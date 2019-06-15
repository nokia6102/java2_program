// 儲存檔名：d:\Chap04\J419_BubbleSort.java

public class J419_BubbleSort
{
	public static void main(String[] args)
	{
		final int max = 5;	// 宣告整常數符號
		int counti, countj, buffer = 0;	// 宣告整數變數
		int number[] = {57, 19, 33, 92, 6};	// 宣告一維陣列
		System.out.print("排序前：");	// 顯示排序前資料
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		System.out.println();
		for (counti = 0; counti < max-1; counti++)	// 排序外迴圈
			for (countj = counti; countj < max; countj++)	// 排序內迴圈
				if (number[counti] > number[countj])	// 若須要則對調
				{
					buffer = number[counti];
					number[counti] = number[countj];
					number[countj] = buffer;
				}
		System.out.print("排序後：");	// 顯示排序後資料
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		System.out.println();
	}
}
