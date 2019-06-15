// 儲存檔名：d:\Chap04\J412_StringReplace.java

public class J412_StringReplace
{
	public static void main(String[] args) throws java.io.IOException
	{
		String s1 = "Programmers have used C++ for applications and \n"
				+ "applets as long as the C++ platform has been \n"
				+ "available. The C++ platform provides everything \n"
				+ "you need to create applications and applets.";
		String s2 = "C++";	//要找尋的舊字串
		String s3 = "Java 1";	//要取代的新字串

		System.out.println("取代前:\n" + s1);
		int index = 0;
		for(int i=0; i<3; i++) {
			index = s1.indexOf(s2, index);	//找尋下一個相符舊字串
			s1 = s1.substring(0, index) + s3 	//取代下一個相符字串
				+ s1.substring(index + s2.length(), s1.length());
		}
		System.out.println("\n使用 substring 以 Java 1 取代 C++ 後:\n" + s1);

		s1 = s1.replace('1', '2');	//以2取代所有的1
		System.out.println("\n使用 replace 以 2 取代 1 後:\n" + s1);
	}
}
