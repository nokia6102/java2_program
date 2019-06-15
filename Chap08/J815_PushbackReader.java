import java.io.*;

public class J815_PushbackReader
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		String s = "I + II = III\n";
		char[] data = new char[s.length()];
		s.getChars(0, s.length(), data, 0);
		CharArrayReader cr = new CharArrayReader(data);
		PushbackReader pr = new PushbackReader(cr);
		int c;

		print("轉換前：" + s);
		print("轉換後：");
		while((c = pr.read()) != -1) {	//讀取字元,若不是檔案結尾
			switch(c) {
			case 'I':	//若第一個字元是'I'
				if((c = pr.read()) == 'I') {	//若第二個字元是也'I'
					if((c = pr.read()) == 'I') {	//若第三個字元也是'I'
						print('3');	//顯示 '3'
					} else {	//若第三個字元不是'='
						print('2');	//顯示 '2'
						pr.unread(c);	//移動指標到上一個字元
					}
				} else {	//若第二個字元不是'='
					print('1');	//顯示 '1'
					pr.unread(c);	//移動指標到上一個字元
				}
				break;
			default:	//若第一個字元不是'I'
				print((char) c);	//顯示字元
				break;
			}
		}
	}
}
