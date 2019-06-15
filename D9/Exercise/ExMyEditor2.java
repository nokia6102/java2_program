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

		//���O�ŧiMenuBar/Menu/MenuItem���ܼ�
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

		//�إߥ\���C�]MenuBar�^�C�ó]�w�䪩���t�m
		myMenuBar = new JMenuBar();
		myMenuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setJMenuBar(myMenuBar);
	
		//�إߨå[�JFile�\���]Menu�^----------------
		myFileMenu = new JMenu("File");
		//�]�w�ֳt��
		myFileMenu.setMnemonic('F');

		//�إߨå[�J�U�\���ﶵ�]MenuItem�^-----------------

		//New�\���ﶵ-----------------
		myNewMItem = new JMenuItem("New");
		myNewMItem.setMnemonic('N');
		myFileMenu.add(myNewMItem);

		//Open�\���ﶵ----------------------
		myOpenMItem = new JMenuItem("Open");
		myOpenMItem.setMnemonic('O');
		myFileMenu.add(myOpenMItem);

		//Save�\���ﶵ----------------------
		mySaveMItem = new JMenuItem("Save");
		mySaveMItem.setMnemonic('S');
		myFileMenu.add(mySaveMItem);	

		//�]�w�@���j�u
		myFileMenu.addSeparator();

		//Exit�\���ﶵ---------------------
		myExitMItem = new JMenuItem("Exit");
		myExitMItem.setMnemonic('X');
		myFileMenu.add(myExitMItem);

		//�N���File�\���]Menu�^�[�ܥ\���C�]MenuBar�^
		myMenuBar.add(myFileMenu);


		//�إߨå[�JEdit�\���]Menu�^----------------
		myEditMenu = new JMenu("Edit");
		//�]�w�ֳt��
		myEditMenu.setMnemonic('E');

		//Copy�\���ﶵ----------------------
		myCopyMItem = new JMenuItem("Copy");
		myCopyMItem.setMnemonic('C');
		myEditMenu.add(myCopyMItem);


		//Paste�\���ﶵ---------------------
		myPasteMItem = new JMenuItem("Paste");
		myPasteMItem.setMnemonic('P');
		myEditMenu.add(myPasteMItem);

		//Cut�\���ﶵ-----------------------
		myCutMItem = new JMenuItem("Cut");
		myCutMItem.setMnemonic('T');
		myEditMenu.add(myCutMItem);

		//�N���Edit�\���]Menu�^�[�ܥ\���C�]MenuBar�^
		myMenuBar.add(myEditMenu);

		//�w�q�ج[�]�����^�����ɪ��B�z
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