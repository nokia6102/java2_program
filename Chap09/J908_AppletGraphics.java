import java.applet.*;
import java.awt.*;
import java.net.*;

public class J908_AppletGraphics extends Applet
{
	public void init() {
		setBackground(Color.yellow);	//�]�w�I���⬰����
		setForeground(Color.blue);	//�]�w�e���⬰�Ŧ�
	}
	public void paint(Graphics g) {
		g.drawRoundRect(20,30, 80, 90, 0, 0);	//�e�@�Ӫ����
		g.drawRoundRect(140,30, 80, 90, 50, 50);	//�e�@�Ӷꨤ�����
		g.drawOval(260, 30, 90, 90);	//�e�@�Ӿ��
		g.drawLine(380, 30, 480, 120);	//�e�@�����u
	}
}
