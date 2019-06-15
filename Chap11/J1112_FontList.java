import java.awt.*;
import java.awt.event.*;

class J1112_FrameWindow extends Frame	//建立框架視窗類別
{
	J1112_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		String message = "";	//定義字串變數
		String[] FontName;	//定義字串陣列變數

		GraphicsEnvironment ge = 
			GraphicsEnvironment.getLocalGraphicsEnvironment();	//取得繪圖環境
		FontName = ge.getAvailableFontFamilyNames();	//取得環境中字型名稱
		for(int i=0; i<FontName.length; i++) {	//顯示字型迴圈
			message = FontName[i];	//message=字型
			if(message.charAt(0) == 'A')	//若為A開頭的字型
				g.drawString(message, 4, 18*i);	//則顯示字型名稱
		}
	}
}
	
public class J1112_FontList	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1112_FrameWindow fw = new J1112_FrameWindow("取得可用字型程式");	//建立視窗物件
		fw.setSize(500, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}