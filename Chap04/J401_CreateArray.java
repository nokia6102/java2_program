// �x�s�ɦW�Gd:\Chap04\J401_CreateArray.java

public class J401_CreateArray
{
	public static void main(String[] args)
	{
		int a[];				//�ŧi��ư}�C
		a = new int[5];	//�ŧi�ëإ߾�ư}�C
		for(int i=0; i<5; i++)
			a[i] = i;	//���w��Ƶ��}�C����
		System.out.println("a[3] = " + a[3]);	//��ܰ}�C���������
	}
}
