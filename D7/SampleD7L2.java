import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L2 {

	public static void main(String[] args) {

		//�]�w���D�I�s�XJFrame���غc�l
		JFrame myFrame = new JFrame("�Ĥ@��Swing Application");


		//�w�q�����ج[�]�����^�ɪ��B�z
		myFrame.addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
 			}
		});


	//�N�����j�p�]��300 ��200
	myFrame.setSize(300, 200);
	myFrame.setVisible(true);
	//myFrame.setCursor(13);
    }
}