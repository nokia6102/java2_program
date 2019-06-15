// 儲存檔名：d:\Chap06\J606_toString.java

class J606_Line
{
	private int x;
	J606_Line(int x) { 	//J606_Line建立者
		this.x = x;	//變數x=參數x
	}
	public String toString() {                  //宣告J606_Line的toString
		StringBuffer lStr = new StringBuffer();	//建立字串緩衝器物件
		lStr.append(x);
		return lStr.toString();	//傳回緩衝器的字串
	}
}

class J606_Plane extends J606_Line
{
	private int y;
	J606_Plane(int x, int y) { 	//J606_Plane建立者
		super(x);	//呼叫J606_Line建立者
		this.y = y;	//變數y=參數y
	}
	public String toString() {                  //宣告J606_Plane的toString
		StringBuffer pStr = new StringBuffer();	//建立字串緩衝器物件
		pStr.append(super.toString());          //呼叫J606_Line的toString
		pStr.append(", " + y);	//附加y座標
		return pStr.toString();	//傳回緩衝器的字串
	}
}

class J606_Space extends J606_Plane
{
	private int z;
	J606_Space(int x, int y, int z) { 	//J606_Space建立者
		super(x, y);	//呼叫J606_Plane建立者
		this.z = z;	//變數z=參數z
	}
	public String toString() {                  //宣告J606_Space的toString
		StringBuffer sStr = new StringBuffer();	//建立字串緩衝器物件
		sStr.append(super.toString());          //呼叫J606_Plane的toString
		sStr.append(", " + z);	//附加z座標
		return sStr.toString();	//傳回緩衝器的字串
	}
}

class J606_toString {
	public static void main(String args[]) {
		J606_Line ln = new J606_Line(5);	//建立J606_Line物件
		J606_Plane pl = new J606_Plane(4, 5);	//建立J606_Plane物件
		J606_Space sp = new J606_Space(3, 4, 5);	//建立J606_Space物件
		System.out.println("直線座標 (" + ln + ")");	//J606_Line的toString
		System.out.println("平面座標 (" + pl + ")");	//J606_Plane toString
		System.out.println("空間座標 (" + sp + ")");	//J606_Space toString
	}
}
