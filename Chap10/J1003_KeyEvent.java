import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1003_KeyEvent extends Applet
	implements KeyListener
{
	String message = "請按打字鍵，按 ESC 清除：";
	int X = 10, Y = 50;	//輸出座標
	public void init()
	{
		addKeyListener(this);	//加入鍵盤監聽者
		requestFocus();	//要求鍵盤輸入控制權
	}
	public void keyPressed(KeyEvent e)
	{
		showStatus("按下按鍵");	//顯示狀態列訊息
		int key = e.getKeyCode();	//取得產生事件的按鍵碼
		if(key == KeyEvent.VK_ESCAPE) {	//若按 ESC 鍵
			message = "請按打字鍵，按 ESC 清除：";
			stop();	//結束Applet
		}
	}
	public void keyReleased(KeyEvent e) {
		showStatus("放開按鍵");	//顯示狀態列訊息
	}
	public void keyTyped(KeyEvent e) {
		if(message.length() <= 68)	//若字串長度<=68
			message += e.getKeyChar();	//按鍵加入字串中
		else
			showStatus("請按 ESC 清除後再輸入");	//顯示狀態列訊息
		repaint();	//重劃applet
	}
	public void paint(Graphics g)
	{
		g.drawString(message, X, Y);	//顯示字串
	}
}
