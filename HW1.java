
public class HW1
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("�п�J���: ");
		int iNum = Integer.parseInt(keyin.readLine());
		
		if (iNum % 6 == 0)
		System.out.println("��J�����: " + iNum + "��6������");					else 
		System.out.println("��J�����: " + iNum + "���O6������");
	}
}
