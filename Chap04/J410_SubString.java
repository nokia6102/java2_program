// 儲存檔名：d:\Chap04\J410_SubString.java

public class J410_SubString
{
	public static void main(String[] args)
	{
		String s1 = "Java 2 教學範本";	//宣告並啟始字串資料
		System.out.println("s1 = " + s1);
		char c1 = s1.charAt(7);	//s1的第7個字元
		System.out.println("s1.toChar(7) = " + c1);
		char a1[] = s1.toCharArray();	//s1的第1個字元
		System.out.println("s1.toCharArray( ) = " + new String(a1));
		char a2[] = new char[5];
		s1.getChars(7, 11, a2, 0);	//s1的7到10字元
		System.out.println("s1.getChars(7, 11, a2, 0) = " + new String(a2));
		String s2 = s1.substring(7, 11);	//s1的7到10字元
		System.out.println("s1.substring(7, 11 ) = " + s2);
	}
}
