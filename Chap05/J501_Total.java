// 儲存檔名：d:\Chap05\J501_Total.java

public class J501_Total
{
	static int total(int n)	//計算總和函數
	{
		int sum = 0;	//宣告區域變數
		for (int i=1; i<=n; i++)	//計算總和迴圈
			sum += i;
		return sum;	//傳回計算結果
	}

	public static void main(String[] args)
	{
		System.out.println("1+2+3+...+10 = " + total(10));	//呼叫方法
		System.out.println("1+2+3+...+100 = " + total(100));	//呼叫方法
		System.out.println("1+2+3+...+500 = " + total(500));	//呼叫方法
	}
}
