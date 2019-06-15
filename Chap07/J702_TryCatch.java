public class J702_TryCatch
{
	public static void main(String[] args) throws ArithmeticException
	{
		int numer = 10;	//宣告方法變數-分子
		int denom = 0;	//宣告方法變數-分母
		int quotient;	//宣告方法變數-商
		try {
			quotient = numer/denom;	//測試除法例外
		} catch(ArithmeticException e) {
			System.out.println( e );	//顯示錯誤訊息
		}
	}
}
