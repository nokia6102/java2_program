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
	
		//建立並加入File功能表（Menu）----------------
		myFileMenu = new JMenu("File");
		myFileMenu.setMnemonic('F');

		//建立並加入各功能表選項（MenuItem）-----------------

		//New功能表選項-----------------
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));

		//將New功能表選項加至File功能表中
		myFileMenu.add(myNewMItem);

		//Open功能表選項-----------------
		myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));

		//將Open功能表選項加至File功能表中
		myFileMenu.add(myOpenMItem);

		//Save功能表選項---------------------
		mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
	
		//將Save功能表選項加至File功能表中
		myFileMenu.add(mySaveMItem);	

		//設定一分隔線
		myFileMenu.addSeparator();

		//Exit功能表選項---------------------
		myExitMItem = new JMenuItem("Exit", new ImageIcon("exit.gif"));

		//將Exit功能表選項加至File功能表中
		myFileMenu.add(myExitMItem);

		//將整個File功能表（Menu）加至功能表列（MenuBar）
		myMenuBar.add(myFileMenu);


		//建立並加入Edit功能表（Menu）----------------
		myEditMenu = new JMenu("Edit");
		//設定快速鍵
		myEditMenu.setMnemonic('E');

		//Copy功能表選項----------------------
		myCopyMItem = new JMenuItem("Copy", new ImageIcon("copy.gif"));
		//定義其事件處理
		myCopyMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.copy();
			}
		});
		myEditMenu.add(myCopyMItem);

		//Paste功能表選項---------------------
		myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
		//定義其事件處理
		myPasteMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.paste();
			}
		});
		myEditMenu.add(myPasteMItem);

		//Cut功能表選項-----------------------
		myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
		//定義其事件處理
		myCutMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.cut();
			}
		});
		myEditMenu.add(myCutMItem);

		//Select功能表選項------------------------
		mySelectMItem = new JMenuItem("Select");
		//定義其事件處理
		mySelectMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (myText.getText().length()>= 0)
					myText.select(0, myText.getText().length());
			}
		});
		myEditMenu.add(mySelectMItem);

		//將整個Edit功能表（Menu）加至功能表列（MenuBar）
		myMenuBar.add(myEditMenu);

		//定義框架（視窗）關閉時的處理���`
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//設定Look & Feel
		try {
			//將Look & Feel設定為Java樣式
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

			//反應設定的Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//錯誤處理區塊
		} catch (Exception e) {
		}

		//設定框架大小、顯示框架��
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//定義main方法
	public static void main(String s[]) {
		//建立MyEditor類別的實體
		ExMyEditor3 myApp = new ExMyEditor3("My Editor");
	}
}