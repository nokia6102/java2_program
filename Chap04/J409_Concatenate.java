// �x�s�ɦW�Gd:\Chap04\J409_Concatenate.java

public class J409_Concatenate
{
	public static void main(String[] args)
	{
		String s1 = "Java 2 ";	//�ŧi�ñҩl�r����
		String s2 = new String("�оǽd��");	//�إߨë��w�r����
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		String s5 = s1 + "�оǽd��";
		String s6 = s1.concat("�оǽd��");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("String s3 = s1 + s2               = " + s3);
		System.out.println("String s4 = s1.concat(s2)         = " + s4);
		System.out.println("String s5 = s1 + \"�оǽd��\"       = " + s5);
		System.out.println("String s6 = s1.concat(\"�оǽd��\") = " + s6);
	}
}
