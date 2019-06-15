import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD10L3 extends Applet {

	int intPosX;
	int intPosY;
	Image imgIcon;

	public void init() {

		setBackground(Color.blue);
		String strIconName = getParameter("ICON_NAME");
		imgIcon = getImage(getDocumentBase(), strIconName);

		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){

				intPosX = me.getX();
				intPosY = me.getY();
				repaint();
			}
		});
	}

	public void paint(Graphics g) {
		g.drawImage(imgIcon, intPosX + 10, intPosY + 10, this);
	}
}