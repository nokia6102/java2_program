import java.awt.*;
import java.awt.event.*;

class J1203_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener, ItemListener
{
	Label lblQuestion;	//�ŧi�����ܼ�
	CheckboxGroup cbgRadios;	//�ŧi�֨��s���ܼ�
	Checkbox chkAnswer1, chkAnswer2, chkAnswer3, chkAnswer4;	//�ŧi�֨�����ܼ�
	TextField txtMessage;	//�ŧi��r����ܼ�
	Button btnExit;	//�ŧi�R�O���s�ܼ�
	J1203_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		lblQuestion = new Label("��̤��O�{���y���H");	//�إ߼��Ҫ���
		cbgRadios = new CheckboxGroup();	//�إ߿�ܸs�ժ���
		chkAnswer1 = new Checkbox("VB", false, cbgRadios);	//�إ߿�ܫ��s����
		chkAnswer2 = new Checkbox("C", false, cbgRadios);	//�إ߿�ܫ��s����
		chkAnswer3 = new Checkbox("C++", false, cbgRadios);	//�إ߿�ܫ��s����
		chkAnswer4 = new Checkbox("Java", false, cbgRadios);	//�إ߿�ܫ��s����
		txtMessage = new TextField(15);	//�إߤ�r�������
		btnExit = new Button("����");	//�إߩR�O���s����
		add(lblQuestion);	//�[�J���Ҩ������
		add(chkAnswer1);	//�[�J�ﶵ���s�������
		add(chkAnswer2);	//�[�J�ﶵ���s�������
		add(chkAnswer3);	//�[�J�ﶵ���s�������
		add(chkAnswer4);	//�[�J�ﶵ���s�������
		add(txtMessage);	//�[�J��r����������
		add(btnExit);	//�[�J�R�O���s�������
		chkAnswer1.addItemListener(this);	//�[�J��ܫ��s�ﶵ��ť
		chkAnswer2.addItemListener(this);	//�[�J��ܫ��s�ﶵ��ť
		chkAnswer3.addItemListener(this);	//�[�J��ܫ��s�ﶵ��ť
		chkAnswer4.addItemListener(this);	//�[�J��ܫ��s�ﶵ��ť
		btnExit.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
	}
	public void itemStateChanged(ItemEvent ie)	//����Item�ƥ��k
	{
		if(ie.getSource() == chkAnswer1)	//�Y��chkAnswer1�ﶵ�ƥ�
			txtMessage.setText("���ߡI����F�C");
		else if(ie.getSource() == chkAnswer2)	//�Y��chkAnswer2�ﶵ�ƥ�
			txtMessage.setText("�藍�_�I�����F�C");
		else if(ie.getSource() == chkAnswer3)	//�Y��chkAnswer3�ﶵ�ƥ�
			txtMessage.setText("�藍�_�I�����F�C");
		else if(ie.getSource() == chkAnswer4)	//�Y��chkAnswer4�ﶵ�ƥ�
			txtMessage.setText("�藍�_�I�����F�C");
	}
	public void actionPerformed(ActionEvent ae)	//����Action�ƥ��k
	{
		if(ae.getSource() == btnExit) {	//�Y��btnExit���s�ƥ�
			System.exit(0);	//��������������
		}
	}
}
	
public class J1203_CheckboxGroup	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1203_FrameWindow fw = new J1203_FrameWindow("����D");	//�إߵ�������
		fw.setSize(400, 100);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}