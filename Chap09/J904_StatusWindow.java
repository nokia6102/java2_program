import java.applet.Applet;
import java.awt.*;

public class J904_StatusWindow extends Applet
{
	String message = "������r";	//�w�qmessage�r��
	String status = "���A�C�T��";	//�w�qstatus�r��
	public void init()
	{
		setBackground(Color.yellow);	//�]�w�I���⬰����
		setForeground(Color.blue);	//�]�w�e���⬰�Ŧ�
	}
	public void paint(Graphics g)
	{
		g.drawString(message, 200, 30);	//��ܵ����T��
		showStatus(status);	//��ܪ��A�C�T��
	}
}
