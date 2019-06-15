import java.awt.*;
import java.awt.event.*;

class J1216_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	MenuBar menubar;	//�ŧi�\���C�ܼ�
	Menu mnuFile;	//�ŧi�\����ܼ�
	MenuItem itmOpen, itmExit;	//�ŧi�\�ඵ�ܼ�
	Label lblMsg;	//�ŧi�����ܼ�
	FileDialog dialog;	//�ŧi�ɮ׹�ܤ���ܼ�

	J1216_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new GridLayout(1, 1));	//�]�wGridLayout�t�m�Φ�
		lblMsg = new Label();	//�إ߼��Ҫ���
		add(lblMsg);	//�[�J���Ҩ������

		menubar = new MenuBar();	//�إߥ\���C
		mnuFile = new Menu("�ɮ�");	//�إ��ɮץ\���
		menubar.add(mnuFile);	//�[�J�ɮץ\���
			itmOpen = new MenuItem("�}������ ...");	//�إ߶}�����ɥ\�ඵ
			itmExit = new MenuItem("����");	//�إߵ����\�ඵ
			mnuFile.add(itmOpen);	//�[�J�}�����ɨ��ɮץ\���
			mnuFile.add(itmExit);	//�[�J�������ɮץ\���
			itmOpen.addActionListener(this);	//�[�J�}�����ɥ\�ඵ�ʧ@��ť
			itmExit.addActionListener(this);	//�[�J�����\�ඵ�ʧ@��ť
		setMenuBar(menubar);	//�]�w�����\���C
		dialog = new FileDialog(this, "�}������");	//�إ߹�ܤ��
	}
	public void actionPerformed(ActionEvent e)	//�������Action�ƥ��k
	{
		if(e.getSource() == itmOpen) {	//�Y���}�����ɥ\�ඵ�ƥ�
			dialog.setVisible(true);	//��ܹ�ܤ��
			lblMsg.setText("��ܶ}�� " + dialog.getFile());	//�Ǧ^��ܤ���r��
		}
		else if(e.getSource() == itmExit) {	//�Y�������\�ඵ�ƥ�
			System.exit(0);	//��������������
		}
	}
}

public class J1216_FileDialog	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1216_FrameWindow fw = 
			new J1216_FrameWindow("�ɮ׹�ܤ��");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}