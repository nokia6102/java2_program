import java.io.File;

public class J801_FileMethod
{
	static void print(String s) {
		System.out.print(s);
	}

	public static void main(String[] args)
	{
		File f = new File("C:/jdk1.3/bin/java.exe");	//建立檔案類別
		print("檔案名稱：" + f.getName() + "\n");	//取得檔案名稱
		print("檔案路徑：" + f.getPath() + "\n");	//取得檔案路徑
		print("絕對路徑：" + f.getAbsolutePath() + "\n");	//取得絕對路徑
		print("上層目錄：" + f.getParent() + "\n");	//取得上層目錄名稱
		print("檔案大小：" + f.length() + " bytes\n");	//取得檔案大小
		print("最後修改：" + f.lastModified() + "\n");	//取得最後修改時間
		print("是否存在：");
		print(f.exists() ? "存在\n" : "不存在\n");	//檢查是否存在
		print("可否讀取：");
		print(f.canRead() ? "可讀取\n" : "不可讀\n");	//檢查是否可讀取
		print("可否寫入：");
		print(f.canWrite() ? "可寫入\n" : "不可寫\n");	//檢查是否可寫入
	}
}
