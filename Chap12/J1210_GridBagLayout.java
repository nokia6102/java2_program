import java.awt.*;
import java.awt.event.*;

class J1210_FrameWindow extends Frame //建立框架視窗類別
{
	String s = "";	//宣告字串變數
	TextField txtMessage;	//宣告文字方塊變數
	J1210_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		GridBagLayout gridbag = new GridBagLayout();	//建立GridBagLayout物件
		GridBagConstraints constraints = new GridBagConstraints();	//建立GridBagConstraints物件
		setFont(new Font("Arial", Font.PLAIN, 14));	//設定字型
		setLayout(gridbag);	//設定視窗外框

		constraints.fill = GridBagConstraints.BOTH;	//放大物件的高度與寬度
		constraints.weighty = 1.0;	//分配多餘的列空間
		createButton("Button1", gridbag, constraints);	//建立Button1按鈕
		createButton("Button2", gridbag, constraints);	//建立Button2按鈕
		createButton("Button3", gridbag, constraints);	//建立Button3按鈕

		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		createButton("Button4", gridbag, constraints);	//建立Button4按鈕

		constraints.weightx = 0.0;	//設定Constraints物件寬度
		constraints.gridwidth = GridBagConstraints.RELATIVE;	//分配相同空間給下一元件
		createButton("Button5", gridbag, constraints);	//建立Button5按鈕
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		createButton("Button6", gridbag, constraints);	//建立Button6按鈕

		createButton("Button7", gridbag, constraints);	//建立Button7按鈕

		constraints.gridwidth = 1;	//設定元件佔用的行數
		constraints.gridheight = 2;	//設定元件佔用的列數
		constraints.weighty = 1.0;	//分配多餘的列空間
		createButton("Button8", gridbag, constraints);	//建立Button8按鈕
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		constraints.gridheight = 1;	//設定元件佔用的列數
		createButton("Button9", gridbag, constraints);	//建立Button9按鈕
		constraints.gridheight = GridBagConstraints.REMAINDER;
		constraints.weighty = 0.0;	//分配多餘的列空間
		createButton("Button0", gridbag, constraints);	//建立Button0按鈕
	}
	protected void createButton(String name, 
		GridBagLayout gridbag, GridBagConstraints c)	//自訂建立按鈕方法
	{
		Button button = new Button(name);	//建立命令按鈕物件
		gridbag.setConstraints(button, c);	//設定按鈕Constraints
		add(button);	//加入按鈕到Layout
	}
}
	
public class J1210_GridBagLayout	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1210_FrameWindow fw = new J1210_FrameWindow("GridBagLayout");	//建立視窗物件
		fw.setSize(300, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}