// �x�s�ɦW�Gd:\Chap05\J503_Weight.java

public class J503_Weight
{
	static float weight(float kg)	//���q�ഫ��k
	{
		float lb;	//�ŧi�ϰ��ܼ�
		lb = kg * 2.20462f;	//�����ন�S
		return lb;	//��^�öǻ�lb
	}

	public static void main(String[] args)
	{
		float[] kg = {40, 50, 60, 70, 80};	//�ŧi�ϰ��ܼ�
		float[] lb = new float[5];	//�ŧi�ϰ��ܼ�
		System.out.println("����\t�S");	//��ܦr��
		for(int i=0; i<5; i++)	//�L�a�j��
		{
			System.out.println(kg[i] + "\t" + weight(kg[i]));	//�I�sWeight��k
		}
	}
}
