 
// �x�s�ɦW�Gd:\Chap02\J205_InputNum.java

public class mid
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));

		int iNum=0;
		String guess;
	
	   redo:try{
	   System.out.print("�п�J���(1-12): ");
		   guess=keyin.readLine();
		   iNum = Integer.parseInt(guess);
		}catch(NumberFormatException e){

		      guess="999";
		      break redo;
		}
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
		System.out.println("�L��");
		break;

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
		default:System.out.println("�A��J�����O(1-12)");
		}

	}
}