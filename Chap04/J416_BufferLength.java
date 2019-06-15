// 儲存檔名：d:\Chap04\J416_BufferLength.java

public class J416_BufferLength
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("Java 2 教學範本");
		System.out.println("來源字串：" + s1);
		System.out.println("字串長度：" + s1.length());	//取得長度
		System.out.println("字串容量：" + s1.capacity());	//取得容量
		s1.setLength(40);	//設定長度
		System.out.println("字串長度：" + s1.length());	//取得長度
		System.out.println("字串容量：" + s1.capacity());	//取得容量
	}
}
