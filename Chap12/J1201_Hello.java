import java.awt.*;
import java.awt.event.*;

class J1201_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	TextField txtAnswer;	//�ŧi��r����ܼ�
	Label lblHello;	//�ŧi�����ܼ�
	Button btnAnswer, btnExit;	//�ŧi�R�O���s�ܼ�
	J1201_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		lblHello = new Label("�١I�A�n�ܡH");	//�إ߼��Ҫ���
		txtAnswer = new TextField(30);	//�إߤ�r�������
		btnAnswer = new Button("�^��");	//�إߩR�O���s����
		btnExit = new Button("����");	//�إߩR�O���s����
		
		add(lblHello);	//�[�J���Ҩ������
		add(txtAnswer);	//�[�J��r����������
		add(btnAnswer);	//�[�J�R�O���s�������
		add(btnExit);	//�[�J�R�O���s�������
		btnAnswer.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
		btnExit.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
	}
	public void actionPerformed(ActionEvent event)	//����Action�ƥ��k
	{
		String msg = new String("���¡I�ګܦn�C");	//�w�q�r��
		if(event.getSource() == btnAnswer) {	//�Y��btnAnswer���s�ƥ�
			txtAnswer.setText(msg);	//��X�r����r���
		}
		if(event.getSource() == btnExit) {	//�Y��btnExit���s�ƥ�
			System.exit(0);	//��������������
		}
	}
}
	
public class J1201_Hello	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1201_FrameWindow fw = new J1201_FrameWindow("���ҡB���s�P��r���");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}