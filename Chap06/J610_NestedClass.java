// 儲存檔名：d:\Chap06\J610_NestedClass.java

public class J610_NestedClass {	//巢狀外部類別
	private static class Point {	//巢狀內部類別
		private int x, y;
		public Point(int x, int y) {	//巢狀內部類別建立者
			this.x = x;
			this.y = y;
		}
		public String toString() {	//巢狀內部類別方法
			return "(" + x + ", " + y + ")";
		}
	}					//結束巢狀內部類別
	public static void main(String args[]) {
		Point[] p = new Point[11];
		for(int i=1; i<=10; i++)
			p[i] = new Point(i, (int)Math.pow(i, 2));	//請參閱說明
		for(int i=1; i<=10; i++)
			System.out.println("P" + i + p[i]);
	}
}						//結束巢狀外部類別