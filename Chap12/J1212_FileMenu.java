import java.awt.*;
import java.awt.event.*;

class J1212_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	MenuBar menubar;	//�ŧiMenuBar�ܼ�
	Menu mnuFile;	//�ŧiMenu�ܼ�
	MenuItem itmNew, itmOpen, itmSave, itmPrint, itmExit;	//�ŧiMenuItem�ܼ�
	Label lblMsg;	//�ŧi�����ܼ�
	J1212_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new GridLayout(1, 1));	//�]�wGridLayout�t�m�Φ�
		lblMsg = new Label();	//�إ߼��Ҫ���
		add(lblMsg);	//�[�J���Ҩ������

		menubar = new MenuBar();	//�إߥ\���C
		mnuFile = new Menu("File");	//�إ��ɮץ\���
		menubar.add(mnuFile);	//�[�J�ɮץ\���
			itmNew = new MenuItem("New", 	//�إ�New�\�ඵ
				new MenuShortcut(KeyEvent.VK_N));	//�]�wNew���ֱ���
			itmOpen = new MenuItem("Open", 	//�إ�Open�\�ඵ
				new MenuShortcut(KeyEvent.VK_O));	//�]�wOpen���ֱ���
			itmSave = new MenuItem("Save", 	//�إ�Save�\�ඵ
				new MenuShortcut(KeyEvent.VK_S));	//�]�wSave���ֱ���
			itmPrint = new MenuItem("Print", 	//�إ�Print�\�ඵ
				new MenuShortcut(KeyEvent.VK_P));	//�]�wPrint���ֱ���
			itmExit = new MenuItem("Exit", 	//�إ�Exit�\�ඵ
				new MenuShortcut(KeyEvent.VK_X));	//�]�wExit���ֱ���

			mnuFile.add(itmNew);	//�[�JNew��File�\���
			mnuFile.add(itmOpen);	//�[�JOpen��File�\���
			mnuFile.add(itmSave);	//�[�JSave��File�\���
			mnuFile.addSeparator();	//�[�J���j�u
			mnuFile.add(itmPrint);	//�[�JPrint��File�\���
			itmPrint.setEnabled(false);	//�OPrint�\�ඵ����
			mnuFile.addSeparator();	//�[�J���j�u
			mnuFile.add(itmExit);	//�[�JExot��File�\���

			itmNew.addActionListener(this);	//�[�JNew�\�ඵ�ʧ@��ť
			itmOpen.addActionListener(this);	//�[�JOpen�\�ඵ�ʧ@��ť
			itmSave.addActionListener(this);	//�[�JSave�\�ඵ�ʧ@��ť
			itmExit.addActionListener(this);	//�[�JExit�\�ඵ�ʧ@��ť

		setMenuBar(menubar);	//�]�w�����\���C
	}
	public void actionPerformed(ActionEvent e)	//����Action�ƥ��k
	{
		if(e.getActionCommand().equals("New"))	//�Y��First�\�ඵ�ƥ�
			lblMsg.setText("���� New �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Open"))	//�Y��Open�\�ඵ�ƥ�
			lblMsg.setText("���� Open �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Save"))	//�Y��Save�\�ඵ�ƥ�
			lblMsg.setText("���� Save �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Exit"))	//�Y��Exit�\�ඵ�ƥ�
			lblMsg.setText("���� Exit �\��");	//�]�w���Ҥ�r
	}
}
	
public class J1212_FileMenu	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1212_FrameWindow fw = new J1212_FrameWindow("FileMenu");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}