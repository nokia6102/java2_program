import java.applet.Applet;
import java.awt.Graphics;

public class ExerciseD10L1 extends Applet {

	String myStr;

	public void init() {
		myStr = "���o!�ڬO�}�\�H";
	}

	public void paint(Graphics g) {
		g.drawString(myStr, 30, 20);
	}
}