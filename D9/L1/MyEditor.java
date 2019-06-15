import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//�~��JFrame���O�H�إߥXMyEditor���O
public class MyEditor extends JFrame {

	//�ŧi�@��Container�����ܼƨåN�Jnull
	Container myContainer = null;

	//�w�qMyEditor���O���غc�l
	public MyEditor(String title) {

		//�I�s�����O�]JFrame�^���غc�l
		super(title);

		//���o�ج[��ContentPane�A�ñN���N�JContainer����
		myContainer = this.getContentPane();

		//�]�w�e���������t�m
		myContainer.setLayout(new BorderLayout());

		//�إ߿�J�Ϊ���r�ϰ�
		final JTextArea myText = new JTextArea();

		//�]�w�䴩�۰ʴ���
		myText.setLineWrap(true);

		//�]�w��r�ϰ�إ߱��b�����]JScrollPane�^
		JScrollPane myScroll = new JScrollPane(myText);

		//�N���b�����t�m��ContentPane�W
		myContainer.add(myScroll, BorderLayout.CENTER);

		//�w�q�ج[�]�����^�����ɪ��B�z
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//�]�wLook & Feel
		try {
			//�NLook & Feel�]�w��Java�˦�
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

			//�����]�w��Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//���~�B�z�϶�
		} catch (Exception e) {
		}

		//�]�w�ج[�j�p�B��ܮج[
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//�w�qmain��k
	public static void main(String s[]) {
		//�إ�MyEditor���O������
		MyEditor myApp = new MyEditor("My Editor");
	}
}