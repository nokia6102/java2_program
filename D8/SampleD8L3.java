import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//擴充JFrame類別來建立SampleD8L3類別
public class SampleD8L3 extends JFrame {

	//用來儲存點選次數的變數
	int intCount = 0;

	//定義SampleD8L3類別的建構子
	public SampleD8L3(String title) {

		//呼叫父類別（JFrame）的建構子
		super(title);

		//建立 "計算次數" 按鈕
		JButton myBtn = new JButton("計算次數");

		//建立 "重來" 按鈕
		JButton myClrBtn = new JButton("重來");

		//建立用來顯示訊息的標籤
		final JLabel myLabel = new JLabel("你一共按下了 " + intCount + " 次", JLabel.CENTER);

		//定義 "開始計算" 按鈕的事件處理
		myBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				intCount = intCount + 1;
				myLabel.setText("你一共按下了 " + intCount + " 次");
			}
		});

		//定義 "重來" 按鈕的事件處理
		myClrBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				intCount = 0;
				myLabel.setText("你一共按下了 " + intCount + " 次");
			}
		});

		//建立面板並配置按鈕
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(1, 2));
		myPanel.add(myBtn);
		myPanel.add(myClrBtn);

		//將面板與標籤加至框架中
		this.getContentPane().add(myPanel, BorderLayout.NORTH);
		this.getContentPane().add(myLabel, BorderLayout.CENTER);


		//定義框架（視窗）關閉時的處理
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//設定Look & Feel
		try {
			//設定Look & Feel為Motif樣式
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

			//反應設定的Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//錯誤處理區塊
		} catch (Exception e) {
		}

		//設定框架大小、顯示框架
		this.setSize(350, 100);
		this.setVisible(true);
	}

	//定義main方法
	public static void main(String args[]) {
		//建立SampleD8L3類別的實體
		SampleD8L3 myApp = new SampleD8L3("Click Counter");
	}
}