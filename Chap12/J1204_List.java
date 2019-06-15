import java.awt.*;
import java.awt.event.*;

class J1204_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	float r;	//�ŧi�B�I�ܼ�
	Label lblPrincipal, lblInterest, lblTotal;	//�ŧi�����ܼ�
	TextField txtPrincipal, txtTotal;	//�ŧi��r����ܼ�
	List lstInterest;	//�ŧi�M���ܼ�
	Button btnCalculate, btnExit;	//�ŧi�R�O���s�ܼ�
	J1204_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		lblPrincipal = new Label("����");	//�إ߼��Ҫ���
		lblInterest = new Label("�Q�v");	//�إ߼��Ҫ���
		lblTotal = new Label("���Q�M");	//�إ߼��Ҫ���
		txtPrincipal = new TextField("0", 15);	//�إߤ�r�������
		lstInterest = new List(5);	//�إ߲M�檫��
		txtTotal = new TextField(15);	//�إߤ�r�������
		btnCalculate = new Button("�p��");	//�إߩR�O���s����
		btnExit = new Button("����");	//�إߩR�O���s����
		add(lblPrincipal);	//�[�J���Ҩ������
		add(txtPrincipal);	//�[�J��r����������
		add(lblInterest);	//�[�J���Ҩ������
		add(lstInterest);	//�[�J�M��������
			lstInterest.add("4.00%");	//�[�J�M�涵�ب�M�椤
			lstInterest.add("5.00%");	//�[�J�M�涵�ب�M�椤
			lstInterest.add("6.00%");	//�[�J�M�涵�ب�M�椤
			lstInterest.add("7.00%");	//�[�J�M�涵�ب�M�椤
			lstInterest.add("8.00%");	//�[�J�M�涵�ب�M�椤
		add(lblTotal);	//�[�J���Ҩ������
		add(txtTotal);	//�[�J��r����������
		add(btnCalculate);	//�[�J�R�O���s�������
		add(btnExit);	//�[�J�R�O���s�������
		lstInterest.addActionListener(this);	//�[�J�M��ʧ@��ť
		btnCalculate.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
		btnExit.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
	}
	public void actionPerformed(ActionEvent event)	//����Action�ƥ��k
	{
		if(event.getSource() == lstInterest) {	//�Y��lstInterest�M��ƥ�
			String s = lstInterest.getSelectedItem();	//���o�Q�v�r��
			r = Float.parseFloat(s.substring(0, 4)) / 100;	//�ন�B�I�ƭ�
		}
		if(event.getSource() == btnCalculate) {	//�Y��btnCalculate���s�ƥ�
			float p = Integer.parseInt(txtPrincipal.getText());	//���o�����r��
			float sum = p * (1 + r);	//�p�⥻�Q�M
			txtTotal.setText(String.valueOf(sum));	//��X���Q�M�ܤ�r���
		}
		if(event.getSource() == btnExit) {	//�Y��btnExit���s�ƥ�
			System.exit(0);	//��������������
		}
	}
}
	
public class J1204_List	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1204_FrameWindow fw = new J1204_FrameWindow("��ܲM��");	//�إߵ�������
		fw.setSize(200, 200);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}