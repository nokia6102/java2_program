// �x�s�ɦW�Gd:\Chap04\J419_BubbleSort.java

public class J419_BubbleSort
{
	public static void main(String[] args)
	{
		final int max = 5;	// �ŧi��`�ƲŸ�
		int counti, countj, buffer = 0;	// �ŧi����ܼ�
		int number[] = {57, 19, 33, 92, 6};	// �ŧi�@���}�C
		System.out.print("�Ƨǫe�G");	// ��ܱƧǫe���
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		System.out.println();
		for (counti = 0; counti < max-1; counti++)	// �Ƨǥ~�j��
			for (countj = counti; countj < max; countj++)	// �ƧǤ��j��
				if (number[counti] > number[countj])	// �Y���n�h���
				{
					buffer = number[counti];
					number[counti] = number[countj];
					number[countj] = buffer;
				}
		System.out.print("�Ƨǫ�G");	// ��ܱƧǫ���
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		System.out.println();
	}
}
