//儲存檔名：d:\Chap02\J207_Logic.java

public class J207_Logic
{
	public static void main(String[] args)
	{
	byte a = 1, b = 4, c = 4;	//宣告並啟始a, b, c值
	boolean x = a < b && a < c;	//宣告並指定 x 值
	System.out.println ("a=" + a);	//輸出字串、a值、跳行
	System.out.println ("b=" + b);	//輸出字串、b值、跳行
	System.out.println ("c=" + c);	//輸出字串、c值、跳行
	System.out.println ("a<b && a<c = " + x);	//輸出字串、x 值
	}
}