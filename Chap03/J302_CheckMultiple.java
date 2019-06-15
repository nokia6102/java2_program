// 纗郎d:\Chap03\J302_CheckMultiple.java

public class J302_CheckMultiple
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("叫块俱计: ");
		int iNum = Integer.parseInt(keyin.readLine());
		if (iNum % 3 == 0)	//璝iNum琌3计
			System.out.println(iNum + " 琌 3 计");
		else	//璝iNum琌3计
			System.out.println(iNum + " ぃ琌 3 计");
	}
}
