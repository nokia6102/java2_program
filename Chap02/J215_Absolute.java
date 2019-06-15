//¿x¶s¿…¶W°Gd:\Chap02\J215_Absolute.java

public class J215_Absolute
{
	public static void main(String[] args)
	{
		int a = Math.abs(-2);		//a=|-2|
		long b = Math.abs(-123456789L);		//b=|-123456789|
		float c = Math.abs(-1.38E13F);		//c=|-1.38*1013|
		double d = Math.abs(-1.38E13);		//d=|-1.38*1013|
		System.out.println("|-2| = " + a);
		System.out.println("|-123456789| = " + b);
		System.out.println("|-1.38E13| = " + c);
		System.out.println("|-1.38E13| = " + d);
	}
}
