// �x�s�ɦW�Gd:\Chap05\J502_Weight.java

public class J502_Weight
{
	static double weight(float lb)	//���q�ഫ��k
	{
		double kg = 1;	//�ŧi�ϰ��ܼ�
		kg = lb / 2.20462;	//�S�ন����	
		return kg;	//��^�öǻ�Kg
	}

	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		float lb;	//�ŧi�ϰ��ܼ�
		while(true)	//�L�a�j��
		{
			System.out.print("�п�J�n�ഫ���S�ơA��J 0 �h�����G");	//��ܦr��
			lb = Float.parseFloat(keyin.readLine());	//��J�B�I�ƭ�
			if (lb == 0) break;	//�Y��J0�h���_�j��
			System.out.println(lb + "�S = " + weight(lb) + "����");	//�I�sWeight��k
		}
	}
}
