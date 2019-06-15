// 儲存檔名：d:\Chap06\J604_Abstract.java

abstract class J604_Line
{
	private int length;
	J604_Line(int length) { 	//宣告J604_Line建立者
		this.length = length; 	//變數length=參數length
	}
	int getLength() {  	//宣告取得length方法
		return this.length;	//傳回變數length值
	}
	abstract double getArea();	//宣告抽象方法
}

class J604_Square extends J604_Line
{
	J604_Square(int length) {  	//宣告J604_Square建立者
		super(length);	//呼叫基礎類別建立者
	}
	double getArea() {  	//超載getArea()方法
		return Math.pow(getLength(), 2); 	//傳回正方形面積
	}
}

class J604_Circle extends J604_Line
{
	J604_Circle(int radius) {  	//宣告J604_Circle建立者
		super(radius);	//呼叫基礎類別建立者
	}
	double getArea() {  	//超載getArea()方法
		return Math.PI * Math.pow(getLength(), 2); 	//傳回圓形面積
	}
}

class J604_Abstract {
	public static void main(String args[]) {
		J604_Square squ = new J604_Square(5);	//建立J604_Square物件
		J604_Circle cir = new J604_Circle(10);	//建立J604_Circle物件
		System.out.print("正方形邊長 = " + squ.getLength());	//呼叫Square的方法
		System.out.println("\t正方形面積 = " + squ.getArea());	//呼叫Square的方法
		System.out.print("圓形半徑 = " + cir.getLength());	//呼叫Square的方法
		System.out.println("\t圓形面積 = " + cir.getArea());	//呼叫Circle的方法
	}
}
