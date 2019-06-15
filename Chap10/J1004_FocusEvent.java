import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1004_FocusEvent extends Applet
	implements FocusListener
{
	Button btn;	//�ŧi�R�O���s�ܼ�

	public void init()
	{
		btn = new Button("���s");	//�إߩR�O���s
		add(btn);	//�[�J�R�O���s��Applet
		btn.addFocusListener(this);	//�[�J���s���D����ť
	}

	public void focusGained(FocusEvent e) {	//�R�O���s���o�����v
		showStatus("���s���o�D��");	//��ܪ��A�C�T��
	}
	public void focusLost(FocusEvent e) {	//�R�O���s���h�����v
		showStatus("���s���h�D��");	//��ܪ��A�C�T��
	}
}
