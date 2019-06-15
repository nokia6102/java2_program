import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1107_FrameWindow extends Frame	//�إ߮ج[�������O
	implements MouseListener, MouseMotionListener	//����ƹ���ť����
{
	Point[] begin = new Point[1000];	//�w�q�_�I�}�C�ܼ�
	Point[] end = new Point[1000];	//�w�q���I�}�C�ܼ�
	int count = 0;	//�w�q�ϧέӼ��ܼ�
	Point start, stop;	//�w�q�_�I�P���I�ܼ�
	boolean mouseUp = false;	//�w�q��}�ƹ��X��

	J1107_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		addMouseListener(this);	//�[�J�ƹ���ť
		addMouseMotionListener(this);	//�[�J�ƹ����ʺ�ť
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		if(mouseUp) {	//�Y�ƹ���}�X�����u

			g.drawRect(start.x, start.y, 
				  (stop.x-start.x), 
				  (stop.y-start.y));	//�e�x��
			for(int i=0; i<count; i++)	//�����e�����ϧΰj��
				g.drawRect(begin[i].x, begin[i].y,
					  (end[i].x-begin[i].x), 
					  (end[i].y-begin[i].y));	//�����x��
		}
	}

	public void mousePressed(MouseEvent me)	//�B�z���U�ƹ����s�ƥ�
	{
		mouseUp = false;	//�O��}�ƹ��X������
		start = new Point(me.getX(), me.getY());	//���o�ϧΰ_�I
		begin[count] = start;	//�x�s�_�I��m
	}
	public void mouseReleased(MouseEvent me)	//�B�z��}�ƹ����s�ƥ�
	{
		stop = new Point(me.getX(), me.getY());	//���o�ϧβ��I
		end[count] = stop;	//�x�s���I��m
		repaint();	//�����ϧ�
		count++;		//�ϧέӼƥ[1
	}
	public void mouseDragged(MouseEvent me)	//�B�z�즲�ƹ����s�ƥ�
	{
		mouseUp = true;	//�O��}�ƹ��X�����u
		stop =  new Point(me.getX(), me.getY());	//���o�ϧβ��I
		repaint();	//�����ϧ�
	}
	public void mouseClicked(MouseEvent me) {}	//�B�z�ƹ��I�����s�ƥ�
	public void mouseEntered(MouseEvent me) {}	//�B�z�ƹ��i�J���s�ƥ�
	public void mouseExited(MouseEvent me) {}	//�B�z�ƹ����}���s�ƥ�
	public void mouseMoved(MouseEvent me) {}	//�B�z���ʷƹ����s�ƥ�
}
	
public class J1107_DrawRect	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1107_FrameWindow fw = new J1107_FrameWindow("�e�x�ε{��");	//�إߵ�������
		fw.setSize(500, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}