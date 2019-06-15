import java.awt.*;
import java.awt.event.*;

class J1203_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener, ItemListener
{
	Label lblQuestion;	//宣告標籤變數
	CheckboxGroup cbgRadios;	//宣告核取群組變數
	Checkbox chkAnswer1, chkAnswer2, chkAnswer3, chkAnswer4;	//宣告核取方塊變數
	TextField txtMessage;	//宣告文字方塊變數
	Button btnExit;	//宣告命令按鈕變數
	J1203_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		lblQuestion = new Label("何者不是程式語言？");	//建立標籤物件
		cbgRadios = new CheckboxGroup();	//建立選擇群組物件
		chkAnswer1 = new Checkbox("VB", false, cbgRadios);	//建立選擇按鈕物件
		chkAnswer2 = new Checkbox("C", false, cbgRadios);	//建立選擇按鈕物件
		chkAnswer3 = new Checkbox("C++", false, cbgRadios);	//建立選擇按鈕物件
		chkAnswer4 = new Checkbox("Java", false, cbgRadios);	//建立選擇按鈕物件
		txtMessage = new TextField(15);	//建立文字方塊物件
		btnExit = new Button("結束");	//建立命令按鈕物件
		add(lblQuestion);	//加入標籤到視窗中
		add(chkAnswer1);	//加入選項按鈕到視窗中
		add(chkAnswer2);	//加入選項按鈕到視窗中
		add(chkAnswer3);	//加入選項按鈕到視窗中
		add(chkAnswer4);	//加入選項按鈕到視窗中
		add(txtMessage);	//加入文字方塊到視窗中
		add(btnExit);	//加入命令按鈕到視窗中
		chkAnswer1.addItemListener(this);	//加入選擇按鈕選項監聽
		chkAnswer2.addItemListener(this);	//加入選擇按鈕選項監聽
		chkAnswer3.addItemListener(this);	//加入選擇按鈕選項監聽
		chkAnswer4.addItemListener(this);	//加入選擇按鈕選項監聽
		btnExit.addActionListener(this);	//加入命令按鈕動作監聽
	}
	public void itemStateChanged(ItemEvent ie)	//執行Item事件方法
	{
		if(ie.getSource() == chkAnswer1)	//若為chkAnswer1選項事件
			txtMessage.setText("恭喜！答對了。");
		else if(ie.getSource() == chkAnswer2)	//若為chkAnswer2選項事件
			txtMessage.setText("對不起！答錯了。");
		else if(ie.getSource() == chkAnswer3)	//若為chkAnswer3選項事件
			txtMessage.setText("對不起！答錯了。");
		else if(ie.getSource() == chkAnswer4)	//若為chkAnswer4選項事件
			txtMessage.setText("對不起！答錯了。");
	}
	public void actionPerformed(ActionEvent ae)	//執行Action事件方法
	{
		if(ae.getSource() == btnExit) {	//若為btnExit按鈕事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}
	
public class J1203_CheckboxGroup	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1203_FrameWindow fw = new J1203_FrameWindow("單選題");	//建立視窗物件
		fw.setSize(400, 100);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}