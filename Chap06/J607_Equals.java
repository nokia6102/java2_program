// �x�s�ɦW�Gd:\Chap06\J607_Equals.java

class J607_Plane	//�ŧiJ607_Plane���O
{
	private int x, y;
	J607_Plane(int x, int y) {	//J607_Plane���O�إߪ�
		this.x = x; 
		this.y = y;
	}
	public String toString() {	//�W��J607_Plane���OtoString
		return x + ", " + y;
	}
}

class J607_Space extends J607_Plane	//�ŧiJ607_Space���O
{
	private int z;
	J607_Space(int x, int y, int z) {	//J607_Space���O�إߪ�
		super(x, y);
		this.z = z;
	}
	public String toString() {	//�W��J607_Space���OtoString
		return super.toString() + ", " + z;
	}
}

class J607_Equals {
	public static void main(String args[]) {
		J607_Plane pl = new J607_Plane(6, 9);	//�إ�J607_Plane����pl
		J607_Space sp = new J607_Space(2, 3, 5);	//�إ�J607_Space����sp
		print(pl, sp);	//�I�sprint��k
		pl = sp;		//�Opl=sp
		print(pl, sp);	//�I�sprint��k
	}
	static void print(J607_Plane ob1, J607_Space ob2) {	//print��k
		if(ob1.equals(ob2))
			System.out.println("(" + ob1 + ") == (" + ob2 + ")");
		else
			System.out.println("(" + ob1 + ") != (" + ob2 + ")");
	}
}


