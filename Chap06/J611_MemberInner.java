// �x�s�ɦW�Gd:\Chap06\J611_MemberInner.java

public class J611_MemberInner {	//�~�����O
	private Point[] p = new Point[10];	//�إ�Point���O����
	private int count = 0;	//�p��[�J�I���Ӽ�

	private class Point {	//�����������O
		private int x, y;
		public Point(int x, int y) {	//�������O�إߪ�
			this.x = x;	//�����ܼ�x=�Ѽ�x
			this.y = y;	//�����ܼ�y=�Ѽ�y
			p[count++] = this;	//�]�w�}�C�������ѦҦ�}
		}
		public String toString() {	//�~�����OtoString��k
			StringBuffer isb = new StringBuffer();	//�إߦr��w�ľ�����
			isb.append("(" + x + ", " + y + ")");	//���[�r���w�ľ���
			return isb.toString();	//�Ǧ^�����w�ľ����r��
		}
	}					//���������������O

	public String toString() {	//�~�����OtoString��k
		StringBuffer osb = new StringBuffer();	//�إߦr��w�ľ�����
		for(int i=0; i<count; i++) {
			osb.append("\tP" + i + p[i]);	//���[�r���w�ľ���
		}
		return osb.toString();	//�Ǧ^�~���w�ľ����r��
	}
	
	public static void main(String args[]) {
		J611_MemberInner m0 = new J611_MemberInner();    //�إߥ~�����O����
		Point P00 = m0.new Point(5, 8);	//�إߤ������O����
		Point P01 = m0.new Point(3, 9);	//�إߤ������O����
		J611_MemberInner m1 = new J611_MemberInner();    //�إߥ~�����O����
		Point P10 = m1.new Point(-5, 8);	//�إߤ������O����
		Point P11 = m1.new Point(-3, 9);	//�إߤ������O����
		System.out.println("�Ĥ@�H���I�G" + m0);	//�I�s�~�����OtoString
		System.out.println("�ĤG�H���I�G" + m1);	//�I�s�~�����OtoString
	}
}
