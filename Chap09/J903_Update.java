import java.applet.Applet;
import java.awt.*;

public class J903_Update extends Applet
{
	String message = "啟動 / ";
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
		update(g);	//呼叫update()方法
	}
	public void update(Graphics g)
	{
		g.drawString(message, 100, 30);	//顯示message字串
		message = "重劃 / ";	//重定字串
	}
}
