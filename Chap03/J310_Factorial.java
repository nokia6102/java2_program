// �x�s�ɦW�Gd:\Chap03\J310_Factorial.java

public class J310_Factorial
{
	public static void main(String[] args)
	{
		int count = 1, factor = 1;	// while �j����
		System.out.println("�p��\t����");	// ��X�r��
		do
		{
			factor *= count;	// �p�ⶥ��
			System.out.println(count + "\t" + factor);	// ��X�p�ƭȻP������
			count ++;	// �p�ƭȥ[ 1
		}while (count <= 10);	// count<=10�j�馨��
	}
}
