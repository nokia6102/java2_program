import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1111_FrameWindow extends Frame	//建立框架視窗類別
{
	J1111_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		Color c1 = new Color(100, 100, 255);	//定義顏色變數c1
		Color c2 = new Color(255, 128, 128);	//定義顏色變數c2
		Color c3 = new Color(255, 128, 255);	//定義顏色變數c3

		g.setColor(c1);	//設定輸出顏色為c1
		g.drawLine(30, 40, 70, 70);	//輸出c1色直線
		g.drawArc(150, 40, 70, 70, 0, 180);	//輸出c1色弧形
		g.setColor(c2);	//設定輸出顏色為c2
		g.drawRect(270, 40, 70, 70);	//輸出c2色矩形
		g.drawOval(390, 40, 70, 70);	//輸出c2色橢圓
		g.setColor(c3);	//設定輸出顏色為c3
		g.fillArc(30, 150, 70, 70, 45, 90);	//輸出c3色扇形
		g.setColor(Color.cyan);	//設定輸出顏色為青色
		g.fillRect(150, 150, 80, 60);	//輸出青色實心矩形
		g.setColor(Color.red);	//設定輸出顏色為紅色
		g.fillOval(270, 150, 70, 50);	//輸出紅色實心橢圓
		g.setColor(Color.blue);	//設定輸出顏色為藍色
		g.fillRoundRect(390, 150, 60, 80, 15, 15);	//輸出藍色圓角實心矩形
	}
}
	
public class J1111_ColorDraw	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1111_FrameWindow fw = new J1111_FrameWindow("圖形著色程式");	//建立視窗物件
		fw.setSize(500, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}