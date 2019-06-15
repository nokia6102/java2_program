import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD8L1 {

	public static void main(String[] args) {

		JFrame myFrame = new JFrame("Click Me Buttons !");
		myFrame.getContentPane().setLayout(new BorderLayout());

		JPanel myPanel = new JPanel();
		//GridLayout gLayout = new GridLayout(1, 3, 5, 5);
		myPanel.setLayout(new GridLayout(2, 5, 5, 5));

		final JLabel myLabel = new JLabel("請點選任一顆按鈕", JLabel.CENTER);

		JButton btn1 = new JButton("保留1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn1");
			}
		});

		JButton btn2 = new JButton("保留2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn2");
			}
		});

		JButton btn3 = new JButton("保留3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn3");
			}
		});

		JButton btn4 = new JButton("保留4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn4");
			}
		});

		JButton btn5 = new JButton("保留5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn5");
			}
		});
		
		JButton btn6 = new JButton("押100");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn6");
			}
		});
		
		JButton btn7 = new JButton("押500");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn7");
			}
		});
				JButton btn8 = new JButton("押1000");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn8");
			}
		});
				JButton btn9 = new JButton("全保留");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn9");
			}
		});
				JButton btn10 = new JButton("賭!");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn10");
			}
		});

		myPanel.add(btn1);
		myPanel.add(btn2);
		myPanel.add(btn3);
		myPanel.add(btn4);
		myPanel.add(btn5);
	myPanel.add(btn6);
	myPanel.add(btn7);
	myPanel.add(btn8);
	myPanel.add(btn9);
	myPanel.add(btn10);
		myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);

		myFrame.getContentPane().add(myLabel, BorderLayout.SOUTH);	

		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(myFrame);

		} catch (Exception e) {
		}

		myFrame.setSize(400, 200);
		myFrame.setVisible(true);

 	}
}