import java.awt.*;
import java.awt.event.*;

class J1115_FrameWindow extends Frame
{
	String line11 = "Success is never ending.";
	String line12 = "Failure is never final.";
	String line21 = "Focus on giving.";
	String line22 = "Instead of getting.";
	String line31 = "You will never win,";
	String line32 = "if you never begin.";

	String name = "Courier New";	//定義字型名稱
	int style = Font.PLAIN;	//定義字型樣式
	int size = 16;	//定義字型大小
	Font font;	//宣告字型變數
	FontMetrics fm;	//宣告字型矩陣變數
	int locX = 0, locY = 20;	//定義起點座標

	J1115_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
	}
	void nextLine(String s, Graphics g)	//顯示下一行文字方法
	{
		FontMetrics fm = g.getFontMetrics();	//建立字型矩陣物件
		locX = 10;	//設定起點x座標
		locY += fm.getHeight();	//設定起點y座標
		g.drawString(s, locX, locY);	//輸出字串到(x, y)位置
		locX += fm.stringWidth(s);	//將輸出座標移到列尾
	}
	void sameLine(String s, Graphics g)	//顯示同一行文字方法
	{
		FontMetrics fm = g.getFontMetrics();	//建立字型矩陣物件
		g.drawString(s, locX, locY);	//輸出字串到(x, y)位置
		locX += fm.stringWidth(s);	//將輸出座標移到列尾
	}
	public void paint(Graphics g)	//視窗繪圖方法
	{
		font = new Font(name, style, size);	//建立字型物件
		g.setFont(font);	//選擇輸出字型

		nextLine(line11, g);	//顯示下一行文字
		sameLine(line12, g);	//顯示同一行文字
		nextLine(line21, g);	//顯示下一行文字
		sameLine(line22, g);	//顯示同一行文字
		nextLine(line31, g);	//顯示下一行文字
		sameLine(line32, g);	//顯示同一行文字
	}
}
	
public class J1115_FontMultiline	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1115_FrameWindow fw = new J1115_FrameWindow("顯示多行文字");	//建立視窗物件
		fw.setSize(500, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}