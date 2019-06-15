import java.io.File;

public class J802_Directory
{
	static void print(String s) {	//宣告輸出方法
		System.out.print(s);
	}
	public static void main(String[] args)
	{
		String path = "C:/jdk1.3";	//定義工作路徑
		File f = new File(path);	//建立檔案類別
		if(f.isDirectory()) {		//測試是否為目錄
			print("檔案路徑 " + path + "\n");	//顯示工作路徑
			String s[] = f.list();	//取得目錄中的成員資料
			for(int i=0; i<s.length; i++) {	//迴圈
				File fn = new File(path + "/" + s[i]);	//建立路徑與檔名物件
				if(fn.isDirectory()) {	//檢查是否為目錄
					print(s[i] + " 是目錄\n");
				} else {
					print(s[i] + " 是檔案\t");
					print("檔案大小：" + s[i].length() + "Bytes\n");
				}
			}
		}
	}
}
