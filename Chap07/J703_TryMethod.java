public class J703_TryMethod
{
	static int Quotient(int n, int d)	//���k�B���k
	{
		int q = n/d;
		return q;
	}

	public static void main(String[] args) throws ArithmeticException
	{
		int numer = 10;	//�ŧi��k�ܼ�
		int denom = 0;	//�ŧi��k�ܼ�
		try {	//try�϶�
			System.out.println( numer + "/" + denom + "=" 
					  + Quotient(numer, denom));
		} catch(ArithmeticException e) {
			System.out.println( e );
		}
	}
}
