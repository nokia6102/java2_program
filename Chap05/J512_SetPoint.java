// 儲存檔名：d:\Chap05\J512_SetPoint.java

class J512_Point	//宣告J512_Point類別
{
	int x, y;
	J512_Point(int ox, int oy)	//建立者
	{
		x = ox; y = oy;	//設定點的起始值
	}
	J512_Point setPoint(int sx, int sy)	//設定點的方法
	{
		J512_Point p = new J512_Point(sx, sy);	//使用建立者建立點
		return p;	//傳回點的物件
	}
}

public class J512_SetPoint
{
	public static void main(String[] args)
	{
		J512_Point p1 = new J512_Point(6, 9);	//使用建立者建立第一點
		J512_Point p2 = p1.setPoint(3, 7);	//使用setPoint設定第二點
		System.out.println("p1(" + p1.x + ", " + p1.y + ")");
		System.out.println("p2(" + p2.x + ", " + p2.y + ")");
	}
}