// �x�s�ɦW�Gd:\Chap04\J418_BufferCharAt.java

public class J418_BufferCharAt
{
	public static void main(String[] args)
	{
		StringBuffer sb;	//�ŧi�r��w�ľ�
		sb = new StringBuffer("Java 2 �оǽd��");	//�ŧi�r��

		System.out.println("���ܦr��e�G" + sb);
		sb.setCharAt(5, '1');	//�]�w�r��
		System.out.println("�]�w�r����G" + sb);
		sb.deleteCharAt(5);	//�R���r��
		sb.deleteCharAt(5);	//�R���r��
		System.out.println("�R���r����G" + sb);
	}
}
