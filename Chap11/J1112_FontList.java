import java.awt.*;
import java.awt.event.*;

class J1112_FrameWindow extends Frame	//�إ߮ج[�������O
{
	J1112_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		String message = "";	//�w�q�r���ܼ�
		String[] FontName;	//�w�q�r��}�C�ܼ�

		GraphicsEnvironment ge = 
			GraphicsEnvironment.getLocalGraphicsEnvironment();	//���oø������
		FontName = ge.getAvailableFontFamilyNames();	//���o���Ҥ��r���W��
		for(int i=0; i<FontName.length; i++) {	//��ܦr���j��
			message = FontName[i];	//message=�r��
			if(message.charAt(0) == 'A')	//�Y��A�}�Y���r��
				g.drawString(message, 4, 18*i);	//�h��ܦr���W��
		}
	}
}
	
public class J1112_FontList	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1112_FrameWindow fw = new J1112_FrameWindow("���o�i�Φr���{��");	//�إߵ�������
		fw.setSize(500, 250);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}