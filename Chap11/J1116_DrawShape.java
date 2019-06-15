import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1116_FrameWindow extends Frame
	implements MouseListener, MouseMotionListener, ActionListener
{
	Button btnLine, btnRect, btnOval;	//�w�q���s�ܼ�
	Point[] begin = new Point[1000];	//�w�q�_�I�}�C�ܼ�
	Point[] end = new Point[1000];	//�w�q���I�}�C�ܼ�
	String[] shape = new String[1000];	//�w�q�ϧΰ}�C�ܼ�
	String flag = new String("Line");	//�w�q�X���ܼ�
	int count = 0;	//�w�q�ϧέӼ��ܼ�
	Point start, stop;	//�w�q�_�I�P���I�ܼ�
	boolean mouseUp = false;	//�w�q��}�ƹ��X��

	J1116_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		btnLine = new Button("���u");	//�w�q���u���s
		btnRect = new Button("�x��");	//�w�q�x�Ϋ��s
		btnOval = new Button("���");	//�w�q�����s
		add(btnLine);	//�[�J���u���s
		add(btnRect);	//�[�J�x�Ϋ��s
		add(btnOval);	//�[�J�����s
		btnLine.addActionListener(this);	//�[�J���u���s��ť
		btnRect.addActionListener(this);	//�[�J�x�Ϋ��s��ť
		btnOval.addActionListener(this);	//�[�J�����s��ť
		addMouseListener(this);	//�[�J�ƹ���ť
		addMouseMotionListener(this);	//�[�J�ƹ����ʺ�ť
	}
	public void actionPerformed(ActionEvent ae)	//�����P�B�z���s�ƥ�
	{
		if(ae.getSource() == btnLine)	//�Y�O�����u���s
			flag = "Line";	//�O�X�� = "Line"
		else if(ae.getSource() == btnRect)	//�Y�O���x�Ϋ��s
			flag = "Rect";	//�O�X�� = "Rect"
		else if(ae.getSource() == btnOval)	//�Y�O�������s
			flag = "Oval";	//�O�X�� = "Oval"
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		if(mouseUp) {
			//�����e�����ϧ�
			for(int i=0; i<count; i++) {
				if(shape[i].equals("Line")) {	//�Y�X����Line
					g.drawLine(begin[i].x, begin[i].y,	//�e�u
						   end[i].x, end[i].y);
				} else if(shape[i].equals("Rect")) {	//�Y�X����Rect
					g.drawRect(begin[i].x, begin[i].y,	//�e�x��
						  (end[i].x-begin[i].x), 
						  (end[i].y-begin[i].y));
				} else if(shape[i].equals("Oval")) {	//�Y�X����Oval
					g.drawOval(begin[i].x, begin[i].y,	//�e���
						  (end[i].x-begin[i].x), 
						  (end[i].y-begin[i].y));
				}
			}
			//�e�̫�@�ӹϧ�
			if(flag.equals("Line")) {	//�Y�X����Line
				g.drawLine(start.x, start.y, 	//�e���u
					   stop.x, stop.y);
				shape[count] = "Line";	//�x�s�ϧΥN��
			} else if(flag.equals("Rect")) {	//�Y�X����Rect
				g.drawRect(start.x, start.y, 	//�e�x��
					  (stop.x-start.x), 
					  (stop.y-start.y));
				shape[count] = "Rect";	//�x�s�ϧΥN��
			} else if(flag.equals("Oval")) {	//�Y�X����Oval
				g.drawOval(start.x, start.y, 	//�e���
					  (stop.x-start.x), 
					  (stop.y-start.y));
				shape[count] = "Oval";	//�x�s�ϧΥN��
			}
		}
	}
	public void mousePressed(MouseEvent me)	//�B�z���U�ƹ����s�ƥ�
	{
		mouseUp = false;	//�O��}�ƹ��X������
		start = new Point(me.getX(), me.getY());	//���o�ϧΰ_�I
		begin[count] = start;	//�x�s�_�I��m
	}
	public void mouseDragged(MouseEvent me)	//�B�z�즲�ƹ����s�ƥ�
	{
		mouseUp = true;	//�O��}�ƹ��X�����u
		stop =  new Point(me.getX(), me.getY());	//���o�ϧβ��I
		repaint();	//�����ϧ�
	}
	public void mouseReleased(MouseEvent me)	//�B�z��}�ƹ����s�ƥ�
	{
		stop = new Point(me.getX(), me.getY());	//���o�ϧβ��I
		end[count] = stop;	//�x�s���I��m
		repaint();	//�����ϧ�
		count++;		//�ϧέӼƥ[1
	}
	public void mouseClicked(MouseEvent me) {}	//�B�z�ƹ��I�����s�ƥ�
	public void mouseEntered(MouseEvent me) {}	//�B�z�ƹ��i�J���s�ƥ�
	public void mouseExited(MouseEvent me) {}	//�B�z�ƹ����}���s�ƥ�
	public void mouseMoved(MouseEvent me) {}	//�B�z���ʷƹ����s�ƥ�
}
	
public class J1116_DrawShape
{
	public static void main(String[] args)
	{
		J1116_FrameWindow fw = new J1116_FrameWindow("�e�ϵ{��");
		fw.setSize(500, 350);
		fw.addWindowListener(new WindowAdapter()
		{ public void windowClosing(WindowEvent e)
			{System.exit(0);}
		});
		fw.show();
	}
}