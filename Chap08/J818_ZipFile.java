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

		//Ū���ӷ��ɮ�
		FileReader readFile = new FileReader(fileName);
		BufferedReader buf = new BufferedReader(readFile);
		String s1 = "", s2;
		while((s2=buf.readLine()) != null) {
			s1 = s1.concat(s2 + "\r\n");
		}
		char[] data = new char[s1.length()];
		s1.getChars(0, s1.length(), data, 0);
		readFile.close();

		//���Y�ӷ��ɮ�
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

		//���o�ɮפj�p
		File test1 = new File(fileName);	//�إ��ɮ����O
		print("��r�ɤj�p�G" + test1.length() + " bytes");
		File test2 = new File(zipName);	//�إ��ɮ����O
		print("���Y�ɤj�p�G" + test2.length() + " bytes");
	}
}