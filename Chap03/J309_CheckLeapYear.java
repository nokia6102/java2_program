// 儲存檔名：d:\Chap03\J309_CheckLeapYear.java

public class J309_CheckLeapYear
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("請輸入西元年份，若輸入 0 則結束：");
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(
			 new java.io.InputStreamReader(System.in));
		int year = Integer.parseInt(line.readLine());
		while (year != '\0')	// 若輸入不是0則迴圈成立
		{
			if (year % 4 != 0)	// 若year不是4的倍數
				System.out.println(year + "年不是閏年");	// 則顯示year不是閏年
			else if (year % 100 == 0)	// 是4的倍數也是100的倍數
			{
				if (year % 400 == 0)	// 是400的倍數
					System.out.println(year + "年是閏年");	// 則顯示year是閏年
				else			// 不是400的倍數
					System.out.println(year + "年不是閏年");	// 則顯示year不是閏年
			}
			else					// 是4的倍數不是100的倍數
				System.out.println(year + "年是閏年");	// 則顯示year是閏年
			System.out.print("請輸入西元年份，若輸入 0 則結束：");
			year = Integer.parseInt(line.readLine());
		}
	}
}