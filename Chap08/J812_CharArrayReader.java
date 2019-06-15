import java.io.*;

public class J812_CharArrayReader
{
	static void print(String s) {	//定義顯示字串方法
		System.out.print(s);
	}
	static void print(char c) {	//定義顯示字元方法
		System.out.print(c);
	}
	public static void main(String[] args) throws IOException
	{
		String s = "Focus on giving, instead of getting.";
		char[] c = new char[s.length()];
		s.getChars(0, s.length(), c, 0);	//將s字串存入緩衝器c
		int i;

		CharArrayReader car1 = new CharArrayReader(c);	//建立car1物件
		print("文字陣列 1：");
		while((i=car1.read()) != -1) {	//讀取car1物件字元
			print((char) i);	//顯示讀取的字元
		}
		print('\n');

		CharArrayReader car2 = new CharArrayReader(c, 0, 16);	//建立car2物件
		print("文字陣列 2：");
		while((i=car2.read()) != -1) {	//讀取car2物件字元
			print((char) i);	//顯示讀取的字元
		}
		print('\n');
	}
}
