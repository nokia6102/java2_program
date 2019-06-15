import java.applet.*;
import java.awt.*;
import java.net.*;

public class J908_AppletGraphics extends Applet
{
	public void init() {
		setBackground(Color.yellow);	//設定背景色為黃色
		setForeground(Color.blue);	//設定前景色為藍色
	}
	public void paint(Graphics g) {
		g.drawRoundRect(20,30, 80, 90, 0, 0);	//畫一個長方形
		g.drawRoundRect(140,30, 80, 90, 50, 50);	//畫一個圓角長方形
		g.drawOval(260, 30, 90, 90);	//畫一個橢圓
		g.drawLine(380, 30, 480, 120);	//畫一條直線
	}
}
