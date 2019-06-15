// 儲存檔名：d:\Chap06\J603_Multilevel.java

class J603_Line
{
	private int length;
	void setLength(int length) { 	//宣告設定length方法
		this.length = length; 	//變數length=參數length
	}
	int getLength() {  	//宣告取得length方法
		return this.length;	//傳回變數length值
	}
}

class J603_Rectangle extends J603_Line
{
	private int width;
	void setWidth(int width) {  	//宣告設定width方法
		this.width = width;  	//變數width=參數width
	}
	int getWidth() {  	//宣告取得width方法
		return this.width;	//傳回變數width值
	}
	int getArea() {  	//宣告取得area方法
		return getLength() * getWidth(); 	//傳回面積
	}				//直接呼叫super的方法
}

class J603_Box extends J603_Rectangle
{
	private int height;
	void setHeight(int height) {  	//宣告設定height方法
		this.height = height; 	//變數height=參數height
	}
	int getHeight() {  	//宣告取得height方法
		return this.height;	//傳回變數height值
	}
	int getVolumn() {  	//宣告取得volumn方法
		return getLength() * getWidth() * getHeight(); 	//傳回體積
	}				//直接呼叫super的方法
}

class J603_Multilevel {
	public static void main(String args[]) {
		J603_Box bx = new J603_Box();	//建立J603_Box物件
		bx.setLength(12);	//設定length
		bx.setWidth(8);	//設定width
		bx.setHeight(4);	//設定height
		System.out.println("線段的長度 = " + bx.getLength());	//呼叫基礎類別方法
		System.out.println("長方形面積 = " + bx.getArea());	//呼叫衍生類別1方法
		System.out.println("長方體體積 = " + bx.getVolumn());	//呼叫衍生類別2方法
	}
}
