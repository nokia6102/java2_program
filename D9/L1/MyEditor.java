import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//繼承JFrame類別以建立出MyEditor類別
public class MyEditor extends JFrame {

	//宣告一個Container物件變數並代入null
	Container myContainer = null;

	//定義MyEditor類別的建構子
	public MyEditor(String title) {

		//呼叫父類別（JFrame）的建構子
		super(title);

		//取得框架的ContentPane，並將之代入Container物件中
		myContainer = this.getContentPane();

		//設定容器的版面配置
		myContainer.setLayout(new BorderLayout());

		//建立輸入用的文字區域
		final JTextArea myText = new JTextArea();

		//設定支援自動換行
		myText.setLineWrap(true);

		//設定文字區域建立捲軸面版（JScrollPane）
		JScrollPane myScroll = new JScrollPane(myText);

		//將捲軸面版配置於ContentPane上
		myContainer.add(myScroll, BorderLayout.CENTER);

		//定義框架（視窗）關閉時的處理
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//設定Look & Feel
		try {
			//將Look & Feel設定為Java樣式
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

			//反應設定的Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//錯誤處理區塊
		} catch (Exception e) {
		}

		//設定框架大小、顯示框架
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//定義main方法
	public static void main(String s[]) {
		//建立MyEditor類別的實體
		MyEditor myApp = new MyEditor("My Editor");
	}
}