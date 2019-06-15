// 儲存檔名：d:\Chap04\J420_BinarySearch.java

public class J420_BinarySearch
{
	public static void main(String[] args) throws java.io.IOException
	{
		final int max = 5;	// 宣告常數符號
		int counti, countj, buffer = 0;	// 宣告整數變數
		int search, low = 0, high = max-1, middle;	// 宣告整數變數
		int number[] = {57, 19, 33, 92, 6};	// 宣告整數陣列
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("排序前：");	// 顯示排序前之值
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		System.out.print("\n請輸入要搜尋數值：");
		search = Integer.parseInt(line.readLine());
		for (counti = 0; counti < max-1; counti++)	// 排序迴圈
			for (countj = counti; countj < max; countj++)
				if (number[counti] > number[countj])
				{
					buffer = number[counti];
					number[counti] = number[countj];
					number[countj] = buffer;
				}
		System.out.print("排序後：");	// 顯示排序後之值
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		do				// 搜尋迴圈
		{
			if ((low + high) % 2 > 0.5)	// 計算搜尋位置
				middle = (low + high) / 2 + 1;
			else
				middle = (low + high) / 2;
	
			if (search < number[middle])	// 計算搜尋上限
				high = middle - 1; 
			else if (search > number[middle])	// 計算搜尋下限
				low = middle + 1;
			else if (search == number[middle])	// 找到相符數值
				break;
		} while (low <= high);
		if (low > high)	// 顯示搜尋結果
			System.out.println("\n找不到數值：" + search);
		else
			System.out.println("\n找到數值：" + search);
	}
}
