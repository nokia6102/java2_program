//儲存檔名：d:\Chap02\J205_InputNum.java

public class jjj
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("請輸入整數: ");
		int iNum = Integer.parseInt(keyin.readLine());
		System.out.println("輸入的整數1-12: " + iNum);
		switch (iNum)
		{
		case 1:
		case 2:
		case 3:
		System.out.println("春天");
		break;
		case 4:
		case 5:
		case 6:
		break;
		System.out.println("夏天");
		case 7:
		case 8:
		case 9:
		System.out.println("秋天");
		break;
		case 10:
		case 11:
		case 12:
		System.out.println("冬天");
		break;
		default:System.out.println("請重新輸入1-12");
		}
		
		
			
	}
}
