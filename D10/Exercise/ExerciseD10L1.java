import java.applet.Applet;
import java.awt.Graphics;

public class ExerciseD10L1 extends Applet {

	String myStr;

	public void init() {
		myStr = "哈囉!我是徐許信";
	}

	public void paint(Graphics g) {
		g.drawString(myStr, 30, 20);
	}
}