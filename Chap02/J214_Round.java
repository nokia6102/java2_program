//�x�s�ɦW�Gd:\Chap02\J214_Round.java

public class J214_Round
{
	public static void main(String[] args)
	{
		double a = Math.sin(Math.toRadians(30));		//a=sin 30�X
		double b = Math.cos(Math.toRadians(45));		//b=cos 45�X
		double c = Math.tan(Math.toRadians(60));		//c=tan 60�X
		double d = Math.ceil(a*1000)/1000;		//d >= a
		double e = Math.floor(b*1000)/1000;		//e <= b
		double f = Math.rint(c*1000)/1000;		//f = c�|�ˤ��J
		double g = Math.round(c*1000)/1000;		//g�u�O�dc��ƭ�
		System.out.println("sin 30�X = " + a + " = " + d);
		System.out.println("cos 45�X = " + b + " = " + e);
		System.out.println("tan 60�X = " + c + " = " + f);
		System.out.println("tan 60�X = " + c + " = " + g);
	}
}
