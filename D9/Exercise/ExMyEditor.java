import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExMyEditor extends JFrame {

	Container myContainer = null;

	public ExMyEditor(String title) {
		super(title);
		myContainer = this.getContentPane();
		myContainer.setLayout(new BorderLayout());
		final JTextField myText = new JTextField();
		JScrollPane myScroll = new JScrollPane(myText);
		myContainer.add(myScroll, BorderLayout.CENTER);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (Exception e) {
		}

		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String s[]) {
		ExMyEditor myApp = new ExMyEditor("My Editor");
	}
}