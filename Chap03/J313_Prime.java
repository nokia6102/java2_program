// �x�s�ɦW�Gd:\Chap03\Prime.java

public class J313_Prime
{
	public static void main(String[] args)
	{
		System.out.print("1 �� 30 ������Ʀ�: ");
		for(int i=2; i<=30; i++)	//�j�M 2 �� 30
		{
			for(int j=2; j<i; j++)	//���Ʊq 2 �� i
				if(i%j==0)	//�Y�㰣�h�D���
					break;	//���_���j��
				else if(j==i-1)	//�T�w�����
					System.out.print(i + " ");
		}
	}
}
