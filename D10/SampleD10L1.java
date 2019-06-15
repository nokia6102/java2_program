import java.applet.Applet;
import java.awt.Graphics;

//繼承Applet類別以建立出SampleD10L1類別
public class SampleD10L1 extends Applet {

	//建立用來儲存訊息的String型態變數
	String myStr;

	//改寫（overriding）init方法
	public void init() {
		//將訊息代入變數myStr
		myStr = "Hello Applet !";
	}

	//改寫（overriding）paint方法
	public void paint(Graphics g) {
		//利用Graphics類別的drawString方法
		//在Applet上顯示訊息
		g.drawString(myStr, 50, 50);
	}
}