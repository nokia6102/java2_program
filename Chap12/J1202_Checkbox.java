import java.awt.*;
import java.awt.event.*;

class J1202_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	Label lblQuestion;	//宣告標籤變數
	Checkbox chkAnswer1, chkAnswer2, chkAnswer3, chkAnswer4;	//宣告核取方塊變數
	TextField txtMessage;	//宣告文字方塊變數
	Button btnCheck, btnExit;	//宣告命令按鈕變數
	J1202_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		lblQuestion = new Label("Java 是");	//建立標籤物件
		chkAnswer1 = new Checkbox("一種程式語言");	//建立核取方塊物件
		chkAnswer2 = new Checkbox("一種咖啡名稱");	//建立核取方塊物件
		chkAnswer3 = new Checkbox("一種茶葉名稱");	//建立核取方塊物件
		chkAnswer4 = new Checkbox("一個地方名稱");	//建立核取方塊物件
		txtMessage = new TextField(15);	//建立文字方塊物件
		btnCheck = new Button("檢查");	//建立命令按鈕物件
		btnExit = new Button("結束");	//建立命令按鈕物件
		add(lblQuestion);	//加入標籤到視窗中
		add(chkAnswer1);	//加入核取方塊到視窗中
		add(chkAnswer2);	//加入核取方塊到視窗中
		add(chkAnswer3);	//加入核取方塊到視窗中
		add(chkAnswer4);	//加入核取方塊到視窗中
		add(txtMessage);	//加入文字方塊到視窗中
		add(btnCheck);	//加入命令按鈕到視窗中
		add(btnExit);	//加入命令按鈕到視窗中
		btnCheck.addActionListener(this);	//加入命令按鈕動作監聽
		btnExit.addActionListener(this);	//加入命令按鈕動作監聽
	}
	public void actionPerformed(ActionEvent event)	//執行Action事件方法
	{
		if(event.getSource() == btnCheck) {	//若為btnCheck按鈕事件
			if(chkAnswer1.getState() == true &&
			   chkAnswer2.getState() == true &&
			   chkAnswer3.getState() == false &&
			   chkAnswer4.getState() == true) {
				txtMessage.setText("恭喜！答對了。");
			} else {
				txtMessage.setText("對不起！答錯了。");
			}
		}
		if(event.getSource() == btnExit) {	//若為btnExit按鈕事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}
	
public class J1202_Checkbox	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1202_FrameWindow fw = new J1202_FrameWindow("複選題");	//建立視窗物件
		fw.setSize(150, 250);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}