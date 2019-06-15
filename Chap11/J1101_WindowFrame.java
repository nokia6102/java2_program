import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

class J1101_Frame extends Frame	//建立框架視窗類別
{
	J1101_Frame(String title)	//框架視窗類別建立者
	{
		super(title);	//呼叫Frame類別建立者
		setLayout(new FlowLayout());	//設定視窗Layout
	}
}

public class J1101_WindowFrame extends Applet	//建立Applet類別
	implements ActionListener	//執行Action監聽介面
{
	Button btnShow, btnHide;	//定義按鈕變數
	J1101_Frame window;	//定義視窗標題變數

	public void init()	//定義起始方法
	{
		btnShow = new Button("顯示視窗");	//建立btnShow按鈕
		btnHide = new Button("隱藏視窗");	//建立btnHide按鈕
		add(btnShow);	//加入btnShow鈕到Applet
		add(btnHide);	//加入btnHide鈕到Applet
		btnShow.addActionListener(this);	//加入btnShow按鈕監聽
		btnHide.addActionListener(this);	//加入btnHide按鈕監聽
		window = new J1101_Frame("框架視窗");	//建立視窗
		window.setSize(300, 200);	//定義視窗大小
	}
	public void actionPerformed(ActionEvent e)	//接收與處理按鈕事件
	{
		if(e.getSource() == btnShow) {	//若是btnShow產生事件
			window.setVisible(true);	//顯示視窗
		}
		if(e.getSource() == btnHide) {	//若是btnHide產生事件
			window.setVisible(false);	//隱藏視窗
		}
	}
}