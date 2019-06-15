public class J704_TryInMethod
{
	static void Quotient(int n, int d) throws ArithmeticException
	{
		try {	//方法中的try區塊
			System.out.println( n + "/" + d + "=" + n/d);
		} catch(ArithmeticException e) {
			System.out.println( e );
		}
	}

	public static void main(String[] args)
	{
		int numer = 10;	//宣告方法變數
		int denom = 0;	//宣告方法變數
	  	Quotient(numer, denom);	//呼叫Quotient方法
	}
}
