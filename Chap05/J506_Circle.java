// �x�s�ɦW�Gd:\Chap05\J506_Circle.java

class J506_Calculate	//�ŧi���O
{
	double radius;	//�ŧi�����ܼ�
	void setRadius(double r)	//�]�w�b�|��k
	{
		radius = r;	//�]�w�b�|
	}
	double circumference()	//�p���P����k
	{
		return 2 * Math.PI * radius;	//�Ǧ^��P��
	}
	double area()	//�p��ꭱ�n��k
	{
		return Math.PI * Math.pow(radius, 2);	//�Ǧ^�ꭱ�n
	}
}

public class J506_Circle
{
	public static void main(String[] args)
	{
		J506_Calculate c = new J506_Calculate();	//�إ����O����
		double r = 5.0;
		System.out.println("�p���P���P�ꭱ�n");	//��ܦr��
		System.out.println("�b�| = " + r);	//��ܪ�
		c.setRadius(r);	//�]�w�b�|
		System.out.println("��P�� = " + c.circumference());	//��ܩP��
		System.out.println("�ꭱ�n = " + c.area());			//��ܭ��n
	}
}