import java.awt.*;
import java.awt.event.*;

class J1209_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	final int n = 7, m = 3;	//�ŧi��Ʊ`��
	String s = "";	//�ŧi�r���ܼ�
	Button btn;	//�ŧi�R�O���s�ܼ�
	TextField txtMessage;	//�ŧi��r����ܼ�
	J1209_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new GridLayout(4, 3));	//�]�w�����~��
		for(int i=1; i<=n; i+=3) {	//�~�j��
			for(int j=0; j<m; j++) {	//���j��
				int k = i + j;
				btn = new Button("" + k);	//�إߩR�O���s����
				add(btn);	//�[�J���s�������
				btn.addActionListener(this);	//�[�J���s�ƥ��ť
			}
		}
		btn = new Button("0");	//�إߩR�O���s����
		add(btn);	//�[�J���s�������
		btn.addActionListener(this);	//�[�J���s�ƥ��ť
		txtMessage = new TextField(5);	//�إߤ�r�������
		add(txtMessage);	//�[�J��r����������
	}
	public void actionPerformed(ActionEvent e)	//����Action�ƥ��k
	{
		s = s + ((Button) e.getSource()).getLabel();	//���o���s����
		txtMessage.setText(s);	//��ܲ��ͨƥ󪺫��s
	}
}
	
public class J1209_GridLayout	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1209_FrameWindow fw = new J1209_FrameWindow("GridLayout");	//�إߵ�������
		fw.setSize(300, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}