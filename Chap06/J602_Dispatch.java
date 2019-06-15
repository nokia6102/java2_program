// �x�s�ɦW�Gd:\Chap06\J602_Dispatch.java

class J602_Line
{
	private int length;
	J602_Line(int length) { 	//�ŧiJ602_Line�إߪ�
		this.length = length; 	//�ܼ�length=�Ѽ�length
	}
	int getLength() {  	//�ŧi���olength��k
		return this.length;	//�Ǧ^�ܼ�length��
	}
}

class J602_Square extends J602_Line
{
	J602_Square(int length) {  	//�ŧiJ602_Square�إߪ�
		super(length);	//�I�s��¦���O�إߪ�
	}
	double getArea() {  	//�ŧi���oarea��k
		return Math.pow(getLength(), 2); 	//�Ǧ^����έ��n
	}
}

class J602_Circle extends J602_Line
{
	J602_Circle(int radius) {  	//�ŧiJ602_Circle�إߪ�
		super(radius);	//�I�s��¦���O�إߪ�
	}
	double getArea() {  	//�ŧi���oarea��k
		return Math.PI * Math.pow(getLength(), 2); 	//�Ǧ^��έ��n
	}
}

class J602_Dispatch {
	public static void main(String args[]) {
		J602_Square squ = new J602_Square(5);	//�إ�J602_Square����
		J602_Circle cir = new J602_Circle(10);	//�إ�J602_Circle����
		System.out.print("�������� = " + squ.getLength());	//�I�sSquare����k
		System.out.println("\t����έ��n = " + squ.getArea());	//�I�sSquare����k
		System.out.print("��Υb�| = " + cir.getLength());	//�I�sSquare����k
		System.out.println("\t��έ��n = " + cir.getArea());	//�I�sCircle����k
	}
}
