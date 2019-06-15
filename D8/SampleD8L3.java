import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//�X�RJFrame���O�ӫإ�SampleD8L3���O
public class SampleD8L3 extends JFrame {

	//�Ψ��x�s�I�隸�ƪ��ܼ�
	int intCount = 0;

	//�w�qSampleD8L3���O���غc�l
	public SampleD8L3(String title) {

		//�I�s�����O�]JFrame�^���غc�l
		super(title);

		//�إ� "�p�⦸��" ���s
		JButton myBtn = new JButton("�p�⦸��");

		//�إ� "����" ���s
		JButton myClrBtn = new JButton("����");

		//�إߥΨ���ܰT��������
		final JLabel myLabel = new JLabel("�A�@�@���U�F " + intCount + " ��", JLabel.CENTER);

		//�w�q "�}�l�p��" ���s���ƥ�B�z
		myBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				intCount = intCount + 1;
				myLabel.setText("�A�@�@���U�F " + intCount + " ��");
			}
		});

		//�w�q "����" ���s���ƥ�B�z
		myClrBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				intCount = 0;
				myLabel.setText("�A�@�@���U�F " + intCount + " ��");
			}
		});

		//�إ߭��O�ðt�m���s
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(1, 2));
		myPanel.add(myBtn);
		myPanel.add(myClrBtn);

		//�N���O�P���ҥ[�ܮج[��
		this.getContentPane().add(myPanel, BorderLayout.NORTH);
		this.getContentPane().add(myLabel, BorderLayout.CENTER);


		//�w�q�ج[�]�����^�����ɪ��B�z
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//�]�wLook & Feel
		try {
			//�]�wLook & Feel��Motif�˦�
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

			//�����]�w��Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//���~�B�z�϶�
		} catch (Exception e) {
		}

		//�]�w�ج[�j�p�B��ܮج[
		this.setSize(350, 100);
		this.setVisible(true);
	}

	//�w�qmain��k
	public static void main(String args[]) {
		//�إ�SampleD8L3���O������
		SampleD8L3 myApp = new SampleD8L3("Click Counter");
	}
}