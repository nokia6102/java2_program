import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L2 {

	public static void main(String[] args) {

		//�إ߮ج[�ó]�w����
		final JFrame myFrame = new JFrame("Look & Feel Changer");
		myFrame.getContentPane().setLayout(new GridLayout(3, 1));

		//�إ߰����˥������s�B����
		final JButton myBtn = new JButton("�o�O���s");
		final JLabel myLbl = new JLabel("�o�O����", JLabel.CENTER);


		//�إ߲�1�����s�]Windows Style�^�B�éw�q��ƥ�B�z
		JRadioButton rdoWindows = new JRadioButton("Windows Style");
		rdoWindows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//�]�wLook & Feel
				try {
					//�NLook & Feel�]�w��Windows�˦�
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					//�����]�w��Look & Feel
					SwingUtilities.updateComponentTreeUI(myFrame);
				//���~�B�z�϶�
				} catch (Exception e) {
				}
			}
		});
	

		//�إ߲�2�����s�]Java Style�^�B�éw�q��ƥ�B�z
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

		//�إ߲�3�����s�]Motif Style�^�B�éw�q��ƥ�B�z
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

		//�N���s�[�ܫ��s�s�դ�
		ButtonGroup myGroup = new ButtonGroup();
		myGroup.add(rdoWindows);
		myGroup.add(rdoJava);
		myGroup.add(rdoMotif);

		//�إ߭��O
		JPanel myPanel = new JPanel();
		//�]�w���O����u
		myPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		//�]�w���O�������t�m
		myPanel.setLayout(new FlowLayout());

		//�N���s�[�ܭ��O��
		myPanel.add(rdoWindows);
		myPanel.add(rdoJava);
		myPanel.add(rdoMotif);

		//�N���O�[�ܮج[��
		myFrame.getContentPane().add(myPanel);

		//�N���s�[�ܮج[��
		myFrame.getContentPane().add(myBtn);

		//�N���ҥ[�ܮج[��
		myFrame.getContentPane().add(myLbl);

		//�w�q�ج[�]�����^�����ɪ��B�z
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//�]�w�ج[�j�p�B��ܮج[
		myFrame.setSize(350, 150);
		myFrame.setVisible(true);
 	}
}