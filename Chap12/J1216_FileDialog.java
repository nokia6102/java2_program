import java.awt.*;
import java.awt.event.*;

class J1216_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	MenuBar menubar;	//宣告功能表列變數
	Menu mnuFile;	//宣告功能表變數
	MenuItem itmOpen, itmExit;	//宣告功能項變數
	Label lblMsg;	//宣告標籤變數
	FileDialog dialog;	//宣告檔案對話方塊變數

	J1216_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new GridLayout(1, 1));	//設定GridLayout配置形式
		lblMsg = new Label();	//建立標籤物件
		add(lblMsg);	//加入標籤到視窗中

		menubar = new MenuBar();	//建立功能表列
		mnuFile = new Menu("檔案");	//建立檔案功能表
		menubar.add(mnuFile);	//加入檔案功能表
			itmOpen = new MenuItem("開啟舊檔 ...");	//建立開啟舊檔功能項
			itmExit = new MenuItem("結束");	//建立結束功能項
			mnuFile.add(itmOpen);	//加入開啟舊檔到檔案功能表
			mnuFile.add(itmExit);	//加入結束到檔案功能表
			itmOpen.addActionListener(this);	//加入開啟舊檔功能項動作監聽
			itmExit.addActionListener(this);	//加入結束功能項動作監聽
		setMenuBar(menubar);	//設定視窗功能表列
		dialog = new FileDialog(this, "開啟舊檔");	//建立對話方塊
	}
	public void actionPerformed(ActionEvent e)	//執行視窗Action事件方法
	{
		if(e.getSource() == itmOpen) {	//若為開啟舊檔功能項事件
			dialog.setVisible(true);	//顯示對話方塊
			lblMsg.setText("選擇開啟 " + dialog.getFile());	//傳回對話方塊字串
		}
		else if(e.getSource() == itmExit) {	//若為結束功能項事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}

public class J1216_FileDialog	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1216_FrameWindow fw = 
			new J1216_FrameWindow("檔案對話方塊");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}