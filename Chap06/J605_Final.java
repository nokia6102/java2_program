// �x�s�ɦW�Gd:\Chap06\J605_Final.java

abstract class J605_Line
{
	private int length, width;
	J605_Line(int length, int width) { 	//�ŧiJ605_Line�إߪ�
		this.length = length; 	//�ܼ�length=�Ѽ�length
		this.width = width; 	//�ܼ�width=�Ѽ�width
	}
	int getLength() {  	//�ŧigetLength��k
		return this.length;	//�Ǧ^�ܼ�length��
	}
	int getWidth() {  	//�ŧigetWidth��k
		return this.width;	//�Ǧ^�ܼ�width��
	}
	abstract double getArea();	//�ŧi��H��k
}

class J605_Rectangle extends J605_Line
{
	J605_Rectangle(int length, int width) {  	//�ŧiJ605_Rectangle�إߪ�
		super(length, width);	//�I�s��¦���O�إߪ�
	}
	double getArea() {  	//�W��getArea()��k
		return getLength() * getWidth(); 	//�Ǧ^����έ��n
	}
}

final class J605_Triangle extends J605_Rectangle
{
	J605_Triangle(int length, int width) {  	//�ŧiJ605_Triangle�إߪ�
		super(length, width);	//�I�s��¦���O�إߪ�
	}
	final double getArea() {  	//�W��getArea()��k
		return super.getArea() / 2; 	//�Ǧ^�T���έ��n
	}
}

class J605_Final {
	public static void main(String args[]) {
		J605_Rectangle rect = new J605_Rectangle(7, 4);	//�إ�J605_Rectangle����
		J605_Triangle tri = new J605_Triangle(6, 3);	//�إ�J605_Triangle����
		System.out.print("����Ϊ��� = " + rect.getLength());	//�I�sRectangle����k
		System.out.print("\t����Ϊ��e = " + rect.getWidth());	//�I�sRectangle����k
		System.out.println("\t����έ��n = " + rect.getArea());	//�I�sRectangle����k
		System.out.print("�T���Ϊ��� = " + tri.getLength());	//�I�sTriangle����k
		System.out.print("\t�T���Ϊ��e = " + tri.getWidth());	//�I�sTriangle����k
		System.out.println("\t�T���έ��n = " + tri.getArea());	//�I�sTriangle����k
	}
}
