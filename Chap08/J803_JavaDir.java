import java.io.*;

class J803_FileFilter implements FilenameFilter	//定義過濾檔名方法
{
	private String name;
	private String ext;
	public J803_FileFilter(String name, String ext) {	//建立者方法
		this.name = name;
		this.ext = ext;
	}
	public boolean accept(File dir, String filename) {	//定義accept方法
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
	static void print(String s) {	//定義print方法
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		File path = new File("C:/jdk1.3/bin");	//建立檔案工作目錄
		print("檔案路徑 " + path);	//顯示工作路徑
		FilenameFilter x = new J803_FileFilter("java", "exe");	//定義要過濾的檔名
		String s[] = path.list(x);	//取得符合的檔名
		for(int i=0; i<s.length; i++)
			print(s[i]);	//顯示符合的檔名
	}
}
