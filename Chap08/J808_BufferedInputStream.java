import java.io.*;

public class J808_BufferedInputStream
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		byte[] data = "Copyright&copy; 2001 Ku & Ku.\n".getBytes();
		ByteArrayInputStream arrayIn = new 
			ByteArrayInputStream(data);	//建立陣列輸入串列物件
		BufferedInputStream bufIn = new 
			BufferedInputStream(arrayIn);	//建立緩衝器輸入串列物件
		int c;
		boolean flag = false;	//旗號=false

		print("轉換前：");
		while((c = arrayIn.read()) != -1)
			print((char) c);
		arrayIn.reset();
		print("轉換後：");
		while((c = bufIn.read()) != -1) {	//若不是緩衝器尾端
			switch(c) {
			case '&':	//若讀取資料為&號
				if(!flag) {	//若旗號=false
					bufIn.mark(data.length);	//標示目前位置
					flag = true;	//令旗號=true
				} else {	//若旗號=true
					flag = false;	//令旗號=false
				}
				break;
			case ';':	//若讀取資料為;號
				if(!flag) {	//若旗號=false
					print((char) c);	//顯示資料
				} else {	//若旗號=true
					print("(c)");	//顯示取代符號
					flag = false;	//令旗號=fasle
				}
				break;
			case ' ':	//若讀取資料為空白
				if(!flag) {	//若旗號=false
					print((char) c);	//顯示資料
				} else {	//若旗號=true
					print("&");	//顯示"&"
					flag = false;	//令旗號=false
					bufIn.reset();	//移動指標到mark位置
				}
				break;
			default:	//若讀取資料為其他
				if(!flag)	//若旗號=false
					print((char) c);	//顯示資料
				break;
			}
		}
	}
}
