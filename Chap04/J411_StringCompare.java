// �x�s�ɦW�Gd:\Chap04\J411_StringCompare.java

public class J411_StringCompare
{
	public static void main(String[] args) throws java.io.IOException
	{
		String s1 = "Java 2";	//�ŧi�ñҩl�r����
		String s2 = "1.38";	//�ŧi�ñҩl�r����
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		System.out.print("�п�J�ϥΪ̱b��: ");
		String id = keyin.readLine();
		System.out.print("�п�J�ϥΪ̱K�X: ");
		String pw = keyin.readLine();
		if (id.equalsIgnoreCase(s1) && pw.equals(s2))
			System.out.println("�ϥΪ̱b���P�K�X���T");
		else if (id.equalsIgnoreCase(s1) && pw.compareTo(s2) != 0)
			System.out.println("�ϥΪ̱K�X���~");
		else if (id.compareTo(s1) != 0 && pw.equals(s2))
			System.out.println("�ϥΪ̱b�����~");
		else if (id.compareTo(s1) != 0 && pw.compareTo(s2) != 0)
			System.out.println("�ϥΪ̱b���P�K�X���~");
	}
}
