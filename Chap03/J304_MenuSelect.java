// �x�s�ɦW�Gd:\Chap03\J304_MenuSelect.java

public class J304_MenuSelect
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inChar;
		System.out.print("a. �s�W���\tb. ���J���\tc. �R�����\t��L. �����{���G");
		inChar = (char)System.in.read();	//inChar=��J�r��
		System.in.read(); System.in.read();	//Ū��cr�Plf����X
		switch (inChar)
		{
			case 'A':	//�YinChar��A�r��
			case 'a':	//��inChar��a�r��
				System.out.println("�s�W���");
				break;
			case 'B':	//�YinChar��B�r��
			case 'b':	//��inChar��b�r��
				System.out.println("���J���");
				break;
			case 'C':	//�YinChar��C�r��
			case 'c':	//��inChar��c�r��
				System.out.pri
		}
	}
}
