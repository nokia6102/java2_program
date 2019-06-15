import java.awt.*;
import java.awt.event.*;

class J1206_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener, AdjustmentListener
{
	TextField txtMessage;	//�ŧi��r����ܼ�
	Scrollbar hsbHorizontal, vsbVertical;	//�ŧi�ƹ����b�ܼ�
	Button btnExit;	//�ŧi�R�O���s�ܼ�
	J1206_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		txtMessage = new TextField(20);	//�إߤ�r�������
		hsbHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);	//�إߤ������b����
		vsbVertical = new Scrollbar(Scrollbar.VERTICAL);	//�إ߫������b����
		btnExit = new Button("����");	//�إߩR�O���s����
		add(hsbHorizontal);	//�[�J�������b�������
		add(txtMessage);	//�[�J��r����������
		add(vsbVertical);	//�[�J�������b�������
		add(btnExit);	//�[�J�R�O���s�������
		hsbHorizontal.addAdjustmentListener(this);	//�[�J�������b�վ��ť
		vsbVertical.addAdjustmentListener(this);	//�[�J�������b�վ��ť
		btnExit.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
	}
	public void adjustmentValueChanged(AdjustmentEvent ad)	//����Adjustment�ƥ��k
	{
			txtMessage.setText("(����, ����) = ("
				+ hsbHorizontal.getValue() + ", "
				+ vsbVertical.getValue() + ")");	//��ܥثe���b����
	}
	public void actionPerformed(ActionEvent ae)	//����Action�ƥ��k
	{
		if(ae.getSource() == btnExit) {	//�Y��btnExit���s�ƥ�
			System.exit(0);	//��������������
		}
	}
}
	
public class J1206_Scrollbar	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1206_FrameWindow fw = new J1206_FrameWindow("���b");	//�إߵ�������
		fw.setSize(200, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}