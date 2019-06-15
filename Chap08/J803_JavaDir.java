import java.io.*;

class J803_FileFilter implements FilenameFilter	//�w�q�L�o�ɦW��k
{
	private String name;
	private String ext;
	public J803_FileFilter(String name, String ext) {	//�إߪ̤�k
		this.name = name;
		this.ext = ext;
	}
	public boolean accept(File dir, String filename) {	//�w�qaccept��k
		boolean fString = true;
		if(name != null)
			fString &= filename.startsWith(name);
		if(ext != null)
			fString &= filename.endsWith("." + ext);
		return fString;
	}
}

public class J803_JavaDir
{
	static void print(String s) {	//�w�qprint��k
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		File path = new File("C:/jdk1.3/bin");	//�إ��ɮפu�@�ؿ�
		print("�ɮ׸��| " + path);	//��ܤu�@���|
		FilenameFilter x = new J803_FileFilter("java", "exe");	//�w�q�n�L�o���ɦW
		String s[] = path.list(x);	//���o�ŦX���ɦW
		for(int i=0; i<s.length; i++)
			print(s[i]);	//��ܲŦX���ɦW
	}
}
