import java.io.*;

public class J809_PushbackInputStream
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		byte[] data = "I + II = III\n".getBytes();
		ByteArrayInputStream arrayIn = new 
			ByteArrayInputStream(data);	//建立陣列輸入串列物件
		PushbackInputStream pushIn = new 
			PushbackInputStream(arrayIn);	//建立推回輸入串列物件
		int c;

		print("轉換前：");
		while((c = arrayIn.read()) != -1) {
			print((char) c);
		}
		arrayIn.reset();
		print("轉換後：");
		while((c = pushIn.read()) != -1) {
			switch(c) {
			case 'I':
				if((c = pushIn.read()) == 'I') {	//若下一個字元是'I'
					if((c = pushIn.read()) == 'I') {	//若下一個字元是'I'
						print('3');	//輸出 '3'
					} else {	//若下一個字元不是'='
						print('2');	//輸出 '2'
						pushIn.unread(c);	//移動指標到上一個字元
					}
				} else {	//若下一個字元不是'='
					print('1');	//輸出
					pushIn.unread(c);	//移動指標到上一個字元
				}
				break;
			default:
				print((char) c);
				break;
			}
		}
	}
}
