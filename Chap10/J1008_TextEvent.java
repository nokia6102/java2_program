import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1008_TextEvent extends Applet implements TextListener
{
	Label lblC, lblF;	//宣告標籤方塊變數
	TextField txtC, txtF;	//宣告文字方塊變數

	public void init() {
		lblC = new Label("攝氏");	//建立攝氏標籤
		lblF = new Label("華氏");	//建立華氏標籤
		txtC = new TextField(20);	//建立攝氏文字方塊
		txtF = new TextField(20);	//建立華氏文字方塊
		add(lblC);	//加入標籤到Applet
		add(txtC);	//加入文字方塊到Applet
		add(lblF);	//加入標籤到Applet
		add(txtF);	//加入文字方塊到Applet
		txtC.addTextListener(this);	//加入txtC的文字監聽
		txtF.addTextListener(this);	//加入txtF的文字監聽
	}
	public void textValueChanged(TextEvent e) {
		TextField tmp = (TextField)e.getSource();	//取得觸發事件來源
		Double t = Double.valueOf(tmp.getText());	//取得溫度轉成物件
		double T = t.doubleValue();	//溫度物件轉成倍精數
		if(tmp == txtC) {	//若txtC為觸發元件
			txtF.removeTextListener(this);	//刪除txtF的文字監聽
			T = T * 9 / 5 + 32;	//轉成華氏溫度
			txtF.setText(Double.toString(T));	//輸出到華氏文字方塊
			txtF.addTextListener(this);	//重新加入txtF的文字監聽
		} else if(tmp == txtF) {	//若txtF為觸發元件
			txtC.removeTextListener(this);	//刪除txtC的文字監聽
			T = (T - 32) * 5 / 9;	//轉成攝氏溫度
			txtC.setText(Double.toString(T));	//輸出到攝氏文字方塊
			txtC.addTextListener(this);	//重新加入txtC的文字監聽
		}
	}
}
