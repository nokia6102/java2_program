// �x�s�ɦW�Gd:\Chap02\J205_InputNum.java

public class J205_InputNum
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("�п�J���: ");
		int iNum = Integer.parseInt(keyin.readLine());
		System.out.println("��J�����: " + iNum);
		System.out.print("�п�J�B�I��: ");
		float fNum = Float.parseFloat(keyin.readLine());
		System.out.println("��J���B�I��: " + fNum);
	}
}
