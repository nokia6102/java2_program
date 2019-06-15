import java.awt.*;
import java.awt.event.*;

class J1103_FrameWindow extends Frame	//�إ߮ج[�������O
	implements MouseListener
{
	int X = 0, Y = 0;	//�w�q�ð_�l�y���ܼ�
	Label lblMessage;	//�w�q���Ҫ����ܼ�

	J1103_FrameWindow(String title)	//�ج[�������O�إߪ�
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
	
public class J1103_WindowApp	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1103_FrameWindow fw = new J1103_FrameWindow("�������ε{��");	//�إߵ���
		fw.setSize(200, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�B�z���������ƥ��k
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}