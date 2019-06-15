import java.awt.*;
import java.awt.event.*;

public class J1001_WindowEvent extends Frame
	implements WindowListener
{
	public static void main(String args[]) {
		J1001_WindowEvent we = new J1001_WindowEvent();	//建立類別物件
		we.addWindowListener(new J1001_WindowEvent());	//加入物件的視窗監聽
		we.setBounds(100, 100, 200, 200);	//設定視窗大小
		we.setVisible(true);	//顯示視窗
	}
	public void windowClosing(WindowEvent e) {	//關閉視窗時呼叫此方法
		System.out.println("關閉視窗");
		System.exit(0);	//結束視窗
	}
	public void windowActivated(WindowEvent e) {	//視窗取得主控呼叫此方法
		System.out.println("取得主控視窗");
	}
	public void windowDeactivated(WindowEvent e) {	//視窗失去主控呼叫此方法
		System.out.println("失去主控視窗");
	}	
	public void windowDeiconified(WindowEvent e) {	//視窗還原時呼叫此方法
		System.out.println("還原視窗");
	}
	public void windowIconified(WindowEvent e) {	//視窗縮小時呼叫此方法
		System.out.println("縮小視窗");
	}
	public void windowOpened(WindowEvent e) {	//開啟視窗時呼叫此方法
		System.out.println("開啟視窗");
	}
	public void windowClosed(WindowEvent e) {	//視窗關閉後呼叫此方法
	}
}
