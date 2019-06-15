import java.awt.*;
import java.awt.event.*;

class J1205_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener, ItemListener
{
	float r;	//�ŧi�B�I�ܼ�
	Label lblPrincipal, lblInterest, lblTotal;	//�ŧi�����ܼ�
	TextField txtPrincipal, txtTotal;	//�ŧi��r����ܼ�
	Choice choInterest;	//�ŧi�M���ܼ�
	Button btnCalculate, btnExit;	//�ŧi�R�O���s�ܼ�
	J1205_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new FlowLayout());	//�]�w�����~��
		lblPrincipal = new Label("����");	//�إ߼��Ҫ���
		lblInterest = new Label("�Q�v");	//�إ߼��Ҫ���
		lblTotal = new Label("���Q�M");	//�إ߼��Ҫ���
		txtPrincipal = new TextField("0", 15);	//�إߤ�r�������
		choInterest = new Choice();	//�إߤU�ԲM�檫��
		txtTotal = new TextField(15);	//�إߤ�r�������
		btnCalculate = new Button("�p��");	//�إߩR�O���s����
		btnExit = new Button("����");	//�إߩR�O���s����
		add(lblPrincipal);	//�[�J���Ҩ������
		add(txtPrincipal);	//�[�J��r����������
		add(lblInterest);	//�[�J���Ҩ������
		add(choInterest);	//�[�J�U�ԲM��������
			choInterest.add("4.00%");	//�[�J���ب�U�ԲM�椤
			choInterest.add("5.00%");	//�[�J���ب�U�ԲM�椤
			choInterest.add("6.00%");	//�[�J���ب�U�ԲM�椤
			choInterest.add("7.00%");	//�[�J���ب�U�ԲM�椤
			choInterest.add("8.00%");	//�[�J���ب�U�ԲM�椤
		add(lblTotal);	//�[�J���Ҩ������
		add(txtTotal);	//�[�J��r����������
		add(btnCalculate);	//�[�J�R�O���s�������
		add(btnExit);	//�[�J�R�O���s�������
		choInterest.addItemListener(this);	//�[�J�U�ԲM��ʧ@��ť
		btnCalculate.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
		btnExit.addActionListener(this);	//�[�J�R�O���s�ʧ@��ť
	}
	public void itemStateChanged(ItemEvent ie)	//�������Item�ƥ��k
	{
		String s = choInterest.getSelectedItem();	//���o�Q�v�r��
		r = Float.parseFloat(s.substring(0, 4)) / 100;	//�ন�B�I�ƭ�
	}
	public void actionPerformed(ActionEvent ae)	//����Action�ƥ��k
	{
		if(ae.getSource() == btnCalculate) {	//�Y��btnCalculate���s�ƥ�
			float p = Integer.parseInt(txtPrincipal.getText());	//���o�����r��
			float sum = p * (1 + r);	//�p�⥻�Q�M
			txtTotal.setText(String.valueOf(sum));	//��X���Q�M�ܤ�r���
		}
		if(ae.getSource() == btnExit) {	//�Y��btnExit���s�ƥ�
			System.exit(0);	//��������������
		}
	}
}
	
public class J1205_Choice	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1205_FrameWindow fw = new J1205_FrameWindow("�U�ԲM��");	//�إߵ�������
		fw.setSize(350, 100);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}