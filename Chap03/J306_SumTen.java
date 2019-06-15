// 儲存檔名：d:\Chap03\J306_SumTen.java

public class J306_SumTen
{
	public static void main(String[] args)
	{
		int count, sum = 0;
		for (count = 1; count <= 10; count ++)	// count<=10迴圈成立
			sum += count;	// sum=sum+count
		System.out.println("1 + 2 + 3 + ... + 10 = " + sum);	// 輸出字串與總和
	}
}
