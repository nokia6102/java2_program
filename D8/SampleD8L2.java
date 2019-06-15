import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L2 {

	public static void main(String[] args) {

		//建立框架並設定版面
		final JFrame myFrame = new JFrame("Look & Feel Changer");
		myFrame.getContentPane().setLayout(new GridLayout(3, 1));

		//建立做為樣本的按鈕、標籤
		final JButton myBtn = new JButton("這是按鈕");
		final JLabel myLbl = new JLabel("這是標籤", JLabel.CENTER);


		//建立第1顆單選鈕（Windows Style）、並定義其事件處理
		JRadioButton rdoWindows = new JRadioButton("Windows Style");
		rdoWindows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//設定Look & Feel
				try {
					//將Look & Feel設定為Windows樣式
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					//反應設定的Look & Feel
					SwingUtilities.updateComponentTreeUI(myFrame);
				//錯誤處理區塊
				} catch (Exception e) {
				}
			}
		});
	

		//建立第2顆單選鈕（Java Style）、並定義其事件處理
		JRadioButton rdoJava = new JRadioButton("Java Style", true);
		rdoJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					SwingUtilities.updateComponentTreeUI(myFrame);
				} catch (Exception e) {
				}
			}
		});

		//建立第3顆單選鈕（Motif Style）、並定義其事件處理
		JRadioButton rdoMotif = new JRadioButton("Motif Style");
		rdoMotif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					SwingUtilities.updateComponentTreeUI(myFrame);
				} catch (Exception e) {
				}
			}
		});

		//將單選鈕加至按鈕群組中
		ButtonGroup myGroup = new ButtonGroup();
		myGroup.add(rdoWindows);
		myGroup.add(rdoJava);
		myGroup.add(rdoMotif);

		//建立面板
		JPanel myPanel = new JPanel();
		//設定面板的邊線
		myPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		//設定面板的版面配置
		myPanel.setLayout(new FlowLayout());

		//將單選鈕加至面板中
		myPanel.add(rdoWindows);
		myPanel.add(rdoJava);
		myPanel.add(rdoMotif);

		//將面板加至框架中
		myFrame.getContentPane().add(myPanel);

		//將按鈕加至框架中
		myFrame.getContentPane().add(myBtn);

		//將標籤加至框架中
		myFrame.getContentPane().add(myLbl);

		//定義框架（視窗）關閉時的處理
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//設定框架大小、顯示框架
		myFrame.setSize(350, 150);
		myFrame.setVisible(true);
 	}
}