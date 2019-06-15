// 儲存檔名：d:\Chap06\J601_SuperConstructor.java

class J601_Rectangle
{
	private int length, width;
	J601_Rectangle() {	//基礎類別無參數建立者
		length = 0;	//物件變數length=0
		width = 0;	//物件變數width=0
	}
	J601_Rectangle(int length, int width) {	//基礎類別有參數建立者
		this.length = length;	//令物件變數=參數值
		this.width = width;	//令物件變數=參數值
	}
	int getLength() {	//宣告取得長度方法
		return length;	//傳回物件變數值
	}
	int getWidth() {	//宣告取得寬度方法
		return width;	//傳回物件變數值
	}
}

class J601_Box extends J601_Rectangle
{
	private int height;
	J601_Box() {	//衍生類別無參數建立者
		super();	//呼叫基礎類別建立者
		height = 0;	//物件變數height=0
	}
	J601_Box(int length, int width, int height) {	//衍生類別有參數建立者
		super(length, width);	//呼叫基礎類別建立者
		this.height = height;	//令物件變數=參數值
	}
	int getHeight() {	//宣告取得高度方法
		return height;	//傳回物件變數值
	}
	int getVolumn() {	//宣告取得體積方法
		return getLength()* getWidth()* height;
	}
}

class J601_SuperConstructor {
	public static void main(String args[]) {
		J601_Box b1 = new J601_Box();	//建立Box物件b1
		J601_Box b2 = new J601_Box(12, 9, 2);	//建立Box物件b2
		System.out.print("箱子 1: 長 = " + b1.getLength());	//呼叫Superclass方法
		System.out.print(", 寬 = " + b1.getWidth());	//呼叫Superclass方法
		System.out.print(", 高 = " + b1.getHeight());	//呼叫Subclass方法
		System.out.println(", 體積 = " + b1.getVolumn());	//呼叫Subclass方法
		System.out.print("箱子 2: 長 = " + b2.getLength());	//呼叫Superclass方法
		System.out.print(", 寬 = " + b2.getWidth());	//呼叫Superclass方法
		System.out.print(", 高 = " + b2.getHeight());	//呼叫Subclass方法
		System.out.println(", 體積 = " + b2.getVolumn());	//呼叫Subclass方法
	}
}