// �x�s�ɦW�Gd:\Chap04\J421_Equation.java

public class J421_Equation
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a1, a2, b1, b2, c1, c2;
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(
				 new java.io.InputStreamReader(System.in));
		System.out.println("�D�p�ߤ�{�� a1x + b1y = c1");	// ����D��
		System.out.println("�@�@�@�@�@�@ a2x + b2y = c2 ���ѡH");
		System.out.print("��J a1 = ");
		a1 = Integer.parseInt(line.readLine());	// ��J��{�իY��
		System.out.print("��J b1 = ");
		b1 = Integer.parseInt(line.readLine());	// ��J��{�իY��
		System.out.print("��J c1 = ");
		c1 = Integer.parseInt(line.readLine());	// ��J��{�իY��
		System.out.print("��J a2 = ");
		a2 = Integer.parseInt(line.readLine());	// ��J��{�իY��
		System.out.print("��J b2 = ");
		b2 = Integer.parseInt(line.readLine());	// ��J��{�իY��
		System.out.print("��J c2 = ");
		c2 = Integer.parseInt(line.readLine());	// ��J��{�իY��
		int dd[][] = {{a1, b1}, {a2, b2}};	// �G���}�C
		int dx[][] = {{c1, b1}, {c2, b2}};	// �G���}�C
		int dy[][] = {{a1, c1}, {a2, c2}};	// �G���}�C
		int delta = dd[0][0] * dd[1][1] - dd[1][0] * dd[0][1];	// a1*b2-a2*b1
		int deltax = dx[0][0] * dx[1][1] - dx[1][0] * dx[0][1];	// c1*b2-c2*b1
		int deltay = dy[0][0] * dy[1][1] - dy[1][0] * dy[0][1];	// a1*c2-a2*c1
		if (delta != 0)	// �Y delta != 0
		{
			double x = (double)deltax / (double)delta;
			double y = (double)deltay / (double)delta;
			System.out.println("���@�ѡGx = " + x + " ,y = " + y);	// �h��ܦ��@��
		}
		else if (delta == 0)	// �Ydelta==0
		{
			if (deltax == 0 && deltay == 0)	// �B�G���l�Ҭ�0
				System.out.println("���L���h��");	// ��ܦ��L���h��
			else if (deltax != 0 || deltay != 0)	// �B���@���l�D0
				System.out.println("�L��");	// ��ܵL��
		}
	}
}
