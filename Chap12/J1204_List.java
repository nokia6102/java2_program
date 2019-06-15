import java.awt.*;
import java.awt.event.*;

class J1204_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	float r;	//宣告浮點變數
	Label lblPrincipal, lblInterest, lblTotal;	//宣告標籤變數
	TextField txtPrincipal, txtTotal;	//宣告文字方塊變數
	List lstInterest;	//宣告清單變數
	Button btnCalculate, btnExit;	//宣告命令按鈕變數
	J1204_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		lblPrincipal = new Label("本金");	//建立標籤物件
		lblInterest = new Label("利率");	//建立標籤物件
		lblTotal = new Label("本利和");	//建立標籤物件
		txtPrincipal = new TextField("0", 15);	//建立文字方塊物件
		lstInterest = new List(5);	//建立清單物件
		txtTotal = new TextField(15);	//建立文字方塊物件
		btnCalculate = new Button("計算");	//建立命令按鈕物件
		btnExit = new Button("結束");	//建立命令按鈕物件
		add(lblPrincipal);	//加入標籤到視窗中
		add(txtPrincipal);	//加入文字方塊到視窗中
		add(lblInterest);	//加入標籤到視窗中
		add(lstInterest);	//加入清單到視窗中
			lstInterest.add("4.00%");	//加入清單項目到清單中
			lstInterest.add("5.00%");	//加入清單項目到清單中
			lstInterest.add("6.00%");	//加入清單項目到清單中
			lstInterest.add("7.00%");	//加入清單項目到清單中
			lstInterest.add("8.00%");	//加入清單項目到清單中
		add(lblTotal);	//加入標籤到視窗中
		add(txtTotal);	//加入文字方塊到視窗中
		add(btnCalculate);	//加入命令按鈕到視窗中
		add(btnExit);	//加入命令按鈕到視窗中
		lstInterest.addActionListener(this);	//加入清單動作監聽
		btnCalculate.addActionListener(this);	//加入命令按鈕動作監聽
		btnExit.addActionListener(this);	//加入命令按鈕動作監聽
	}
	public void actionPerformed(ActionEvent event)	//執行Action事件方法
	{
		if(event.getSource() == lstInterest) {	//若為lstInterest清單事件
			String s = lstInterest.getSelectedItem();	//取得利率字串
			r = Float.parseFloat(s.substring(0, 4)) / 100;	//轉成浮點數值
		}
		if(event.getSource() == btnCalculate) {	//若為btnCalculate按鈕事件
			float p = Integer.parseInt(txtPrincipal.getText());	//取得本金字串
			float sum = p * (1 + r);	//計算本利和
			txtTotal.setText(String.valueOf(sum));	//輸出本利和至文字方塊
		}
		if(event.getSource() == btnExit) {	//若為btnExit按鈕事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}
	
public class J1204_List	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1204_FrameWindow fw = new J1204_FrameWindow("選擇清單");	//建立視窗物件
		fw.setSize(200, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}