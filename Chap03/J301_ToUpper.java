// �x�s�ɦW�Gd:\Chap03\J301_ToUpper.java

public class J301_ToUpper
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inkey;
		System.out.print("�Ы����N��G");
		inkey = (char)System.in.read();	//inkey=��J�r��
		System.in.read(); System.in.read();	//Ū��cr�Plf����X
		if (inkey >= 'a' && inkey <= 'z')	//�Yinkey���p�g�r��
			inkey -= 0x20;	//�p�g�ন�j�g
		System.out.println("��J�r�����G" + inkey);
	}
}
