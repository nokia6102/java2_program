// �x�s�ɦW�Gd:\Chap03\J311_CheckPiece.java

public class J311_CheckPiece
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inChar;
		int  plus = 0, minus = 0, zero = 0;
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		do
		{
			System.out.print("�п�J��ƼƭȡG");
			int inNum = Integer.parseInt(line.readLine());
			if (inNum > 0)		// �Y inNum �j�� 0
				plus++;	// plus = plus + 1
			else if (inNum < 0)		// �Y inNum �p�� 0
				minus++;	// minus = minus + 1
			else					// �_�h
				zero++;		// zero = zero + 1
			System.out.print("�O�_��J�U�@���ƭ� (y/n)�G");
			inChar = (char)System.in.read();	//inChar=��J�r��
			System.in.read(); System.in.read();	//Ū��cr�Plf����X
		} while (inChar == 'Y' || inChar == 'y');	// �Y�r��='Y'�h���ưj��
		System.out.println("���Ʀ� " + plus + " ��");	// ��ܥ��ƭӼ�
		System.out.println("�t�Ʀ� " + minus + " ��");	// ��ܭt�ƭӼ�
		System.out.println("�s�� " + zero + " ��");	// ��ܹs���Ӽ�
	}
}
