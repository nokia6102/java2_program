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
		myButton = new JButton("���");
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				//�إ�JOptionPane
				JOptionPane myOptPane= new JOptionPane("�A��J����r�O�u" + myText.getText() + "�v", JOptionPane.INFORMATION_MESSAGE);

				//�Q��createDialog��k�إߥX��ܤ���A�ñN���N�JJDialog����
				JDialog myDialog = myOptPane.createDialog(myContainer, "Dialog Generated !");
				//�]�w��ܤ������ܪ��A
				myDialog.setVisible(true);
			}

		});

		myContainer.setLayout(new FlowLayout());

		myContainer.add(myText);
		myContainer.add(myButton);

		//�]�wLook & Feel
		try {
			//�NLook & Feel�]�w��Windows�˦�
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			//�����]�w��Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//���~�B�z�϶�
		} catch (Exception e) {
		}
	}
}