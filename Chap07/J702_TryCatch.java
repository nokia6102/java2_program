public class J702_TryCatch
{
	public static void main(String[] args) throws ArithmeticException
	{
		int numer = 10;	//�ŧi��k�ܼ�-���l
		int denom = 0;	//�ŧi��k�ܼ�-����
		int quotient;	//�ŧi��k�ܼ�-��
		try {
			quotient = numer/denom;	//���հ��k�ҥ~
		} catch(ArithmeticException e) {
			System.out.println( e );	//��ܿ��~�T��
		}
	}
}
