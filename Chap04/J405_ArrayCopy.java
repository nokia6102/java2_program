// �x�s�ɦW�Gd:\Chap04\J405_ArrayCopy.java

public class J405_ArrayCopy
{
	public static void main(String[] args)
	{
	int[] array = {0, 1, 2, 3, 4, 5, 6, 7};	//�ŧi�ñҩl�}�Carray
	System.out.print("���[�e�}�C�G");
	for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");	//��ܪ��[�e�}�C

	int temp[] = new int[array.length];	//�ŧi�s�}�Ctemp
	temp = array;	//temp���Varray�O����
	array = new int[array.length + 1];	//���s�t�marray
	System.arraycopy(temp, 0, array, 0, temp.length);	//�ƻs�}�C
	array[8] = 8;	//�s�W�������

	System.out.print("\n���[��}�C�G");
	for(int k=0; k<array.length; k++)
			System.out.print(array[k] + " ");
	}
}
