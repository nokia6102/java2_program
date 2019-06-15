// 儲存檔名：d:\Chap02\J205_InputNum.java

public class J205_InputNum
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("請輸入整數: ");
		int iNum = Integer.parseInt(keyin.readLine());
		System.out.println("輸入的整數: " + iNum);
		System.out.print("請輸入浮點數: ");
		float fNum = Float.parseFloat(keyin.readLine());
		System.out.println("輸入的浮點數: " + fNum);
	}
}
