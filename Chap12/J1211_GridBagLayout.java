import java.awt.*;
import java.awt.event.*;

class J1211_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	String s = "";	//宣告字串變數
	TextField txtMessage;	//宣告文字方塊變數
	J1211_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		GridBagLayout gridbag = new GridBagLayout();	//建立GridBagLayout物件
		GridBagConstraints constraints = new GridBagConstraints();	//建立GridBagConstraints物件
		setFont(new Font("Arial", Font.PLAIN, 14));	//設定字型
		setLayout(gridbag);	//設定視窗外框

		constraints.fill = GridBagConstraints.BOTH;	//放大物件的高度與寬度
		constraints.weighty = 1.0;	//分配多餘的列空間
		constraints.weightx = 1.0;	//分配多餘的行空間
		createButton("1", gridbag, constraints);	//建立1按鈕
		createButton("2", gridbag, constraints);	//建立2按鈕
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		createButton("3", gridbag, constraints);	//建立3按鈕

		constraints.gridwidth = 1;	//設定元件佔用的行數
		createButton("4", gridbag, constraints);	//建立4按鈕
		createButton("5", gridbag, constraints);	//建立5按鈕
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		createButton("6", gridbag, constraints);	//建立6按鈕

		constraints.gridwidth = 1;	//設定元件佔用的行數
		createButton("7", gridbag, constraints);	//建立7按鈕
		createButton("8", gridbag, constraints);	//建立8按鈕
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		createButton("9", gridbag, constraints);	//建立9按鈕

		constraints.gridwidth = 1;	//設定元件佔用的行數
		createButton("0", gridbag, constraints);	//建立0按鈕
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//下一元件使用剩餘的行空間
		txtMessage = new TextField();	//建立文字方塊物件
		gridbag.setConstraints(txtMessage, constraints);	//建立物件的Constaints
		add(txtMessage);	//加入文字方塊
	}
	protected void createButton(String name, 
		GridBagLayout gridbag, GridBagConstraints c)	//自訂建立按鈕方法
	{
		Button button = new Button(name);	//建立命令按鈕物件
		gridbag.setConstraints(button, c);	//設定按鈕Constraints
		add(button);	//加入按鈕到Layout
		button.addActionListener(this);	//加入按鈕監聽
	}
	public void actionPerformed(ActionEvent e)	//執行Action事件方法
	{
		s = s + ((Button) e.getSource()).getLabel();	//取得按鈕標籤
		txtMessage.setText(s);	//顯示產生事件的按鈕
	}
}
	
public class J1211_GridBagLayout	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1211_FrameWindow fw = new J1211_FrameWindow("GridBagLayout");	//建立視窗物件
		fw.setSize(200, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}