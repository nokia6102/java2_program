// �x�s�ɦW�Gd:\Chap04\J403_FindMax.java

public class J403_FindMax
{
	public static void main(String[] args)
	{
		int count, max = 0;	// �ŧi����ܼ�
		int number[] = {5, 9, 3};	// �ŧi�@���}�C�ܼ�
		for (count = 0; count <= 2; count++)	// ��M�̤j�Ȱj��
		{
			if (number[count] > max)	// �Y�ƭ�>�w�ľ���
				max = number[count];	// �h���N�w�ľ���
		}
		System.out.println("5, 9, 3 �T�ƪ��̤j�� = " + max);	// ��̤ܳj��
	}
}
