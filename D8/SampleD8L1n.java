import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L1n {

	public static void main(String[] args) {

		//建立框架並設定版面配置
		JFrame myFrame = new JFrame("Click Me Buttons !");
		myFrame.getContentPane().setLayout(null);
	//myFrame.getContentPane().setLayout(new BorderLayout());
		//建立面版（Panel）並設定版面配置
		//JPanel myPanel = new JPanel();
//		myPanel.setLayout(new GridLayout(1, 3, 5, 5));
		//myPanel.setLayout(null);
		//建立顯示訊息用的標籤
		final JLabel myLabel = new JLabel("請點選任一顆按鈕");
		myLabel.setBounds(10,20,100,100);

		//建立btnA
		JButton btnA = new JButton("btnA");
		btnA.setBounds(10,30,60,20);
		//定義btnA被點選時的事件
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("你按下了btnA按鈕");
				
			}
		});

		//建立btnB
		JButton btnB = new JButton("btnB");
		btnB.setBounds(170,330,160,20);	
		//定義btnB被點選時的事件
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("你按下了btnB按鈕");
				System.out.println("123");
			}
		});

		//建立btnC
		Icon icon1=new ImageIcon("hold.gif");
		JButton btnC = new JButton("保留");
		btnC.setBounds(130,30,100,20);	
		//定義btnC被點選時的事件
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("你按下了btnC按鈕");
			}
		});


		//將按鈕加至面版中
		myFrame.getContentPane().add(btnA,null);
		myFrame.getContentPane().add(btnB,null);
		myFrame.getContentPane().add(btnC,null);

		//將面版加至框架中（加至BorderLayout的北側）
		//myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);

		//將標籤加至框架中（加至BorderLayout中間空下來的區域）
	//	myFrame.getContentPane().add(myLabel, BorderLayout.CENTER);	

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
		myFrame.setSize(500, 600);
		myFrame.setVisible(true);

 	}
}