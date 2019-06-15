import java.io.*;

public class J806_ByteArrayInputStream
{
	static void print(char s) {	//定義螢幕輸出方法
		System.out.print(s);
	}

	public static void main(String[] args) throws IOException
	{
		byte[] data = "Success is never ending.".getBytes();
		ByteArrayInputStream arrayIn = 
			new ByteArrayInputStream(data);	//建立位元組輸入串列
		int ch;
		while((ch = arrayIn.read()) != -1)	//若不是串列尾端
			print((char) ch);	//則顯示讀取資料
	}
}
