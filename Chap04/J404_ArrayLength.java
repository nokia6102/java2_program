// 儲存檔名：d:\Chap04\J404_ArrayLength.java

public class J404_ArrayLength
{
	public static void main(String[] args)
	{
	int[] array = {0, 1, 2, 3, 4, 5, 6, 7};	//宣告並啟始陣列array
	System.out.print("顯示陣列元素：");
	for(int i=0; i<array.length; i++)	//i<陣列長度則迴圈成立
			System.out.print(array[i] + " ");	//顯示陣列元素
	}
}
