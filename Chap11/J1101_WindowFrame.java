import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

class J1101_Frame extends Frame	//�إ߮ج[�������O
{
	J1101_Frame(String title)	//�ج[�������O�إߪ�
	{
		super(title);	//�I�sFrame���O�إߪ�
		setLayout(new FlowLayout());	//�]�w����Layout
	}
}

public class J1101_WindowFrame extends Applet	//�إ�Applet���O
	implements ActionListener	//����Action��ť����
{
	Button btnShow, btnHide;	//�w�q���s�ܼ�
	J1101_Frame window;	//�w�q�������D�ܼ�

	public void init()	//�w�q�_�l��k
	{
		btnShow = new Button("��ܵ���");	//�إ�btnShow���s
		btnHide = new Button("���õ���");	//�إ�btnHide���s
		add(btnShow);	//�[�JbtnShow�s��Applet
		add(btnHide);	//�[�JbtnHide�s��Applet
		btnShow.addActionListener(this);	//�[�JbtnShow���s��ť
		btnHide.addActionListener(this);	//�[�JbtnHide���s��ť
		window = new J1101_Frame("�ج[����");	//�إߵ���
		window.setSize(300, 200);	//�w�q�����j�p
	}
	public void actionPerformed(ActionEvent e)	//�����P�B�z���s�ƥ�
	{
		if(e.getSource() == btnShow) {	//�Y�ObtnShow���ͨƥ�
			window.setVisible(true);	//��ܵ���
		}
		if(e.getSource() == btnHide) {	//�Y�ObtnHide���ͨƥ�
			window.setVisible(false);	//���õ���
		}
	}
}