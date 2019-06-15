public class J701_TryThrow
{
	public static void main(String[] args)
	{
		int numer = 10;	//宣告方法變數-分子
		int denom = 0;	//宣告方法變數-分母
		int quotient;	//宣告方法變數-商
		try {
			if(denom == 0)	//檢查除數是否為0
				throw new ArithmeticException("除數為 0");
			quotient = numer/denom;
		} catch(ArithmeticException e) {
			System.out.println( e );	//顯示錯誤訊息
		}
	}
}
