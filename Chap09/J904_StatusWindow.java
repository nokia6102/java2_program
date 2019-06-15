import java.applet.Applet;
import java.awt.*;

public class J904_StatusWindow extends Applet
{
	String message = "視窗文字";	//定義message字串
	String status = "狀態列訊息";	//定義status字串
	public void init()
	{
		setBackground(Color.yellow);	//設定背景色為黃色
		setForeground(Color.blue);	//設定前景色為藍色
	}
	public void paint(Graphics g)
	{
		g.drawString(message, 200, 30);	//顯示視窗訊息
		showStatus(status);	//顯示狀態列訊息
	}
}
