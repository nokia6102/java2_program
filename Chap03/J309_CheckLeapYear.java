// �x�s�ɦW�Gd:\Chap03\J309_CheckLeapYear.java

public class J309_CheckLeapYear
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("�п�J�褸�~���A�Y��J 0 �h�����G");
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(
			 new java.io.InputStreamReader(System.in));
		int year = Integer.parseInt(line.readLine());
		while (year != '\0')	// �Y��J���O0�h�j�馨��
		{
			if (year % 4 != 0)	// �Yyear���O4������
				System.out.println(year + "�~���O�|�~");	// �h���year���O�|�~
			else if (year % 100 == 0)	// �O4�����Ƥ]�O100������
			{
				if (year % 400 == 0)	// �O400������
					System.out.println(year + "�~�O�|�~");	// �h���year�O�|�~
				else			// ���O400������
					System.out.println(year + "�~���O�|�~");	// �h���year���O�|�~
			}
			else					// �O4�����Ƥ��O100������
				System.out.println(year + "�~�O�|�~");	// �h���year�O�|�~
			System.out.print("�п�J�褸�~���A�Y��J 0 �h�����G");
			year = Integer.parseInt(line.readLine());
		}
	}
}