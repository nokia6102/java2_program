// �x�s�ɦW�Gd:\Chap03\J305_CheckNumber.java

public class J305_CheckNumber
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("�п�J���: ");
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int iNum = Integer.parseInt(keyin.readLine());
		System.out.print(iNum + " �O");
		System.out.println((iNum >= 0) ? "����" : "�t��");	// �������B��Ÿ�
	}
}
