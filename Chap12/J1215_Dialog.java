import java.awt.*;
import java.awt.event.*;

class J1215_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	MenuBar menubar;	//�ŧi�\���C�ܼ�
	Menu mnuFile;	//�ŧi�\����ܼ�
	MenuItem itmNew, itmExit;	//�ŧi�\�ඵ�ܼ�
	Label lblMsg;	//�ŧi�����ܼ�
	J1215_NewDialog dialog;	//�ŧi�ۭq���O�ܼ�

	J1215_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new GridLayout(1, 1));	//�]�wGridLayout�t�m�Φ�
		lblMsg = new Label();	//�إ߼��Ҫ���
		add(lblMsg);	//�[�J���Ҩ������

		menubar = new MenuBar();	//�إߥ\���C
		mnuFile = new Menu("�ɮ�");	//�إ�File�\���
		menubar.add(mnuFile);	//�[�JFile�\���
			itmNew = new MenuItem("�s�W ...");	//�إ߷s�W�\�ඵ
			itmExit = new MenuItem("����");	//�إߵ����\�ඵ
			mnuFile.add(itmNew);	//�[�J�s�W���ɮץ\���
			mnuFile.add(itmExit);	//�[�J�������ɮץ\���
			itmNew.addActionListener(this);	//�[�J�s�W�\�ඵ�ʧ@��ť
			itmExit.addActionListener(this);	//�[�J�����\�ඵ�ʧ@��ť
		setMenuBar(menubar);	//�]�w�����\���C
		dialog = new J1215_NewDialog(this, "�s�W", true);	//�إ߹�ܤ��
	}
	public void actionPerformed(ActionEvent e)	//�������Action�ƥ��k
	{
		if(e.getSource() == itmNew) {	//�Y���s�W�\�ඵ�ƥ�
			dialog.setVisible(true);	//�i�אּdialog.show()
			lblMsg.setText(dialog.data);	//�Ǧ^��r����r��
		}
		else if(e.getSource() == itmExit) {	//�Y�������\�ඵ�ƥ�
			System.exit(0);	//��������������
		}
	}
}

class J1215_NewDialog extends Dialog implements ActionListener	//�ۭq��ܤ�����O
{
	Button btnOk, btnCancel;	//�ŧi�R�O���s�ܼ�
	TextField txtInput;	//�ŧi��r����ܼ�
	String data;	//�ŧi�r���ܼ�
	J1215_NewDialog(Frame hostFrame, String title, boolean dModal)	//�إߪ�
	{
		super(hostFrame, title, dModal);	//�إ߹�ܤ������
		setSize(200, 100);	//�w�q��ܤ�������j�p
		setLayout(new FlowLayout());	//�]�w��ܤ���t�m�Φ�
		txtInput = new TextField(20);	//�إߤ�r���
		btnOk = new Button("�T�{");	//�إ߽T�{���s
		btnCancel = new Button("����");	//�إߨ������s
		add(txtInput);	//�[�J��r������ܮ�
		add(btnOk);	//�[�J�T�{���s���ܮ�
		add(btnCancel);	//�[�J�����s���ܮ�
		btnOk.addActionListener(this);	//�[�J�T�{���s�ʧ@��ť
		btnCancel.addActionListener(this);	//�[�J�������s�ʧ@��ť
		data = new String("");	//��ߪťզr��
	}
	public void actionPerformed(ActionEvent e)	//�����ܮ�Action�ƥ��k
	{
		if(e.getSource() == btnOk) {	//�Y���T�{���s�ƥ�
			data = txtInput.getText();	//data=��r����r��
		} else {	//�Y�D�T�{���s�ƥ�
			data = "";	//data=�Ŧr��
		}
		setVisible(false);	//�i�אּhide()
			
	}
}
	
public class J1215_Dialog	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1215_FrameWindow fw = 
			new J1215_FrameWindow("��ܤ��");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}