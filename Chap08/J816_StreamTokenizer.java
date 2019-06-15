import java.io.*;

public class J816_StreamTokenizer
{
	public static void main(String[] args) throws IOException
	{
		String s = "Success is never ending, failure is never final.";
		char[] data = new char[s.length()];	//�w�q�w�ľ�data�}�C
		s.getChars(0, s.length(), data, 0);	//�r��s�s�J�w�ľ�data
		CharArrayReader car = new CharArrayReader(data);	//data�s�Jcar����
		StreamTokenizer tok = new StreamTokenizer(car);	//car����s�Jtok����
		while(tok.nextToken() != StreamTokenizer.TT_EOF)	//Ū���U�@�Ӧr
		{
			if(tok.ttype == StreamTokenizer.TT_WORD)	//�Y���A�ۦP
				System.out.println(tok.sval);	//���Ū�����r
		}
	}
}
