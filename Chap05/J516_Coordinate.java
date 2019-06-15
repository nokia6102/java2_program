// 儲存檔名：d:\Chap05\J516_Coordinate.java

class J516_Point	//J516_Point類別
{
	int x, y;	//宣告物件變數
	J516_Point(int x, int y)	//建立者
	{
		this.x = x;	//令變數x=參數x
		this.y = y;	//令變數y=參數y
	}
	void showPoint()	//顯示點座標
	{
		System.out.println( "(" + this.x + ", " + this.y + ")" );
	}
}

class J516_Area	//J516_Area類別
{
	int getArea(J516_Point p1, J516_Point p2)	//計算面積方法
	{
		int width = Math.abs(p1.x - p2.x);	//計算x寬度
		int height = Math.abs(p1.y - p2.y);	//計算y高度
		return width * height;	//傳回二點間的矩形面積
	}
}

public class J516_Coordinate
{
	public static void main(String[] args)
	{
		J516_Point p1 = new J516_Point(2, 3);	//建立J516_Point物件
		J516_Point p2 = new J516_Point(6, 9);	//建立J516_Point物件
		J516_Area a = new J516_Area();	//建立J516_Area物件
		System.out.print("p1"); p1.showPoint();	//呼叫showPoint方法
		System.out.print("p2"); p2.showPoint();	//呼叫showPoint方法
		System.out.println("面積 = " + a.getArea(p1, p2));	//呼叫getArea方法
	}
}