// �x�s�ɦW�Gd:\Chap05\J508_Rectangle.java

class J508_Calculate	//�ŧi���O
{
	double length;	//�ŧi�����ܼ�
	double width;	//�ŧi�����ܼ�
	J508_Calculate(double l, double w)	//�ŧi���O�إߪ�
	{
		length = l;	//�Olength=�Ѽ�l
		width = w;	//�Owidth=�Ѽ�w
	}
	double circumference()	//�p��P����k
	{
		return 2 * (length + width);	//�Ǧ^�P��
	}
	double area()	//�p�⭱�n��k
	{
		return length * width;	//�Ǧ^���n
	}
}

public class J508_Rectangle
{
	public static void main(String[] args)
	{
		double l = 8.0;
		double w = 4.0;
		J508_Calculate rect = new J508_Calculate(l, w);	//�إ����O����
		System.out.println("�p�����ΩP���P���n");	//��ܦr��
		System.out.println("�� = " + l);	//��ܪ�
		System.out.println("�e = " + w);	//��ܼe
		System.out.println("�P�� = " + rect.circumference());	//��ܩP��
		System.out.println("���n = " + rect.area());	//��ܭ��n
	}
}