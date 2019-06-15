import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J909_AppletControls extends Applet implements ActionListener
{
	Label lblCelsius, lblFahrenheit;	//宣告標籤方塊變數
	TextField txtCelsius, txtFahrenheit;	//宣告文字方塊變數
	Button btnTransfer;	//宣告命令按鈕變數

	public void init() {
		lblCelsius = new Label("攝氏");	//建立攝氏標籤
		lblFahrenheit = new Label("華氏");	//建立華氏標籤
		txtCelsius = new TextField(20);	//建立攝氏文字方塊
		txtFahrenheit = new TextField(20);	//建立華氏文字方塊
		btnTransfer = new Button("攝氏轉華氏");	//建立轉換命令按鈕
		add(lblCelsius);	//加入標籤到Applet
		add(txtCelsius);	//加入文字方塊到Applet
		add(lblFahrenheit);	//加入標籤到Applet
		add(txtFahrenheit);	//加入文字方塊到Applet
		add(btnTransfer);	//加入命令按鈕到Applet
		btnTransfer.addActionListener(this);	//加入命令按鈕Listerer
	}
	public void actionPerformed(ActionEvent ae) {
		float f = Integer.parseInt(txtCelsius.getText());	//取得攝氏溫度
		f = f * 9 / 5 + 32;	//轉成華氏溫度
		txtFahrenheit.setText(String.valueOf(f));	//輸出到華氏文字方塊
	}
}
