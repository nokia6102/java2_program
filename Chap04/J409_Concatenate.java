// 儲存檔名：d:\Chap04\J409_Concatenate.java

public class J409_Concatenate
{
	public static void main(String[] args)
	{
		String s1 = "Java 2 ";	//宣告並啟始字串資料
		String s2 = new String("教學範本");	//建立並指定字串資料
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		String s5 = s1 + "教學範本";
		String s6 = s1.concat("教學範本");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("String s3 = s1 + s2               = " + s3);
		System.out.println("String s4 = s1.concat(s2)         = " + s4);
		System.out.println("String s5 = s1 + \"教學範本\"       = " + s5);
		System.out.println("String s6 = s1.concat(\"教學範本\") = " + s6);
	}
}
