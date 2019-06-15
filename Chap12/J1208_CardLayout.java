import java.awt.*;
import java.awt.event.*;

class J1208_FrameWindow extends Frame //建立框架視窗類別
	implements ActionListener
{
	String name;
	Button btnFirst, btnPrevious, btnNext, btnLast;	//宣告命令按鈕變數
	Panel panelCenter, panelSouth;	//宣告配置版變數
	CardLayout card;	//宣告CardLayout變數
	J1208_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		btnFirst = new Button("First");	//建立First按鈕物件
		btnPrevious = new Button("Previous");	//建立Previous按鈕物件
		btnNext = new Button("Next");	//建立Next按鈕物件
		btnLast = new Button("Last");	//建立Last按鈕物件
		btnFirst.addActionListener(this);	//加入First按鈕動作監聽
		btnPrevious.addActionListener(this);	//加入Previous按鈕動作監聽
		btnNext.addActionListener(this);	//加入Next按鈕動作監聽
		btnLast.addActionListener(this);	//加入Last按鈕動作監聽

		panelSouth = new Panel();	//建立South配置版
			panelSouth.add(btnFirst);	//加入First按鈕到South版中
			panelSouth.add(btnPrevious);	//加入Previous按鈕到South版中
			panelSouth.add(btnNext);	//加入Next按鈕到South版中
			panelSouth.add(btnLast);	//加入Last按鈕到South版中
		panelCenter = new Panel();	//建立Center配置版
			card = new CardLayout();	//建立CardLayout物件
			panelCenter.setLayout(card);	//設定Center版配置方式
			for(int i=1; i<=10; i++) {
				name = "Label " + i;	//制定標籤名稱
				panelCenter.add(new Label(name, Label.CENTER), name);	//加入標籤到Center版
			}

		add(panelCenter, BorderLayout.CENTER);	//加入Center版到BorderLayout
		add(panelSouth, BorderLayout.SOUTH);	//加入South版到BorderLayout
	}
	public void actionPerformed(ActionEvent e)	//執行Action事件方法
	{
		if(e.getActionCommand().equals("First"))	//若為First按鈕事件
			card.first(panelCenter);	//顯示第一個標籤到Center版
		else if(e.getActionCommand().equals("Previous"))	//若為Previous按鈕事件
			card.previous(panelCenter);	//顯示前一個標籤Center版
		else if(e.getActionCommand().equals("Next"))	//若為Next按鈕事件
			card.next(panelCenter);	//顯示下一個標籤Center版
		else if(e.getActionCommand().equals("Last"))	//若為Last按鈕事件
			card.last(panelCenter);	//顯示最後一個標籤Center版
	}
}
	
public class J1208_CardLayout	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1208_FrameWindow fw = new J1208_FrameWindow("CardLayout");	//建立視窗物件
		fw.setSize(250, 150);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}