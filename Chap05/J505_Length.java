// �x�s�ɦW�Gd:\Chap05\J505_Length.java

class J505_Transfer	//�ŧi���O
{
	double cm;	//�ŧi�����ܼ�
	double getCM(float in)	//�����ഫ��k
	{
		cm = in * 2.54;	//�^�T�ন����	
		return cm;	//��^�öǻ�cm
	}
}

public class J505_Length
{
	public static void main(String[] args)
	{
		J505_Transfer l = new J505_Transfer();	//�إ����O����
		System.out.print("�^�T\t����\n");	//��ܦr��
		for(int in=1; in<=10; in++)	//1��10�^�T�j��
		{
			System.out.println(" " + in + "\t" 
				+ l.getCM(in));	//�I�sgetCM��k
		}
	}
}