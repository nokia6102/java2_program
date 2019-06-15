import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J910_StopLight extends Applet implements ActionListener
{
	Button btnRed, btnYellow, btnGreen;	//宣告命令按鈕變數
	int firstX = 65, firstY = 60;	//宣告第一圓的起點
	int secondX = firstX + 60, secondY = 60;	//宣告第二圓的起點
	int thirdX = firstX + 120, thirdY = 60;	//宣告第三圓的起點
	Color firstC = Color.red;	//宣告第一圓的初色
	Color secondC = Color.gray;	//宣告第二圓的初色
	Color thirdC = Color.gray;	//宣告第三圓的初色
	String message = "紅　燈　停";

	public void init() {
		setBackground(Color.cyan);	//設定背景色為淺灰色
		btnRed = new Button("紅燈");	//建立紅燈命令按鈕
		btnYellow = new Button("黃燈");	//建立黃燈命令按鈕
		btnGreen = new Button("綠燈");	//建立綠燈命令按鈕
		add(btnRed);	//加入紅燈按鈕到Applet
		add(btnYellow);	//加入黃燈按鈕到Applet
		add(btnGreen);	//加入綠燈按鈕到Applet
		btnRed.addActionListener(this);	//加入紅燈按鈕Listerer
		btnYellow.addActionListener(this);	//加入黃燈按鈕Listerer
		btnGreen.addActionListener(this);	//加入綠燈按鈕Listerer
	}

	public void paint(Graphics g) {
		g.drawRect(firstX-20, firstY-20, 210, 90);	//畫空心矩形
		g.setColor(firstC);	//設定第一圓顏色
		g.fillOval(firstX, firstY, 50, 50);	//畫第一個圓
		g.setColor(secondC);	//設定第二圓顏色
		g.fillOval(secondX, secondY, 50, 50);	//畫第二個圓
		g.setColor(thirdC);	//設定第三圓顏色
		g.fillOval(thirdX, thirdY, 50, 50);	//畫第三個圓
		g.setColor(Color.black);	//設定輸出色
		g.drawString(message, secondX, secondY+100);	//輸出字串
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("紅燈")) {	//若為"紅燈"按鈕
			firstC = Color.red;	//設定第一圓的顏色
			secondC = Color.gray;	//設定第二圓的顏色
			thirdC = Color.gray;	//設定第三圓的顏色
			message = "紅　燈　停";	//設定輸出字串
		} else if(str.equals("黃燈")) {	//若為"黃燈"按鈕
			firstC = Color.gray;	//設定第一圓的顏色
			secondC = Color.yellow;	//設定第二圓的顏色
			thirdC = Color.gray;	//設定第三圓的顏色
			message = "黃燈看情形";	//設定輸出字串
		} else if(str.equals("綠燈")) {	//若為"綠燈"按鈕
			firstC = Color.gray;	//設定第一圓的顏色
			secondC = Color.gray;	//設定第二圓的顏色
			thirdC = Color.green;	//設定第三圓的顏色
			message = "綠　燈　行";	//設定輸出字串
		}
		repaint();	//重劃applet
	}
}
