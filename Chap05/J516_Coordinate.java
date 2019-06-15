// �x�s�ɦW�Gd:\Chap05\J516_Coordinate.java

class J516_Point	//J516_Point���O
{
	int x, y;	//�ŧi�����ܼ�
	J516_Point(int x, int y)	//�إߪ�
	{
		this.x = x;	//�O�ܼ�x=�Ѽ�x
		this.y = y;	//�O�ܼ�y=�Ѽ�y
	}
	void showPoint()	//����I�y��
	{
		System.out.println( "(" + this.x + ", " + this.y + ")" );
	}
}

class J516_Area	//J516_Area���O
{
	int getArea(J516_Point p1, J516_Point p2)	//�p�⭱�n��k
	{
		int width = Math.abs(p1.x - p2.x);	//�p��x�e��
		int height = Math.abs(p1.y - p2.y);	//�p��y����
		return width * height;	//�Ǧ^�G�I�����x�έ��n
	}
}

public class J516_Coordinate
{
	public static void main(String[] args)
	{
		J516_Point p1 = new J516_Point(2, 3);	//�إ�J516_Point����
		J516_Point p2 = new J516_Point(6, 9);	//�إ�J516_Point����
		J516_Area a = new J516_Area();	//�إ�J516_Area����
		System.out.print("p1"); p1.showPoint();	//�I�sshowPoint��k
		System.out.print("p2"); p2.showPoint();	//�I�sshowPoint��k
		System.out.println("���n = " + a.getArea(p1, p2));	//�I�sgetArea��k
	}
}