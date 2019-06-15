import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1008_TextEvent extends Applet implements TextListener
{
	Label lblC, lblF;	//�ŧi���Ҥ���ܼ�
	TextField txtC, txtF;	//�ŧi��r����ܼ�

	public void init() {
		lblC = new Label("���");	//�إ�������
		lblF = new Label("�ؤ�");	//�إߵؤ����
		txtC = new TextField(20);	//�إ�����r���
		txtF = new TextField(20);	//�إߵؤ��r���
		add(lblC);	//�[�J���Ҩ�Applet
		add(txtC);	//�[�J��r�����Applet
		add(lblF);	//�[�J���Ҩ�Applet
		add(txtF);	//�[�J��r�����Applet
		txtC.addTextListener(this);	//�[�JtxtC����r��ť
		txtF.addTextListener(this);	//�[�JtxtF����r��ť
	}
	public void textValueChanged(TextEvent e) {
		TextField tmp = (TextField)e.getSource();	//���oĲ�o�ƥ�ӷ�
		Double t = Double.valueOf(tmp.getText());	//���o�ū��ন����
		double T = t.doubleValue();	//�ūת����ন�����
		if(tmp == txtC) {	//�YtxtC��Ĳ�o����
			txtF.removeTextListener(this);	//�R��txtF����r��ť
			T = T * 9 / 5 + 32;	//�ন�ؤ�ū�
			txtF.setText(Double.toString(T));	//��X��ؤ��r���
			txtF.addTextListener(this);	//���s�[�JtxtF����r��ť
		} else if(tmp == txtF) {	//�YtxtF��Ĳ�o����
			txtC.removeTextListener(this);	//�R��txtC����r��ť
			T = (T - 32) * 5 / 9;	//�ন���ū�
			txtC.setText(Double.toString(T));	//��X������r���
			txtC.addTextListener(this);	//���s�[�JtxtC����r��ť
		}
	}
}
