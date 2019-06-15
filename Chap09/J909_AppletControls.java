import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J909_AppletControls extends Applet implements ActionListener
{
	Label lblCelsius, lblFahrenheit;	//�ŧi���Ҥ���ܼ�
	TextField txtCelsius, txtFahrenheit;	//�ŧi��r����ܼ�
	Button btnTransfer;	//�ŧi�R�O���s�ܼ�

	public void init() {
		lblCelsius = new Label("���");	//�إ�������
		lblFahrenheit = new Label("�ؤ�");	//�إߵؤ����
		txtCelsius = new TextField(20);	//�إ�����r���
		txtFahrenheit = new TextField(20);	//�إߵؤ��r���
		btnTransfer = new Button("�����ؤ�");	//�إ��ഫ�R�O���s
		add(lblCelsius);	//�[�J���Ҩ�Applet
		add(txtCelsius);	//�[�J��r�����Applet
		add(lblFahrenheit);	//�[�J���Ҩ�Applet
		add(txtFahrenheit);	//�[�J��r�����Applet
		add(btnTransfer);	//�[�J�R�O���s��Applet
		btnTransfer.addActionListener(this);	//�[�J�R�O���sListerer
	}
	public void actionPerformed(ActionEvent ae) {
		float f = Integer.parseInt(txtCelsius.getText());	//���o���ū�
		f = f * 9 / 5 + 32;	//�ন�ؤ�ū�
		txtFahrenheit.setText(String.valueOf(f));	//��X��ؤ��r���
	}
}
