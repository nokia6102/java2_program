// 儲存檔名：d:\Chap03\J310_Factorial.java

public class J310_Factorial
{
	public static void main(String[] args)
	{
		int count = 1, factor = 1;	// while 迴圈初值
		System.out.println("計數\t階乘");	// 輸出字串
		do
		{
			factor *= count;	// 計算階乘
			System.out.println(count + "\t" + factor);	// 輸出計數值與階乘值
			count ++;	// 計數值加 1
		}while (count <= 10);	// count<=10迴圈成立
	}
}
