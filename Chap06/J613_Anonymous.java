// �x�s�ɦW�Gd:\Chap06\J613_Anonymous.java

public class J613_Anonymous {	//�~�����O
	public interface AnonymPoint {	//�إ�LocalPoint����
		public String showPoint();	//�ŧishowPoint������k
	}

	public AnonymPoint getPoint(final int x1, final int y1) 
	{					//�~�����OgetPoint��k
		return new AnonymPoint() {	//�Ǧ^�ΦW�������O
			private int x, y;
			{			//�ΦW�������O�إߪ�
				x = x1;
				y = y1;
			}
			public String showPoint() {	//�������OshowPoint��k
				return "(" + x + ", " + y + ")";
			}
		};				//����return�ԭz
	}

	public static void main(String args[]) {
		J613_Anonymous loc = new J613_Anonymous();	//�إߥ~�����O����
		AnonymPoint p = loc.getPoint(5, 10);	//�I�s�~�����O��k
		System.out.println("P" + p.showPoint());	//�I�s�������O��k
	}
}