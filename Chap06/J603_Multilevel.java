// �x�s�ɦW�Gd:\Chap06\J603_Multilevel.java

class J603_Line
{
	private int length;
	void setLength(int length) { 	//�ŧi�]�wlength��k
		this.length = length; 	//�ܼ�length=�Ѽ�length
	}
	int getLength() {  	//�ŧi���olength��k
		return this.length;	//�Ǧ^�ܼ�length��
	}
}

class J603_Rectangle extends J603_Line
{
	private int width;
	void setWidth(int width) {  	//�ŧi�]�wwidth��k
		this.width = width;  	//�ܼ�width=�Ѽ�width
	}
	int getWidth() {  	//�ŧi���owidth��k
		return this.width;	//�Ǧ^�ܼ�width��
	}
	int getArea() {  	//�ŧi���oarea��k
		return getLength() * getWidth(); 	//�Ǧ^���n
	}				//�����I�ssuper����k
}

class J603_Box extends J603_Rectangle
{
	private int height;
	void setHeight(int height) {  	//�ŧi�]�wheight��k
		this.height = height; 	//�ܼ�height=�Ѽ�height
	}
	int getHeight() {  	//�ŧi���oheight��k
		return this.height;	//�Ǧ^�ܼ�height��
	}
	int getVolumn() {  	//�ŧi���ovolumn��k
		return getLength() * getWidth() * getHeight(); 	//�Ǧ^��n
	}				//�����I�ssuper����k
}

class J603_Multilevel {
	public static void main(String args[]) {
		J603_Box bx = new J603_Box();	//�إ�J603_Box����
		bx.setLength(12);	//�]�wlength
		bx.setWidth(8);	//�]�wwidth
		bx.setHeight(4);	//�]�wheight
		System.out.println("�u�q������ = " + bx.getLength());	//�I�s��¦���O��k
		System.out.println("����έ��n = " + bx.getArea());	//�I�s�l�����O1��k
		System.out.println("��������n = " + bx.getVolumn());	//�I�s�l�����O2��k
	}
}
