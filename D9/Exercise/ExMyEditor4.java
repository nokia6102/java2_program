import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

public class ExMyEditor4 extends JFrame {

	//宣告一個Container物件變數並代入null
	Container myContainer = null;

	//定義MyEditor類別的建構子
	public ExMyEditor4(String title) {

		//呼叫父類別（JFrame）的建構子
		super(title);

		//將Application的標題代入變數
		final String myTitle = title;

		//將檔名設定為標題
		ExMyEditor4.this.setTitle(title + " - 未命名.txt");
		
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

		//建立FileChooser的實體
		final JFileChooser myFileChooser = new JFileChooser();

		//分別宣告MenuBar/Menu/MenuItem的變數
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
		//定義其事件處理
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));
		myNewMItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				myText.setText("");
				ExMyEditor4.this.setTitle(myTitle + " - 未命名.txt");
			}
		});
		myFileMenu.add(myNewMItem);

		//Open功能表選項---------------------
		myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));

		//定義其事件處理
		//顯示FileChooser供使用者選擇要開啟之檔案
		myOpenMItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				//顯示[開啟]對話方塊
				int intRet = myFileChooser.showOpenDialog(ExMyEditor4.this);

				//若按下的是yes或ok鈕
				if (intRet == JFileChooser.APPROVE_OPTION) {
					//便進行開啟檔案的處理
					try {
						//建立一個String物件以供讀取時使用
						String strLine;
						//將使用者在FileChooser中選取的檔案代入File物件
						File myFile = myFileChooser.getSelectedFile();
						ExMyEditor4.this.setTitle(myTitle  + " - " + myFile.getName());
						//設定使用者選取的檔案的絕對路徑、以建立出BufferedReader物件
						BufferedReader myReader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));
						//將第1行文字代入TextArea中
						myText.setText(myReader.readLine());
						//從第2行開始改為利用append方法來加入文字並設定換行碼
						while ((strLine = myReader.readLine()) != null) {
							myText.append("\n" + strLine);
						}

						//關閉BufferedReader物件
						myReader.close();
					} catch (IOException ie) {
					}
				}
			}
		});
		//將Open功能表選項加至File功能表中
		myFileMenu.add(myOpenMItem);


		//Save功能表選項---------------------
		mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
		//定義其事件處理
		mySaveMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//顯示[儲存]對話方塊
				int intRet = myFileChooser.showSaveDialog(ExMyEditor4.this);

				//若按下的是yes或ok鈕
				if (intRet == JFileChooser.APPROVE_OPTION) {
					//便進行儲存檔案的處理
					try {
						File myFile = myFileChooser.getSelectedFile();
            ExMyEditor4.this.setTitle(myTitle  + " - " + myFile.getName());
						PrintWriter myWriter = new PrintWriter(new BufferedWriter(new FileWriter(myFile.getAbsolutePath())));
						myWriter.write(myText.getText());
						myWriter.close();
					} catch (IOException ie) {
					}

				}
			}
		});
		//將Save功能表選項加至File功能表中
		myFileMenu.add(mySaveMItem);	

		//設定一分隔線
		myFileMenu.addSeparator();

		//Exit功能表選項---------------------
		myExitMItem = new JMenuItem("Exit", new ImageIcon("exit.gif"));
		//定義其事件處理
		//結束Application
		myExitMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			    System.exit(0);
			}
		});
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

		myMenuBar.add(myEditMenu);

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
		ExMyEditor4 myApp = new ExMyEditor4("My Editor");
	}
}