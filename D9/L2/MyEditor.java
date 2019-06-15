import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyEditor extends JFrame {

	//宣告一個Container物件變數並代入null
	Container myContainer = null;

	//定義MyEditor類別的建構子
	public MyEditor(String title) {

		//呼叫父類別（JFrame）的建構子
		super(title);

		//取得框架的ContentPane，並將之代入Container物件中
		myContainer = this.getContentPane();

		//設定容器的版面配置
		myContainer.setLayout(new BorderLayout());

		//建立輸入用的文字區域
		final JTextArea myText = new JTextArea();

		//設定支援自動換行
		myText.setLineWrap(true);

		//設定文字區域建立捲軸面版（JScrollPane）
		JScrollPane myScroll = new JScrollPane(myText);

		//將捲軸面版配置於ContentPane上
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
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));
		//將New功能表選項加至File功能表中
		myFileMenu.add(myNewMItem);

		//Open功能表選項---------------------
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
		//將Copy功能表選項加至Edit功能表中
		myEditMenu.add(myCopyMItem);


		//Paste功能表選項---------------------
		myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
		//將Past功能表選項加至Edit功能表中
		myEditMenu.add(myPasteMItem);


		//Cut功能表選項-----------------------
		myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
		//將Cut功能表選項加至Edit功能表中
		myEditMenu.add(myCutMItem);

		//將整個Edit功能表（Menu）加至功能表列（MenuBar）
		myMenuBar.add(myEditMenu);

		//定義框架（視窗）關閉時的處理
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

		//設定框架大小、顯示框架
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//定義main方法
	public static void main(String s[]) {
		//建立MyEditor類別的實體
		MyEditor myApp = new MyEditor("My Editor");
	}
}