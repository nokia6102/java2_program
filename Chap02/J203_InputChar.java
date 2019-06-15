// 儲存檔名：d:\Chap02\J203_InputChar.java

public class J203_InputChar
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("按任意字元: ");
		char cin = (char)System.in.read();	//cin=讀取鍵盤輸入字元
		System.in.read();	//讀取跳行字元
		System.in.read();	//讀取回覆字元
		System.out.println("輸入的字元: " + cin);
	}
}
