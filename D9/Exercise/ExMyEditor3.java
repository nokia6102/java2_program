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
	
		//�إߨå[�JFile�\����]Menu�^----------------
		myFileMenu = new JMenu("File");
		myFileMenu.setMnemonic('F');

		//�إߨå[�J�U�\����ﶵ�]MenuItem�^-----------------

		//New�\����ﶵ-----------------
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));

		//�NNew�\����ﶵ�[��File�\�����
		myFileMenu.add(myNewMItem);

		//Open�\����ﶵ-----------------
		myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));

		//�NOpen�\����ﶵ�[��File�\�����
		myFileMenu.add(myOpenMItem);

		//Save�\����ﶵ---------------------
		mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
	
		//�NSave�\����ﶵ�[��File�\�����
		myFileMenu.add(mySaveMItem);	

		//�]�w�@���j�u
		myFileMenu.addSeparator();

		//Exit�\����ﶵ---------------------
		myExitMItem = new JMenuItem("Exit", new ImageIcon("exit.gif"));

		//�NExit�\����ﶵ�[��File�\�����
		myFileMenu.add(myExitMItem);

		//�N���File�\����]Menu�^�[�ܥ\����C�]MenuBar�^
		myMenuBar.add(myFileMenu);


		//�إߨå[�JEdit�\����]Menu�^----------------
		myEditMenu = new JMenu("Edit");
		//�]�w�ֳt��
		myEditMenu.setMnemonic('E');

		//Copy�\����ﶵ----------------------
		myCopyMItem = new JMenuItem("Copy", new ImageIcon("copy.gif"));
		//�w�q��ƥ�B�z
		myCopyMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.copy();
			}
		});
		myEditMenu.add(myCopyMItem);

		//Paste�\����ﶵ---------------------
		myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
		//�w�q��ƥ�B�z
		myPasteMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.paste();
			}
		});
		myEditMenu.add(myPasteMItem);

		//Cut�\����ﶵ-----------------------
		myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
		//�w�q��ƥ�B�z
		myCutMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.cut();
			}
		});
		myEditMenu.add(myCutMItem);

		//Select�\����ﶵ------------------------
		mySelectMItem = new JMenuItem("Select");
		//�w�q��ƥ�B�z
		mySelectMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (myText.getText().length()>= 0)
					myText.select(0, myText.getText().length());
			}
		});
		myEditMenu.add(mySelectMItem);

		//�N���Edit�\����]Menu�^�[�ܥ\����C�]MenuBar�^
		myMenuBar.add(myEditMenu);

		//�w�q�ج[�]�����^�����ɪ��B�z��`
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//�]�wLook & Feel
		try {
			//�NLook & Feel�]�w��Java�˦�
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

			//�����]�w��Look & Feel
			SwingUtilities.updateComponentTreeUI(this);

		//���~�B�z�϶�
		} catch (Exception e) {
		}

		//�]�w�ج[�j�p�B��ܮج[��
		this.setSize(500, 300);
		this.setVisible(true);
	}

	//�w�qmain��k
	public static void main(String s[]) {
		//�إ�MyEditor���O������
		ExMyEditor3 myApp = new ExMyEditor3("My Editor");
	}
}