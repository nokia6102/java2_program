// �x�s�ɦW�Gd:\Chap06\J601_SuperConstructor.java

class J601_Rectangle
{
	private int length, width;
	J601_Rectangle() {	//��¦���O�L�Ѽƫإߪ�
		length = 0;	//�����ܼ�length=0
		width = 0;	//�����ܼ�width=0
	}
	J601_Rectangle(int length, int width) {	//��¦���O���Ѽƫإߪ�
		this.length = length;	//�O�����ܼ�=�Ѽƭ�
		this.width = width;	//�O�����ܼ�=�Ѽƭ�
	}
	int getLength() {	//�ŧi���o���פ�k
		return length;	//�Ǧ^�����ܼƭ�
	}
	int getWidth() {	//�ŧi���o�e�פ�k
		return width;	//�Ǧ^�����ܼƭ�
	}
}

class J601_Box extends J601_Rectangle
{
	private int height;
	J601_Box() {	//�l�����O�L�Ѽƫإߪ�
		super();	//�I�s��¦���O�إߪ�
		height = 0;	//�����ܼ�height=0
	}
	J601_Box(int length, int width, int height) {	//�l�����O���Ѽƫإߪ�
		super(length, width);	//�I�s��¦���O�إߪ�
		this.height = height;	//�O�����ܼ�=�Ѽƭ�
	}
	int getHeight() {	//�ŧi���o���פ�k
		return height;	//�Ǧ^�����ܼƭ�
	}
	int getVolumn() {	//�ŧi���o��n��k
		return getLength()* getWidth()* height;
	}
}

class J601_SuperConstructor {
	public static void main(String args[]) {
		J601_Box b1 = new J601_Box();	//�إ�Box����b1
		J601_Box b2 = new J601_Box(12, 9, 2);	//�إ�Box����b2
		System.out.print("�c�l 1: �� = " + b1.getLength());	//�I�sSuperclass��k
		System.out.print(", �e = " + b1.getWidth());	//�I�sSuperclass��k
		System.out.print(", �� = " + b1.getHeight());	//�I�sSubclass��k
		System.out.println(", ��n = " + b1.getVolumn());	//�I�sSubclass��k
		System.out.print("�c�l 2: �� = " + b2.getLength());	//�I�sSuperclass��k
		System.out.print(", �e = " + b2.getWidth());	//�I�sSuperclass��k
		System.out.print(", �� = " + b2.getHeight());	//�I�sSubclass��k
		System.out.println(", ��n = " + b2.getVolumn());	//�I�sSubclass��k
	}
}