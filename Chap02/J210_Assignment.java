//儲存檔名：d:\Chap02\J210_Assignment.java

public class J210_Assignment
{
	public static void main(String[] args)
	{
		float a, b, c, d, x = 6;	//宣告變數a,b,c,d,x
		int f = 20;	//宣告變數f = 20
		a = b = c = d = 20;	//令a=b=c=d=20
		System.out.print ("a = b = c = d = f = 20,");
		System.out.println (" x = 6");	//輸出字串
		System.out.println ("a += x = " + (a += x));	//輸出字串與a值
		System.out.println ("b -= x = " + (b -= x));	//輸出字串與b值
		System.out.println ("c *= x = " + (c *= x));	//輸出字串與c值
		System.out.println ("d /= x = " + (d /= x));	//輸出字串與d值
		System.out.println ("f %= x = " + (f %= 6));	//輸出字串與f值
	}
}
