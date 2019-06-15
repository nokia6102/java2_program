import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1007_ItemEvent extends Applet
	implements ItemListener
{
	Label lblCo, lblWeb;	//宣告標籤變數
	TextField txtWeb;	//宣告文字方塊變數
	List lstCo;	//宣告清單變數

	public void init()
	{
		lblCo = new Label("公司：");	//建立公司標籤
		lblWeb = new Label("網址：");	//建立網址標籤
		txtWeb = new TextField("", 15);	//建立文字方塊
		txtWeb.setEditable(false);	//設為不可編輯的方塊
		lstCo = new List();	//建立清單方塊
		lstCo.add("國際昇陽");	//加入清單項目
		lstCo.add("國際雅虎");	//加入清單項目
		lstCo.add("國際微軟");	//加入清單項目
		add(lblWeb);	//加入標籤到Applet
		add(txtWeb);	//加入文字方塊到Applet
		add(lblCo);	//加入標籤到Applet
		add(lstCo);	//加入清單方塊到Applet
		lstCo.addItemListener(this);	//加入清單的項目監聽
	}

	public void itemStateChanged(ItemEvent e) {
		List l = (List)e.getItemSelectable();
		switch(l.getSelectedIndex())
		{
		case 0:		//選擇第0項國際昇陽
			txtWeb.setText("java.sun.com");	//輸出字串到文字方塊
			break;
		case 1:		//選擇第1項國際雅虎
			txtWeb.setText("www.yahoo.com");	//輸出字串到文字方塊
			break;
		case 2:		//選擇第2項國際微軟
			txtWeb.setText("www.microsoft.com");	//輸出字串到文字方塊
			break;
		default:
			txtWeb.setText("");	//輸出字串到文字方塊
			break;
		}
	}
}
