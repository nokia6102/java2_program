// �x�s�ɦW�Gd:\Chap03\J314_Multiple.java

public class J314_Multiple
{
	public static void main(String[] args)
	{
		int count;
		System.out.print("1 �� 30 �� 3 �����Ƭ��G");
		for (count = 1; count <= 30; count++)	// �w�q�j��
		{
			if (count % 3 != 0)	// �Y���O3������
				continue;		// ��^�j��_�I
			System.out.print(count + " ");	// ���3�����ƨêŮ�
		}
		System.out.println();			// ��X����
	}
}
