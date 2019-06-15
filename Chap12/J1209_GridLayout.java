import java.awt.*;
import java.awt.event.*;

class J1209_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	final int n = 7, m = 3;	//宣告整數常數
	String s = "";	//宣告字串變數
	Button btn;	//宣告命令按鈕變數
	TextField txtMessage;	//宣告文字方塊變數
	J1209_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new GridLayout(4, 3));	//設定視窗外框
		for(int i=1; i<=n; i+=3) {	//外迴圈
			for(int j=0; j<m; j++) {	//內迴圈
				int k = i + j;
				btn = new Button("" + k);	//建立命令按鈕物件
				add(btn);	//加入按鈕到視窗中
				btn.addActionListener(this);	//加入按鈕事件監聽
			}
		}
		btn = new Button("0");	//建立命令按鈕物件
		add(btn);	//加入按鈕到視窗中
		btn.addActionListener(this);	//加入按鈕事件監聽
		txtMessage = new TextField(5);	//建立文字方塊物件
		add(txtMessage);	//加入文字方塊到視窗中
	}
	public void actionPerformed(ActionEvent e)	//執行Action事件方法
	{
		s = s + ((Button) e.getSource()).getLabel();	//取得按鈕標籤
		txtMessage.setText(s);	//顯示產生事件的按鈕
	}
}
	
public class J1209_GridLayout	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1209_FrameWindow fw = new J1209_FrameWindow("GridLayout");	//建立視窗物件
		fw.setSize(300, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}