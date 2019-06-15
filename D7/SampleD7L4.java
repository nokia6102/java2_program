import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L4 {

    public static void main(String[] args) {

	//�إ�JFrame���O������
	JFrame myFrame = new JFrame("�t�m�U������");

	//�إߪ����޲z���]FlowLayout�^������
	FlowLayout fLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);

	//�]�w�e���]�ج[�^������
	myFrame.getContentPane().setLayout(fLayout);

	//�إ�JButton���O������
	JButton myButton = new JButton("���s Button");

	//�إ�JLabel���O������
	JLabel myLabel = new JLabel("���� Label");

	//�إ�JTextField���O������
	JTextField myText = new JTextField("��r��� Text Field", 15);

	//�N����[�J�ج[��
	myFrame.getContentPane().add(myButton);	
	myFrame.getContentPane().add(myLabel);
	myFrame.getContentPane().add(myText);

	//�w�q�����ج[�]�����^�ɪ��B�z
	myFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	//�]�wLook & Feel
	try {
		//�NLook & Feel�]��Windows�˦�
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		//�����]�w��Look & Feel
		SwingUtilities.updateComponentTreeUI(myFrame);

	//���~�B�z�϶�
	} catch (Exception e) {
	}

	//�]�w�ج[�j�p�B��ܮج[
	myFrame.setSize(250, 100);
	myFrame.setVisible(true);
    }
}