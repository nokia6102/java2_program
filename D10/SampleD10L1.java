import java.applet.Applet;
import java.awt.Graphics;

//�~��Applet���O�H�إߥXSampleD10L1���O
public class SampleD10L1 extends Applet {

	//�إߥΨ��x�s�T����String���A�ܼ�
	String myStr;

	//��g�]overriding�^init��k
	public void init() {
		//�N�T���N�J�ܼ�myStr
		myStr = "Hello Applet !";
	}

	//��g�]overriding�^paint��k
	public void paint(Graphics g) {
		//�Q��Graphics���O��drawString��k
		//�bApplet�W��ܰT��
		g.drawString(myStr, 50, 50);
	}
}