import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1002_MouseEvent extends Applet
	implements MouseListener, MouseMotionListener
{
	String message = "";
	int X = 0, Y = 0, X1 = 0, Y1 = 0;	//起始座標位置
	public void init()
	{
		addMouseListener(this);	//加入滑鼠監聽者
		addMouseMotionListener(this);	//加入移動滑鼠監聽者
	}
	public void mouseClicked(MouseEvent e)
	{
		X = 0; Y = 10;
		showStatus("按下滑鼠鍵");	//顯示狀態列訊息
		repaint();
	}
	public void mouseEntered(MouseEvent e) {
		X = 0; Y = 10;
		showStatus("滑鼠進入applet");	//顯示狀態列訊息
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		X = 0; Y = 10;
		showStatus("滑鼠離開applet");	//顯示狀態列訊息
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		X1= e.getX(); Y1 = e.getY();
		showStatus("按下滑鼠鍵");	//顯示狀態列訊息
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		X = e.getX(); Y = e.getY();
		showStatus("放開滑鼠鍵");	//顯示狀態列訊息
		repaint();
	}
	public void mouseDragged(MouseEvent e) {
		X = e.getX(); Y = e.getY();
		showStatus("拖曳滑鼠從" + X1 + ", " + Y1 
			+ " 到 " + X + ", " + Y);	//顯示狀態列訊息
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		X = e.getX(); Y = e.getY();
		showStatus("滑鼠位置： " + X + ", " + Y);	//顯示狀態列訊息
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(message, X, Y);	//顯示字串
	}
}
