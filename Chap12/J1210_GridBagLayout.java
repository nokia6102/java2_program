import java.awt.*;
import java.awt.event.*;

class J1210_FrameWindow extends Frame //�إ߮ج[�������O
{
	String s = "";	//�ŧi�r���ܼ�
	TextField txtMessage;	//�ŧi��r����ܼ�
	J1210_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		GridBagLayout gridbag = new GridBagLayout();	//�إ�GridBagLayout����
		GridBagConstraints constraints = new GridBagConstraints();	//�إ�GridBagConstraints����
		setFont(new Font("Arial", Font.PLAIN, 14));	//�]�w�r��
		setLayout(gridbag);	//�]�w�����~��

		constraints.fill = GridBagConstraints.BOTH;	//��j���󪺰��׻P�e��
		constraints.weighty = 1.0;	//���t�h�l���C�Ŷ�
		createButton("Button1", gridbag, constraints);	//�إ�Button1���s
		createButton("Button2", gridbag, constraints);	//�إ�Button2���s
		createButton("Button3", gridbag, constraints);	//�إ�Button3���s

		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		createButton("Button4", gridbag, constraints);	//�إ�Button4���s

		constraints.weightx = 0.0;	//�]�wConstraints����e��
		constraints.gridwidth = GridBagConstraints.RELATIVE;	//���t�ۦP�Ŷ����U�@����
		createButton("Button5", gridbag, constraints);	//�إ�Button5���s
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		createButton("Button6", gridbag, constraints);	//�إ�Button6���s

		createButton("Button7", gridbag, constraints);	//�إ�Button7���s

		constraints.gridwidth = 1;	//�]�w������Ϊ����
		constraints.gridheight = 2;	//�]�w������Ϊ��C��
		constraints.weighty = 1.0;	//���t�h�l���C�Ŷ�
		createButton("Button8", gridbag, constraints);	//�إ�Button8���s
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;	//�U�@����ϥγѾl����Ŷ�
		constraints.gridheight = 1;	//�]�w������Ϊ��C��
		createButton("Button9", gridbag, constraints);	//�إ�Button9���s
		constraints.gridheight = GridBagConstraints.REMAINDER;
		constraints.weighty = 0.0;	//���t�h�l���C�Ŷ�
		createButton("Button0", gridbag, constraints);	//�إ�Button0���s
	}
	protected void createButton(String name, 
		GridBagLayout gridbag, GridBagConstraints c)	//�ۭq�إ߫��s��k
	{
		Button button = new Button(name);	//�إߩR�O���s����
		gridbag.setConstraints(button, c);	//�]�w���sConstraints
		add(button);	//�[�J���s��Layout
	}
}
	
public class J1210_GridBagLayout	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1210_FrameWindow fw = new J1210_FrameWindow("GridBagLayout");	//�إߵ�������
		fw.setSize(300, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}