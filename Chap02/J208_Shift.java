// �x�s�ɦW�Gd:\Chap02\J208_Shift.java

public class J208_Shift
{
	public static void main(String[] args)
	{
		char hex[] = {'0', '1', '2', '3', '4', '5',
			      '6', '7', '8', '9', 'a', 'b',
			      'c', 'd', 'e', 'f'};	//�w�q�Q���i���ഫ��
		byte hexA = (byte)0xc5;	//�w�q�Q���i����
		int hiA = (hexA & 0xf0) >> 4;	//���o���|�줸�Q���i���
		int loA = (hexA & 0x0f);	//���o�C�|�줸�Q���i���
		System.out.println("hexA = 0x" + hex[hiA] + hex[loA]);	//��X
	}
}