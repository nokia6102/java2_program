import java.awt.*;
import java.awt.event.*;

class J1208_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	String name;
	Button btnFirst, btnPrevious, btnNext, btnLast;	//�ŧi�R�O���s�ܼ�
	Panel panelCenter, panelSouth;	//�ŧi�t�m���ܼ�
	CardLayout card;	//�ŧiCardLayout�ܼ�
	J1208_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		btnFirst = new Button("First");	//�إ�First���s����
		btnPrevious = new Button("Previous");	//�إ�Previous���s����
		btnNext = new Button("Next");	//�إ�Next���s����
		btnLast = new Button("Last");	//�إ�Last���s����
		btnFirst.addActionListener(this);	//�[�JFirst���s�ʧ@��ť
		btnPrevious.addActionListener(this);	//�[�JPrevious���s�ʧ@��ť
		btnNext.addActionListener(this);	//�[�JNext���s�ʧ@��ť
		btnLast.addActionListener(this);	//�[�JLast���s�ʧ@��ť

		panelSouth = new Panel();	//�إ�South�t�m��
			panelSouth.add(btnFirst);	//�[�JFirst���s��South����
			panelSouth.add(btnPrevious);	//�[�JPrevious���s��South����
			panelSouth.add(btnNext);	//�[�JNext���s��South����
			panelSouth.add(btnLast);	//�[�JLast���s��South����
		panelCenter = new Panel();	//�إ�Center�t�m��
			card = new CardLayout();	//�إ�CardLayout����
			panelCenter.setLayout(card);	//�]�wCenter���t�m�覡
			for(int i=1; i<=10; i++) {
				name = "Label " + i;	//��w���ҦW��
				panelCenter.add(new Label(name, Label.CENTER), name);	//�[�J���Ҩ�Center��
			}

		add(panelCenter, BorderLayout.CENTER);	//�[�JCenter����BorderLayout
		add(panelSouth, BorderLayout.SOUTH);	//�[�JSouth����BorderLayout
	}
	public void actionPerformed(ActionEvent e)	//����Action�ƥ��k
	{
		if(e.getActionCommand().equals("First"))	//�Y��First���s�ƥ�
			card.first(panelCenter);	//��ܲĤ@�Ӽ��Ҩ�Center��
		else if(e.getActionCommand().equals("Previous"))	//�Y��Previous���s�ƥ�
			card.previous(panelCenter);	//��ܫe�@�Ӽ���Center��
		else if(e.getActionCommand().equals("Next"))	//�Y��Next���s�ƥ�
			card.next(panelCenter);	//��ܤU�@�Ӽ���Center��
		else if(e.getActionCommand().equals("Last"))	//�Y��Last���s�ƥ�
			card.last(panelCenter);	//��̫ܳ�@�Ӽ���Center��
	}
}
	
public class J1208_CardLayout	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1208_FrameWindow fw = new J1208_FrameWindow("CardLayout");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}