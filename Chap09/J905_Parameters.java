import java.applet.Applet;
import java.awt.*;

public class J905_Parameters extends Applet
{
	String message = "��m";	//�w�qmessage�r��	
	int Width, Height;	//�w�qWidth, Height�ܼ�	
	public void start()
	{
		String param;	//�w�qparam�r���ܼ�

		param = getParameter("Width");	//���ohtml��Width�Ѽ�
		try {
			if(param != null)	//�Y���O�Ŧr��
				Width = Integer.parseInt(param) / 2 - 150;	//�N�Ѽ��ন���
			else			//�Y�ѼƬO�Ŧr��
				Width = 10;	//�OWidth=10
		} catch(NumberFormatException e) {
			Width = 0;	//�OWidth=0
		}

		param = getParameter("Height");	//���ohtml��Height�Ѽ�
		try {
			if(param != null)	//�Y���O�Ŧr��
				Height = Integer.parseInt(param) / 2;	//�N�Ѽ��ন���
			else			//�Y�ѼƬO�Ŧr��
				Height = 30;	//�OHeight=30
		} catch(NumberFormatException e) {
			Height = 0;	//�OHeight=0
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(message + " (" + Width + ", " + Height + ")", 
			Width, Height);		//��ܦr��
	}
}
