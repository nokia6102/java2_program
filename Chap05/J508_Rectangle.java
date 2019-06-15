// 儲存檔名：d:\Chap05\J508_Rectangle.java

class J508_Calculate	//宣告類別
{
	double length;	//宣告物件變數
	double width;	//宣告物件變數
	J508_Calculate(double l, double w)	//宣告類別建立者
	{
		length = l;	//令length=參數l
		width = w;	//令width=參數w
	}
	double circumference()	//計算周長方法
	{
		return 2 * (length + width);	//傳回周長
	}
	double area()	//計算面積方法
	{
		return length * width;	//傳回面積
	}
}

public class J508_Rectangle
{
	public static void main(String[] args)
	{
		double l = 8.0;
		double w = 4.0;
		J508_Calculate rect = new J508_Calculate(l, w);	//建立類別物件
		System.out.println("計算長方形周長與面積");	//顯示字串
		System.out.println("長 = " + l);	//顯示長
		System.out.println("寬 = " + w);	//顯示寬
		System.out.println("周長 = " + rect.circumference());	//顯示周長
		System.out.println("面積 = " + rect.area());	//顯示面積
	}
}