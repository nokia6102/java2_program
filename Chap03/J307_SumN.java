// 儲存檔名：d:\Chap03\J307_SumN.java

public class J307_SumN
{
	public static void main(String[] args)
	{
		int count, sum = 0;
		System.out.println("計數\t總和");		// 輸出字串
		for (count = 1, sum = 1; count <= 10; count ++, sum += count)
			System.out.println(count + "\t" + sum);		// 為迴圈敘述
	}
}
