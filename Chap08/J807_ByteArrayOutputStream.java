import java.io.*;

public class J807_ByteArrayOutputStream
{
	public static void main(String[] args) throws IOException
	{
		byte[] data = "Failure is never final.".getBytes();
		ByteArrayOutputStream arrayOut = new 
			ByteArrayOutputStream();	//建立位元組輸出串列
		arrayOut.write(data);	//data寫入arrayOut
		System.out.println(arrayOut.toString());	//顯示串列的資料

		OutputStream fileOut = new 
			FileOutputStream("J807.txt");	//建立檔案輸出串列物件
		arrayOut.writeTo(fileOut);	//arrayOut寫入fileOut
		fileOut.close();	//關閉檔案輸出串列物件
	}
}
