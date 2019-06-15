// 儲存檔名：d:\Chap03\J314_Multiple.java

public class J314_Multiple
{
	public static void main(String[] args)
	{
		int count;
		System.out.print("1 至 30 間 3 的倍數為：");
		for (count = 1; count <= 30; count++)	// 定義迴圈
		{
			if (count % 3 != 0)	// 若不是3的倍數
				continue;		// 返回迴圈起點
			System.out.print(count + " ");	// 顯示3的倍數並空格
		}
		System.out.println();			// 輸出跳行
	}
}
