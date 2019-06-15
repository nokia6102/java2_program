import java.applet.*;
import java.awt.*;
import java.net.*;

public class J907_AppletContext extends Applet
{
	public void start() {
		String newHtml = "J907_Test.html";	//宣告newHtml字串
		AppletContext ac = getAppletContext();	//建立AppletContext物件

		try {
			ac.showDocument(new URL(getCodeBase() + newHtml), "_blank");	//顯示J907_Test.html
		} catch(MalformedURLException e) {
			showStatus("URL not found");	//顯示狀態列訊息
		}
	}
}
