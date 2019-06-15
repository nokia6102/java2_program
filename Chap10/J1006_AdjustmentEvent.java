import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1006_AdjustmentEvent extends Applet
	implements AdjustmentListener
{
	Label lblYear;	//�ŧi���Ҥ���ܼ�
	TextField txtYear;	//�ŧi��r����ܼ�
	Scrollbar sbrYear;	//�ŧi���b�ܼ�

	public void init()
	{
		txtYear = new TextField("2000", 3);	//�إߤ�r���
		txtYear.setEditable(false);	//�]�����i�s�誺���
		lblYear = new Label("�~");	//�إ߼��Ҥ��
		sbrYear = new Scrollbar(Scrollbar.VERTICAL, 
			2000, 1, 1900, 2100);	//�إ߱��b
		add(txtYear);	//�[�J��r�����Applet
		add(lblYear);	//�[�J���Ҩ�Applet
		add(sbrYear);	//�[�J���b��Applet
		sbrYear.addAdjustmentListener(this);	//�[�J���b���վ��ť
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		int sbrVal = e.getValue();	//���o���b���Э�
		sbrVal = 2099 - sbrVal + 1900;	//�վ㦨1900-2099
		txtYear.setText(String.valueOf(sbrVal));	//�ন�r����X
	}
}
