import java.awt.*;
import java.awt.event.*;

class J1104_NoFrameWindow extends Window 	//�إߵL�ج[�������O
	implements MouseListener
{
	int X = 0, Y = 0;	//�w�q�ð_�l�y���ܼ�
	Label lblMessage;	//�w�q���Ҫ����ܼ�

	J1104_NoFrameWindow(J1104_FrameWindow title)	//�ج[�������O�إߪ�
	{
		super(title);	//�I�sFrame���O�إߪ�
		setLayout(new FlowLayout());	//�]�w����Layout
		lblMessage = new Label("�@�@�@�@");	//�إ߼���
		add(lblMessage);	//�[�J���Ҩ����
		addMouseListener(this);	//�[�Ƶ������ƹ���ť
	}
	public void paint(Graphics g)	//��X��r�ιϧΨ����
	{
		int width = getSize().width;	//���o�L�ج[�����e��
		int height = getSize().height;	//���o�L�ج[��������
		g.drawRect(0, 0, --width, --height);	//�[��u��L�ج[����
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

class J1104_FrameWindow extends Frame implements ActionListener
{
	Button btnShow, btnHide;	//�w�q���s�ܼ�
	J1104_NoFrameWindow nf;	//�w�q�L�ج[�����ܼ�
	J1104_FrameWindow()
	{
		setLayout(new FlowLayout());
		btnShow = new Button("��ܵ���");	//�إ�btnShow���s
		btnHide = new Button("���õ���");	//�إ�btnHide���s
		add(btnShow);	//�[�JbtnShow�s��Applet
		add(btnHide);	//�[�JbtnHide�s��Applet
		btnShow.addActionListener(this);	//�[�JbtnShow���s��ť
		btnHide.addActionListener(this);	//�[�JbtnHide���s��ť
		nf = new J1104_NoFrameWindow(this);	//�إߵL�ج[����
		nf.setSize(400, 200);	//�]�w�����j�p
		nf.setLocation(300, 300);	//�]�w������m
	}
	public void actionPerformed(ActionEvent e)	//�����P�B�z���s�ƥ�
	{
		if(e.getSource() == btnShow) {	//�Y�ObtnShow���ͨƥ�
			nf.setVisible(true);	//��ܵ���
		}
		if(e.getSource() == btnHide) {	//�Y�ObtnHide���ͨƥ�
			nf.setVisible(false);	//���õ���
		}
	}
}
	
public class J1104_WindowLabel	//�إߵ������ε{�����O
{
	public static void main(String[] args) {	//main��k
		J1104_FrameWindow fw = new J1104_FrameWindow();	//�إߵ���
		fw.setSize(200, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�B�z���������ƥ��k
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}