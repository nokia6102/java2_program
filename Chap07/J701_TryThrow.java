public class J701_TryThrow
{
	public static void main(String[] args)
	{
		int numer = 10;	//�ŧi��k�ܼ�-���l
		int denom = 0;	//�ŧi��k�ܼ�-����
		int quotient;	//�ŧi��k�ܼ�-��
		try {
			if(denom == 0)	//�ˬd���ƬO�_��0
				throw new ArithmeticException("���Ƭ� 0");
			quotient = numer/denom;
		} catch(ArithmeticException e) {
			System.out.println( e );	//��ܿ��~�T��
		}
	}
}
