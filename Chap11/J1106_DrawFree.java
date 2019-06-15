import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1106_FrameWindow extends Frame	//�إ߮ج[�������O
	implements MouseListener, MouseMotionListener	//����ƹ���ť����
{
	Point[] free = new Point[1000];	//�w�q�I�}�C�ܼ�
	int count = 0;	//�w�q�ϧέӼ��ܼ�
	Point start, stop;	//�w�q�_�I�P���I�ܼ�
	boolean mouseUp = false;	//�w�q��}�ƹ��X��

	J1106_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		addMouseListener(this);	//�[�J�ƹ���ť
		addMouseMotionListener(this);	//�[�J�ƹ����ʺ�ť
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		if(mouseUp) {	//�Y�ƹ���}�X�����u
			for(int i=1; i<count; i++)	//���ϧΰj��
				g.drawLine(free[i-1].x, free[i-1].y,
					   free[i].x, free[i].y);	//�e���u
		}
	}
	public void mousePressed(MouseEvent me)	//�B�z���U�ƹ����s�ƥ�
	{
		mouseUp = false;	//�O��}�ƹ��X������
		count = 0;	//�ϧέӼ��k�s
		start = new Point(me.getX(), me.getY());	//���o�_�I��m
		free[count] = start;	//�x�s�_�I��m
	}
	public void mousePressed(MouseEvent me)	//�B�z���U�ƹ����s�ƥ�
	{
		stop = new Point(me.getX(), me.getY());	//���o���I��m
		free[count] = stop;	//�x�s���I��m
		count++;	//�ϧέӼƥ[1
		repaint();	//��������
	}
	public void mouseDragged(MouseEvent me)	//�B�z�즲�ƹ����s�ƥ�
	{
		stop =  new Point(me.getX(), me.getY());	//���o���I��m
		free[count] = stop;	//�x�s���I��m
		count++;	//�ϧέӼƥ[1
		mouseUp = true;	//�O��}�ƹ��X�����u
		repaint();	//��������
	}
	public void mouseClicked(MouseEvent me) {}	//�B�z�ƹ��I�����s�ƥ�
	public void mouseEntered(MouseEvent me) {}	//�B�z�ƹ��i�J���s�ƥ�
	public void mouseExited(MouseEvent me) {}	//�B�z�ƹ����}���s�ƥ�
	public void mouseMoved(MouseEvent me) {}	//�B�z���ʷƹ����s�ƥ�
}
	
public class J1106_DrawFree	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1106_FrameWindow fw = new J1106_FrameWindow("��~�{��");	//�إߵ�������
		fw.setSize(500, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}