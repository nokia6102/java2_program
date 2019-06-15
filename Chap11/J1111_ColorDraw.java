import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1111_FrameWindow extends Frame	//�إ߮ج[�������O
{
	J1111_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		Color c1 = new Color(100, 100, 255);	//�w�q�C���ܼ�c1
		Color c2 = new Color(255, 128, 128);	//�w�q�C���ܼ�c2
		Color c3 = new Color(255, 128, 255);	//�w�q�C���ܼ�c3

		g.setColor(c1);	//�]�w��X�C�⬰c1
		g.drawLine(30, 40, 70, 70);	//��Xc1�⪽�u
		g.drawArc(150, 40, 70, 70, 0, 180);	//��Xc1�⩷��
		g.setColor(c2);	//�]�w��X�C�⬰c2
		g.drawRect(270, 40, 70, 70);	//��Xc2��x��
		g.drawOval(390, 40, 70, 70);	//��Xc2����
		g.setColor(c3);	//�]�w��X�C�⬰c3
		g.fillArc(30, 150, 70, 70, 45, 90);	//��Xc3�⮰��
		g.setColor(Color.cyan);	//�]�w��X�C�⬰�C��
		g.fillRect(150, 150, 80, 60);	//��X�C���߯x��
		g.setColor(Color.red);	//�]�w��X�C�⬰����
		g.fillOval(270, 150, 70, 50);	//��X�����߾��
		g.setColor(Color.blue);	//�]�w��X�C�⬰�Ŧ�
		g.fillRoundRect(390, 150, 60, 80, 15, 15);	//��X�Ŧ�ꨤ��߯x��
	}
}
	
public class J1111_ColorDraw	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1111_FrameWindow fw = new J1111_FrameWindow("�ϧεۦ�{��");	//�إߵ�������
		fw.setSize(500, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}