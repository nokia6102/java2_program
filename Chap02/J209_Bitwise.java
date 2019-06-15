//�x�s�ɦW�Gd:\Chap02\J209_Bitwise.java

public class J209_Bitwise
{
	public static void main(String[] args)
	{
		char hex[] = {'0', '1', '2', '3', '4', '5',
			      '6', '7', '8', '9', 'a', 'b',
			      'c', 'd', 'e', 'f'};
		byte a = (byte)0x57;	//�ŧi�ñҩla��
		byte b = (byte)0x93;	//�ŧi�ñҩlb��
		int x = ~ a;	//�ŧi�ë��wx��
		int y = a & b;	//�ŧi�ë��wy��
		int z = a | b;	//�ŧi�ë��wz��
		int w = a ^ b;	//�ŧi�ë��ww��

		System.out.println ("a = 0x" + hex[(a & 0xf0) >> 4] + hex[a & 0x0f]);	//��X�r��Ba�ȻP�w��
		System.out.println ("b = 0x" + hex[(b & 0xf0) >> 4] + hex[b & 0x0f]);	//��X�r��Bb�ȻP����
		System.out.println ("~a = 0x" + hex[(x & 0xf0) >> 4] + hex[x & 0x0f]);	//��X�r��Bx�ȻP����
		System.out.println ("a&b = 0x" + hex[(y & 0xf0) >> 4] + hex[y & 0x0f]);	//��X�r��By�ȻP����
		System.out.println ("a|b = 0x" + hex[(z & 0xf0) >> 4] + hex[z & 0x0f]);	//��X�r��Bz�ȻP����
		System.out.println ("a^b = 0x" + hex[(w & 0xf0) >> 4] + hex[w & 0x0f]);	//��X�r��Bw�ȻP����
	}
}