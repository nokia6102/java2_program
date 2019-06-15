import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1116_FrameWindow extends Frame
	implements MouseListener, MouseMotionListener, ActionListener
{
	Button btnLine, btnRect, btnOval;	//定義按鈕變數
	Point[] begin = new Point[1000];	//定義起點陣列變數
	Point[] end = new Point[1000];	//定義終點陣列變數
	String[] shape = new String[1000];	//定義圖形陣列變數
	String flag = new String("Line");	//定義旗號變數
	int count = 0;	//定義圖形個數變數
	Point start, stop;	//定義起點與終點變數
	boolean mouseUp = false;	//定義放開滑鼠旗號

	J1116_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		btnLine = new Button("直線");	//定義直線按鈕
		btnRect = new Button("矩形");	//定義矩形按鈕
		btnOval = new Button("橢圓");	//定義橢圓按鈕
		add(btnLine);	//加入直線按鈕
		add(btnRect);	//加入矩形按鈕
		add(btnOval);	//加入橢圓按鈕
		btnLine.addActionListener(this);	//加入直線按鈕監聽
		btnRect.addActionListener(this);	//加入矩形按鈕監聽
		btnOval.addActionListener(this);	//加入橢圓按鈕監聽
		addMouseListener(this);	//加入滑鼠監聽
		addMouseMotionListener(this);	//加入滑鼠移動監聽
	}
	public void actionPerformed(ActionEvent ae)	//接收與處理按鈕事件
	{
		if(ae.getSource() == btnLine)	//若是按直線按鈕
			flag = "Line";	//令旗號 = "Line"
		else if(ae.getSource() == btnRect)	//若是按矩形按鈕
			flag = "Rect";	//令旗號 = "Rect"
		else if(ae.getSource() == btnOval)	//若是按橢圓按鈕
			flag = "Oval";	//令旗號 = "Oval"
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		if(mouseUp) {
			//重劃前面的圖形
			for(int i=0; i<count; i++) {
				if(shape[i].equals("Line")) {	//若旗號為Line
					g.drawLine(begin[i].x, begin[i].y,	//畫線
						   end[i].x, end[i].y);
				} else if(shape[i].equals("Rect")) {	//若旗號為Rect
					g.drawRect(begin[i].x, begin[i].y,	//畫矩形
						  (end[i].x-begin[i].x), 
						  (end[i].y-begin[i].y));
				} else if(shape[i].equals("Oval")) {	//若旗號為Oval
					g.drawOval(begin[i].x, begin[i].y,	//畫橢圓
						  (end[i].x-begin[i].x), 
						  (end[i].y-begin[i].y));
				}
			}
			//畫最後一個圖形
			if(flag.equals("Line")) {	//若旗號為Line
				g.drawLine(start.x, start.y, 	//畫直線
					   stop.x, stop.y);
				shape[count] = "Line";	//儲存圖形代號
			} else if(flag.equals("Rect")) {	//若旗號為Rect
				g.drawRect(start.x, start.y, 	//畫矩形
					  (stop.x-start.x), 
					  (stop.y-start.y));
				shape[count] = "Rect";	//儲存圖形代號
			} else if(flag.equals("Oval")) {	//若旗號為Oval
				g.drawOval(start.x, start.y, 	//畫橢圓
					  (stop.x-start.x), 
					  (stop.y-start.y));
				shape[count] = "Oval";	//儲存圖形代號
			}
		}
	}
	public void mousePressed(MouseEvent me)	//處理按下滑鼠按鈕事件
	{
		mouseUp = false;	//令放開滑鼠旗號為假
		start = new Point(me.getX(), me.getY());	//取得圖形起點
		begin[count] = start;	//儲存起點位置
	}
	public void mouseDragged(MouseEvent me)	//處理拖曳滑鼠按鈕事件
	{
		mouseUp = true;	//令放開滑鼠旗號為真
		stop =  new Point(me.getX(), me.getY());	//取得圖形終點
		repaint();	//重劃圖形
	}
	public void mouseReleased(MouseEvent me)	//處理放開滑鼠按鈕事件
	{
		stop = new Point(me.getX(), me.getY());	//取得圖形終點
		end[count] = stop;	//儲存終點位置
		repaint();	//重劃圖形
		count++;		//圖形個數加1
	}
	public void mouseClicked(MouseEvent me) {}	//處理滑鼠點取按鈕事件
	public void mouseEntered(MouseEvent me) {}	//處理滑鼠進入按鈕事件
	public void mouseExited(MouseEvent me) {}	//處理滑鼠離開按鈕事件
	public void mouseMoved(MouseEvent me) {}	//處理移動滑鼠按鈕事件
}
	
public class J1116_DrawShape
{
	public static void main(String[] args)
	{
		J1116_FrameWindow fw = new J1116_FrameWindow("畫圖程式");
		fw.setSize(500, 350);
		fw.addWindowListener(new WindowAdapter()
		{ public void windowClosing(WindowEvent e)
			{System.exit(0);}
		});
		fw.show();
	}
}