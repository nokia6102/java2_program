// 儲存檔名：d:\Chap06\J614_Hierarchy.java

interface J614_Areaface
{
	public double area();
}

class J614_Point
{
	protected double[] x = new double[2];
	protected double[] y = new double[2];

	public void setPoint(double a, double b, int i) { 
		x[i] = a; y[i] = b;
	}
	public double getX(int i) { 
		return x[i]; 
	}
	public double getY(int i) { 
		return y[i]; 
	}
}

class J614_Line extends J614_Point
{
	public double getBase() {
		return Math.abs(getX(0)-getX(1));
	}
	public double getHeight() {
		return Math.abs(getY(0)-getY(1));
	}
}

class J614_Rectangle extends J614_Line implements J614_Areaface
{
	public double area() { 
		return getBase() * getHeight();
	}
}

class J614_Triangle extends J614_Line implements J614_Areaface
{
	public double area() { 
		return getBase() * getHeight() / 2;
	}
}

public class J614_Hierarchy
{
	public static void main(String[] args) throws java.io.IOException
	{
		double[][][] array = {  { {10, 10, 20, 10}, {110, 110, 120, 130} },
					{ {10, 20, 20, 40}, {110, 120, 120, 160} } };
		J614_Rectangle rt = new J614_Rectangle();
		J614_Triangle ta = new J614_Triangle();
		for(int i=0; i<2; i++) {
			rt.setPoint(array[0][i][0], array[0][i][1], 0);
			rt.setPoint(array[0][i][2], array[0][i][3], 1);
			System.out.print("長方形:  起點 = (" 
					+ rt.getX(0) + ", " + rt.getY(0) + ")");
			System.out.print("  終點 = (" 
					+ rt.getX(1) + ", " + rt.getY(1) + ")");
			System.out.println("  面積 = " + rt.area());

			ta.setPoint(array[1][i][0], array[1][i][1], 0);
			ta.setPoint(array[1][i][2], array[1][i][3], 1);
			System.out.print("三角形:  起點 = (" 
					+ ta.getX(0) + ", " + ta.getY(0) + ")");
			System.out.print("  終點 = (" 
					+ ta.getX(1) + ", " + ta.getY(1) + ")");
			System.out.println("  面積 = " + ta.area() + "\n");
		}
	}
}