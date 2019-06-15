import java.io.*;

public class J811_FileWriter
{
	public static void main(String[] args) throws IOException
	{
		String s1 = "Success is never ending, "
			  + "Failure is never final.\r\n";
		char[] d1 = new char[s1.length()];
		s1.getChars(0, s1.length(), d1, 0);	//s1存入字元緩衝器d1
		FileWriter fw1 = new FileWriter("J811.txt");	//建立寫入檔案物件
		for(int i=0; i<d1.length; i++) {
			fw1.write(d1[i]);	//寫入單一元素
		}

		String s2 = "成功永無休止，失敗永不終結。\r\n";
		char[] d2 = new char[s2.length()];
		s2.getChars(0, s2.length(), d2, 0);	//s2存入字元緩衝器d2
		FileWriter fw2 = new FileWriter("J811.txt", true);	//建立附加檔案物件
		fw2.write(d2);		//寫入整個陣列

		fw1.close();	//關閉寫入檔案物件
		fw2.close();	//關閉附加檔案物件
	}
}
