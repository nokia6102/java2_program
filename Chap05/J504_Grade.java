// �x�s�ɦW�Gd:\Chap05\J504_Grade.java

public class J504_Grade
{

	static int score(int i, int array[][])	//�p���`����k
	{
		int sum = 0;	//�ŧi�ϰ��ܼ�
		for (int j = 0; j < 3; j++)	//�p���`���j��
			sum += array[i][j];
		return sum;	//��^�öǦ^sum
	}

	public static void main(String[] args)
	{
		String[] name1 = {"�i�T", "���|", "����"};	//�ŧi�m�W�}�C
		int[][] record = {{90, 80, 70},
				  {80, 80, 90},
				  {70, 80, 70}};	//�ŧi���Z�}�C
		System.out.print("�m�W\t" + "���\t" + "�^��\t");
		System.out.println("�ƾ�\t" + "�`��\t" + "����");	//������r��
		for (int i = 0; i < 3; i++)	//��ܦ��Z�j��
		{
			System.out.println(name1[i] + "\t"	//��ܰ}�C��
			 	+ record[i][0] + "\t"	//��ܲĤ@�����
			 	+ record[i][0] + "\t"	//��ܲĤG�����
			 	+ record[i][0] + "\t"	//��ܲĤT�����
			 	+ score(i, record) + "\t"	//��ܤ�k�Ǧ^��
			 	+ score(i, record) / 3);	//��ܤ�k�Ǧ^��
		}
	}
}