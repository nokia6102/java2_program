// 儲存檔名：d:\Chap06\J602_Dispatch.java

class J602_Line
{
	private int length;
	J602_Line(int length) { 	//宣告J602_Line建立者
		this.length = length; 	//變數length=參數length
	}
	int getLength() {  	//宣告取得length方法
		return this.length;	//傳回變數length值
	}
}

class J602_Square extends J602_Line
{
	J602_Square(int length) {  	//宣告J602_Square建立者
		super(length);	//呼叫基礎類別建立者
	}
	double getArea() {  	//宣告取得area方法
		return Math.pow(getLength(), 2); 	//傳回正方形面積
	}
}

class J602_Circle extends J602_Line
{
	J602_Circle(int radius) {  	//宣告J602_Circle建立者
		super(radius);	//呼叫基礎類別建立者
	}
	double getArea() {  	//宣告取得area方法
		return Math.PI * Math.pow(getLength(), 2); 	//傳回圓形面積
	}
}

class J602_Dispatch {
	public static void main(String args[]) {
		J602_Square squ = new J602_Square(5);	//建立J602_Square物件
		J602_Circle cir = new J602_Circle(10);	//建立J602_Circle物件
		System.out.print("正方形邊長 = " + squ.getLength());	//呼叫Square的方法
		System.out.println("\t正方形面積 = " + squ.getArea());	//呼叫Square的方法
		System.out.print("圓形半徑 = " + cir.getLength());	//呼叫Square的方法
		System.out.println("\t圓形面積 = " + cir.getArea());	//呼叫Circle的方法
	}
}
