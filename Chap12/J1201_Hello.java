import java.awt.*;
import java.awt.event.*;

class J1201_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	TextField txtAnswer;	//宣告文字方塊變數
	Label lblHello;	//宣告標籤變數
	Button btnAnswer, btnExit;	//宣告命令按鈕變數
	J1201_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		lblHello = new Label("嗨！你好嗎？");	//建立標籤物件
		txtAnswer = new TextField(30);	//建立文字方塊物件
		btnAnswer = new Button("回答");	//建立命令按鈕物件
		btnExit = new Button("結束");	//建立命令按鈕物件
		
		add(lblHello);	//加入標籤到視窗中
		add(txtAnswer);	//加入文字方塊到視窗中
		add(btnAnswer);	//加入命令按鈕到視窗中
		add(btnExit);	//加入命令按鈕到視窗中
		btnAnswer.addActionListener(this);	//加入命令按鈕動作監聽
		btnExit.addActionListener(this);	//加入命令按鈕動作監聽
	}
	public void actionPerformed(ActionEvent event)	//執行Action事件方法
	{
		String msg = new String("謝謝！我很好。");	//定義字串
		if(event.getSource() == btnAnswer) {	//若為btnAnswer按鈕事件
			txtAnswer.setText(msg);	//輸出字串到文字方塊
		}
		if(event.getSource() == btnExit) {	//若為btnExit按鈕事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}
	
public class J1201_Hello	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1201_FrameWindow fw = new J1201_FrameWindow("標籤、按鈕與文字方塊");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}