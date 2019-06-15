import java.awt.*;
import java.awt.event.*;

class J1114_FrameWindow extends Frame 	//建立框架視窗類別
	implements ActionListener	//執行Action監聽
{
	Button btnBold, btnItalic, btnPlain;	//定義按鈕變數
	String message = "Java 2";	//定義訊息字串
	String fontname = "Courier New";	//定義字型字串
	int type = Font.PLAIN;	//定義字型形態
	int size = 16;	//定義字型大小
	Font font;	//定義字型物件
	FontMetrics fm;	//定義字型陣列物件

	J1114_FrameWindow(String title)	//框架視窗建立者
	{
		super(title);	//定義視窗標題
		setLayout(new FlowLayout());	//設定視窗外框
		btnBold = new Button("粗體");	//建立粗體按鈕
		btnItalic = new Button("斜體");	//建立斜體按鈕
		btnPlain = new Button("正常");	//建立正常按鈕
		add(btnBold);	//加入粗體按鈕到視窗
		add(btnItalic);	//加入斜體按鈕到視窗
		add(btnPlain);	//加入正常按鈕到視窗
		btnBold.addActionListener(this);	//加入粗體按鈕監聽
		btnItalic.addActionListener(this);	//加入斜體按鈕監聽
		btnPlain.addActionListener(this);	//加入正常按鈕監聽
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnBold)	//若滑鼠按粗體按鈕
			type = Font.BOLD;	//設定為粗體輸出字型
		if(e.getSource() == btnItalic)	//若滑鼠按斜體按鈕
			type = Font.ITALIC;	//設定為斜體輸出字型
		if(e.getSource() == btnPlain)	//若滑鼠按正常按鈕
			type = Font.PLAIN;	//設定為正常輸出字型
		requestFocus();
		repaint();
	}
	public void paint(Graphics g)	//處理視窗繪圖
	{
		font = new Font(fontname, type, size);	//建立字型物件
		g.setFont(font);	//設定字型
		fm = getFontMetrics(font);	//設定字型陣列
		int xloc = (getSize().width - fm.stringWidth(message))/2;	//調整為水平置中
		int yloc = (getSize().height + fm.getHeight())/2;	//調整為垂直置中
		g.drawString(message, xloc, yloc);	//依設定值輸出字串
	}
}
	
public class J1114_FontStyle	//建立視窗應用程式類別
{
	public static void main(String[] args)	//main方法
	{
		J1114_FrameWindow fw = new J1114_FrameWindow("選擇視窗字體程式");	//建立視窗物件
		fw.setSize(500, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//接收與處理關閉視窗事件
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}