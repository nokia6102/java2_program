//儲存檔名：d:\Chap02\J214_Round.java

public class J214_Round
{
	public static void main(String[] args)
	{
		double a = Math.sin(Math.toRadians(30));		//a=sin 30°
		double b = Math.cos(Math.toRadians(45));		//b=cos 45°
		double c = Math.tan(Math.toRadians(60));		//c=tan 60°
		double d = Math.ceil(a*1000)/1000;		//d >= a
		double e = Math.floor(b*1000)/1000;		//e <= b
		double f = Math.rint(c*1000)/1000;		//f = c四捨六入
		double g = Math.round(c*1000)/1000;		//g只保留c整數值
		System.out.println("sin 30° = " + a + " = " + d);
		System.out.println("cos 45° = " + b + " = " + e);
		System.out.println("tan 60° = " + c + " = " + f);
		System.out.println("tan 60° = " + c + " = " + g);
	}
}
