import java.awt.*;
import java.awt.event.*;

class J1215_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	MenuBar menubar;	//宣告功能表列變數
	Menu mnuFile;	//宣告功能表變數
	MenuItem itmNew, itmExit;	//宣告功能項變數
	Label lblMsg;	//宣告標籤變數
	J1215_NewDialog dialog;	//宣告自訂類別變數

	J1215_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new GridLayout(1, 1));	//設定GridLayout配置形式
		lblMsg = new Label();	//建立標籤物件
		add(lblMsg);	//加入標籤到視窗中

		menubar = new MenuBar();	//建立功能表列
		mnuFile = new Menu("檔案");	//建立File功能表
		menubar.add(mnuFile);	//加入File功能表
			itmNew = new MenuItem("新增 ...");	//建立新增功能項
			itmExit = new MenuItem("結束");	//建立結束功能項
			mnuFile.add(itmNew);	//加入新增到檔案功能表
			mnuFile.add(itmExit);	//加入結束到檔案功能表
			itmNew.addActionListener(this);	//加入新增功能項動作監聽
			itmExit.addActionListener(this);	//加入結束功能項動作監聽
		setMenuBar(menubar);	//設定視窗功能表列
		dialog = new J1215_NewDialog(this, "新增", true);	//建立對話方塊
	}
	public void actionPerformed(ActionEvent e)	//執行視窗Action事件方法
	{
		if(e.getSource() == itmNew) {	//若為新增功能項事件
			dialog.setVisible(true);	//可改為dialog.show()
			lblMsg.setText(dialog.data);	//傳回文字方塊字串
		}
		else if(e.getSource() == itmExit) {	//若為結束功能項事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}

class J1215_NewDialog extends Dialog implements ActionListener	//自訂對話方塊類別
{
	Button btnOk, btnCancel;	//宣告命令按鈕變數
	TextField txtInput;	//宣告文字方塊變數
	String data;	//宣告字串變數
	J1215_NewDialog(Frame hostFrame, String title, boolean dModal)	//建立者
	{
		super(hostFrame, title, dModal);	//建立對話方塊視窗
		setSize(200, 100);	//定義對話方塊視窗大小
		setLayout(new FlowLayout());	//設定對話方塊配置形式
		txtInput = new TextField(20);	//建立文字方塊
		btnOk = new Button("確認");	//建立確認按鈕
		btnCancel = new Button("取消");	//建立取消按鈕
		add(txtInput);	//加入文字方塊到對話框
		add(btnOk);	//加入確認按鈕到對話框
		add(btnCancel);	//加入取消鈕到對話框
		btnOk.addActionListener(this);	//加入確認按鈕動作監聽
		btnCancel.addActionListener(this);	//加入取消按鈕動作監聽
		data = new String("");	//鍵立空白字串
	}
	public void actionPerformed(ActionEvent e)	//執行對話框Action事件方法
	{
		if(e.getSource() == btnOk) {	//若為確認按鈕事件
			data = txtInput.getText();	//data=文字方塊字串
		} else {	//若非確認按鈕事件
			data = "";	//data=空字串
		}
		setVisible(false);	//可改為hide()
			
	}
}
	
public class J1215_Dialog	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1215_FrameWindow fw = 
			new J1215_FrameWindow("對話方塊");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}