import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L3 {

    public static void main(String[] args) {


	//�إ�JFrame���O������
	JFrame myFrame = new JFrame("�t�m�F���s��Application");

	//�إ�JButton���O������
	JButton myButton = new JButton("��!��!�ڴN�O���s");

	//�N���s�[�J�ج[��
	/*����O�L�k�����[�JJFrame����
	�@�ҥH�����n�����oContentPane�M��A�N����[�J�ܦ�*/
	myFrame.getContentPane().add(myButton);

	//�w�q�����ج[�]�����^�ɪ��B�z
	myFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	//�]�wLook & Feel
	try {
		//�NLook&Feel�]�w��Windows�˦�
		UIManager.setLookAndFeel(
			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		/*
			#�@�Y�n�]��Metal�˦��O�g�W:
				"javax.swing.plaf.metal.MetalLookAndFeel"
			#�@�Y�n�]��Motif�˦��O�g�W:�F
				"com.sun.java.swing.plaf.motif.MotifLookAndFeel"
		*/

		//����Look & Feel���]�w
		SwingUtilities.updateComponentTreeUI(myFrame);


	//���~�B�z�϶�
	} catch (Exception e) {
	}


	//�]�w�ج[�j�p�B��ܮج[
	myFrame.setSize(250, 100);
	myFrame.setVisible(true);
    }
}