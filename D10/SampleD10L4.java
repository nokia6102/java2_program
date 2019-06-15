import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SampleD10L4 extends JApplet {

	Container myContainer;
	JTextField myText;
	JButton myButton;

	public void init() {

		myContainer = this.getContentPane();
				
		myText = new JTextField(15);
		myButton = new JButton("顯示");
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				//建立JOptionPane
				JOptionPane myOptPane= new JOptionPane("你輸入的文字是「" + myText.getText() + "」", JOptionPane.INFORMATION_MESSAGE);

				//利用createDialog方法建立出對話方塊，並將之代入JDialog物件中
				JDialog myDialog = myOptPane.createDialog(myContainer, "Dialog Generated !");
				//設定對話方塊為顯示狀態
				myDialog.setVisible(true);
			}

		});

		myContainer.setLayout(new FlowLayout());

		myContainer.add(myText);
		myContainer.add(myButton);

		//設定Look & Feel
		try {
			//將Look & Feel設定為Windows樣式
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			//反應設定的Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//錯誤處理區塊
		} catch (Exception e) {
		}
	}
}