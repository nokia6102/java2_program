import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

public class MyEditor extends JFrame {

	//«Å§i¤@­ÓContainerª«¥óÅÜ¼Æ¨Ã¥N¤Jnull
	Container myContainer = null;

	//©w¸qMyEditorÃş§Oªº«Øºc¤l
	public MyEditor(String title) {

		//©I¥s¤÷Ãş§O¡]JFrame¡^ªº«Øºc¤l
		super(title);

		//¨ú±o®Ø¬[ªºContentPane¡A¨Ã±N¤§¥N¤JContainerª«¥ó¤¤
		myContainer = this.getContentPane();

		//³]©w®e¾¹ªºª©­±°t¸m
		myContainer.setLayout(new BorderLayout());

		//«Ø¥ß¿é¤J¥Îªº¤å¦r°Ï°ì
		final JTextArea myText = new JTextArea();

		//³]©w¤ä´©¦Û°Ê´«¦æ
		myText.setLineWrap(true);

		//³]©w¤å¦r°Ï°ì«Ø¥ß±²¶b­±ª©¡]JScrollPane¡^
		JScrollPane myScroll = new JScrollPane(myText);

		//±N±²¶b­±ª©°t¸m©óContentPane¤W
		myContainer.add(myScroll, BorderLayout.CENTER);

		//«Ø¥ßFileChooserªº¹êÅé
		final JFileChooser myFileChooser = new JFileChooser();

		//¤À§O«Å§iMenuBar/Menu/MenuItemªºÅÜ¼Æ
		JMenuBar myMenuBar;
		JMenu myFileMenu;		//File
		JMenu myEditMenu;		//Edit
		JMenuItem myNewMItem;	//New
		JMenuItem myOpenMItem;	//Open
		JMenuItem mySaveMItem;	//Save
		JMenuItem myExitMItem;	//Exit
		JMenuItem myCopyMItem;	//Copy
		JMenuItem myPasteMItem;	//Paste
		JMenuItem myCutMItem;	//Cut

		//«Ø¥ß¥\¯àªí¦C¡]MenuBar¡^¦C¨Ã³]©w¨äª©­±°t¸m
		myMenuBar = new JMenuBar();
		myMenuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setJMenuBar(myMenuBar);
	
		//«Ø¥ß¨Ã¥[¤JFile¥\¯àªí¡]Menu¡^----------------
		myFileMenu = new JMenu("File");
		//³]©w§Ö³tÁä
		myFileMenu.setMnemonic('F');

		//«Ø¥ß¨Ã¥[¤J¦U¥\¯àªí¿ï¶µ¡]MenuItem¡^-----------------

		//New¥\¯àªí¿ï¶µ-----------------
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));

		//©w¸q¨ä¨Æ¥ó³B²z
		myNewMItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				myText.setText("");
			}
		});
		//±NNew¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(myNewMItem);


		//Open¥\¯àªí¿ï¶µ---------------------
		myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));

		//©w¸q¨ä¨Æ¥ó³B²z
		//Åã¥ÜFileChooser¨Ñ¨Ï¥ÎªÌ¿ï¾Ü­n¶}±Ò¤§ÀÉ®×
		myOpenMItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				//Åã¥Ü[¶}±Ò]¹ï¸Ü¤è¶ô
				int intRet = myFileChooser.showOpenDialog(MyEditor.this);

				//­Y«ö¤Uªº¬Oyes©Îok¶s
				if (intRet == JFileChooser.APPROVE_OPTION) {
					//«K¶i¦æ¶}±ÒÀÉ®×ªº³B²z
					try {
						//«Ø¥ß¤@­ÓStringª«¥ó¥H¨ÑÅª¨ú®É¨Ï¥Î
						String strLine;
						//±N¨Ï¥ÎªÌ¦bFileChooser¤¤¿ï¨úªºÀÉ®×¥N¤JFileª«¥ó
						File myFile = myFileChooser.getSelectedFile();	
						//³]©w¨Ï¥ÎªÌ¿ï¨úªºÀÉ®×¤§µ´¹ï¸ô®|¡B¥H«Ø¥ß¥XBufferedReaderª«¥ó
						BufferedReader myReader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));
						//±N²Ä1¦æ¤å¦r¥N¤JTextArea¤¤
						myText.setText(myReader.readLine());
						//±q²Ä2¦æ¶}©l§ï¬°§Q¥Îappend¤èªk¨Ó¥[¤J¤å¦r¨Ã³]©w´«¦æ½X
						while ((strLine = myReader.readLine()) != null) {
							myText.append("\n" + strLine);
						}
						//Ãö³¬BufferedReaderª«¥ó
						myReader.close();
					} catch (IOException ie) {
					}
				}
			}
		});
		//±NOpen¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(myOpenMItem);


		//Save¥\¯àªí¿ï¶µ---------------------
		mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
		//©w¸q¨ä¨Æ¥ó³B²z
		mySaveMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//Åã¥Ü[Àx¦s]¹ï¸Ü¤è¶ô
				int intRet = myFileChooser.showSaveDialog(MyEditor.this);

				//­Y«ö¤Uªº¬Oyes©Îok¶s
				if (intRet == JFileChooser.APPROVE_OPTION) {
					//«K¶i¦æÀx¦sÀÉ®×ªº³B²z
					try {
						File myFile = myFileChooser.getSelectedFile();
						PrintWriter myWriter = new PrintWriter(new BufferedWriter(new FileWriter(myFile.getAbsolutePath())));
						myWriter.write(myText.getText());
						myWriter.close();
					} catch (IOException ie) {
					}
				}
			}
		});
		//±NSave¥\¯àªí¿ï¶µ¥[¦ÜFile¥\¯àªí¤¤
		myFileMenu.add(mySaveMItem);	


		//³]©w¤@¤À¹j½u
		myFileMenu.addSeparator();

		//Exit¥\¯àªí¿ï¶µ---------------------
		myExitMItem = new JMenuItem("Exit", new ImageIcon("exit.gif"));
		//©w¸q¨ä¨Æ¥ó³B²z
		//µ²§ôApplication
		myExitMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			    System.exit(0);
			}
		});
		
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

		//Cut¥\¯àªí¿ï¶µ------------------------
		myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
		//©w¸q¨ä¨Æ¥ó³B²z
		myCutMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.cut();
			}
		});
		myEditMenu.add(myCutMItem);

		//±N¾ã­ÓEdit¥\¯àªí¡]Menu¡^¥[¦Ü¥\¯àªí¦C¡]MenuBar¡^
		myMenuBar.add(myEditMenu);

		//©w¸q®Ø¬[¡]µøµ¡¡^Ãö³¬®Éªº³B²z
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

		//³]©w®Ø¬[¤j¤p¡BÅã¥Ü®Ø¬[
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//©w¸qmain¤èªk
	public static void main(String s[]) {
		//«Ø¥ßMyEditorÃş§Oªº¹êÅé¬
		MyEditor myApp = new MyEditor("My Editor");
	}
}