import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD8L4C extends JFrame {

	Container myContainer = null;

	public ExerciseD8L4C(String title) {

		super(title);
		myContainer = this.getContentPane();

		JLabel myLabel = new JLabel("�г]�w�T���A��������U [�إ�!] �s", JLabel.CENTER);

		final JTextField myText = new JTextField("�b����J�T��", 20);

		JButton myBtn = new JButton("�إ�!");

		myBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				JOptionPane myOptPane= new JOptionPane(myText.getText(), JOptionPane.QUESTION_MESSAGE);

				JDialog myDialog = myOptPane.createDialog(myContainer, "Dialog Generated !");

				myDialog.setVisible(true);
			}
		});

		JPanel myPanel = new JPanel();
		myPanel.setLayout(new FlowLayout());		

		myPanel.add(myText);
		myPanel.add(myBtn);

		myContainer.setLayout(new GridLayout(2, 1));

		myContainer.add(myLabel);
		myContainer.add(myPanel);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(this);

		} catch (Exception e) {
		}

		this.setSize(350, 120);
		this.setVisible(true);
	}

	public static void main(String s[]) {
		ExerciseD8L4C myApp = new ExerciseD8L4C("Dialog Generator");
	}
}