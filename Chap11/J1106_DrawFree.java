import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1106_FrameWindow extends Frame	//建立框架視窗類別
	implements MouseListener, MouseMotionListener	//執行滑鼠監聽介面
{
	Point[] free = new Point[1000];	//定義點陣列變數
	int count = 0;	//定義圖形個數變數
	Point start, stop;	//定義起點與終點變數
	boolean mouseUp = false;	//定義放開滑鼠旗號

	J1106_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		addMouseListener(this);	//加入滑鼠監聽
		addMouseMotionListener(this);	//加入滑鼠移動監聽
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		if(mouseUp) {	//若滑鼠放開旗號為真
			for(int i=1; i<count; i++)	//劃圖形迴圈
				g.drawLine(free[i-1].x, free[i-1].y,
					   free[i].x, free[i].y);	//畫直線
		}
	}
	public void mousePressed(MouseEvent me)	//處理按下滑鼠按鈕事件
	{
		mouseUp = false;	//令放開滑鼠旗號為假
		count = 0;	//圖形個數歸零
		start = new Point(me.getX(), me.getY());	//取得起點位置
		free[count] = start;	//儲存起點位置
	}
	public void mousePressed(MouseEvent me)	//處理按下滑鼠按鈕事件
	{
		stop = new Point(me.getX(), me.getY());	//取得終點位置
		free[count] = stop;	//儲存終點位置
		count++;	//圖形個數加1
		repaint();	//重劃視窗
	}
	public void mouseDragged(MouseEvent me)	//處理拖曳滑鼠按鈕事件
	{
		stop =  new Point(me.getX(), me.getY());	//取得終點位置
		free[count] = stop;	//儲存終點位置
		count++;	//圖形個數加1
		mouseUp = true;	//令放開滑鼠旗號為真
		repaint();	//重劃視窗
	}
	public void mouseClicked(MouseEvent me) {}	//處理滑鼠點取按鈕事件
	public void mouseEntered(MouseEvent me) {}	//處理滑鼠進入按鈕事件
	public void mouseExited(MouseEvent me) {}	//處理滑鼠離開按鈕事件
	public void mouseMoved(MouseEvent me) {}	//處理移動滑鼠按鈕事件
}
	
public class J1106_DrawFree	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1106_FrameWindow fw = new J1106_FrameWindow("塗鴉程式");	//建立視窗物件
		fw.setSize(500, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}