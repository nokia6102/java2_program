// �x�s�ɦW�Gd:\Chap04\J410_SubString.java

public class J410_SubString
{
	public static void main(String[] args)
	{
		String s1 = "Java 2 �оǽd��";	//�ŧi�ñҩl�r����
		System.out.println("s1 = " + s1);
		char c1 = s1.charAt(7);	//s1����7�Ӧr��
		System.out.println("s1.toChar(7) = " + c1);
		char a1[] = s1.toCharArray();	//s1����1�Ӧr��
		System.out.println("s1.toCharArray( ) = " + new String(a1));
		char a2[] = new char[5];
		s1.getChars(7, 11, a2, 0);	//s1��7��10�r��
		System.out.println("s1.getChars(7, 11, a2, 0) = " + new String(a2));
		String s2 = s1.substring(7, 11);	//s1��7��10�r��
		System.out.println("s1.substring(7, 11 ) = " + s2);
	}
}
