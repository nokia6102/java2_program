import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SampleD10L2 extends Applet {

	Button btnCalc;                         //«ö¶s
	TextField txtA, txtB, txtAnswer;        //¼Æ­È¿é¤J¤å¦rÄæ¦ì
	Label lblPlus;                          //¥Î¨ÓÅã¥Ü¡u+¡vªº¼ÐÅÒ

	public void init() {
		//«Ø¥ß«ö¶sªº¹êÅé
		btnCalc = new Button("=");
		//©w¸q«ö¶sªº¨Æ¥ó³B²z
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//¨D¥X¿é¤JtxtA»PtxtB¤§¤¤ªº­ÈªºÁ`©M‚ðŒvŽZ
				int intAnswer = Integer.parseInt(txtA.getText()) + Integer.parseInt(txtB.getText());
				//±Nµª®×Åã¥Ü©ótxtAnswer
				txtAnswer.setText(Integer.toString(intAnswer));
			}
		});

		//¤¸¥óªºªì©l¤Æ
		txtA = new TextField("0", 3);
		txtB = new TextField("0", 3);
		lblPlus = new Label(" + ");
		txtAnswer = new TextField("0", 5);

		//¥[¤J¤¸¥ó
		add(txtA);
		add(lblPlus);
		add(txtB);
		add(btnCalc);
		add(txtAnswer);
	}
}