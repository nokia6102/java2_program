import java.awt.*;
import java.awt.event.*;

class J1214_FrameWindow extends Frame //�إ߮ج[�������O
	implements ItemListener
{
	PopupMenu popup;	//�ŧi�u�X�\����ܼ�
	CheckboxMenuItem italic;	//�ŧi�֨��\�ඵ�ܼ�
	TextField txtMsg;	//�ŧi��r����ܼ�
	J1214_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�wFlowLayout�t�m�Φ�
		popup = new PopupMenu("Menu");	//�إ�Popup�\���
		add(popup);	//�[�JPopup�\�������
			italic = new CheckboxMenuItem("����");	//�إ�italic�\�ඵ
			italic.addItemListener(this);	//�[�Jitalic�ﶵ��ť
			popup.add(italic);	//�[�Jitalic��Popup�\���

		txtMsg = new TextField(20);	//�إߤ�r���
		txtMsg.setText("���`�r");	//��X��r
		txtMsg.setEditable(false);	//�]�w�����i�s��
		txtMsg.addMouseListener(new J1214_MouseHandler());	//�[�J��r����ƹ���ť
		add(txtMsg);	//�[�J��r��������
	}
	public void itemStateChanged(ItemEvent ie)	//���涵���ܧ�ƥ��k
	{
		if(italic.getState()) {	//�Yitalic���A=true
			txtMsg.setFont(new Font("�s�ө���", Font.ITALIC, 12));
			txtMsg.setText("����r");
		} else {	//�Yitalic���A=false
			txtMsg.setFont(new Font("�s�ө���", Font.PLAIN, 12));
			txtMsg.setText("���`�r");
		}
	}
	class J1214_MouseHandler extends MouseAdapter {	//�ƹ���ť�������O
		public void mousePressed(MouseEvent me) {	//�B�z���U�ƹ������k
			popup.show(txtMsg, me.getX(), me.getY());	//���Popup�\���
		}
	}
}
	
public class J1214_PopupMenu	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1214_FrameWindow fw = new J1214_FrameWindow("Popup Menu");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}