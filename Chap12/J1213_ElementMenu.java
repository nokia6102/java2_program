import java.awt.*;
import java.awt.event.*;

class J1213_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	MenuBar menubar;	//宣告功能表列變數
	Menu mnuElement, mnuColor;	//宣告功能表變數
	MenuItem itmLine, itmRectangle, itmCircle, itmCurve;	//宣告功能項變數
	MenuItem subRed, subBlue, subGreen, subBlack;	//宣告功能項變數
	Label lblMsg;	//宣告標籤變數
	J1213_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new GridLayout(1, 1));	//設定GridLayout配置形式
		lblMsg = new Label();	//建立標籤物件
		add(lblMsg);	//加入標籤到視窗中

		menubar = new MenuBar();	//建立功能表列
		mnuElement = new Menu("Element");	//建立Element功能表
		menubar.add(mnuElement);	//加入Element功能表
			itmLine = new MenuItem("Line",  	//建立Line功能項
				new MenuShortcut(KeyEvent.VK_L));	//設定Line的快捷鍵
			itmRectangle = new MenuItem("Rectangle",  	//建立Rectangle功能項
				new MenuShortcut(KeyEvent.VK_R));	//設定Rectangle的快捷鍵
			itmCircle = new MenuItem("Circle",  	//建立Circle功能項
				new MenuShortcut(KeyEvent.VK_C));	//設定Circle的快捷鍵
			itmCurve = new MenuItem("Curve",  	//建立curve功能項
				new MenuShortcut(KeyEvent.VK_V));	//設定Curve的快捷鍵
		mnuColor = new Menu("Color");	//加入Element功能表
			subRed = new MenuItem("Red"); 	//建立Red功能項
			subBlue = new MenuItem("Blue"); 	//建立Blue功能項
			subGreen = new MenuItem("Green"); 	//建立Green功能項
			subBlack = new MenuItem("Black"); 	//建立Black功能項

			mnuElement.add(itmLine);	//加入Line到Element功能表
			mnuElement.add(itmRectangle);	//加入Rectangle到Element功能表
			mnuElement.add(itmCircle);	//加入Circle到Element功能表
			mnuElement.add(itmCurve);	//加入Curve到Element功能表
			mnuElement.addSeparator();	//加入分隔線
			mnuElement.add(mnuColor);	//加入Color到Element功能表
				mnuColor.add(subRed);	//加入Red到Color功能表
				mnuColor.add(subBlue);	//加入Blue到Color功能表
				mnuColor.add(subGreen);	//加入Green到Color功能表
				mnuColor.add(subBlack);	//加入Black到Color功能表

			itmLine.addActionListener(this);	//加入Line功能項動作監聽
			itmRectangle.addActionListener(this);	//加入Rectangle功能項動作監聽
			itmCircle.addActionListener(this);	//加入Circle功能項動作監聽
			itmCurve.addActionListener(this);	//加入Curve功能項動作監聽
			subRed.addActionListener(this);	//加入Red功能項動作監聽
			subBlue.addActionListener(this);	//加入Blue功能項動作監聽
			subGreen.addActionListener(this);	//加入Green功能項動作監聽
			subBlack.addActionListener(this);	//加入Black功能項動作監聽

		setMenuBar(menubar);	//設定視窗功能表列
	}
	public void actionPerformed(ActionEvent e)	//執行Action事件方法
	{
		if(e.getActionCommand().equals("Line"))	//若為Line功能項事件
			lblMsg.setText("執行 Line 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Rectangle"))	//若為Rectangle功能項事件
			lblMsg.setText("執行 Rectangle 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Circle"))	//若為Circle功能項事件
			lblMsg.setText("執行 Circle 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Curve"))	//若為Curve功能項事件
			lblMsg.setText("執行 Curve 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Red"))	//若為Red功能項事件
			lblMsg.setText("執行 Red 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Blue"))	//若為Blue功能項事件
			lblMsg.setText("執行 Blue 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Green"))	//若為Green功能項事件
			lblMsg.setText("執行 Green 功能");	//設定標籤文字
		else if(e.getActionCommand().equals("Black"))	//若為Black功能項事件
			lblMsg.setText("執行 Black 功能");	//設定標籤文字
	}
}
	
public class J1213_ElementMenu	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1213_FrameWindow fw = new J1213_FrameWindow("ElementMenu");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}