import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1110_FrameWindow extends Frame	//�إ߮ج[�������O
{
	J1110_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		int[] pointX1 = {50, 110, 140, 110, 50, 20};	//�w�q���ӳ�����x�y��
		int[] pointY1 = {60, 60, 120, 180, 180, 120};	//�w�q���ӳ�����y�y��
		int s1 = 6;	//�]�w���=6
		g.drawPolygon(pointX1, pointY1, s1);	//�e�����

		int[] pointX2 = {180, 240, 300, 270, 210};	//�w�q���ӳ�����y�y��
		int[] pointY2 = {105, 60, 105, 180, 180};	//�w�q���ӳ�����y�y��
		int s2 = 5;	//�]�w���=5
		g.drawPolygon(pointX2, pointY2, s2);	//�e�����

		int[] pointX3 = {405, 330, 480};	//�w�q�T�ӳ�����x�y��
		int[] pointY3 = {60, 180, 180};	//�w�q�T�ӳ�����y�y��
		int s3 = 3;	//�]�w���=3
		g.drawPolygon(pointX3, pointY3, s3);	//�e�T����
	}
}
	
public class J1110_DrawPolygon	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1110_FrameWindow fw = new J1110_FrameWindow("�e�h��ε{��");	//�إߵ�������
		fw.setSize(500, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}