import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L1n {

	public static void main(String[] args) {

		//�إ߮ج[�ó]�w�����t�m
		JFrame myFrame = new JFrame("Click Me Buttons !");
		myFrame.getContentPane().setLayout(null);
	//myFrame.getContentPane().setLayout(new BorderLayout());
		//�إ߭����]Panel�^�ó]�w�����t�m
		//JPanel myPanel = new JPanel();
//		myPanel.setLayout(new GridLayout(1, 3, 5, 5));
		//myPanel.setLayout(null);
		//�إ���ܰT���Ϊ�����
		final JLabel myLabel = new JLabel("���I����@�����s");
		myLabel.setBounds(10,20,100,100);

		//�إ�btnA
		JButton btnA = new JButton("btnA");
		btnA.setBounds(10,30,60,20);
		//�w�qbtnA�Q�I��ɪ��ƥ�
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("�A���U�FbtnA���s");
				
			}
		});

		//�إ�btnB
		JButton btnB = new JButton("btnB");
		btnB.setBounds(170,330,160,20);	
		//�w�qbtnB�Q�I��ɪ��ƥ�
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("�A���U�FbtnB���s");
				System.out.println("123");
			}
		});

		//�إ�btnC
		Icon icon1=new ImageIcon("hold.gif");
		JButton btnC = new JButton("�O�d");
		btnC.setBounds(130,30,100,20);	
		//�w�qbtnC�Q�I��ɪ��ƥ�
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("�A���U�FbtnC���s");
			}
		});


		//�N���s�[�ܭ�����
		myFrame.getContentPane().add(btnA,null);
		myFrame.getContentPane().add(btnB,null);
		myFrame.getContentPane().add(btnC,null);

		//�N�����[�ܮج[���]�[��BorderLayout���_���^
		//myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);

		//�N���ҥ[�ܮج[���]�[��BorderLayout�����ŤU�Ӫ��ϰ�^
	//	myFrame.getContentPane().add(myLabel, BorderLayout.CENTER);	

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
		myFrame.setSize(500, 600);
		myFrame.setVisible(true);

 	}
}