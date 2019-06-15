// 儲存檔名：d:\Chap06\J612_LocalInner.java

public class J612_LocalInner {	//外部類別
	public interface LocalPoint {	//建立LocalPoint介面
		public String showPoint();	//宣告showPoint介面方法
	}

	public LocalPoint getPoint(int x, int y) {	//外部類別getPoint方法
		class MyPoint implements LocalPoint {	//區域內部類別
			private int x, y;
			public MyPoint(int x, int y) {	//區域內部類別建立者
				this.x = x;
				this.y = y;
			}
			public String showPoint() {	//區域內部類別方法
				return "(" + x + ", " + y + ")";
			}
		}
		return new MyPoint(x, y);	//傳回內部類別型態資料
	}

	public static void main(String args[]) {
		J612_LocalInner loc = new J612_LocalInner();    //建立外部類別物件
		LocalPoint p = loc.getPoint(5, 10);	//呼叫外部類別getPoint
		System.out.println("P" + p.showPoint());	//呼叫外部類別showPoint
	}
}
