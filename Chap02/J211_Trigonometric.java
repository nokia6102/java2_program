//¿x¶s¿…¶W°Gd:\Chap02\J211_Trigonometric.java

public class J211_Trigonometric
{
	public static void main(String[] args)
	{
		double a = Math.sin(Math.toRadians(30));	//a=sin 30¢X
		double b = Math.cos(Math.toRadians(45));	//b=cos 45¢X
		double c = Math.tan(Math.toRadians(60));	//c=tan 60¢X
		double x = Math.sin(Math.toRadians(Math.PI));	//x=sin 180¢X
		double y = Math.cos(Math.toRadians(Math.PI));	//y=cos 180¢X
		double z = Math.tan(Math.toRadians(Math.PI));	//z=tan 180¢X

		System.out.println("Sin 30\u00b0 = " + a);
		System.out.println("Cos 30\u00b0 = " + b);
		System.out.println("Tan 30\u00b0 = " + c);
		System.out.println("Sin 180¢X = " + x);
		System.out.println("Cos 180¢X = " + y);
		System.out.println("Tan 180¢X = " + z);
	}
}