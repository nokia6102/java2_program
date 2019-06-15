import java.io.*;

public class J806_ByteArrayInputStream
{
	static void print(char s) {	//�w�q�ù���X��k
		System.out.print(s);
	}

	public static void main(String[] args) throws IOException
	{
		byte[] data = "Success is never ending.".getBytes();
		ByteArrayInputStream arrayIn = 
			new ByteArrayInputStream(data);	//�إߦ줸�տ�J��C
		int ch;
		while((ch = arrayIn.read()) != -1)	//�Y���O��C����
			print((char) ch);	//�h���Ū�����
	}
}
