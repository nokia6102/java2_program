import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ExerciseD10L2 extends Applet {

	Button btnCalc;
	TextField txtA, txtB, txtAnswer;
	Label lblPlus;

	public void init() {
		btnCalc = new Button("=");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int intAnswer = Integer.parseInt(txtA.getText()) - Integer.parseInt(txtB.getText());
				txtAnswer.setText(Integer.toString(intAnswer));
			}
		});

		txtA = new TextField("0", 3);
		txtB = new TextField("0", 3);
		lblPlus = new Label(" - ");
		txtAnswer = new TextField("0", 5);

		add(txtA);
		add(lblPlus);
		add(txtB);
		add(btnCalc);
		add(txtAnswer);
	}
}