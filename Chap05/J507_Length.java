// �x�s�ɦW�Gd:\Chap05\J507_Length.java

class J507_Transfer	//�ŧi���O
{
	float in;	//�ŧi�����ܼ�
	J507_Transfer(int cm)	//�����ഫ��k
	{
		in = cm / 2.54f;	//�����ন�^�T
	}
	float getInch()
	{
		return in;
	}
}

public class J507_Length
{
	public static void main(String[] args)
	{
		System.out.print("����\t�^�T\n");	//��ܦr��
		for(int cm=1; cm<=10; cm++)	//1��10�����j��
		{
			System.out.println(" " + cm + "\t" 
				+ (new J507_Transfer(cm).getInch()));	//�I�sgetInch��k
		}
	}
}