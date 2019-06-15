import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1109_FrameWindow extends Frame	//建立框架視窗類別
{
	J1109_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		g.drawArc(30, 40, 70, 70, 45, 90);	//畫弧形
		g.drawArc(150, 40, 70, 70, 0, 180);	//畫弧形
		g.drawArc(270, 40, 70, 70, 225, 270);	//畫弧形
		g.drawArc(390, 40, 70, 70, 0, 360);	//畫弧形
		g.fillArc(30, 150, 70, 70, 45, 90);	//畫弧形
		g.fillArc(150, 150, 70, 70, 0, 180);	//畫弧形
		g.fillArc(270, 150, 70, 70, 225, 270);	//畫弧形
		g.fillArc(390, 150, 70, 70, 0, 360);	//畫弧形
	}
}
	
public class J1109_DrawArc	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1109_FrameWindow fw = new J1109_FrameWindow("畫弧形程式");	//建立視窗物件
		fw.setSize(500, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}