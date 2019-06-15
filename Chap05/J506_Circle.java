// 儲存檔名：d:\Chap05\J506_Circle.java

class J506_Calculate	//宣告類別
{
	double radius;	//宣告物件變數
	void setRadius(double r)	//設定半徑方法
	{
		radius = r;	//設定半徑
	}
	double circumference()	//計算圓周長方法
	{
		return 2 * Math.PI * radius;	//傳回圓周長
	}
	double area()	//計算圓面積方法
	{
		return Math.PI * Math.pow(radius, 2);	//傳回圓面積
	}
}

public class J506_Circle
{
	public static void main(String[] args)
	{
		J506_Calculate c = new J506_Calculate();	//建立類別物件
		double r = 5.0;
		System.out.println("計算圓周長與圓面積");	//顯示字串
		System.out.println("半徑 = " + r);	//顯示長
		c.setRadius(r);	//設定半徑
		System.out.println("圓周長 = " + c.circumference());	//顯示周長
		System.out.println("圓面積 = " + c.area());			//顯示面積
	}
}