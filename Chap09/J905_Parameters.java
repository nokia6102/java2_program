import java.applet.Applet;
import java.awt.*;

public class J905_Parameters extends Applet
{
	String message = "竚";	//﹚竡message﹃	
	int Width, Height;	//﹚竡Width, Height跑计	
	public void start()
	{
		String param;	//﹚竡param﹃跑计

		param = getParameter("Width");	//眔htmlWidth把计
		try {
			if(param != null)	//璝ぃ琌﹃
				Width = Integer.parseInt(param) / 2 - 150;	//盢把计锣Θ俱计
			else			//璝把计琌﹃
				Width = 10;	//Width=10
		} catch(NumberFormatException e) {
			Width = 0;	//Width=0
		}

		param = getParameter("Height");	//眔htmlHeight把计
		try {
			if(param != null)	//璝ぃ琌﹃
				Height = Integer.parseInt(param) / 2;	//盢把计锣Θ俱计
			else			//璝把计琌﹃
				Height = 30;	//Height=30
		} catch(NumberFormatException e) {
			Height = 0;	//Height=0
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(message + " (" + Width + ", " + Height + ")", 
			Width, Height);		//陪ボ﹃
	}
}
