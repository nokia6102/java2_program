import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1109_FrameWindow extends Frame	//�إ߮ج[�������O
{
	J1109_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		g.drawArc(30, 40, 70, 70, 45, 90);	//�e����
		g.drawArc(150, 40, 70, 70, 0, 180);	//�e����
		g.drawArc(270, 40, 70, 70, 225, 270);	//�e����
		g.drawArc(390, 40, 70, 70, 0, 360);	//�e����
		g.fillArc(30, 150, 70, 70, 45, 90);	//�e����
		g.fillArc(150, 150, 70, 70, 0, 180);	//�e����
		g.fillArc(270, 150, 70, 70, 225, 270);	//�e����
		g.fillArc(390, 150, 70, 70, 0, 360);	//�e����
	}
}
	
public class J1109_DrawArc	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1109_FrameWindow fw = new J1109_FrameWindow("�e���ε{��");	//�إߵ�������
		fw.setSize(500, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}