import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1004_FocusEvent extends Applet
	implements FocusListener
{
	Button btn;	//㏑秙跑计

	public void init()
	{
		btn = new Button("秙");	//ミ㏑秙
		add(btn);	//㏑秙Applet
		btn.addFocusListener(this);	//秙北菏钮
	}

	public void focusGained(FocusEvent e) {	//㏑秙眔北舦
		showStatus("秙眔北");	//陪ボ篈癟
	}
	public void focusLost(FocusEvent e) {	//㏑秙ア北舦
		showStatus("秙ア北");	//陪ボ篈癟
	}
}
