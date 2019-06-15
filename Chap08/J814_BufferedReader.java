import java.io.*;

public class J814_BufferedReader
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		String s = "Copyright&copy; 2001 Ku & Ku.\n";
		char[] data = new char[s.length()];
		s.getChars(0, s.length(), data, 0);
		CharArrayReader cr = new CharArrayReader(data);	//建立讀取字元陣列物件
		BufferedReader br = new BufferedReader(cr);	//建立讀取緩衝器物件
		int c;
		boolean flag = false;	//旗號=false

		print("轉換前：");
		while((c = cr.read()) != -1)
			print((char) c);
		cr.reset();
		print("轉換後：");
		while((c = br.read()) != -1) {	//若不是緩衝器尾端
			switch(c) {
			case '&':	//若讀取資料為&號
				if(!flag) {	//若旗號=false
					br.mark(data.length);	//標示目前位置
					flag = true;	//令旗號=true
				} else {
					flag = false;	//令旗號=false
				}
				break;
			case ';':	//若讀取資料為;號
				if(!flag) {	//若旗號=false
					print((char) c);	//顯示資料
				} else {
					print("(c)");	//顯示取代符號
					flag = false;	//令旗號=false
				}
				break;
			case ' ':
				if(!flag) {	//若旗號=false
					print((char) c);	//顯示資料
				} else {
					print("&");
					flag = false;	//令旗號=false
					br.reset();	//移動指標到mark位置
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
