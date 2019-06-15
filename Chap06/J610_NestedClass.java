// �x�s�ɦW�Gd:\Chap06\J610_NestedClass.java

public class J610_NestedClass {	//�_���~�����O
	private static class Point {	//�_���������O
		private int x, y;
		public Point(int x, int y) {	//�_���������O�إߪ�
			this.x = x;
			this.y = y;
		}
		public String toString() {	//�_���������O��k
			return "(" + x + ", " + y + ")";
		}
	}					//�����_���������O
	public static void main(String args[]) {
		Point[] p = new Point[11];
		for(int i=1; i<=10; i++)
			p[i] = new Point(i, (int)Math.pow(i, 2));	//�аѾ\����
		for(int i=1; i<=10; i++)
			System.out.println("P" + i + p[i]);
	}
}						//�����_���~�����O