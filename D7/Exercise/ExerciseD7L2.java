import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD7L2 {

	public static void main(String[] args) {

		JFrame myFrame = new JFrame("Hello Swing Application");

		myFrame.addWindowListener(new WindowAdapter() {			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
 			}
		});

	myFrame.setSize(250, 250);
	myFrame.setVisible(true);
    }
}