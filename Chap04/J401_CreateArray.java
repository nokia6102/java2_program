// 儲存檔名：d:\Chap04\J401_CreateArray.java

public class J401_CreateArray
{
	public static void main(String[] args)
	{
		int a[];				//宣告整數陣列
		a = new int[5];	//宣告並建立整數陣列
		for(int i=0; i<5; i++)
			a[i] = i;	//指定資料給陣列元素
		System.out.println("a[3] = " + a[3]);	//顯示陣列元素的資料
	}
}
