import java.io.*;
import java.util.zip.*;

public class J819_UnZipFile
{
	public static void main(String[] args) throws IOException
	{
		String dirName = "d:/chap08";
		String zipName = "J818_ZipFile.zip";
		String fileName = "J818_ZipFile.txt";

		//解壓縮來源檔案
		File myDataZip = new File(dirName, zipName);
		ZipInputStream myZipFile = new ZipInputStream(
				      	   new FileInputStream(myDataZip));
		ZipEntry myZipEntry = myZipFile.getNextEntry();
		System.out.println("被壓縮檔名：" + myZipEntry.getName());
		DataInputStream dataIn = new DataInputStream(
					 new BufferedInputStream(myZipFile));

		//寫入文字檔案
		byte[] data = new byte[dataIn.available()];
		FileOutputStream fstTxtFile = 
			new FileOutputStream(fileName);
		FileOutputStream secTxtFile = 
			new FileOutputStream(fileName, true);
		boolean EOF = false, SOF = true;
		while(!EOF) {
			try {
				dataIn.readFully(data);
			} catch (IOException e) {
				EOF = true;
			}
			if(SOF) {
				fstTxtFile.write(data);
				SOF = false;
			} else {
				secTxtFile.write(data);
			}
		}
		System.out.println("解壓檔檔名：" + fileName);
		fstTxtFile.close();
		secTxtFile.close();
		dataIn.close();
	}
}
