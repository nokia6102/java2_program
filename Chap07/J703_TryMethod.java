public class J703_TryMethod
{
	static int Quotient(int n, int d)	//除法運算方法
	{
		int q = n/d;
		return q;
	}

	public static void main(String[] args) throws ArithmeticException
	{
		int numer = 10;	//宣告方法變數
		int denom = 0;	//宣告方法變數
		try {	//try區塊
			System.out.println( numer + "/" + denom + "=" 
					  + Quotient(numer, denom));
		} catch(ArithmeticException e) {
			System.out.println( e );
		}
	}
}
