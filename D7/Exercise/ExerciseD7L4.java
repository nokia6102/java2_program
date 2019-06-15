import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD7L4 {

    public static void main(String[] args) {

	//建立JFrame類別的實體
	JFrame myFrame = new JFrame("變更Application");

	//建立版面管理員（FlowLayout）的實體
	FlowLayout fLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);

	//設定容器（框架）的版面
	myFrame.getContentPane().setLayout(fLayout);

	//建立JButton類別的實體
	JButton myButton = new JButton("這就是按鈕");

	//建立JLabel類別的實體
	JLabel myLabel = new JLabel("這就是標籤");

	//建立JTextField類別的實體
	JTextField myText = new JTextField("這就是文字欄位", 20);

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
		//將Look & Feel設定為Windows樣式
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		//反應設定的Look & Feel
		SwingUtilities.updateComponentTreeUI(myFrame);

	//錯誤處理區塊
	} catch (Exception e) {
	}

	//設定框架大小、顯示框架
	myFrame.setSize(300, 150);
	myFrame.setVisible(true);
    }
}