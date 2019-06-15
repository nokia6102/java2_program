// 儲存檔名：d:\Chap06\J613_Anonymous.java

public class J613_Anonymous {	//外部類別
	public interface AnonymPoint {	//建立LocalPoint介面
		public String showPoint();	//宣告showPoint介面方法
	}

	public AnonymPoint getPoint(final int x1, final int y1) 
	{					//外部類別getPoint方法
		return new AnonymPoint() {	//傳回匿名內部類別
			private int x, y;
			{			//匿名內部類別建立者
				x = x1;
				y = y1;
			}
			public String showPoint() {	//內部類別showPoint方法
				return "(" + x + ", " + y + ")";
			}
		};				//結束return敘述
	}

	public static void main(String args[]) {
		J613_Anonymous loc = new J613_Anonymous();	//建立外部類別物件
		AnonymPoint p = loc.getPoint(5, 10);	//呼叫外部類別方法
		System.out.println("P" + p.showPoint());	//呼叫內部類別方法
	}
}