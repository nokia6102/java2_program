import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L3 {

    public static void main(String[] args) {


	//建立JFrame類別的實體
	JFrame myFrame = new JFrame("配置了按鈕的Application");

	//建立JButton類別的實體
	JButton myButton = new JButton("呵!呵!我就是按鈕");

	//將按鈕加入框架中
	/*元件是無法直接加入JFrame中的
	�@所以必須要先取得ContentPane然後再將元件加入至此*/
	myFrame.getContentPane().add(myButton);

	//定義關閉框架（視窗）時的處理
	myFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	//設定Look & Feel
	try {
		//將Look&Feel設定為Windows樣式
		UIManager.setLookAndFeel(
			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		/*
			#�@若要設為Metal樣式是寫上:
				"javax.swing.plaf.metal.MetalLookAndFeel"
			#�@若要設為Motif樣式是寫上:�F
				"com.sun.java.swing.plaf.motif.MotifLookAndFeel"
		*/

		//反應Look & Feel的設定
		SwingUtilities.updateComponentTreeUI(myFrame);


	//錯誤處理區塊
	} catch (Exception e) {
	}


	//設定框架大小、顯示框架
	myFrame.setSize(250, 100);
	myFrame.setVisible(true);
    }
}