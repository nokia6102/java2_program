// �x�s�ɦW�Gd:\Chap06\J612_LocalInner.java

public class J612_LocalInner {	//�~�����O
	public interface LocalPoint {	//�إ�LocalPoint����
		public String showPoint();	//�ŧishowPoint������k
	}

	public LocalPoint getPoint(int x, int y) {	//�~�����OgetPoint��k
		class MyPoint implements LocalPoint {	//�ϰ줺�����O
			private int x, y;
			public MyPoint(int x, int y) {	//�ϰ줺�����O�إߪ�
				this.x = x;
				this.y = y;
			}
			public String showPoint() {	//�ϰ줺�����O��k
				return "(" + x + ", " + y + ")";
			}
		}
		return new MyPoint(x, y);	//�Ǧ^�������O���A���
	}

	public static void main(String args[]) {
		J612_LocalInner loc = new J612_LocalInner();    //�إߥ~�����O����
		LocalPoint p = loc.getPoint(5, 10);	//�I�s�~�����OgetPoint
		System.out.println("P" + p.showPoint());	//�I�s�~�����OshowPoint
	}
}
