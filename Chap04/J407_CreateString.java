// 儲存檔名：d:\Chap04\J407_CreateString.java

public class J407_CreateString
{
	public static void main(String[] args)
	{
		String s1;			//宣告字串變數
		s1 = "Java 1";		//s1 = "Java 1"
		String s2 = "Java 2";	//s2 = "Java 2"
		String s3 = new String();	//建立字串物件
		s3 = "jdk1.3";		//s3 = "jdk1.3"
		String s4 = new String("Wonder4 Jara");	//s4 = "Wonder4 Jara"
		byte[] b = {65, 66, 67, 68, 69, 70};
		String s5 = new String(b);	//s5 = "ABCDEF"
		char[] c = {'a', 'b', 'c', 'd', 'e', 'f'};
		String s6 = new String(c, 2, 3);	//s6 = "cde"

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);
		System.out.println("s6 = " + s6);
	}
}
