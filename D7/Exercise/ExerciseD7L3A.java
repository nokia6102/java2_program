import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD7L3A {

    public static void main(String[] args) {

	JFrame myFrame = new JFrame("°t¸m¤F«ö¶sªºApplication");

	JButton myButton = new JButton("Motif «ö¶s");

	myFrame.getContentPane().add(myButton);	

	myFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		SwingUtilities.updateComponentTreeUI(myFrame);

	} catch (Exception e) {
	}

	myFrame.setSize(250, 100);
	myFrame.setVisible(true);
    }
}