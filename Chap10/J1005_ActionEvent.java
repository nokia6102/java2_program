import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1005_ActionEvent extends Applet
	implements ActionListener
{
	Button btnShow;	//宣告命令按鈕變數

	public void init()
	{
		btnShow = new Button("顯示新網頁");	//建立顯示命令按鈕
		add(btnShow);	//加入命令按鈕到Applet
		btnShow.addActionListener(this);	//加入按鈕的主控監聽
	}

	public void actionPerformed(ActionEvent ae) {
		String newHtml = "J1005_Test.html";	//宣告newHtml字串
		AppletContext ac = getAppletContext();	//建立AppletContext物件

		try {
			ac.showDocument(new URL(getCodeBase() + newHtml));	//顯示J1005_Test.html
		} catch(MalformedURLException me) {
			showStatus("URL not found");	//顯示狀態列訊息
		}
	}
}
