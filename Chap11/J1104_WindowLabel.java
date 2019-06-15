import java.awt.*;
import java.awt.event.*;

class J1104_NoFrameWindow extends Window 	//建立無框架視窗類別
	implements MouseListener
{
	int X = 0, Y = 0;	//定義並起始座標變數
	Label lblMessage;	//定義標籤物件變數

	J1104_NoFrameWindow(J1104_FrameWindow title)	//框架視窗類別建立者
	{
		super(title);	//呼叫Frame類別建立者
		setLayout(new FlowLayout());	//設定視窗Layout
		lblMessage = new Label("　　　　");	//建立標籤
		add(lblMessage);	//加入標籤到視窗
		addMouseListener(this);	//加數視窗的滑鼠監聽
	}
	public void paint(Graphics g)	//輸出文字或圖形到視窗
	{
		int width = getSize().width;	//取得無框架視窗寬度
		int height = getSize().height;	//取得無框架視窗高度
		g.drawRect(0, 0, --width, --height);	//加邊線到無框架視窗
		g.drawString("(" + X + ", " + Y + ")", X, Y);	//顯示滑鼠位置座標
	}
	public void mouseClicked(MouseEvent e)	//按下與放開滑鼠事件方法
	{
		X = e.getX(); Y = e.getY();	//取得滑鼠座標
		repaint();	//重劃視窗
	}
	public void mouseEntered(MouseEvent e)	//處理滑鼠進入視窗事件方法
	{
		lblMessage.setText("滑鼠進入");	//顯示標籤文字
	}
	public void mouseExited(MouseEvent e)	//處理滑鼠離開視窗事件方法
	{
		lblMessage.setText("滑鼠離開");	//顯示標籤文字
	}
	public void mousePressed(MouseEvent e)	//處理按下滑鼠事件方法
	{
		lblMessage.setText("按下滑鼠");	//顯示標籤文字
	}
	public void mouseReleased(MouseEvent e)	//處理放開滑鼠事件方法
	{
		lblMessage.setText("放開滑鼠");	//顯示標籤文字
	}
}

class J1104_FrameWindow extends Frame implements ActionListener
{
	Button btnShow, btnHide;	//定義按鈕變數
	J1104_NoFrameWindow nf;	//定義無框架視窗變數
	J1104_FrameWindow()
	{
		setLayout(new FlowLayout());
		btnShow = new Button("顯示視窗");	//建立btnShow按鈕
		btnHide = new Button("隱藏視窗");	//建立btnHide按鈕
		add(btnShow);	//加入btnShow鈕到Applet
		add(btnHide);	//加入btnHide鈕到Applet
		btnShow.addActionListener(this);	//加入btnShow按鈕監聽
		btnHide.addActionListener(this);	//加入btnHide按鈕監聽
		nf = new J1104_NoFrameWindow(this);	//建立無框架視窗
		nf.setSize(400, 200);	//設定視窗大小
		nf.setLocation(300, 300);	//設定視窗位置
	}
	public void actionPerformed(ActionEvent e)	//接收與處理按鈕事件
	{
		if(e.getSource() == btnShow) {	//若是btnShow產生事件
			nf.setVisible(true);	//顯示視窗
		}
		if(e.getSource() == btnHide) {	//若是btnHide產生事件
			nf.setVisible(false);	//隱藏視窗
		}
	}
}
	
public class J1104_WindowLabel	//建立視窗應用程式類別
{
	public static void main(String[] args) {	//main方法
		J1104_FrameWindow fw = new J1104_FrameWindow();	//建立視窗
		fw.setSize(200, 200);	//設定視窗大小
		fw.addWindowListener(new WindowAdapter()	//加入視窗監聽
		{ public void windowClosing(WindowEvent e)	//處理關閉視窗事件方法
			{System.exit(0);}	//結束並關閉視窗
		});
		fw.show();	//顯示視窗
	}
}