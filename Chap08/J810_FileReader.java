import java.io.*;

public class J810_FileReader
{
	public static void main(String[] args) throws IOException
	{
		FileReader filRead = 
			new FileReader("J810_FileReader.java");	//�إ�FileReader����
		BufferedReader bufRead = 
			new BufferedReader(filRead);		//BufferedReader����
		String s;
		while((s=bufRead.readLine()) != null) {		//Ū���@�r��,�Y�D�Ŧr��
			System.out.println(s);			//��ܦr��
		}
		filRead.close();				//����FileReader����
	}
}
