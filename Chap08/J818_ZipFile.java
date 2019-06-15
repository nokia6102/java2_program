import java.io.*;
import java.util.zip.*;

public class J818_ZipFile
{
	static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) throws IOException
	{
		String dirName = "d:/chap08";
		String zipName = "J818_ZipFile.zip";
		String fileName = "J818_ZipFile.java";

		//讀取來源檔案
		FileReader readFile = new FileReader(fileName);
		BufferedReader buf = new BufferedReader(readFile);
		String s1 = "", s2;
		while((s2=buf.readLine()) != null) {
			s1 = s1.concat(s2 + "\r\n");
		}
		char[] data = new char[s1.length()];
		s1.getChars(0, s1.length(), data, 0);
		readFile.close();

		//壓縮來源檔案
		File myDataZip = new File(dirName, zipName);
		myDataZip.createNewFile();
		ZipOutputStream myZipFile = new ZipOutputStream(
				      	    new FileOutputStream(myDataZip));
		ZipEntry myZipEntry = new ZipEntry(fileName);
		myZipFile.putNextEntry(myZipEntry);
		DataOutputStream myFile = new DataOutputStream(
					  new BufferedOutputStream(myZipFile));
		for(int i=0; i<data.length; i++)
			myFile.write(data[i]);
		myFile.flush();
		myZipFile.closeEntry();
		myFile.close();

		//取得檔案大小
		File test1 = new File(fileName);	//建立檔案類別
		print("文字檔大小：" + test1.length() + " bytes");
		File test2 = new File(zipName);	//建立檔案類別
		print("壓縮檔大小：" + test2.length() + " bytes");
	}
}