import java.io.*;

public class J812_CharArrayReader
{
	static void print(String s) {	//�w�q��ܦr���k
		System.out.print(s);
	}
	static void print(char c) {	//�w�q��ܦr����k
		System.out.print(c);
	}
	public static void main(String[] args) throws IOException
	{
		String s = "Focus on giving, instead of getting.";
		char[] c = new char[s.length()];
		s.getChars(0, s.length(), c, 0);	//�Ns�r��s�J�w�ľ�c
		int i;

		CharArrayReader car1 = new CharArrayReader(c);	//�إ�car1����
		print("��r�}�C 1�G");
		while((i=car1.read()) != -1) {	//Ū��car1����r��
			print((char) i);	//���Ū�����r��
		}
		print('\n');

		CharArrayReader car2 = new CharArrayReader(c, 0, 16);	//�إ�car2����
		print("��r�}�C 2�G");
		while((i=car2.read()) != -1) {	//Ū��car2����r��
			print((char) i);	//���Ū�����r��
		}
		print('\n');
	}
}
