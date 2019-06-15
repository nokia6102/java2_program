// 儲存檔名：d:\Chap03\J304_MenuSelect.java

public class J304_MenuSelect
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inChar;
		System.out.print("a. 新增資料\tb. 插入資料\tc. 刪除資料\t其他. 結束程式：");
		inChar = (char)System.in.read();	//inChar=輸入字元
		System.in.read(); System.in.read();	//讀取cr與lf控制碼
		switch (inChar)
		{
			case 'A':	//若inChar為A字元
			case 'a':	//或inChar為a字元
				System.out.println("新增資料");
				break;
			case 'B':	//若inChar為B字元
			case 'b':	//或inChar為b字元
				System.out.println("插入資料");
				break;
			case 'C':	//若inChar為C字元
			case 'c':	//或inChar為c字元
				System.out.pri
		}
	}
}
