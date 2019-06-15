
public class HW1
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("請輸入整數: ");
		int iNum = Integer.parseInt(keyin.readLine());
		
		if (iNum % 6 == 0)
		System.out.println("輸入的整數: " + iNum + "為6的倍數");					else 
		System.out.println("輸入的整數: " + iNum + "不是6的倍數");
	}
}
