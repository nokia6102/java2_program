import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

class J1102_FrameWindow extends Frame	//�إ߮ج[�������O
	implements MouseListener
{
	int X = 0, Y = 0;	//�w�q�ð_�l�y���ܼ�
	Label lblMessage;	//�w�q���Ҫ����ܼ�

	J1102_FrameWindow(String title)	//�ج[�������O�إߪ�
	{
		super(title);	//�I�sFrame���O�إߪ�
		setLayout(new FlowLayout());	//�]�w����Layout
		lblMessage = new Label("�@�@�@�@");	//�إ߼���
		add(lblMessage);	//�[�J���Ҩ����
		addMouseListener(this);	//�[�Ƶ������ƹ���ť
	}
	public void paint(Graphics g)	//��X��r�ιϧΨ����
	{
		g.drawString("(" + X + ", " + Y + ")", X, Y);	//��ܷƹ���m�y��
	}
	public void mouseClicked(MouseEvent e)	//���U�P��}�ƹ��ƥ��k
	{
		X = e.getX(); Y = e.getY();	//���o�ƹ��y��
		repaint();	//��������
	}
	public void mouseEntered(MouseEvent e)	//�B�z�ƹ��i�J�����ƥ��k
	{
		lblMessage.setText("�ƹ��i�J");	//��ܼ��Ҥ�r
	}
	public void mouseExited(MouseEvent e)	//�B�z�ƹ����}�����ƥ��k
	{
		lblMessage.setText("�ƹ����}");	//��ܼ��Ҥ�r
	}
	public void mousePressed(MouseEvent e)	//�B�z���U�ƹ��ƥ��k
	{
		lblMessage.setText("���U�ƹ�");	//��ܼ��Ҥ�r
	}
	public void mouseReleased(MouseEvent e)	//�B�z��}�ƹ��ƥ��k
	{
		lblMessage.setText("��}�ƹ�");	//��ܼ��Ҥ�r
	}
}

public class J1102_WindowEvent extends Applet	//�إ�Applet���O
	implements ActionListener	//����Action��ť����
{
	Button btnShow, btnHide;	//�w�q���s�ܼ�
	J1102_FrameWindow window;	//�w�q�������D�ܼ�

	public void init()
	{
		btnShow = new Button("��ܵ���");	//�إ�btnShow���s
		btnHide = new Button("���õ���");	//�إ�btnHide���s
		add(btnShow);	//�[�JbtnShow�s��Applet
		add(btnHide);	//�[�JbtnHide�s��Applet
		btnShow.addActionListener(this);	//�[�JbtnShow���s��ť
		btnHide.addActionListener(this);	//�[�JbtnHide���s��ť
		window = new J1102_FrameWindow("�ج[����");	//�إߵ���
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