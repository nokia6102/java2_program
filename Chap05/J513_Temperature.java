// �x�s�ɦW�Gd:\Chap05\J513_Temperature.java

class J513_Transfer
{
	float f;	//�ŧi�����ܼ�
	float getC(float c)	//�ū��ഫ��k
	{
		f = ((9 * c) / 5) + 32;	//����ন�ؤ�	
		return f;	//��^�öǻ�f
	}
}

public class J513_Temperature
{
	public static void main(String[] args)
	{
		float c = Float.parseFloat(args[0]);	//�r���ন�B�I�ƭ�
		J513_Transfer f = new J513_Transfer();	//�إ����O����
		System.out.println(c + "�XC = " + f.getC(c) + "�XF");	//�I�sTransfer��k
	}
}