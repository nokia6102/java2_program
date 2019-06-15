import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L2 {

	public static void main(String[] args) {

		//設定標題呼叫出JFrame的建構子
		JFrame myFrame = new JFrame("第一個Swing Application");


		//定義關閉框架（視窗）時的處理
		myFrame.addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
 			}
		});


	//將視窗大小設為300 ×200
	myFrame.setSize(300, 200);
	myFrame.setVisible(true);
	//myFrame.setCursor(13);
    }
}