// 儲存檔名：d:\Chap04\J405_ArrayCopy.java

public class J405_ArrayCopy
{
	public static void main(String[] args)
	{
	int[] array = {0, 1, 2, 3, 4, 5, 6, 7};	//宣告並啟始陣列array
	System.out.print("附加前陣列：");
	for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");	//顯示附加前陣列

	int temp[] = new int[array.length];	//宣告新陣列temp
	temp = array;	//temp指向array記憶體
	array = new int[array.length + 1];	//重新配置array
	System.arraycopy(temp, 0, array, 0, temp.length);	//複製陣列
	array[8] = 8;	//新增元素資料

	System.out.print("\n附加後陣列：");
	for(int k=0; k<array.length; k++)
			System.out.print(array[k] + " ");
	}
}
