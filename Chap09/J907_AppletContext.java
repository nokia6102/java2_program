import java.applet.*;
import java.awt.*;
import java.net.*;

public class J907_AppletContext extends Applet
{
	public void start() {
		String newHtml = "J907_Test.html";	//�ŧinewHtml�r��
		AppletContext ac = getAppletContext();	//�إ�AppletContext����

		try {
			ac.showDocument(new URL(getCodeBase() + newHtml), "_blank");	//���J907_Test.html
		} catch(MalformedURLException e) {
			showStatus("URL not found");	//��ܪ��A�C�T��
		}
	}
}
