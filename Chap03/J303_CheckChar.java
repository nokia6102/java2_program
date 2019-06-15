// 儲存檔名：d:\Chap03\J303_CheckChar.java

public class J303_CheckChar
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inChar;
		System.out.print("請按任意鍵：");
		inChar = (char)System.in.read();	//inChar=輸入字元
		System.in.read(); System.in.read();	//讀取cr與lf控制碼
		if (inChar >= 'A' && inChar <= 'Z')	//若inChar為大寫字母
			System.out.println(inChar + " 為大寫字元");
		else if (inChar >= 'a' && inChar <= 'z')	//若inChar為小寫字母
			System.out.println(inChar + " 為小寫字元");
		else if (inChar >= '0' && inChar <= '9')	//若inChar為數字字元
			System.out.println(inChar + " 為數字字元");
		else	//否則inChar為符號字元
			System.out.println(inChar + " 為符號字元");
	}
}
