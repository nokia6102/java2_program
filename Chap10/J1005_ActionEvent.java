import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1005_ActionEvent extends Applet
	implements ActionListener
{
	Button btnShow;	//�ŧi�R�O���s�ܼ�

	public void init()
	{
		btnShow = new Button("��ܷs����");	//�إ���ܩR�O���s
		add(btnShow);	//�[�J�R�O���s��Applet
		btnShow.addActionListener(this);	//�[�J���s���D����ť
	}

	public void actionPerformed(ActionEvent ae) {
		String newHtml = "J1005_Test.html";	//�ŧinewHtml�r��
		AppletContext ac = getAppletContext();	//�إ�AppletContext����

		try {
			ac.showDocument(new URL(getCodeBase() + newHtml));	//���J1005_Test.html
		} catch(MalformedURLException me) {
			showStatus("URL not found");	//��ܪ��A�C�T��
		}
	}
}
