// 儲存檔名：d:\Chap03\J301_ToUpper.java

public class J301_ToUpper
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inkey;
		System.out.print("請按任意鍵：");
		inkey = (char)System.in.read();	//inkey=輸入字元
		System.in.read(); System.in.read();	//讀取cr與lf控制碼
		if (inkey >= 'a' && inkey <= 'z')	//若inkey為小寫字母
			inkey -= 0x20;	//小寫轉成大寫
		System.out.println("輸入字元為：" + inkey);
	}
}
