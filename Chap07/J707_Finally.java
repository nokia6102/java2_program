public class J707_Finally
{
	static int[] numer = {10, 20, 30};
	static int[] denom = {2, 5, 0};
	static int[] quotient = new int[3];
	static void Division(int i)
	{
		quotient[i] = numer[i]/denom[i];
		System.out.println(numer[i] + "/" + denom[i]
				  + "=" + quotient[i]);
	}
	public static void main(String[] args) throws ArithmeticException
	{
		try {			//���պ�N���~
			for(int i=0; i<3; i++)
				Division(i);	//�I�sDivision��k
		} catch(ArithmeticException e) {	//������N���~
			System.out.println( e );
		} finally {	//�׵�try�϶�
			System.out.println("�׵�try�϶�");
		}
	}
}
