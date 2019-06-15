import java.io.*;

public class J810_FileReader
{
	public static void main(String[] args) throws IOException
	{
		FileReader filRead = 
			new FileReader("J810_FileReader.java");	//建立FileReader物件
		BufferedReader bufRead = 
			new BufferedReader(filRead);		//BufferedReader物件
		String s;
		while((s=bufRead.readLine()) != null) {		//讀取一字串,若非空字串
			System.out.println(s);			//顯示字串
		}
		filRead.close();				//關閉FileReader物件
	}
}
