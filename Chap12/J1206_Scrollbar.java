import java.awt.*;
import java.awt.event.*;

class J1206_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener, AdjustmentListener
{
	TextField txtMessage;	//宣告文字方塊變數
	Scrollbar hsbHorizontal, vsbVertical;	//宣告滑鼠捲軸變數
	Button btnExit;	//宣告命令按鈕變數
	J1206_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		txtMessage = new TextField(20);	//建立文字方塊物件
		hsbHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);	//建立水平捲軸物件
		vsbVertical = new Scrollbar(Scrollbar.VERTICAL);	//建立垂直捲軸物件
		btnExit = new Button("結束");	//建立命令按鈕物件
		add(hsbHorizontal);	//加入水平捲軸到視窗中
		add(txtMessage);	//加入文字方塊到視窗中
		add(vsbVertical);	//加入垂直捲軸到視窗中
		add(btnExit);	//加入命令按鈕到視窗中
		hsbHorizontal.addAdjustmentListener(this);	//加入水平捲軸調整監聽
		vsbVertical.addAdjustmentListener(this);	//加入垂直捲軸調整監聽
		btnExit.addActionListener(this);	//加入命令按鈕動作監聽
	}
	public void adjustmentValueChanged(AdjustmentEvent ad)	//執行Adjustment事件方法
	{
			txtMessage.setText("(水平, 垂直) = ("
				+ hsbHorizontal.getValue() + ", "
				+ vsbVertical.getValue() + ")");	//顯示目前捲軸指標
	}
	public void actionPerformed(ActionEvent ae)	//執行Action事件方法
	{
		if(ae.getSource() == btnExit) {	//若為btnExit按鈕事件
			System.exit(0);	//結束並關閉視窗
		}
	}
}
	
public class J1206_Scrollbar	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1206_FrameWindow fw = new J1206_FrameWindow("捲軸");	//建立視窗物件
		fw.setSize(200, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}