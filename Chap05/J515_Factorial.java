// �x�s�ɦW�Gd:\Chap05\J515_Factorial.java

class J515_Recursion	//J515_Recursion���O
{
	int factorial(int n)
	{
		if(n > 1)
			return n * factorial(n-1);	//���^�I�sfactorial
		else
			return 1;	//�������^�I�s
	}
}

public class J515_Factorial
{
	public static void main(String[] args)
	{
		J515_Recursion r = new J515_Recursion();	//�إ�J515_Recursion����
		System.out.println("4! = " + r.factorial(4));	//�I�sfactorial��k
		System.out.println("5! = " + r.factorial(5));	//�I�sfactorial��k
		System.out.println("6! = " + r.factorial(6));	//�I�sfactorial��k
	}
}