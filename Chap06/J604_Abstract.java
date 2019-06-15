// �x�s�ɦW�Gd:\Chap06\J604_Abstract.java

abstract class J604_Line
{
	private int length;
	J604_Line(int length) { 	//�ŧiJ604_Line�إߪ�
		this.length = length; 	//�ܼ�length=�Ѽ�length
	}
	int getLength() {  	//�ŧi���olength��k
		return this.length;	//�Ǧ^�ܼ�length��
	}
	abstract double getArea();	//�ŧi��H��k
}

class J604_Square extends J604_Line
{
	J604_Square(int length) {  	//�ŧiJ604_Square�إߪ�
		super(length);	//�I�s��¦���O�إߪ�
	}
	double getArea() {  	//�W��getArea()��k
		return Math.pow(getLength(), 2); 	//�Ǧ^����έ��n
	}
}

class J604_Circle extends J604_Line
{
	J604_Circle(int radius) {  	//�ŧiJ604_Circle�إߪ�
		super(radius);	//�I�s��¦���O�إߪ�
	}
	double getArea() {  	//�W��getArea()��k
		return Math.PI * Math.pow(getLength(), 2); 	//�Ǧ^��έ��n
	}
}

class J604_Abstract {
	public static void main(String args[]) {
		J604_Square squ = new J604_Square(5);	//�إ�J604_Square����
		J604_Circle cir = new J604_Circle(10);	//�إ�J604_Circle����
		System.out.print("�������� = " + squ.getLength());	//�I�sSquare����k
		System.out.println("\t����έ��n = " + squ.getArea());	//�I�sSquare����k
		System.out.print("��Υb�| = " + cir.getLength());	//�I�sSquare����k
		System.out.println("\t��έ��n = " + cir.getArea());	//�I�sCircle����k
	}
}
