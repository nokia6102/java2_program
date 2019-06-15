import java.io.*;

public class J811_FileWriter
{
	public static void main(String[] args) throws IOException
	{
		String s1 = "Success is never ending, "
			  + "Failure is never final.\r\n";
		char[] d1 = new char[s1.length()];
		s1.getChars(0, s1.length(), d1, 0);	//s1�s�J�r���w�ľ�d1
		FileWriter fw1 = new FileWriter("J811.txt");	//�إ߼g�J�ɮת���
		for(int i=0; i<d1.length; i++) {
			fw1.write(d1[i]);	//�g�J��@����
		}

		String s2 = "���\�õL���A���ѥä��׵��C\r\n";
		char[] d2 = new char[s2.length()];
		s2.getChars(0, s2.length(), d2, 0);	//s2�s�J�r���w�ľ�d2
		FileWriter fw2 = new FileWriter("J811.txt", true);	//�إߪ��[�ɮת���
		fw2.write(d2);		//�g�J��Ӱ}�C

		fw1.close();	//�����g�J�ɮת���
		fw2.close();	//�������[�ɮת���
	}
}
