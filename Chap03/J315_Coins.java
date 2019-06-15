// �x�s�ɦW�Gd:\Chap03\J315_Coins.java

public class J315_Coins
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("�п�J���� (���G��) = ");	//��ܴ��ܦr��
		java.io.BufferedReader br;	//�ŧiŪ���w�ľ��ܼ�
		br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));	//�إ�Ū���w�ľ�����
		String line = br.readLine();	//line=Ū���w�ľ����
		System.out.println();	//����

		int totalMoney = Integer.parseInt(line);	//�N��J�r���ন���
		int dollars = totalMoney % 100;	//��J�ƭȰ�100���l��
		int fifty = dollars / 50;	//���o���Q��w���ƶq
		int ten = (dollars % 50) / 10;	//���o�Q��w���ƶq
		int five = ((dollars % 50) % 10) / 5;	//���o����w���ƶq
		int one = ((dollars % 50) % 10) % 5;	//���o�@��w���ƶq
		int coins = fifty + ten + five + one;	//�p��w���`��

		if (dollars == 0)	//�Y��J�ƭȬ�100������
			System.out.println("���ݭn�w��");
		else {	//�Y��J�ƭȤ��O100������
			System.out.println("�w���`�� = " + coins);
			if(fifty != 0)	//�Y���Q��w���ƶq!=0
				System.out.println("���Q��w�� = " + fifty);
			if(ten != 0)	//�Y�Q��w���ƶq!=0
				System.out.println("�Q��w�� = " + ten);
			if(five != 0)	//�Y����w���ƶq!=0
				System.out.println("����w�� = " + five);
			if(one != 0)	//�Y�@��w���ƶq!=0
				System.out.println("�@��w�� = " + one);
		}
	}
}
