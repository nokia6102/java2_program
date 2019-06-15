// �x�s�ɦW�Gd:\Chap05\J517_BitField.java

public class J517_BitField
{
	static boolean[] flags = new boolean[16];	//�إ�flags�}�C

	public static void setFlag(int arg)	//�]�w�X����k
	{
		flags[arg] = true;
	}
	public static void clsFlag(int arg)	//�M���X����k
	{
		flags[arg] = false;
	}
	public static void notFlag(int arg)	//���ܺX����k
	{
		flags[arg] ^= true;
	}
	public static boolean getFlag(int arg)	//���o�X����k
	{
		return flags[arg];
	}
	public static int addFlag()	//�p��X���`�Ƥ�k
	{
		int sum = 0;
		for(int i=0; i<16; i++)
			if(flags[i] == true)
				sum++;
		return sum;
	}
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader br;	//�ŧiBufferedReader����
		br = new java.io.BufferedReader(
		     new java.io.InputStreamReader(System.in));	//�إߨðt�m����O����
		int number;	//�ŧi����ܼ�
		System.out.println("1.�]�w�X��  2.�M���X��  3.���ܺX��  "
				 + "4.���o�X��  5.�X���`��  6.�����{��");
		while(true) {
			System.out.print("�п�� 1-6�G");
			char sel = (char)System.in.read();	//Ū����L��J�r��
			System.in.read(); System.in.read();	//Ū��LF�PCR�X

			switch(sel) {	//�P�_��J�r��
			    case '1':	//�Y��J�r��='1'
				System.out.print("�п�J�X���G");
				number = Integer.parseInt(br.readLine());	//Ū���r����ন���
				setFlag(number);	//�I�ssetFlag��k
				break;
			    case '2':	//�Y��J�r��='2'
				System.out.print("�п�J�X���G");
				number = Integer.parseInt(br.readLine());	//Ū���r����ন���
				clsFlag(number);	//�I�sclsFlag��k
				break;
			    case '3':	//�Y��J�r��='3'
				System.out.print("�п�J�X���G");
				number = Integer.parseInt(br.readLine());	//Ū���r����ন���
				notFlag(number);	//�I�snotFlag��k
				break;
			    case '4':	//�Y��J�r��='4'
				System.out.print("�п�J�X���G");
				number = Integer.parseInt(br.readLine());	//Ū���r����ন���
				System.out.println("�X�� " + number + " = " 
						+ getFlag(number));	//�I�sgetFlag��k
				break;
			    case '5':	//�Y��J�r��='5'
				System.out.println("�X����1���ӼơG" 
						+ addFlag());	//�I�saddFlag��k
				break;
			    case '6':	//�Y��J�r��='6'
				return;
			}
		}
	}
}
