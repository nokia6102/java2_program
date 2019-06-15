import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ExMyEditor3 extends JFrame {

	Container myContainer = null;

	public ExMyEditor3(String title) {

		super(title);

		myContainer = this.getContentPane();

		myContainer.setLayout(new BorderLayout());

		final JTextArea myText = new JTextArea();
		myText.setLineWrap(true);
		JScrollPane myScroll = new JScrollPane(myText);
		myContainer.add(myScroll, BorderLayout.CENTER);


		JMenuBar myMenuBar;
		JMenu myFileMenu;		//File
		JMenu myEditMenu;		//Edit
		JMenuItem myNewMItem;		//New
		JMenuItem myOpenMItem;		//Open
		JMenuItem mySaveMItem;		//Save
		JMenuItem myExitMItem;		//Exit
		JMenuItem myCopyMItem;		//Copy
		JMenuItem myPasteMItem;		//Paste
		JMenuItem myCutMItem;		//Cut
		JMenuItem mySelectMItem;	//Select

		myMenuBar = new JMenuBar();
		myMenuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setJMenuBar(myMenuBar);
	
		//«Ø¥ß¨Ã¥[¤JFile¥\¯àªí¡]Menu¡^----------------
		myFileMenu = new JMenu("File");
		myFileMenu.setMnemonic('F');

		//«Ø¥ß¨Ã¥[¤J¦U¥\¯àªí¿ï¶µ¡]MenuItem¡^-----------------

		//New¥\¯àªí¿ï¶µ-----------------
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));

		//±NNew¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(myNewMItem);

		//Open¥\¯àªí¿ï¶µ-----------------
		myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));

		//±NOpen¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(myOpenMItem);

		//Save¥\¯àªí¿ï¶µ---------------------
		mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
	
		//±NSave¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(mySaveMItem);	

		//³]©w¤@¤À¹j½u
		myFileMenu.addSeparator();

		//Exit¥\¯àªí¿ï¶µ---------------------
		myExitMItem = new JMenuItem("Exit", new ImageIcon("exit.gif"));

		//±NExit¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(myExitMItem);

		//±N¾ã­ÓFile¥\¯àªí¡]Menu¡^¥[¦Ü¥\¯àªí¦C¡]MenuBar¡^
		myMenuBar.add(myFileMenu);


		//«Ø¥ß¨Ã¥[¤JEdit¥\¯àªí¡]Menu¡^----------------
		myEditMenu = new JMenu("Edit");
		//³]©w§Ö³tÁä
		myEditMenu.setMnemonic('E');

		//Copy¥\¯àªí¿ï¶µ----------------------
		myCopyMItem = new JMenuItem("Copy", new ImageIcon("copy.gif"));
		//©w¸q¨ä¨Æ¥ó³B²z
		myCopyMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.copy();
			}
		});
		myEditMenu.add(myCopyMItem);

		//Paste¥\¯àªí¿ï¶µ---------------------
		myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
		//©w¸q¨ä¨Æ¥ó³B²z
		myPasteMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.paste();
			}
		});
		myEditMenu.add(myPasteMItem);

		//Cut¥\¯àªí¿ï¶µ-----------------------
		myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
		//©w¸q¨ä¨Æ¥ó³B²z
		myCutMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.cut();
			}
		});
		myEditMenu.add(myCutMItem);

		//Select¥\¯àªí¿ï¶µ------------------------
		mySelectMItem = new JMenuItem("Select");
		//©w¸q¨ä¨Æ¥ó³B²z
		mySelectMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (myText.getText().length()>= 0)
					myText.select(0, myText.getText().length());
			}
		});
		myEditMenu.add(mySelectMItem);

		//±N¾ã­ÓEdit¥\¯àªí¡]Menu¡^¥[¦Ü¥\¯àªí¦C¡]MenuBar¡^
		myMenuBar.add(myEditMenu);

		//©w¸q®Ø¬[¡]µøµ¡¡^Ãö³¬®Éªº³B²z’è‹`
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//³]©wLook & Feel
		try {
			//±NLook & Feel³]©w¬°Java¼Ë¦¡
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

			//¤ÏÀ³³]©wªºLook & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//¿ù»~³B²z°Ï¶ô
		} catch (Exception e) {
		}

		//³]©w®Ø¬[¤j¤p¡BÅã¥Ü®Ø¬[Ž¦
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//©w¸qmain¤èªk
	public static void main(String s[]) {
		//«Ø¥ßMyEditorÃþ§Oªº¹êÅé
		ExMyEditor3 myApp = new ExMyEditor3("My Editor");
	}
}