import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class J1110_FrameWindow extends Frame	//建立框架視窗類別
{
	J1110_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		int[] pointX1 = {50, 110, 140, 110, 50, 20};	//定義六個頂角的x座標
		int[] pointY1 = {60, 60, 120, 180, 180, 120};	//定義六個頂角的y座標
		int s1 = 6;	//設定邊數=6
		g.drawPolygon(pointX1, pointY1, s1);	//畫六邊形

		int[] pointX2 = {180, 240, 300, 270, 210};	//定義五個頂角的y座標
		int[] pointY2 = {105, 60, 105, 180, 180};	//定義五個頂角的y座標
		int s2 = 5;	//設定邊數=5
		g.drawPolygon(pointX2, pointY2, s2);	//畫五邊形

		int[] pointX3 = {405, 330, 480};	//定義三個頂角的x座標
		int[] pointY3 = {60, 180, 180};	//定義三個頂角的y座標
		int s3 = 3;	//設定邊數=3
		g.drawPolygon(pointX3, pointY3, s3);	//畫三角形
	}
}
	
public class J1110_DrawPolygon	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1110_FrameWindow fw = new J1110_FrameWindow("畫多邊形程式");	//建立視窗物件
		fw.setSize(500, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}