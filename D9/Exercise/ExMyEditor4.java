import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

public class ExMyEditor4 extends JFrame {

	//�ŧi�@��Container�����ܼƨåN�Jnull
	Container myContainer = null;

	//�w�qMyEditor���O���غc�l
	public ExMyEditor4(String title) {

		//�I�s�����O�]JFrame�^���غc�l
		super(title);

		//�NApplication�����D�N�J�ܼ�
		final String myTitle = title;

		//�N�ɦW�]�w�����D
		ExMyEditor4.this.setTitle(title + " - ���R�W.txt");
		
		//���o�ج[��ContentPane�A�ñN���N�JContainer����
		myContainer = this.getContentPane();

		//�]�w�e���������t�m
		myContainer.setLayout(new BorderLayout());

		//�إ߿�J�Ϊ���r�ϰ�
		final JTextArea myText = new JTextArea();

		//�]�w�䴩�۰ʴ���
		myText.setLineWrap(true);

		//�]�w��r�ϰ�إ߱��b�����]JScrollPane�^
		JScrollPane myScroll = new JScrollPane(myText);

		//�N���b�����t�m��ContentPane�W
		myContainer.add(myScroll, BorderLayout.CENTER);

		//�إ�FileChooser������
		final JFileChooser myFileChooser = new JFileChooser();

		//���O�ŧiMenuBar/Menu/MenuItem���ܼ�
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
		//�w�q��ƥ�B�z
		myNewMItem = new JMenuItem("New", new ImageIcon("new.gif"));
		myNewMItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				myText.setText("");
				ExMyEditor4.this.setTitle(myTitle + " - ���R�W.txt");
			}
		});
		myFileMenu.add(myNewMItem);

		//Open�\���ﶵ---------------------
		myOpenMItem = new JMenuItem("Open", new ImageIcon("open.gif"));

		//�w�q��ƥ�B�z
		//���FileChooser�ѨϥΪ̿�ܭn�}�Ҥ��ɮ�
		myOpenMItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				//���[�}��]��ܤ��
				int intRet = myFileChooser.showOpenDialog(ExMyEditor4.this);

				//�Y���U���Oyes��ok�s
				if (intRet == JFileChooser.APPROVE_OPTION) {
					//�K�i��}���ɮת��B�z
					try {
						//�إߤ@��String����H��Ū���ɨϥ�
						String strLine;
						//�N�ϥΪ̦bFileChooser��������ɮץN�JFile����
						File myFile = myFileChooser.getSelectedFile();
						ExMyEditor4.this.setTitle(myTitle  + " - " + myFile.getName());
						//�]�w�ϥΪ̿�����ɮת�������|�B�H�إߥXBufferedReader����
						BufferedReader myReader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));
						//�N��1���r�N�JTextArea��
						myText.setText(myReader.readLine());
						//�q��2��}�l�אּ�Q��append��k�ӥ[�J��r�ó]�w����X
						while ((strLine = myReader.readLine()) != null) {
							myText.append("\n" + strLine);
						}

						//����BufferedReader����
						myReader.close();
					} catch (IOException ie) {
					}
				}
			}
		});
		//�NOpen�\���ﶵ�[��File�\���
		myFileMenu.add(myOpenMItem);


		//Save�\���ﶵ---------------------
		mySaveMItem = new JMenuItem("Save", new ImageIcon("save.gif"));
		//�w�q��ƥ�B�z
		mySaveMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//���[�x�s]��ܤ��
				int intRet = myFileChooser.showSaveDialog(ExMyEditor4.this);

				//�Y���U���Oyes��ok�s
				if (intRet == JFileChooser.APPROVE_OPTION) {
					//�K�i���x�s�ɮת��B�z
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
		//�NSave�\���ﶵ�[��File�\���
		myFileMenu.add(mySaveMItem);	

		//�]�w�@���j�u
		myFileMenu.addSeparator();

		//Exit�\���ﶵ---------------------
		myExitMItem = new JMenuItem("Exit", new ImageIcon("exit.gif"));
		//�w�q��ƥ�B�z
		//����Application
		myExitMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			    System.exit(0);
			}
		});
		//�NExit�\���ﶵ�[��File�\���
		myFileMenu.add(myExitMItem);

		//�N���File�\���]Menu�^�[�ܥ\���C�]MenuBar�^
		myMenuBar.add(myFileMenu);

		//�إߨå[�JEdit�\���]Menu�^----------------
		myEditMenu = new JMenu("Edit");
		//�]�w�ֳt��
		myEditMenu.setMnemonic('E');

		//Copy�\���ﶵ----------------------
		myCopyMItem = new JMenuItem("Copy", new ImageIcon("copy.gif"));
		//�w�q��ƥ�B�z
		myCopyMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.copy();
			}
		});
		myEditMenu.add(myCopyMItem);

		//Paste�\���ﶵ---------------------
		myPasteMItem = new JMenuItem("Paste", new ImageIcon("paste.gif"));
		//�w�q��ƥ�B�z
		myPasteMItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myText.paste();
			}
		});
		myEditMenu.add(myPasteMItem);

		//Cut�\���ﶵ-----------------------
		myCutMItem = new JMenuItem("Cut", new ImageIcon("cut.gif"));
		//�w�q��ƥ�B�z
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