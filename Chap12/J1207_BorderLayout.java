import java.awt.*;
import java.awt.event.*;

class J1207_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	TextField txtCenter;	//�ŧi��r����ܼ�
	Button btnNorth, btnSouth, btnEast, btnWest;	//�ŧi�R�O���s�ܼ�
	J1207_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new BorderLayout());	//�]�w�����~��
		txtCenter = new TextField(20);	//�إߤ�r�������
		btnNorth = new Button("North");	//�إ�North���s����
		btnSouth = new Button("South");	//�إ�South���s����
		btnEast = new Button("East");	//�إ�East���s����
		btnWest = new Button("West");	//�إ�West���s����
		add("North", btnNorth);	//�[�JNorth���s�������
		add("South", btnSouth);	//�[�JSouth���s�������
		add("East", btnEast);	//�[�JEast���s�������
		add("West", btnWest);	//�[�JWest���s�������
		add("Center", txtCenter);	//�[�J��r����������
		btnNorth.addActionListener(this);	//�[�JNorth���s�ʧ@��ť
		btnSouth.addActionListener(this);	//�[�JSouth���s�ʧ@��ť
		btnEast.addActionListener(this);	//�[�JEast���s�ʧ@��ť
		btnWest.addActionListener(this);	//�[�JWest���s�ʧ@��ť
	}
	public void actionPerformed(ActionEvent e)	//����Action�ƥ��k
	{
		txtCenter.setText(((Button) e.getSource()).getLabel()
			 + " �s�Q���U");	//��ܳQ���U�����s
	}
}
	
public class J1207_BorderLayout	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1207_FrameWindow fw = new J1207_FrameWindow("BorderLayout");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}