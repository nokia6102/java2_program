import java.awt.*;
import java.awt.event.*;

class J1212_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	MenuBar menubar;	//宣告MenuBar變數
	Menu mnuFile;	//宣告Menu變數
	MenuItem itmNew, itmOpen, itmSave, itmPrint, itmExit;	//宣告MenuItem變數
	Label lblMsg;	//宣告標籤變數
	J1212_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new GridLayout(1, 1));	//設定GridLayout配置形式
		lblMsg = new Label();	//建立標籤物件
		add(lblMsg);	//加入標籤到視窗中

		menubar = new MenuBar();	//建立功能表列
		mnuFile = new Menu("File");	//建立檔案功能表
		menubar.add(mnuFile);	//加入檔案功能表
			itmNew = new MenuItem("New", 	//建立New功能項
				new MenuShortcut(KeyEvent.VK_N));	//設定New的快捷鍵
			itmOpen = new MenuItem("Open", 	//建立Open功能項
				new MenuShortcut(KeyEvent.VK_O));	//設定Open的快捷鍵
			itmSave = new MenuItem("Save", 	//建立Save功能項
				new MenuShortcut(KeyEvent.VK_S));	//設定Save的快捷鍵
			itmPrint = new MenuItem("Print", 	//建立Print功能項
				new MenuShortcut(KeyEvent.VK_P));	//設定Print的快捷鍵
			itmExit = new MenuItem("Exit", 	//建立Exit功能項
				new MenuShortcut(KeyEvent.VK_X));	//設定Exit的快捷鍵

			mnuFile.add(itmNew);	//加入New到File功能表
			mnuFile.add(itmOpen);	//加入Open到File功能表
			mnuFile.add(itmSave);	//加入Save到File功能表
			mnuFile.addSeparator();	//加入分隔線
			mnuFile.add(itmPrint);	//加入Print到File功能表
			itmPrint.setEnabled(false);	//令Print功能項失效
			mnuFile.addSeparator();	//加入分隔線
			mnuFile.add(itmExit);	//加入Exot到File功能表

			itmNew.addActionListener(this);	//加入New功能項動作監聽
			itmOpen.addActionListener(this);	//加入Open功能項動作監聽
			itmSave.addActionListener(this);	//加入Save功能項動作監聽
			itmExit.addActionListener(this);	//加入Exit功能項動作監聽

		setMenuBar(menubar);	//設定視窗功能表列
	}
	public void actionPerformed(ActionEvent e)	//執行Action事件方法
	{
		if(e.getActionCommand().equals("New"))	//若為First功能項事件
			lblMsg.setText("執行 New 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Open"))	//若為Open功能項事件
			lblMsg.setText("執行 Open 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Save"))	//若為Save功能項事件
			lblMsg.setText("執行 Save 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Exit"))	//若為Exit功能項事件
			lblMsg.setText("執行 Exit 功能");	//設定標籤文字
	}
}
	
public class J1212_FileMenu	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1212_FrameWindow fw = new J1212_FrameWindow("FileMenu");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}