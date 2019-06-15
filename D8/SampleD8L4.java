import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//�X�RJFrame���O�إ�SampleD8L4���O
public class SampleD8L4 extends JFrame {

	//�ŧi�@��Container�����ܼƨåN�Jnull
	Container myContainer = null;

	//�w�qSampleD8L4���O���غc�l
	public SampleD8L4(String title) {

		//�I�s�����O�]JFrame�^���غc�l
		super(title);

		//���oJFrame��contentPane�A�ñN���N�JContainer����
		myContainer = this.getContentPane();

		//�إߥΥH��ܰT��������
		JLabel myLabel = new JLabel("�г]�w�T���A��������U [�إ�!] �s", JLabel.CENTER);

		//�إߥΨӿ�J�T������r���
		final JTextField myText = new JTextField("�b����J�T��", 20);

		//�إ߫��s
		JButton myBtn = new JButton("�إ�!");

		//�w�q���s�Q���U�ɪ��ƥ�B�z
		myBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				//�إ�JOptionPane
				JOptionPane myOptPane= new JOptionPane("�S��===>0��\n1�F===>2��\n�R�F===>4��\n3��===>6��\n��Ī===>8��\n�K�K===>10��\n��===>20��\n�P�ᶶ===>40��", JOptionPane.INFORMATION_MESSAGE);

				//�HcreateDialog��k�إ߹�ܤ���A�ñN���N�JJDialog����
				JDialog myDialog = myOptPane.createDialog(myContainer, "Dialog Generated !");
				//�]�w��ܤ������ܪ��A
				myDialog.setVisible(true);
			}
		});

		//�إ߭��O�]FlowLayout�^
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new FlowLayout());

		//�N��r���B���s�t�m�󭱪O�W
		myPanel.add(myText);
		myPanel.add(myBtn);

		//�]�wContainer���󪺪����t�m�]2 ��1��GridLayout�^
		myContainer.setLayout(new GridLayout(2, 1));

		//�t�m���ҡB���O
		myContainer.add(myLabel);
		myContainer.add(myPanel);

		//�w�q�ج[�]�����^�����ɪ��B�z
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		//�]�wLook & Feel
		try {
			//�NLook & Feel�]�w��Windows�˦�
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			//�����]�w��Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//���~�B�z�϶�
		} catch (Exception e) {
		}

		//�]�w�ج[�j�p�B��ܮج[
		this.setSize(350, 120);
		this.setVisible(true);

	}

	//�w�qmain��k
	public static void main(String s[]) {
		//�إ�SampleD8L4���O������
		SampleD8L4 myApp = new SampleD8L4("Dialog Generator");
	}
}