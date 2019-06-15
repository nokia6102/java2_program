import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD7L3 {

    public static void main(String[] args) {


	//«Ø¥ßJFrameÃş§Oªº¹êÅé
	JFrame myFrame = new JFrame("°t¸m¤F«ö¶sªºApplication");

	//«Ø¥ßJButtonÃş§Oªº¹êÅé
	JButton myButton = new JButton("¨ş!¨ş!§Ú´N¬O«ö¶s");

	//±N«ö¶s¥[¤J®Ø¬[¤¤
	/*¤¸¥ó¬OµLªkª½±µ¥[¤JJFrame¤¤ªº
	@©Ò¥H¥²¶·­n¥ı¨ú±oContentPaneµM«á¦A±N¤¸¥ó¥[¤J¦Ü¦¹*/
	myFrame.getContentPane().add(myButton);

	//©w¸qÃö³¬®Ø¬[¡]µøµ¡¡^®Éªº³B²z
	myFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	//³]©wLook & Feel
	try {
		//±NLook&Feel³]©w¬°Windows¼Ë¦¡
		UIManager.setLookAndFeel(
			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		/*
			#@­Y­n³]¬°Metal¼Ë¦¡¬O¼g¤W:
				"javax.swing.plaf.metal.MetalLookAndFeel"
			#@­Y­n³]¬°Motif¼Ë¦¡¬O¼g¤W:F
				"com.sun.java.swing.plaf.motif.MotifLookAndFeel"
		*/

		//¤ÏÀ³Look & Feelªº³]©w
		SwingUtilities.updateComponentTreeUI(myFrame);


	//¿ù»~³B²z°Ï¶ô
	} catch (Exception e) {
	}


	//³]©w®Ø¬[¤j¤p¡BÅã¥Ü®Ø¬[
	myFrame.setSize(250, 100);
	myFrame.setVisible(true);
    }
}