// �x�s�ɦW�Gd:\Chap05\J510_Volume.java

class J510_Setting	//�ŧi���O
{
	int length;	//�ŧi�����ܼ�
	int width;	//�ŧi�����ܼ�
	int height;	//�ŧi�����ܼ�
	J510_Setting(int l, int w, int h)	//�إߪ�1
	{
		length = l;	//�]�w����
		width = w;	//�]�w�e��
		height = h;	//�]�w����
	}
	J510_Setting(int l)	//�إߪ�2 (�W��)
	{
		length = width = height = l;	//�]�w���e��
	}
	int getVolume()	//�����n
	{
		return length * width * height;
	}
}

public class J510_Volume
{
	public static void main(String[] args)
	{
		J510_Setting s1 = new J510_Setting(3, 4, 5);	//�H�إߪ�1�إߪ���
		J510_Setting s2 = new J510_Setting(5);	//�H�إߪ�2�إߪ���
		System.out.println("��������n�G" + s1.getVolume());	
		System.out.println("�ߤ�����n�G" + s2.getVolume());
	}
}