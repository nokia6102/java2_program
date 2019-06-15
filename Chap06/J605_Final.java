// 儲存檔名：d:\Chap06\J605_Final.java

abstract class J605_Line
{
	private int length, width;
	J605_Line(int length, int width) { 	//宣告J605_Line建立者
		this.length = length; 	//變數length=參數length
		this.width = width; 	//變數width=參數width
	}
	int getLength() {  	//宣告getLength方法
		return this.length;	//傳回變數length值
	}
	int getWidth() {  	//宣告getWidth方法
		return this.width;	//傳回變數width值
	}
	abstract double getArea();	//宣告抽象方法
}

class J605_Rectangle extends J605_Line
{
	J605_Rectangle(int length, int width) {  	//宣告J605_Rectangle建立者
		super(length, width);	//呼叫基礎類別建立者
	}
	double getArea() {  	//超載getArea()方法
		return getLength() * getWidth(); 	//傳回正方形面積
	}
}

final class J605_Triangle extends J605_Rectangle
{
	J605_Triangle(int length, int width) {  	//宣告J605_Triangle建立者
		super(length, width);	//呼叫基礎類別建立者
	}
	final double getArea() {  	//超載getArea()方法
		return super.getArea() / 2; 	//傳回三角形面積
	}
}

class J605_Final {
	public static void main(String args[]) {
		J605_Rectangle rect = new J605_Rectangle(7, 4);	//建立J605_Rectangle物件
		J605_Triangle tri = new J605_Triangle(6, 3);	//建立J605_Triangle物件
		System.out.print("長方形的長 = " + rect.getLength());	//呼叫Rectangle的方法
		System.out.print("\t長方形的寬 = " + rect.getWidth());	//呼叫Rectangle的方法
		System.out.println("\t長方形面積 = " + rect.getArea());	//呼叫Rectangle的方法
		System.out.print("三角形的長 = " + tri.getLength());	//呼叫Triangle的方法
		System.out.print("\t三角形的寬 = " + tri.getWidth());	//呼叫Triangle的方法
		System.out.println("\t三角形面積 = " + tri.getArea());	//呼叫Triangle的方法
	}
}
