//�x�s�ɦW�Gd:\Chap02\J210_Assignment.java

public class J210_Assignment
{
	public static void main(String[] args)
	{
		float a, b, c, d, x = 6;	//�ŧi�ܼ�a,b,c,d,x
		int f = 20;	//�ŧi�ܼ�f = 20
		a = b = c = d = 20;	//�Oa=b=c=d=20
		System.out.print ("a = b = c = d = f = 20,");
		System.out.println (" x = 6");	//��X�r��
		System.out.println ("a += x = " + (a += x));	//��X�r��Pa��
		System.out.println ("b -= x = " + (b -= x));	//��X�r��Pb��
		System.out.println ("c *= x = " + (c *= x));	//��X�r��Pc��
		System.out.println ("d /= x = " + (d /= x));	//��X�r��Pd��
		System.out.println ("f %= x = " + (f %= 6));	//��X�r��Pf��
	}
}
