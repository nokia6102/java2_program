class J705_Division
{
	private int q;	//�����ܼ�

	int Quotient(int n, int d)	//���k�B���k����
	{
		q = n/d;
		return q;
	}
}

public class J705_TryClass
{
	public static void main(String[] args) throws ArithmeticException
	{
		J705_Division q1 = new J705_Division();	//�ŧi����
		int numer = 10;	//�ŧi��k�ܼ�
		int denom = 0;	//�ŧi��k�ܼ�
		try {		//try�϶�
			System.out.println( numer + "/" + denom + "=" 
					  + q1.Quotient(numer, denom));
		} catch(ArithmeticException e) {
			System.out.println( e );
		}
	}
}