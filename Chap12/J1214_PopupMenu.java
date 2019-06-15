import java.awt.*;
import java.awt.event.*;

class J1214_FrameWindow extends Frame //建立框架視窗類別
	implements ItemListener
{
	PopupMenu popup;	//宣告彈出功能表變數
	CheckboxMenuItem italic;	//宣告核取功能項變數
	TextField txtMsg;	//宣告文字方塊變數
	J1214_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定FlowLayout配置形式
		popup = new PopupMenu("Menu");	//建立Popup功能表
		add(popup);	//加入Popup功能表到視窗
			italic = new CheckboxMenuItem("斜體");	//建立italic功能項
			italic.addItemListener(this);	//加入italic選項監聽
			popup.add(italic);	//加入italic到Popup功能表

		txtMsg = new TextField(20);	//建立文字方塊
		txtMsg.setText("正常字");	//輸出文字
		txtMsg.setEditable(false);	//設定為不可編輯
		txtMsg.addMouseListener(new J1214_MouseHandler());	//加入文字方塊滑鼠監聽
		add(txtMsg);	//加入文字方塊到視窗
	}
	public void itemStateChanged(ItemEvent ie)	//執行項目變更事件方法
	{
		if(italic.getState()) {	//若italic狀態=true
			txtMsg.setFont(new Font("新細明體", Font.ITALIC, 12));
			txtMsg.setText("斜體字");
		} else {	//若italic狀態=false
			txtMsg.setFont(new Font("新細明體", Font.PLAIN, 12));
			txtMsg.setText("正常字");
		}
	}
	class J1214_MouseHandler extends MouseAdapter {	//滑鼠監聽內部類別
		public void mousePressed(MouseEvent me) {	//處理按下滑鼠按鍵方法
			popup.show(txtMsg, me.getX(), me.getY());	//顯示Popup功能表
		}
	}
}
	
public class J1214_PopupMenu	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1214_FrameWindow fw = new J1214_FrameWindow("Popup Menu");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}