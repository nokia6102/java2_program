// 儲存檔名：d:\Chap06\J611_MemberInner.java

public class J611_MemberInner {	//外部類別
	private Point[] p = new Point[10];	//建立Point類別物件
	private int count = 0;	//計算加入點的個數

	private class Point {	//成員內部類別
		private int x, y;
		public Point(int x, int y) {	//成員類別建立者
			this.x = x;	//物件變數x=參數x
			this.y = y;	//物件變數y=參數y
			p[count++] = this;	//設定陣列元素的參考位址
		}
		public String toString() {	//外部類別toString方法
			StringBuffer isb = new StringBuffer();	//建立字串緩衝器物件
			isb.append("(" + x + ", " + y + ")");	//附加字串到緩衝器中
			return isb.toString();	//傳回內部緩衝器的字串
		}
	}					//結束成員內部類別

	public String toString() {	//外部類別toString方法
		StringBuffer osb = new StringBuffer();	//建立字串緩衝器物件
		for(int i=0; i<count; i++) {
			osb.append("\tP" + i + p[i]);	//附加字串到緩衝器中
		}
		return osb.toString();	//傳回外部緩衝器的字串
	}
	
	public static void main(String args[]) {
		J611_MemberInner m0 = new J611_MemberInner();    //建立外部類別物件
		Point P00 = m0.new Point(5, 8);	//建立內部類別物件
		Point P01 = m0.new Point(3, 9);	//建立內部類別物件
		J611_MemberInner m1 = new J611_MemberInner();    //建立外部類別物件
		Point P10 = m1.new Point(-5, 8);	//建立內部類別物件
		Point P11 = m1.new Point(-3, 9);	//建立內部類別物件
		System.out.println("第一象限點：" + m0);	//呼叫外部類別toString
		System.out.println("第二象限點：" + m1);	//呼叫外部類別toString
	}
}
