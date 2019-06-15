class J705_Division
{
	private int q;	//物件變數

	int Quotient(int n, int d)	//除法運算方法成員
	{
		q = n/d;
		return q;
	}
}

public class J705_TryClass
{
	public static void main(String[] args) throws ArithmeticException
	{
		J705_Division q1 = new J705_Division();	//宣告物件
		int numer = 10;	//宣告方法變數
		int denom = 0;	//宣告方法變數
		try {		//try區塊
			System.out.println( numer + "/" + denom + "=" 
					  + q1.Quotient(numer, denom));
		} catch(ArithmeticException e) {
			System.out.println( e );
		}
	}
}