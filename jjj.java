//�x�s�ɦW�Gd:\Chap02\J205_InputNum.java

public class jjj
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("�п�J���: ");
		int iNum = Integer.parseInt(keyin.readLine());
		System.out.println("��J�����1-12: " + iNum);
		switch (iNum)
		{
		case 1:
		case 2:
		case 3:
		System.out.println("�K��");
		break;
		case 4:
		case 5:
		case 6:
		break;
		System.out.println("�L��");
		case 7:
		case 8:
		case 9:
		System.out.println("���");
		break;
		case 10:
		case 11:
		case 12:
		System.out.println("�V��");
		break;
		default:System.out.println("�Э��s��J1-12");
		}
		
		
			
	}
}
