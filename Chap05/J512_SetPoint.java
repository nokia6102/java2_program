// �x�s�ɦW�Gd:\Chap05\J512_SetPoint.java

class J512_Point	//�ŧiJ512_Point���O
{
	int x, y;
	J512_Point(int ox, int oy)	//�إߪ�
	{
		x = ox; y = oy;	//�]�w�I���_�l��
	}
	J512_Point setPoint(int sx, int sy)	//�]�w�I����k
	{
		J512_Point p = new J512_Point(sx, sy);	//�ϥΫإߪ̫إ��I
		return p;	//�Ǧ^�I������
	}
}

public class J512_SetPoint
{
	public static void main(String[] args)
	{
		J512_Point p1 = new J512_Point(6, 9);	//�ϥΫإߪ̫إ߲Ĥ@�I
		J512_Point p2 = p1.setPoint(3, 7);	//�ϥ�setPoint�]�w�ĤG�I
		System.out.println("p1(" + p1.x + ", " + p1.y + ")");
		System.out.println("p2(" + p2.x + ", " + p2.y + ")");
	}
}