public class J704_TryInMethod
{
	static void Quotient(int n, int d) throws ArithmeticException
	{
		try {	//��k����try�϶�
			System.out.println( n + "/" + d + "=" + n/d);
		} catch(ArithmeticException e) {
			System.out.println( e );
		}
	}

	public static void main(String[] args)
	{
		int numer = 10;	//�ŧi��k�ܼ�
		int denom = 0;	//�ŧi��k�ܼ�
	  	Quotient(numer, denom);	//�I�sQuotient��k
	}
}
