// 儲存檔名：d:\Chap04\J403_FindMax.java

public class J403_FindMax
{
	public static void main(String[] args)
	{
		int count, max = 0;	// 宣告整數變數
		int number[] = {5, 9, 3};	// 宣告一維陣列變數
		for (count = 0; count <= 2; count++)	// 找尋最大值迴圈
		{
			if (number[count] > max)	// 若數值>緩衝器值
				max = number[count];	// 則取代緩衝器值
		}
		System.out.println("5, 9, 3 三數的最大值 = " + max);	// 顯示最大值
	}
}
