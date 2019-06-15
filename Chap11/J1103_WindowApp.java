import java.awt.*;
import java.awt.event.*;

class J1103_FrameWindow extends Frame	//建立框架視窗類別
	implements MouseListener
{
	int X = 0, Y = 0;	//定義並起始座標變數
	Label lblMessage;	//定義標籤物件變數

	J1103_FrameWindow(String title)	//框架視窗類別建立者
	{
		super(title);	//呼叫Frame類別建立者
		setLayout(new FlowLayout());	//設定視窗Layout
		lblMessage = new Label("　　　　");	//建立標籤
		add(lblMessage);	//加入標籤到視窗
		addMouseListener(this);	//加數視窗的滑鼠監聽
	}
	public void paint(Graphics g)	//輸出文字或圖形到視窗
	{
		g.drawString("(" + X + ", " + Y + ")", X, Y);	//顯示滑鼠位置座標
	}
	public void mouseClicked(MouseEvent e)	//按下與放開滑鼠事件方法
	{
		X = e.getX(); Y = e.getY();	//取得滑鼠座標
		repaint();	//重劃視窗
	}
	public void mouseEntered(MouseEvent e)	//處理滑鼠進入視窗事件方法
	{
		lblMessage.setText("滑鼠進入");	//顯示標籤文字
	}
	public void mouseExited(MouseEvent e)	//處理滑鼠離開視窗事件方法
	{
		lblMessage.setText("滑鼠離開");	//顯示標籤文字
	}
	public void mousePressed(MouseEvent e)	//處理按下滑鼠事件方法
	{
		lblMessage.setText("按下滑鼠");	//顯示標籤文字
	}
	public void mouseReleased(MouseEvent e)	//處理放開滑鼠事件方法
	{
		lblMessage.setText("放開滑鼠");	//顯示標籤文字
	}
}
	
public class J1103_WindowApp	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1103_FrameWindow fw = new J1103_FrameWindow("視窗應用程式");	//建立視窗
		fw.setSize(200, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//處理關閉視窗事件方法
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}