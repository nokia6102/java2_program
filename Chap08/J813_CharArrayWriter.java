import java.io.*;

public class J813_CharArrayWriter
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char s) {
		System.out.print(s);
	}
	public static void main(String[] args) throws IOException
	{
		String s1 = "�I����󬰦��֡I";
		char[] d1 = new char[s1.length()];
		s1.getChars(0, s1.length(), d1, 0);	//�Ns1�r��s�Jd1�w�ľ�
		CharArrayWriter caw = new CharArrayWriter();	//�إ�caw����
		caw.write(d1);	//�Nd1�g�Jcaw����
		print("���󤺮e�G" + caw.toString()+ '\n');	//���caw���󤺮e

		char[] c = caw.toCharArray();	//�Ncaw���e�s�J�}�Cc
		print("�}�C���e�G");
		for(int i=0; i<c.length; i++)	//��ܦr���}�C�j��
			print(c[i]);	//��ܳ�@�r��
		print('\n');	//��ܸ���

		FileWriter fw = new FileWriter("J813.txt");	//�إ߼g�J�ɮת���
		caw.writeTo(fw);	//�N�}�C����g�J�ɮ�
		fw.close();	//�����g�J�ɮ�
		print("�g�J J813.txt �ɮצ��\\n");	//��ܰT��

		caw.reset();	//���ʼg�J���Ц^�_�I
		caw.write("���]���󤺮e");	//�N�T���g�Jcaw����
		print(caw.toString());	//���caw������
	}
}
