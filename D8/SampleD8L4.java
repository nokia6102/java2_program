import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//擴充JFrame類別建立SampleD8L4類別
public class SampleD8L4 extends JFrame {

	//宣告一個Container物件變數並代入null
	Container myContainer = null;

	//定義SampleD8L4類別的建構子
	public SampleD8L4(String title) {

		//呼叫父類別（JFrame）的建構子
		super(title);

		//取得JFrame的contentPane，並將之代入Container物件中
		myContainer = this.getContentPane();

		//建立用以顯示訊息的標籤
		JLabel myLabel = new JLabel("請設定訊息，完成後按下 [建立!] 鈕", JLabel.CENTER);

		//建立用來輸入訊息的文字欄位
		final JTextField myText = new JTextField("在此輸入訊息", 20);

		//建立按鈕
		JButton myBtn = new JButton("建立!");

		//定義按鈕被按下時的事件處理
		myBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				//建立JOptionPane
				JOptionPane myOptPane= new JOptionPane("沒有===>0倍\n1胚===>2倍\n吐胚===>4倍\n3條===>6倍\n葫蘆===>8倍\n鐵枝===>10倍\n順===>20倍\n同花順===>40倍", JOptionPane.INFORMATION_MESSAGE);

				//以createDialog方法建立對話方塊，並將之代入JDialog物件中
				JDialog myDialog = myOptPane.createDialog(myContainer, "Dialog Generated !");
				//設定對話方塊為顯示狀態
				myDialog.setVisible(true);
			}
		});

		//建立面板（FlowLayout）
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new FlowLayout());

		//將文字欄位、按鈕配置於面板上
		myPanel.add(myText);
		myPanel.add(myBtn);

		//設定Container物件的版面配置（2 ×1的GridLayout）
		myContainer.setLayout(new GridLayout(2, 1));

		//配置標籤、面板
		myContainer.add(myLabel);
		myContainer.add(myPanel);

		//定義框架（視窗）關閉時的處理
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		//設定Look & Feel
		try {
			//將Look & Feel設定為Windows樣式
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			//反應設定的Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//錯誤處理區塊
		} catch (Exception e) {
		}

		//設定框架大小、顯示框架
		this.setSize(350, 120);
		this.setVisible(true);

	}

	//定義main方法
	public static void main(String s[]) {
		//建立SampleD8L4類別的實體
		SampleD8L4 myApp = new SampleD8L4("Dialog Generator");
	}
}