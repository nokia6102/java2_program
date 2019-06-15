// 儲存檔名：d:\Chap03\J305_CheckNumber.java

public class J305_CheckNumber
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("請輸入整數: ");
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int iNum = Integer.parseInt(keyin.readLine());
		System.out.print(iNum + " 是");
		System.out.println((iNum >= 0) ? "正數" : "負數");	// 執行條件運算符號
	}
}
