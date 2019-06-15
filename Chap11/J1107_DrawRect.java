import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1107_FrameWindow extends Frame	//建立框架視窗類別
	implements MouseListener, MouseMotionListener	//執行滑鼠監聽介面
{
	Point[] begin = new Point[1000];	//定義起點陣列變數
	Point[] end = new Point[1000];	//定義終點陣列變數
	int count = 0;	//定義圖形個數變數
	Point start, stop;	//定義起點與終點變數
	boolean mouseUp = false;	//定義放開滑鼠旗號

	J1107_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		addMouseListener(this);	//加入滑鼠監聽
		addMouseMotionListener(this);	//加入滑鼠移動監聽
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		if(mouseUp) {	//若滑鼠放開旗號為真

			g.drawRect(start.x, start.y, 
				  (stop.x-start.x), 
				  (stop.y-start.y));	//畫矩形
			for(int i=0; i<count; i++)	//重劃前面的圖形迴圈
				g.drawRect(begin[i].x, begin[i].y,
					  (end[i].x-begin[i].x), 
					  (end[i].y-begin[i].y));	//重劃矩形
		}
	}

	public void mousePressed(MouseEvent me)	//處理按下滑鼠按鈕事件
	{
		mouseUp = false;	//令放開滑鼠旗號為假
		start = new Point(me.getX(), me.getY());	//取得圖形起點
		begin[count] = start;	//儲存起點位置
	}
	public void mouseReleased(MouseEvent me)	//處理放開滑鼠按鈕事件
	{
		stop = new Point(me.getX(), me.getY());	//取得圖形終點
		end[count] = stop;	//儲存終點位置
		repaint();	//重劃圖形
		count++;		//圖形個數加1
	}
	public void mouseDragged(MouseEvent me)	//處理拖曳滑鼠按鈕事件
	{
		mouseUp = true;	//令放開滑鼠旗號為真
		stop =  new Point(me.getX(), me.getY());	//取得圖形終點
		repaint();	//重劃圖形
	}
	public void mouseClicked(MouseEvent me) {}	//處理滑鼠點取按鈕事件
	public void mouseEntered(MouseEvent me) {}	//處理滑鼠進入按鈕事件
	public void mouseExited(MouseEvent me) {}	//處理滑鼠離開按鈕事件
	public void mouseMoved(MouseEvent me) {}	//處理移動滑鼠按鈕事件
}
	
public class J1107_DrawRect	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1107_FrameWindow fw = new J1107_FrameWindow("畫矩形程式");	//建立視窗物件
		fw.setSize(500, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}