import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SampleD10L2 extends Applet {

	Button btnCalc;                         //���s
	TextField txtA, txtB, txtAnswer;        //�ƭȿ�J��r���
	Label lblPlus;                          //�Ψ���ܡu+�v������

	public void init() {
		//�إ߫��s������
		btnCalc = new Button("=");
		//�w�q���s���ƥ�B�z
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//�D�X��JtxtA�PtxtB�������Ȫ��`�M���v�Z
				int intAnswer = Integer.parseInt(txtA.getText()) + Integer.parseInt(txtB.getText());
				//�N������ܩ�txtAnswer
				txtAnswer.setText(Integer.toString(intAnswer));
			}
		});

		//���󪺪�l��
		txtA = new TextField("0", 3);
		txtB = new TextField("0", 3);
		lblPlus = new Label(" + ");
		txtAnswer = new TextField("0", 5);

		//�[�J����
		add(txtA);
		add(lblPlus);
		add(txtB);
		add(btnCalc);
		add(txtAnswer);
	}
}