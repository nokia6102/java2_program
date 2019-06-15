import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SampleD10L3 extends Applet {

	int intPosX;                    //儲存滑鼠游標的位置（X軸）
	int intPosY;                    //儲存滑鼠游標的位置（Y軸）
	Image imgIcon;                  //寵物的圖示

	public void init() {

		//設定Applet的背景色為藍色
		setBackground(Color.blue);

		//從HTML內的參數來取得圖示的檔名
		String strIconName = getParameter("ICON_NAME");

		//利用取得的圖示檔名來取得圖示的影像
		imgIcon = getImage(getDocumentBase(), strIconName);

		//登錄滑鼠事件監聽者
		addMouseMotionListener(new MouseMotionAdapter(){
			//定義mouseMoved事件方法
			public void mouseMoved(MouseEvent me){

				//從MouseEvent物件來取得游標目前的
				//位置（X軸, Y軸）並將之代入變數
				intPosX = me.getX();
				intPosY = me.getY();
				//藉此呼叫出paint方法
				repaint();
			}
		});
	}

	//paint方法（要繪出Applet時所呼叫出的方法）
	public void paint(Graphics g) {
		//利用參數Graphics物件擁有的drawImage方法
		//在目前滑鼠游標的所在位置上繪出寵物的圖示
		g.drawImage(imgIcon, intPosX + 10, intPosY + 10, this);
	}
}