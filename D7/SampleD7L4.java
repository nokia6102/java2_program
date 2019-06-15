import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L4 {

    public static void main(String[] args) {

	//建立JFrame類別的實體
	JFrame myFrame = new JFrame("配置各式元件");

	//建立版面管理員（FlowLayout）的實體
	FlowLayout fLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);

	//設定容器（框架）的版面
	myFrame.getContentPane().setLayout(fLayout);

	//建立JButton類別的實體
	JButton myButton = new JButton("按鈕 Button");

	//建立JLabel類別的實體
	JLabel myLabel = new JLabel("標籤 Label");

	//建立JTextField類別的實體
	JTextField myText = new JTextField("文字欄位 Text Field", 15);

	//將元件加入框架中
	myFrame.getContentPane().add(myButton);	
	myFrame.getContentPane().add(myLabel);
	myFrame.getContentPane().add(myText);

	//定義關閉框架（視窗）時的處理
	myFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	//設定Look & Feel
	try {
		//將Look & Feel設為Windows樣式
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		//反應設定的Look & Feel
		SwingUtilities.updateComponentTreeUI(myFrame);

	//錯誤處理區塊
	} catch (Exception e) {
	}

	//設定框架大小、顯示框架
	myFrame.setSize(250, 100);
	myFrame.setVisible(true);
    }
}