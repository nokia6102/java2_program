//儲存檔名：d:\Chap02\J216_Compare.java

public class J216_Compare
{
	public static void main(String[] args)
	{
		int a = Math.abs(-2);	//a=|-2|
		int b = 1;	//b=1
		System.out.println("a = " + a);	//輸出a
		System.out.println("b = " + b);	//輸出b
		System.out.print(Math.max(a, b)+ " > ");	//輸出較大值
		System.out.print(Math.min(a, b));	//輸出較小值
	}
}
