import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD8L2 {

	public static void main(String[] args) {

		final JFrame myFrame = new JFrame("Look & Feel Changer");
		myFrame.getContentPane().setLayout(new GridLayout(3, 1));

		final JButton myBtn = new JButton("這是按鈕");
		final JLabel myLbl = new JLabel("這是標籤", JLabel.CENTER);

		JRadioButton rdoWindows = new JRadioButton("Windows Style");
		rdoWindows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					SwingUtilities.updateComponentTreeUI(myFrame);
					myLbl.setText("Windows");

				} catch (Exception e) {
				}
			}
		});

		JRadioButton rdoJava = new JRadioButton("Java Style", true);
		rdoJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					SwingUtilities.updateComponentTreeUI(myFrame);
					myLbl.setText("Java");
				} catch (Exception e) {
				}
			}
		});

		JRadioButton rdoMotif = new JRadioButton("Motif Style");
		rdoMotif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					SwingUtilities.updateComponentTreeUI(myFrame);
					myLbl.setText("Motif");
				} catch (Exception e) {
				}
			}
		});

		ButtonGroup myGroup = new ButtonGroup();
		myGroup.add(rdoWindows);
		myGroup.add(rdoJava);
		myGroup.add(rdoMotif);

		JPanel myPanel = new JPanel();
		myPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		myPanel.setLayout(new FlowLayout());

		myPanel.add(rdoWindows);
		myPanel.add(rdoJava);
		myPanel.add(rdoMotif);

		myFrame.getContentPane().add(myPanel);

		myFrame.getContentPane().add(myBtn);

		myFrame.getContentPane().add(myLbl);

		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		myFrame.setSize(350, 150);
		myFrame.setVisible(true);
 	}
}