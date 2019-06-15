import java.applet.Applet;
import java.awt.*;
import java.net.*;

public class J906_GetBase extends Applet
{
	String codeBase = "Code Base: ";	//﹚竡codeBase﹃
	String docBase = "Document Base: ";	//﹚竡docBase﹃
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
		URL u1 = getCodeBase();	//眔class郎URL
		codeBase += u1.toString();	//u1codeBase﹃
		URL u2 = getDocumentBase();	//眔HTML郎URL
		docBase += u2.toString();	//u2docBase﹃
		g.drawString(codeBase, Width, (Height-10));		//陪ボcodeBase﹃
		g.drawString(docBase, Width, (Height+10));		//陪ボdocBase﹃
	}
}
