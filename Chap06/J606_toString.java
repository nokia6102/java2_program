// �x�s�ɦW�Gd:\Chap06\J606_toString.java

class J606_Line
{
	private int x;
	J606_Line(int x) { 	//J606_Line�إߪ�
		this.x = x;	//�ܼ�x=�Ѽ�x
	}
	public String toString() {                  //�ŧiJ606_Line��toString
		StringBuffer lStr = new StringBuffer();	//�إߦr��w�ľ�����
		lStr.append(x);
		return lStr.toString();	//�Ǧ^�w�ľ����r��
	}
}

class J606_Plane extends J606_Line
{
	private int y;
	J606_Plane(int x, int y) { 	//J606_Plane�إߪ�
		super(x);	//�I�sJ606_Line�إߪ�
		this.y = y;	//�ܼ�y=�Ѽ�y
	}
	public String toString() {                  //�ŧiJ606_Plane��toString
		StringBuffer pStr = new StringBuffer();	//�إߦr��w�ľ�����
		pStr.append(super.toString());          //�I�sJ606_Line��toString
		pStr.append(", " + y);	//���[y�y��
		return pStr.toString();	//�Ǧ^�w�ľ����r��
	}
}

class J606_Space extends J606_Plane
{
	private int z;
	J606_Space(int x, int y, int z) { 	//J606_Space�إߪ�
		super(x, y);	//�I�sJ606_Plane�إߪ�
		this.z = z;	//�ܼ�z=�Ѽ�z
	}
	public String toString() {                  //�ŧiJ606_Space��toString
		StringBuffer sStr = new StringBuffer();	//�إߦr��w�ľ�����
		sStr.append(super.toString());          //�I�sJ606_Plane��toString
		sStr.append(", " + z);	//���[z�y��
		return sStr.toString();	//�Ǧ^�w�ľ����r��
	}
}

class J606_toString {
	public static void main(String args[]) {
		J606_Line ln = new J606_Line(5);	//�إ�J606_Line����
		J606_Plane pl = new J606_Plane(4, 5);	//�إ�J606_Plane����
		J606_Space sp = new J606_Space(3, 4, 5);	//�إ�J606_Space����
		System.out.println("���u�y�� (" + ln + ")");	//J606_Line��toString
		System.out.println("�����y�� (" + pl + ")");	//J606_Plane toString
		System.out.println("�Ŷ��y�� (" + sp + ")");	//J606_Space toString
	}
}
