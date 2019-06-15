import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1002_MouseEvent extends Applet
	implements MouseListener, MouseMotionListener
{
	String message = "";
	int X = 0, Y = 0, X1 = 0, Y1 = 0;	//�_�l�y�Ц�m
	public void init()
	{
		addMouseListener(this);	//�[�J�ƹ���ť��
		addMouseMotionListener(this);	//�[�J���ʷƹ���ť��
	}
	public void mouseClicked(MouseEvent e)
	{
		X = 0; Y = 10;
		showStatus("���U�ƹ���");	//��ܪ��A�C�T��
		repaint();
	}
	public void mouseEntered(MouseEvent e) {
		X = 0; Y = 10;
		showStatus("�ƹ��i�Japplet");	//��ܪ��A�C�T��
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		X = 0; Y = 10;
		showStatus("�ƹ����}applet");	//��ܪ��A�C�T��
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		X1= e.getX(); Y1 = e.getY();
		showStatus("���U�ƹ���");	//��ܪ��A�C�T��
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		X = e.getX(); Y = e.getY();
		showStatus("��}�ƹ���");	//��ܪ��A�C�T��
		repaint();
	}
	public void mouseDragged(MouseEvent e) {
		X = e.getX(); Y = e.getY();
		showStatus("�즲�ƹ��q" + X1 + ", " + Y1 
			+ " �� " + X + ", " + Y);	//��ܪ��A�C�T��
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		X = e.getX(); Y = e.getY();
		showStatus("�ƹ���m�G " + X + ", " + Y);	//��ܪ��A�C�T��
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(message, X, Y);	//��ܦr��
	}
}
