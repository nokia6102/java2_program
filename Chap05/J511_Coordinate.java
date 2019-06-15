// �x�s�ɦW�Gd:\Chap05\J511_Coordinate.java

class J511_Point	//J511_Point���O
{
	int x, y;	//�ŧi�����ܼ�
	J511_Point(int xx, int yy)	//�إߪ�
	{
		x = xx;	y = yy;	//x, y�_�l��
	}
	void showPoint()	//����I�y��
	{
		System.out.println( "(" + x + ", " + y + ")" );
	}
}

class J511_Area	//J511_Area���O
{
	int getArea(J511_Point p1, J511_Point p2)	//�p�⭱�n��k
	{
		int width = Math.abs(p1.x - p2.x);	//�p��x�e��
		int height = Math.abs(p1.y - p2.y);	//�p��y����
		return width * height;	//�Ǧ^�G�I�����x�έ��n
	}
}

public class J511_Coordinate
{
	public static void main(String[] args)
	{
		J511_Point p1 = new J511_Point(2, 3);	//�إ�J511_Point����
		J511_Point p2 = new J511_Point(6, 9);	//�إ�J511_Point����
		J511_Area a = new J511_Area();	//�إ�J511_Area����
		System.out.print("p1"); p1.showPoint();	//�I�sshowPoint��k
		System.out.print("p2"); p2.showPoint();	//�I�sshowPoint��k
		System.out.println("���n = " + a.getArea(p1, p2));	//�I�sgetArea��k
	}
}