import java.awt.*;
import java.awt.event.*;

class J1202_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	Label lblQuestion;	//�ŧi�����ܼ�
	Checkbox chkAnswer1, chkAnswer2, chkAnswer3, chkAnswer4;	//�ŧi�֨�����ܼ�
	TextField txtMessage;	//�ŧi��r����ܼ�
	Button btnCheck, btnExit;	//�ŧi�R�O���s�ܼ�
	J1202_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		lblQuestion = new Label("Java �O");	//�إ߼��Ҫ���
		chkAnswer1 = new Checkbox("�@�ص{���y��");	//�إ߮֨��������
		chkAnswer2 = new Checkbox("�@�ة@�ئW��");	//�إ߮֨��������
		chkAnswer3 = new Checkbox("�@�د����W��");	//�إ߮֨��������
		chkAnswer4 = new Checkbox("�@�Ӧa��W��");	//�إ߮֨��������
		txtMessage = new TextField(15);	//�إߤ�r�������
		btnCheck = new Button("�ˬd");	//�إߩR�O���s����
		btnExit = new Button("����");	//�إߩR�O���s����
		add(lblQuestion);	//�[�J���Ҩ������
		add(chkAnswer1);	//�[�J�֨�����������
		add(chkAnswer2);	//�[�J�֨�����������
		add(chkAnswer3);	//�[�J�֨�����������
		add(chkAnswer4);	//�[�J�֨�����������
		add(txtMessage);	//�[�J��r����������
		add(btnCheck);	//�[�J�R�O���s�������
		add(btnExit);	//�[�J�R�O���s�������
		btnCheck.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
		btnExit.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
	}
	public void actionPerformed(ActionEvent event)	//����Action�ƥ��k
	{
		if(event.getSource() == btnCheck) {	//�Y��btnCheck���s�ƥ�
			if(chkAnswer1.getState() == true &&
			   chkAnswer2.getState() == true &&
			   chkAnswer3.getState() == false &&
			   chkAnswer4.getState() == true) {
				txtMessage.setText("���ߡI����F�C");
			} else {
				txtMessage.setText("�藍�_�I�����F�C");
			}
		}
		if(event.getSource() == btnExit) {	//�Y��btnExit���s�ƥ�
			System.exit(0);	//��������������
		}
	}
}
	
public class J1202_Checkbox	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1202_FrameWindow fw = new J1202_FrameWindow("�ƿ��D");	//�إߵ�������
		fw.setSize(150, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}