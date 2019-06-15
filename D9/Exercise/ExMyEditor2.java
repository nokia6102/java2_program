import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ExMyEditor2 extends JFrame {

	Container myContainer = null;

	public ExMyEditor2(String title) {

		super(title);

		myContainer = this.getContentPane();

		myContainer.setLayout(new BorderLayout());

		final JTextArea myText = new JTextArea();

		myText.setLineWrap(true);

		JScrollPane myScroll = new JScrollPane(myText);

		myContainer.add(myScroll, BorderLayout.CENTER);

		//分別宣告MenuBar/Menu/MenuItem的變數
		JMenuBar myMenuBar;
		JMenu myFileMenu;	//File
		JMenu myEditMenu;	//Edit
		JMenuItem myNewMItem;	//New
		JMenuItem myOpenMItem;	//Open
		JMenuItem mySaveMItem;	//Save
		JMenuItem myExitMItem;	//Exit
		JMenuItem myCopyMItem;	//Copy
		JMenuItem myPasteMItem;	//Paste
		JMenuItem myCutMItem;	//Cut

		//建立功能表列（MenuBar）列並設定其版面配置
		myMenuBar = new JMenuBar();
		myMenuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setJMenuBar(myMenuBar);
	
		//建立並加入File功能表（Menu）----------------
		myFileMenu = new JMenu("File");
		//設定快速鍵
		myFileMenu.setMnemonic('F');

		//建立並加入各功能表選項（MenuItem）-----------------

		//New功能表選項-----------------
		myNewMItem = new JMenuItem("New");
		myNewMItem.setMnemonic('N');
		myFileMenu.add(myNewMItem);

		//Open功能表選項----------------------
		myOpenMItem = new JMenuItem("Open");
		myOpenMItem.setMnemonic('O');
		myFileMenu.add(myOpenMItem);

		//Save功能表選項----------------------
		mySaveMItem = new JMenuItem("Save");
		mySaveMItem.setMnemonic('S');
		myFileMenu.add(mySaveMItem);	

		//設定一分隔線
		myFileMenu.addSeparator();

		//Exit功能表選項---------------------
		myExitMItem = new JMenuItem("Exit");
		myExitMItem.setMnemonic('X');
		myFileMenu.add(myExitMItem);

		//將整個File功能表（Menu）加至功能表列（MenuBar）
		myMenuBar.add(myFileMenu);


		//建立並加入Edit功能表（Menu）----------------
		myEditMenu = new JMenu("Edit");
		//設定快速鍵
		myEditMenu.setMnemonic('E');

		//Copy功能表選項----------------------
		myCopyMItem = new JMenuItem("Copy");
		myCopyMItem.setMnemonic('C');
		myEditMenu.add(myCopyMItem);


		//Paste功能表選項---------------------
		myPasteMItem = new JMenuItem("Paste");
		myPasteMItem.setMnemonic('P');
		myEditMenu.add(myPasteMItem);

		//Cut功能表選項-----------------------
		myCutMItem = new JMenuItem("Cut");
		myCutMItem.setMnemonic('T');
		myEditMenu.add(myCutMItem);

		//將整個Edit功能表（Menu）加至功能表列（MenuBar）
		myMenuBar.add(myEditMenu);

		//定義框架（視窗）關閉時的處理
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
		}

		this.setSize(500, 300);
		this.setVisible(true);
	}

	public static void main(String s[]) {
		ExMyEditor2 myApp = new ExMyEditor2("My Editor");
	}
}