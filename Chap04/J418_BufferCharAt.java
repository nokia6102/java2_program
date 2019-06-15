// 儲存檔名：d:\Chap04\J418_BufferCharAt.java

public class J418_BufferCharAt
{
	public static void main(String[] args)
	{
		StringBuffer sb;	//宣告字串緩衝器
		sb = new StringBuffer("Java 2 教學範本");	//宣告字串

		System.out.println("改變字串前：" + sb);
		sb.setCharAt(5, '1');	//設定字元
		System.out.println("設定字元後：" + sb);
		sb.deleteCharAt(5);	//刪除字元
		sb.deleteCharAt(5);	//刪除字元
		System.out.println("刪除字元後：" + sb);
	}
}
