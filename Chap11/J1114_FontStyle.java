import java.awt.*;
import java.awt.event.*;

class J1114_FrameWindow extends Frame 	//�إ߮ج[�������O
	implements ActionListener	//����Action��ť
{
	Button btnBold, btnItalic, btnPlain;	//�w�q���s�ܼ�
	String message = "Java 2";	//�w�q�T���r��
	String fontname = "Courier New";	//�w�q�r���r��
	int type = Font.PLAIN;	//�w�q�r���κA
	int size = 16;	//�w�q�r���j�p
	Font font;	//�w�q�r������
	FontMetrics fm;	//�w�q�r���}�C����

	J1114_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		btnBold = new Button("����");	//�إ߲�����s
		btnItalic = new Button("����");	//�إ߱�����s
		btnPlain = new Button("���`");	//�إߥ��`���s
		add(btnBold);	//�[�J������s�����
		add(btnItalic);	//�[�J������s�����
		add(btnPlain);	//�[�J���`���s�����
		btnBold.addActionListener(this);	//�[�J������s��ť
		btnItalic.addActionListener(this);	//�[�J������s��ť
		btnPlain.addActionListener(this);	//�[�J���`���s��ť
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnBold)	//�Y�ƹ���������s
			type = Font.BOLD;	//�]�w�������X�r��
		if(e.getSource() == btnItalic)	//�Y�ƹ���������s
			type = Font.ITALIC;	//�]�w�������X�r��
		if(e.getSource() == btnPlain)	//�Y�ƹ������`���s
			type = Font.PLAIN;	//�]�w�����`��X�r��
		requestFocus();
		repaint();
	}
	public void paint(Graphics g)	//�B�z����ø��
	{
		font = new Font(fontname, type, size);	//�إߦr������
		g.setFont(font);	//�]�w�r��
		fm = getFontMetrics(font);	//�]�w�r���}�C
		int xloc = (getSize().width - fm.stringWidth(message))/2;	//�վ㬰�����m��
		int yloc = (getSize().height + fm.getHeight())/2;	//�վ㬰�����m��
		g.drawString(message, xloc, yloc);	//�̳]�w�ȿ�X�r��
	}
}
	
public class J1114_FontStyle	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1114_FrameWindow fw = new J1114_FrameWindow("��ܵ����r��{��");	//�إߵ�������
		fw.setSize(500, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}