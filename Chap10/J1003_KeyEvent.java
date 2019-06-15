import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1003_KeyEvent extends Applet
	implements KeyListener
{
	String message = "�Ы����r��A�� ESC �M���G";
	int X = 10, Y = 50;	//��X�y��
	public void init()
	{
		addKeyListener(this);	//�[�J��L��ť��
		requestFocus();	//�n�D��L��J�����v
	}
	public void keyPressed(KeyEvent e)
	{
		showStatus("���U����");	//��ܪ��A�C�T��
		int key = e.getKeyCode();	//���o���ͨƥ󪺫���X
		if(key == KeyEvent.VK_ESCAPE) {	//�Y�� ESC ��
			message = "�Ы����r��A�� ESC �M���G";
			stop();	//����Applet
		}
	}
	public void keyReleased(KeyEvent e) {
		showStatus("��}����");	//��ܪ��A�C�T��
	}
	public void keyTyped(KeyEvent e) {
		if(message.length() <= 68)	//�Y�r�����<=68
			message += e.getKeyChar();	//����[�J�r�ꤤ
		else
			showStatus("�Ы� ESC �M����A��J");	//��ܪ��A�C�T��
		repaint();	//����applet
	}
	public void paint(Graphics g)
	{
		g.drawString(message, X, Y);	//��ܦr��
	}
}
