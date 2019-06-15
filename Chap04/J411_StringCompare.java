// 儲存檔名：d:\Chap04\J411_StringCompare.java

public class J411_StringCompare
{
	public static void main(String[] args) throws java.io.IOException
	{
		String s1 = "Java 2";	//宣告並啟始字串資料
		String s2 = "1.38";	//宣告並啟始字串資料
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		System.out.print("請輸入使用者帳號: ");
		String id = keyin.readLine();
		System.out.print("請輸入使用者密碼: ");
		String pw = keyin.readLine();
		if (id.equalsIgnoreCase(s1) && pw.equals(s2))
			System.out.println("使用者帳號與密碼正確");
		else if (id.equalsIgnoreCase(s1) && pw.compareTo(s2) != 0)
			System.out.println("使用者密碼錯誤");
		else if (id.compareTo(s1) != 0 && pw.equals(s2))
			System.out.println("使用者帳號錯誤");
		else if (id.compareTo(s1) != 0 && pw.compareTo(s2) != 0)
			System.out.println("使用者帳號與密碼錯誤");
	}
}
