import java.awt.*;
import java.awt.event.*;

class J1113_FrameWindow extends Frame	//建立框架視窗類別
{
	String message = "床前明月光，疑似地上霜。舉頭望明月，低頭思故鄉。";
	Font f;		//定義字型物件變數

	J1113_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		f = new Font("標楷體", Font.PLAIN, 16);	//建立輸出字型為標楷體
		setFont(f);	//設定輸出字型
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		g.drawString(message, 50, 100);	//輸出字串
	}
}
	
public class J1113_FontSelect	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1113_FrameWindow fw = new J1113_FrameWindow("選擇顯示字型程式");	//建立視窗物件
		fw.setSize(500, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}