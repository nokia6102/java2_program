// 儲存檔名：d:\Chap05\J511_Coordinate.java

class J511_Point	//J511_Point類別
{
	int x, y;	//宣告物件變數
	J511_Point(int xx, int yy)	//建立者
	{
		x = xx;	y = yy;	//x, y起始值
	}
	void showPoint()	//顯示點座標
	{
		System.out.println( "(" + x + ", " + y + ")" );
	}
}

class J511_Area	//J511_Area類別
{
	int getArea(J511_Point p1, J511_Point p2)	//計算面積方法
	{
		int width = Math.abs(p1.x - p2.x);	//計算x寬度
		int height = Math.abs(p1.y - p2.y);	//計算y高度
		return width * height;	//傳回二點間的矩形面積
	}
}

public class J511_Coordinate
{
	public static void main(String[] args)
	{
		J511_Point p1 = new J511_Point(2, 3);	//建立J511_Point物件
		J511_Point p2 = new J511_Point(6, 9);	//建立J511_Point物件
		J511_Area a = new J511_Area();	//建立J511_Area物件
		System.out.print("p1"); p1.showPoint();	//呼叫showPoint方法
		System.out.print("p2"); p2.showPoint();	//呼叫showPoint方法
		System.out.println("面積 = " + a.getArea(p1, p2));	//呼叫getArea方法
	}
}