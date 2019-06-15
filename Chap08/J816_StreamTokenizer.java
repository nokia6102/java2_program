import java.io.*;

public class J816_StreamTokenizer
{
	public static void main(String[] args) throws IOException
	{
		String s = "Success is never ending, failure is never final.";
		char[] data = new char[s.length()];	//定義緩衝器data陣列
		s.getChars(0, s.length(), data, 0);	//字串s存入緩衝器data
		CharArrayReader car = new CharArrayReader(data);	//data存入car物件
		StreamTokenizer tok = new StreamTokenizer(car);	//car物件存入tok物件
		while(tok.nextToken() != StreamTokenizer.TT_EOF)	//讀取下一個字
		{
			if(tok.ttype == StreamTokenizer.TT_WORD)	//若型態相同
				System.out.println(tok.sval);	//顯示讀取的字
		}
	}
}
