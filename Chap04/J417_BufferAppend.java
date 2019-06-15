// 儲存檔名：d:\Chap04\J417_BufferAppend.java

public class J417_BufferAppend
{
	public static void main(String[] args) throws java.io.IOException
	{
		StringBuffer sb = new StringBuffer("Java");	//宣告字串緩衝器
		String s = " 教學手冊";	//宣告字串

		System.out.println("改變字串前：" + sb);
		sb.append(s);	//附加字串
		System.out.println("附加字串後：" + sb);
		sb.insert(4, " 1.2");	//插入字串
		System.out.println("插入字串後：" + sb);
		sb.replace(11, 13, "範本");	//取代字串
		System.out.println("取代字串後：" + sb);
		sb.delete(5, 7);	//刪除字串
		System.out.println("刪除字串後：" + sb);
	}
}
