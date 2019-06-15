import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1006_AdjustmentEvent extends Applet
	implements AdjustmentListener
{
	Label lblYear;	//宣告標籤方塊變數
	TextField txtYear;	//宣告文字方塊變數
	Scrollbar sbrYear;	//宣告捲軸變數

	public void init()
	{
		txtYear = new TextField("2000", 3);	//建立文字方塊
		txtYear.setEditable(false);	//設為不可編輯的方塊
		lblYear = new Label("年");	//建立標籤方塊
		sbrYear = new Scrollbar(Scrollbar.VERTICAL, 
			2000, 1, 1900, 2100);	//建立捲軸
		add(txtYear);	//加入文字方塊到Applet
		add(lblYear);	//加入標籤到Applet
		add(sbrYear);	//加入捲軸到Applet
		sbrYear.addAdjustmentListener(this);	//加入捲軸的調整監聽
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		int sbrVal = e.getValue();	//取得捲軸指標值
		sbrVal = 2099 - sbrVal + 1900;	//調整成1900-2099
		txtYear.setText(String.valueOf(sbrVal));	//轉成字串後輸出
	}
}
