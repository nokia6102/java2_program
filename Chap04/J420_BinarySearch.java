// �x�s�ɦW�Gd:\Chap04\J420_BinarySearch.java

public class J420_BinarySearch
{
	public static void main(String[] args) throws java.io.IOException
	{
		final int max = 5;	// �ŧi�`�ƲŸ�
		int counti, countj, buffer = 0;	// �ŧi����ܼ�
		int search, low = 0, high = max-1, middle;	// �ŧi����ܼ�
		int number[] = {57, 19, 33, 92, 6};	// �ŧi��ư}�C
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("�Ƨǫe�G");	// ��ܱƧǫe����
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		System.out.print("\n�п�J�n�j�M�ƭȡG");
		search = Integer.parseInt(line.readLine());
		for (counti = 0; counti < max-1; counti++)	// �Ƨǰj��
			for (countj = counti; countj < max; countj++)
				if (number[counti] > number[countj])
				{
					buffer = number[counti];
					number[counti] = number[countj];
					number[countj] = buffer;
				}
		System.out.print("�Ƨǫ�G");	// ��ܱƧǫᤧ��
		for (counti = 0; counti < max; counti++)
			System.out.print(number[counti] + " ");
		do				// �j�M�j��
		{
			if ((low + high) % 2 > 0.5)	// �p��j�M��m
				middle = (low + high) / 2 + 1;
			else
				middle = (low + high) / 2;
	
			if (search < number[middle])	// �p��j�M�W��
				high = middle - 1; 
			else if (search > number[middle])	// �p��j�M�U��
				low = middle + 1;
			else if (search == number[middle])	// ���۲żƭ�
				break;
		} while (low <= high);
		if (low > high)	// ��ܷj�M���G
			System.out.println("\n�䤣��ƭȡG" + search);
		else
			System.out.println("\n���ƭȡG" + search);
	}
}
