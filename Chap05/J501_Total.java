// �x�s�ɦW�Gd:\Chap05\J501_Total.java

public class J501_Total
{
	static int total(int n)	//�p���`�M���
	{
		int sum = 0;	//�ŧi�ϰ��ܼ�
		for (int i=1; i<=n; i++)	//�p���`�M�j��
			sum += i;
		return sum;	//�Ǧ^�p�⵲�G
	}

	public static void main(String[] args)
	{
		System.out.println("1+2+3+...+10 = " + total(10));	//�I�s��k
		System.out.println("1+2+3+...+100 = " + total(100));	//�I�s��k
		System.out.println("1+2+3+...+500 = " + total(500));	//�I�s��k
	}
}
