import java.awt.*;
import java.awt.event.*;

class J1113_FrameWindow extends Frame	//�إ߮ج[�������O
{
	String message = "�ɫe������A�æ��a�W���C�|�Y�����A�C�Y��G�m�C";
	Font f;		//�w�q�r�������ܼ�

	J1113_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		f = new Font("�з���", Font.PLAIN, 16);	//�إ߿�X�r�����з���
		setFont(f);	//�]�w��X�r��
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		g.drawString(message, 50, 100);	//��X�r��
	}
}
	
public class J1113_FontSelect	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1113_FrameWindow fw = new J1113_FrameWindow("�����ܦr���{��");	//�إߵ�������
		fw.setSize(500, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}