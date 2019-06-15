// 儲存檔名：d:\Chap04\J421_Equation.java

public class J421_Equation
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a1, a2, b1, b2, c1, c2;
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(
				 new java.io.InputStreamReader(System.in));
		System.out.println("求聯立方程組 a1x + b1y = c1");	// 顯示題目
		System.out.println("　　　　　　 a2x + b2y = c2 之解？");
		System.out.print("輸入 a1 = ");
		a1 = Integer.parseInt(line.readLine());	// 輸入方程組係數
		System.out.print("輸入 b1 = ");
		b1 = Integer.parseInt(line.readLine());	// 輸入方程組係數
		System.out.print("輸入 c1 = ");
		c1 = Integer.parseInt(line.readLine());	// 輸入方程組係數
		System.out.print("輸入 a2 = ");
		a2 = Integer.parseInt(line.readLine());	// 輸入方程組係數
		System.out.print("輸入 b2 = ");
		b2 = Integer.parseInt(line.readLine());	// 輸入方程組係數
		System.out.print("輸入 c2 = ");
		c2 = Integer.parseInt(line.readLine());	// 輸入方程組係數
		int dd[][] = {{a1, b1}, {a2, b2}};	// 二維陣列
		int dx[][] = {{c1, b1}, {c2, b2}};	// 二維陣列
		int dy[][] = {{a1, c1}, {a2, c2}};	// 二維陣列
		int delta = dd[0][0] * dd[1][1] - dd[1][0] * dd[0][1];	// a1*b2-a2*b1
		int deltax = dx[0][0] * dx[1][1] - dx[1][0] * dx[0][1];	// c1*b2-c2*b1
		int deltay = dy[0][0] * dy[1][1] - dy[1][0] * dy[0][1];	// a1*c2-a2*c1
		if (delta != 0)	// 若 delta != 0
		{
			double x = (double)deltax / (double)delta;
			double y = (double)deltay / (double)delta;
			System.out.println("有一解：x = " + x + " ,y = " + y);	// 則顯示有一解
		}
		else if (delta == 0)	// 若delta==0
		{
			if (deltax == 0 && deltay == 0)	// 且二分子皆為0
				System.out.println("有無限多解");	// 顯示有無限多解
			else if (deltax != 0 || deltay != 0)	// 且有一分子非0
				System.out.println("無解");	// 顯示無解
		}
	}
}
