import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L1 {

	public static void main(String[] args) {

		//�إ߮ج[�ó]�w�����t�m
		JFrame myFrame = new JFrame("Click Me Buttons !");
		myFrame.getContentPane().setLayout(new BorderLayout());
		//myFrame.getContentPane().setLayout(null);
		//�إ߭����]Panel�^�ó]�w�����t�m
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(1, 3, 5, 5));

		//�إ���ܰT���Ϊ�����
		final JLabel myLabel = new JLabel("���I����@�����s", JLabel.CENTER);

		//�إ�btnA
		JButton btnA = new JButton("btnA");

		//�w�qbtnA�Q�I��ɪ��ƥ�
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("�A���U�FbtnA���s");
				
			}
		});

		//�إ�btnB
		JButton btnB = new JButton("btnB");

		//�w�qbtnB�Q�I��ɪ��ƥ�
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("�A���U�FbtnB���s");
				System.out.println("123");
			}
		});

		//�إ�btnC
		JButton btnC = new JButton("btnC");

		//�w�qbtnC�Q�I��ɪ��ƥ�
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("�A���U�FbtnC���s");
			}
		});


		//�N���s�[�ܭ�����
		myPanel.add(btnA);
		myPanel.add(btnB);
		myPanel.add(btnC);

		//�N�����[�ܮج[���]�[��BorderLayout���_���^
		myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);

		//�N���ҥ[�ܮج[���]�[��BorderLayout�����ŤU�Ӫ��ϰ�^
		myFrame.getContentPane().add(myLabel, BorderLayout.CENTER);	

		//�w�q�ج[�]�����^�����ɪ��B�z
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//�]�wLook & Feel
		try {
			//�NLook & Feel�]�w��Windows�˦�
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