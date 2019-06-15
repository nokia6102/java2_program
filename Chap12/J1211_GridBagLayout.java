import java.awt.*;
import java.awt.event.*;

class J1211_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	String s = "";	//�ŧi�r���ܼ�
	TextField txtMessage;	//�ŧi��r����ܼ�
	J1211_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		GridBagLayout gridbag = new GridBagLayout();	//�إ�GridBagLayout����
		GridBagConstraints constraints = new GridBagConstraints();	//�إ�GridBagConstraints����
		setFont(new Font("Arial", Font.PLAIN, 14));	//�]�w�r��
		setLayout(gridbag);	//�]�w�����~��

		constraints.fill = GridBagConstraints.BOTH;	//��j���󪺰��׻P�e��
		constraints.weighty = 1.0;	//���t�h�l���C�Ŷ�
		constraints.weightx = 1.0;	//���t�h�l����Ŷ�
		createButton("1", gridbag, constraints);	//�إ�1���s
		createButton("2", gridbag, constraints);	//�إ�2���s
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		createButton("3", gridbag, constraints);	//�إ�3���s

		constraints.gridwidth = 1;	//�]�w������Ϊ����
		createButton("4", gridbag, constraints);	//�إ�4���s
		createButton("5", gridbag, constraints);	//�إ�5���s
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		createButton("6", gridbag, constraints);	//�إ�6���s

		constraints.gridwidth = 1;	//�]�w������Ϊ����
		createButton("7", gridbag, constraints);	//�إ�7���s
		createButton("8", gridbag, constraints);	//�إ�8���s
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		createButton("9", gridbag, constraints);	//�إ�9���s

		constraints.gridwidth = 1;	//�]�w������Ϊ����
		createButton("0", gridbag, constraints);	//�إ�0���s
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		txtMessage = new TextField();	//�إߤ�r�������
		gridbag.setConstraints(txtMessage, constraints);	//�إߪ���Constaints
		add(txtMessage);	//�[�J��r���
	}
	protected void createButton(String name, 
		GridBagLayout gridbag, GridBagConstraints c)	//�ۭq�إ߫��s��k
	{
		Button button = new Button(name);	//�إߩR�O���s����
		gridbag.setConstraints(button, c);	//�]�w���sConstraints
		add(button);	//�[�J���s��Layout
		button.addActionListener(this);	//�[�J���s��ť
	}
	public void actionPerformed(ActionEvent e)	//����Action�ƥ��k
	{
		s = s + ((Button) e.getSource()).getLabel();	//���o���s����
		txtMessage.setText(s);	//��ܲ��ͨƥ󪺫��s
	}
}
	
public class J1211_GridBagLayout	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1211_FrameWindow fw = new J1211_FrameWindow("GridBagLayout");	//�إߵ�������
		fw.setSize(200, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}