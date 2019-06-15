// 儲存檔名：d:\Chap02\J204_InputStr.java

public class J204_InputStr
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;		//定義br物件
		keyin = new java.io.BufferedReader(	//配置物件記憶體
			new java.io.InputStreamReader(System.in));
		System.out.print("請輸入姓名: ");
		String name = keyin.readLine();		//讀取輸入並存入name
		System.out.println("輸入的姓名: " + name);
	}
}
