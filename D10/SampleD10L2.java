import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SampleD10L2 extends Applet {

	Button btnCalc;                         //按鈕
	TextField txtA, txtB, txtAnswer;        //數值輸入文字欄位
	Label lblPlus;                          //用來顯示「+」的標籤

	public void init() {
		//建立按鈕的實體
		btnCalc = new Button("=");
		//定義按鈕的事件處理
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//求出輸入txtA與txtB之中的值的總和���v�Z
				int intAnswer = Integer.parseInt(txtA.getText()) + Integer.parseInt(txtB.getText());
				//將答案顯示於txtAnswer
				txtAnswer.setText(Integer.toString(intAnswer));
			}
		});

		//元件的初始化
		txtA = new TextField("0", 3);
		txtB = new TextField("0", 3);
		lblPlus = new Label(" + ");
		txtAnswer = new TextField("0", 5);

		//加入元件
		add(txtA);
		add(lblPlus);
		add(txtB);
		add(btnCalc);
		add(txtAnswer);
	}
}