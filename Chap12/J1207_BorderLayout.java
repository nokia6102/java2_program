import java.awt.*;
import java.awt.event.*;

class J1207_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	TextField txtCenter;	//宣告文字方塊變數
	Button btnNorth, btnSouth, btnEast, btnWest;	//宣告命令按鈕變數
	J1207_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new BorderLayout());	//設定視窗外框
		txtCenter = new TextField(20);	//建立文字方塊物件
		btnNorth = new Button("North");	//建立North按鈕物件
		btnSouth = new Button("South");	//建立South按鈕物件
		btnEast = new Button("East");	//建立East按鈕物件
		btnWest = new Button("West");	//建立West按鈕物件
		add("North", btnNorth);	//加入North按鈕到視窗中
		add("South", btnSouth);	//加入South按鈕到視窗中
		add("East", btnEast);	//加入East按鈕到視窗中
		add("West", btnWest);	//加入West按鈕到視窗中
		add("Center", txtCenter);	//加入文字方塊到視窗中
		btnNorth.addActionListener(this);	//加入North按鈕動作監聽
		btnSouth.addActionListener(this);	//加入South按鈕動作監聽
		btnEast.addActionListener(this);	//加入East按鈕動作監聽
		btnWest.addActionListener(this);	//加入West按鈕動作監聽
	}
	public void actionPerformed(ActionEvent e)	//執行Action事件方法
	{
		txtCenter.setText(((Button) e.getSource()).getLabel()
			 + " 鈕被按下");	//顯示被按下的按鈕
	}
}
	
public class J1207_BorderLayout	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1207_FrameWindow fw = new J1207_FrameWindow("BorderLayout");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}