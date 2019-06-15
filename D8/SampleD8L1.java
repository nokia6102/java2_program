import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L1 {

	public static void main(String[] args) {

		//建立框架並設定版面配置
		JFrame myFrame = new JFrame("Click Me Buttons !");
		myFrame.getContentPane().setLayout(new BorderLayout());
		//myFrame.getContentPane().setLayout(null);
		//建立面版（Panel）並設定版面配置
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(1, 3, 5, 5));

		//建立顯示訊息用的標籤
		final JLabel myLabel = new JLabel("請點選任一顆按鈕", JLabel.CENTER);

		//建立btnA
		JButton btnA = new JButton("btnA");

		//定義btnA被點選時的事件
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("你按下了btnA按鈕");
				
			}
		});

		//建立btnB
		JButton btnB = new JButton("btnB");

		//定義btnB被點選時的事件
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("你按下了btnB按鈕");
				System.out.println("123");
			}
		});

		//建立btnC
		JButton btnC = new JButton("btnC");

		//定義btnC被點選時的事件
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("你按下了btnC按鈕");
			}
		});


		//將按鈕加至面版中
		myPanel.add(btnA);
		myPanel.add(btnB);
		myPanel.add(btnC);

		//將面版加至框架中（加至BorderLayout的北側）
		myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);

		//將標籤加至框架中（加至BorderLayout中間空下來的區域）
		myFrame.getContentPane().add(myLabel, BorderLayout.CENTER);	

		//定義框架（視窗）關閉時的處理
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
		myFrame.setSize(250, 100);
		myFrame.setVisible(true);

 	}
}