import java.applet.Applet;
import java.awt.*;

public class J903_Update extends Applet
{
	String message = "�Ұ� / ";
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
		update(g);	//�I�supdate()��k
	}
	public void update(Graphics g)
	{
		g.drawString(message, 100, 30);	//���message�r��
		message = "���� / ";	//���w�r��
	}
}
