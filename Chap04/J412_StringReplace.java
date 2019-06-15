// �x�s�ɦW�Gd:\Chap04\J412_StringReplace.java

public class J412_StringReplace
{
	public static void main(String[] args) throws java.io.IOException
	{
		String s1 = "Programmers have used C++ for applications and \n"
				+ "applets as long as the C++ platform has been \n"
				+ "available. The C++ platform provides everything \n"
				+ "you need to create applications and applets.";
		String s2 = "C++";	//�n��M���¦r��
		String s3 = "Java 1";	//�n���N���s�r��

		System.out.println("���N�e:\n" + s1);
		int index = 0;
		for(int i=0; i<3; i++) {
			index = s1.indexOf(s2, index);	//��M�U�@�Ӭ۲��¦r��
			s1 = s1.substring(0, index) + s3 	//���N�U�@�Ӭ۲Ŧr��
				+ s1.substring(index + s2.length(), s1.length());
		}
		System.out.println("\n�ϥ� substring �H Java 1 ���N C++ ��:\n" + s1);

		s1 = s1.replace('1', '2');	//�H2���N�Ҧ���1
		System.out.println("\n�ϥ� replace �H 2 ���N 1 ��:\n" + s1);
	}
}
