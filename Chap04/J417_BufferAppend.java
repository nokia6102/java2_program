// �x�s�ɦW�Gd:\Chap04\J417_BufferAppend.java

public class J417_BufferAppend
{
	public static void main(String[] args) throws java.io.IOException
	{
		StringBuffer sb = new StringBuffer("Java");	//�ŧi�r��w�ľ�
		String s = " �оǤ�U";	//�ŧi�r��

		System.out.println("���ܦr��e�G" + sb);
		sb.append(s);	//���[�r��
		System.out.println("���[�r���G" + sb);
		sb.insert(4, " 1.2");	//���J�r��
		System.out.println("���J�r���G" + sb);
		sb.replace(11, 13, "�d��");	//���N�r��
		System.out.println("���N�r���G" + sb);
		sb.delete(5, 7);	//�R���r��
		System.out.println("�R���r���G" + sb);
	}
}
