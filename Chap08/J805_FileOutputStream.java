import java.io.*;

public class J805_FileOutputStream
{
	static void print(String s) {	//定義螢幕輸出方法
		System.out.print(s);
	}

	public static void main(String[] args) throws Exception
	{
		byte[] data = "You will never win, if you never begin.\r\n"
			      .getBytes();	//取得並定義陣列長度
		FileOutputStream file1 = new 
			FileOutputStream("J805.txt");	//建立寫入輸出串列物件
		for(int i=0; i<data.length; i++)
			file1.write(data[i]);	//位元組資料寫入檔案
		FileOutputStream file2 = new 
			FileOutputStream("J805.txt", true);	//建立附加輸出串列物件
		file2.write(data);	//緩衝器資料寫入檔案
		FileOutputStream file3 = new 
			FileOutputStream("J805.txt", true);	//建立附加輸出串列物件
		file3.write(data, 0, 18);	//指定長度資料寫入檔案
		file1.close();	//關閉寫入檔案物件
		file2.close();	//關閉附加檔案物件
		file3.close();	//關閉附加檔案物件
	}
}
