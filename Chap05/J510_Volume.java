// 儲存檔名：d:\Chap05\J510_Volume.java

class J510_Setting	//宣告類別
{
	int length;	//宣告物件變數
	int width;	//宣告物件變數
	int height;	//宣告物件變數
	J510_Setting(int l, int w, int h)	//建立者1
	{
		length = l;	//設定長度
		width = w;	//設定寬度
		height = h;	//設定高度
	}
	J510_Setting(int l)	//建立者2 (超載)
	{
		length = width = height = l;	//設定長寬高
	}
	int getVolume()	//顯示體積
	{
		return length * width * height;
	}
}

public class J510_Volume
{
	public static void main(String[] args)
	{
		J510_Setting s1 = new J510_Setting(3, 4, 5);	//以建立者1建立物件
		J510_Setting s2 = new J510_Setting(5);	//以建立者2建立物件
		System.out.println("長方體體積：" + s1.getVolume());	
		System.out.println("立方體體積：" + s2.getVolume());
	}
}