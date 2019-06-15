import java.applet.Applet;
import java.awt.*;

public class J902_Sequence extends Applet
{
	String message = "啟動 / ";	//定義message字串
	public void init()
	{
		message += "進入 init() / ";	//串接字串到message
	}
	public void start()
	{
		message += "進入 start() / ";	//串接字串到message
	}
	public void paint(Graphics g)
	{
		message += "進入 paint() / ";	//串接字串到message
		g.drawString(message, 50, 30);	//顯示字串
	}
}
