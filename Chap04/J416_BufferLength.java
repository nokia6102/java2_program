// �x�s�ɦW�Gd:\Chap04\J416_BufferLength.java

public class J416_BufferLength
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("Java 2 �оǽd��");
		System.out.println("�ӷ��r��G" + s1);
		System.out.println("�r����סG" + s1.length());	//���o����
		System.out.println("�r��e�q�G" + s1.capacity());	//���o�e�q
		s1.setLength(40);	//�]�w����
		System.out.println("�r����סG" + s1.length());	//���o����
		System.out.println("�r��e�q�G" + s1.capacity());	//���o�e�q
	}
}
