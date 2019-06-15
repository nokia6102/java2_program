import java.awt.*;
import java.awt.event.*;

class J1115_FrameWindow extends Frame
{
	String line11 = "Success is never ending.";
	String line12 = "Failure is never final.";
	String line21 = "Focus on giving.";
	String line22 = "Instead of getting.";
	String line31 = "You will never win,";
	String line32 = "if you never begin.";

	String name = "Courier New";	//�w�q�r���W��
	int style = Font.PLAIN;	//�w�q�r���˦�
	int size = 16;	//�w�q�r���j�p
	Font font;	//�ŧi�r���ܼ�
	FontMetrics fm;	//�ŧi�r���x�}�ܼ�
	int locX = 0, locY = 20;	//�w�q�_�I�y��

	J1115_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
	}
	void nextLine(String s, Graphics g)	//��ܤU�@���r��k
	{
		FontMetrics fm = g.getFontMetrics();	//�إߦr���x�}����
		locX = 10;	//�]�w�_�Ix�y��
		locY += fm.getHeight();	//�]�w�_�Iy�y��
		g.drawString(s, locX, locY);	//��X�r���(x, y)��m
		locX += fm.stringWidth(s);	//�N��X�y�в���C��
	}
	void sameLine(String s, Graphics g)	//��ܦP�@���r��k
	{
		FontMetrics fm = g.getFontMetrics();	//�إߦr���x�}����
		g.drawString(s, locX, locY);	//��X�r���(x, y)��m
		locX += fm.stringWidth(s);	//�N��X�y�в���C��
	}
	public void paint(Graphics g)	//����ø�Ϥ�k
	{
		font = new Font(name, style, size);	//�إߦr������
		g.setFont(font);	//��ܿ�X�r��

		nextLine(line11, g);	//��ܤU�@���r
		sameLine(line12, g);	//��ܦP�@���r
		nextLine(line21, g);	//��ܤU�@���r
		sameLine(line22, g);	//��ܦP�@���r
		nextLine(line31, g);	//��ܤU�@���r
		sameLine(line32, g);	//��ܦP�@���r
	}
}
	
public class J1115_FontMultiline	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1115_FrameWindow fw = new J1115_FrameWindow("��ܦh���r");	//�إߵ�������
		fw.setSize(500, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}