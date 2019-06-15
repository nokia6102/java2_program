// 儲存檔名：d:\Chap06\J607_Equals.java

class J607_Plane	//宣告J607_Plane類別
{
	private int x, y;
	J607_Plane(int x, int y) {	//J607_Plane類別建立者
		this.x = x; 
		this.y = y;
	}
	public String toString() {	//超載J607_Plane類別toString
		return x + ", " + y;
	}
}

class J607_Space extends J607_Plane	//宣告J607_Space類別
{
	private int z;
	J607_Space(int x, int y, int z) {	//J607_Space類別建立者
		super(x, y);
		this.z = z;
	}
	public String toString() {	//超載J607_Space類別toString
		return super.toString() + ", " + z;
	}
}

class J607_Equals {
	public static void main(String args[]) {
		J607_Plane pl = new J607_Plane(6, 9);	//建立J607_Plane物件pl
		J607_Space sp = new J607_Space(2, 3, 5);	//建立J607_Space物件sp
		print(pl, sp);	//呼叫print方法
		pl = sp;		//令pl=sp
		print(pl, sp);	//呼叫print方法
	}
	static void print(J607_Plane ob1, J607_Space ob2) {	//print方法
		if(ob1.equals(ob2))
			System.out.println("(" + ob1 + ") == (" + ob2 + ")");
		else
			System.out.println("(" + ob1 + ") != (" + ob2 + ")");
	}
}


