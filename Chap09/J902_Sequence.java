import java.applet.Applet;
import java.awt.*;

public class J902_Sequence extends Applet
{
	String message = "�Ұ� / ";	//�w�qmessage�r��
	public void init()
	{
		message += "�i�J init() / ";	//�걵�r���message
	}
	public void start()
	{
		message += "�i�J start() / ";	//�걵�r���message
	}
	public void paint(Graphics g)
	{
		message += "�i�J paint() / ";	//�걵�r���message
		g.drawString(message, 50, 30);	//��ܦr��
	}
}
