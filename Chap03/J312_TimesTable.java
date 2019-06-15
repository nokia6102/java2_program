// 儲存檔名：d:\Chap03\J312_TimesTable.java

public class J312_TimesTable
{
	public static void main(String[] args)
	{
		int count1, count2;
		for (count2=1; count2<=9; count2++)	//被乘數迴圈由1到9
		{
			for (count1=2; count1<=5; count1++)	//乘數迴圈由2到5
			{
				System.out.print(count1 + " * " + count2 + " = ");	//輸出count1 '*' count2
				System.out.print(count1*count2 + "\t");	//輸出並跳至下一定位
			}
			System.out.println();	//輸出跳行
		}
		System.out.println();	//輸出跳行
		for (count2=1; count2<=9; count2++)	//被乘數迴圈由1到9
		{
			for (count1=6; count1<=9; count1++)	//乘數迴圈由6到9
			{
				System.out.print(count1 + " * " + count2 + " = ");	//輸出count1 '*' count2
				System.out.print(count1*count2 + "\t");	//輸出並跳至下一定位
			}
			System.out.println();	//輸出跳行
		}
	}
}