//
//�W�١G PKCARD 							         
//�����G5.0 windows ����
//�\��G5 �i�����J
//�Ǹ��G9006086
//�m�W�G�G�߱j			
//2002/6/12 

//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//

//

public class pk50w3
{
	
public static String pe;
		public static String pair[] ={"�S��","�@�F","�R�F","�T��","��Ī","�K�K"};
		public static int mpair[] ={0,2,4,6,8,10,};
		public static String seri[] ={"None","None","None","None","��"};
		public static int mseri[] ={0,0,0,0,20,40};
public static int swap,pa,pb,pc,pp;	
public static int [] a,b,b1,b2;
public static char hex1[] = {3,4,5,6};
public static Icon fIcon[] = {new ImageIcon("f1.gif"),
							  new ImageIcon("f2.gif"),
							  new ImageIcon("f3.gif"),
							  new ImageIcon("f4.gif")};

public static String hex2[] = {" A", " 2", " 3", " 4", " 5",
				      " 6", " 7", " 8", " 9", "10", " J",
			      " Q", " K"};
			      public static   Container myContainer = null;
public static boolean hold[]={false,false,false,false,false,false};
public static int money=5000,iNum=0;	
//	�D�{��
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
	
		int cin;
		char[] cx;
		String[] cy;
		int i,j,k;

		a=new int[53];		//52�i�P
		b=new int[11];		//��X��11�i
		b1=new int[11];		//���
		b2=new int[11];		//�Ʀr	

		JFrame myFrame = new JFrame("----�����J5----[WINDOWS��]");
		
		JMenuBar myMenuBar = new JMenuBar();
		JMenuBar myMenuBarAbout = new JMenuBar();
		myFrame.setJMenuBar(myMenuBar);
		JMenu myMenu = new JMenu("G �C��");

		myMenu.setMnemonic('G');
		JMenuItem replay = new JMenuItem("�W�h");
		JMenuItem quit = new JMenuItem("����");
		myMenu.add(replay);
		myMenu.add(quit);
		myMenuBar.add(myMenu);    

			replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
					//�إ�JOptionPane
				JOptionPane myOptPane= new JOptionPane("�S��===>0��\n1�F===>2��\n�R�F===>4��\n3��===>6��\n��Ī===>8��\n�K�K===>10��\n��===>20��\n�P�ᶶ===>40��", JOptionPane.INFORMATION_MESSAGE);

				//�HcreateDialog��k�إ߹�ܤ���A�ñN���N�JJDialog����
				JDialog myDialog = myOptPane.createDialog(myContainer, "���ƻ���");
				
				//�]�w��ܤ������ܪ��A
				myDialog.setVisible(true);

			}
		});		
		//quit
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});		
		

		myFrame.getContentPane().setLayout(new BorderLayout());

		JPanel myPanel = new JPanel();
		

		myPanel.setLayout(new GridLayout(5, 5, 4, 5));
		
		final JLabel myLabel = new JLabel("���e����:$"+money, JLabel.CENTER);
		final JTextField myText = new JTextField("0", 5);
		final JLabel myLabel11 = new JLabel("  ����-->", JLabel.CENTER);
		final JLabel myLabel12 = new JLabel("  ���-->", JLabel.CENTER);
		final JLabel myLabel13 = new JLabel("", JLabel.CENTER);
		final JTextField myText2 = new JTextField(""+money, 5);
		final JTextField myText3 = new JTextField("0", 5);
final JLabel myLabel1 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel2 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel3 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel4 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel5 = new JLabel("?", JLabel.CENTER);
final JButton btn11 = new JButton("<--��");

		final JButton btn1 = new JButton("change");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[1]=!hold[1];
				if (btn1.getText()=="change") btn1.setText("�O�d1") ;
				else btn1.setText("change");						
			}
		});

		final JButton btn2 = new JButton("change");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[2]=!hold[2];
				if (btn2.getText()=="change") btn2.setText("�O�d2") ;
				else btn2.setText("change");
							}
		});

		final JButton btn3 = new JButton("change");
		btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					hold[3]=!hold[3];
					if (btn3.getText()=="change") btn3.setText("�O�d3") ;
				else btn3.setText("change");
				}
		});

		final JButton btn4 = new JButton("change");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[4]=!hold[4];
				if (btn4.getText()=="change") btn4.setText("�O�d4") ;
				else btn4.setText("change");
	
			}
		});

		final JButton btn5 = new JButton("change");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[5]=!hold[5];
				if (btn5.getText()=="change") btn5.setText("�O�d5") ;
				else btn5.setText("change");
			}
		});
		
			 JButton btn9 = new JButton("---");
				btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn9");
			}
		});
		final JButton btn6 = new JButton("��100");
		final JButton btn7 = new JButton("��500");
		final JButton btn8 = new JButton("��1000");
		final JButton btn10 = new JButton("½!");
				
		 btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (btn10.getText()=="½!")
				{
				btn10.setText("��");
				btn1.setText("change");
				btn2.setText("change");
				btn3.setText("change");
				btn4.setText("change");
				btn5.setText("change");						
 				int i,j,k;
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
								for (i=1 ; i <=10 ; i++)
		{	
		  	b[i]=a[i];		
		  	//��P
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;        //0-12
	 	}

	 	
		//�̼Ʀr�ƧǤp->�j
		for (i=1;i<=5;i++)
		for (j=i+1;j<=5;j++)
			if (b2[i]>b2[j])
			{
			b1[0]=b1[i];
			b2[0]=b2[i];
			b1[i]=b1[j];
			b2[i]=b2[j];
			b1[j]=b1[0];
			b2[j]=b2[0];
			}

 	
//���   
		
		 pa=pb=pc=0;
		 
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//��l
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//�s�� 
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//�P�� 
pe="�S��";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) pe="�P��"+pe;				
		 	
		 
myLabel1.setText(hex2[b2[1]]);
myLabel2.setText(hex2[b2[2]]);
myLabel3.setText(hex2[b2[3]]);
myLabel4.setText(hex2[b2[4]]);
myLabel5.setText(hex2[b2[5]]);

myLabel1.setIcon(fIcon[b1[1]]);
myLabel2.setIcon(fIcon[b1[2]]);
myLabel3.setIcon(fIcon[b1[3]]);
myLabel4.setIcon(fIcon[b1[4]]);
myLabel5.setIcon(fIcon[b1[5]]);
				
				
				
			 	System.out.println();
 for (i=1; i<=5; i++)
	System.out.print("+--+ ");
 	System.out.println();
 for (i=1; i<=5; i++)	
 	System.out.print("|"+hex1[b1[i]]+" | ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("|"+hex2[b2[i]]+"| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("+--+ ");
 	System.out.println();
 //System.out.println();				 			
 myLabel.setText("--------->"+pe+"<---------");
 for (i=1; i<=5; i++)
 
 if (hold[i])
 	System.out.print("hold ");
 else
 	System.out.print("  "+i+"  ");
 	System.out.println();
}else{
	int i,j,k;
	for (i=1; i<=5; i++)
	if (!hold[i]) 
	{
		b1[i]=b1[i+5];
		b2[i]=b2[i+5];
	}
	
	
//��ܵP��		 
 for (i=1; i<=5; i++)
	System.out.print("+--+ ");
 	System.out.println();
 for (i=1; i<=5; i++)	
 	System.out.print("|"+hex1[b1[i]]+" | ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("|"+hex2[b2[i]]+"| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("+--+ ");
 	System.out.println();		
	 	
		//�̼Ʀr�ƧǤp->�j
		for (i=1;i<=5;i++)
		for (j=i+1;j<=5;j++)
			if (b2[i]>b2[j])
			{
			b1[0]=b1[i];
			b2[0]=b2[i];
			b1[i]=b1[j];
			b2[i]=b2[j];
			b1[j]=b1[0];
			b2[j]=b2[0];
			}
			


		 pa=pb=pc=0;
		 
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//��l
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//�s�� 
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//�P�� 
		 

	pe="�S��";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) {
		pe="�P��"+pe;
		pa++;
		} 
	pp=mpair[pb]+mseri[pa];
	money+=iNum*pp;
	//System.out.println("[���P��]-->>"+pe+"<<-------");
	myLabel.setText("--------->"+pe+"<---------\n��o"+pp+"���A�o$"+iNum*pp);
	myText2.setText(" "+money);
	//System.out.println();
	System.out.println();

myLabel1.setText(hex2[b2[1]]);
myLabel2.setText(hex2[b2[2]]);
myLabel3.setText(hex2[b2[3]]);
myLabel4.setText(hex2[b2[4]]);
myLabel5.setText(hex2[b2[5]]);

myLabel1.setIcon(fIcon[b1[1]]);
myLabel2.setIcon(fIcon[b1[2]]);
myLabel3.setIcon(fIcon[b1[3]]);
myLabel4.setIcon(fIcon[b1[4]]);
myLabel5.setIcon(fIcon[b1[5]]);

	
	
for (i=1; i<=5; i++)
	System.out.print("+--+ ");
 	System.out.println();
 for (i=1; i<=5; i++)	
 	System.out.print("|++| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("|++| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("+--+ ");
 	System.out.println();
 	
 	//do{
	//	System.out.print("�ثe�٦�$"+money+"��J��������s>");
		//iNum = Integer.parseInt(keyin.readLine());
//}while(iNum<0);
		//money-=iNum;

		
		//�~�P
		for (i=1 ; i <=5 ; i++)
		{
			hold[i]=false;
		}
		
		for (j=1 ; j <=10 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]�O�Ȧs
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);				
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
	btn10.setEnabled(false);	
				iNum=0;
				myText3.setText("0");
			    for (i=1 ; i <=5 ; i++)	
			hold[i]=false;

btn10.setText("½!");	
}
				
			}
		});




		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				if (money>=100) {
				iNum+=100;
				money-=100;}
			    btn10.setEnabled(true);
				myLabel.setText("�ثe��:$"+iNum+"������:$"+money);
				myText2.setText(""+money);
				myText3.setText(""+iNum);		
			}
		});
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				
				if (money>=500){
				iNum+=500;
				 money-=500;}
				btn10.setEnabled(true);
				myLabel.setText("�ثe��:$"+iNum+"������:$"+money);
				myText2.setText(""+money);
				myText3.setText(""+iNum);
				
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				if (money>=1000) {
				iNum+=1000;
				money-=1000;}
					btn10.setEnabled(true);
				myLabel.setText("�ثe��:$"+iNum+"������:$"+money);
				myText2.setText(""+money);
				myText3.setText(""+iNum);				
			}
		});
		
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int p;
				p=Integer.parseInt(myText.getText());
				
				if (money>=p){ 
				money-=p;
				iNum+=p;}
					btn10.setEnabled(true);
				myLabel.setText("�ثe��:$"+iNum+"������:$"+money);
				myText2.setText(""+money);
				myText3.setText(""+iNum);				
			}
		});
		
		//myLabel1.setForeground(RED);
		myPanel.add(myLabel11);
		myPanel.add(myText2);
		myPanel.add(myLabel12);
		myPanel.add(myText3);
		myPanel.add(myLabel13);
		myPanel.add(myLabel1);
		myPanel.add(myLabel2);
		myPanel.add(myLabel3);
		myPanel.add(myLabel4);
		myPanel.add(myLabel5);
		myPanel.add(btn1);
		myPanel.add(btn2);
		myPanel.add(btn3);
		myPanel.add(btn4);
		myPanel.add(btn5);
	myPanel.add(btn6);
	myPanel.add(btn7);
	myPanel.add(btn8);
	myPanel.add(btn9);
	myPanel.add(btn10);
	myPanel.add(myText);
	myPanel.add(btn11);
	
		myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);
		
		myFrame.getContentPane().add(myLabel, BorderLayout.CENTER);	
		//myFrame.getContentPane().add(myLabel, BorderLayout.SOUTH);	

		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(myFrame);

		} catch (Exception e) {
		}

		//�w�q�����ج[�]�����^�ɪ��B�z
		myFrame.addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
 			}
		}
		);

	
	//�N�����j�p�]��300��240
	myFrame.setSize(500, 400);
	myFrame.setLocation(200,200);
	myFrame.setVisible(true);	
    myFrame.setCursor(12);
    
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn9.setEnabled(false);
	btn10.setEnabled(false);
		
		//��J52�i�P
		for (i=1 ; i <=52 ; i++)
			a[i]=i;
			
		for (j=0 ; j <=5 ; j++)
		System.out.println(pair[j]+"===>"+mpair[j]+"��");
	
		System.out.println(seri[4]+"===>"+mseri[4]+"��");		
		System.out.println("�P�ᶶ===>"+mseri[5]+"��");

do {	


 for (i=1; i<=5; i++)
	System.out.print("+--+ ");
 	System.out.println();
 for (i=1; i<=5; i++)	
 	System.out.print("|++| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("|++| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("+--+ ");
 	System.out.println();
 	
 	//do{
	//	System.out.print("�ثe�٦�$"+money+"��J��������s>");
		//iNum = Integer.parseInt(keyin.readLine());
//}while(iNum<0);
		//money-=iNum;

		
		//�~�P
		for (i=1 ; i <=5 ; i++)
		{
			hold[i]=false;
		}
		
		for (j=1 ; j <=10 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]�O�Ȧs
			a[j]=a[swap];
			a[swap]=a[0];			
		}		



try{do{
 	

	
		System.out.print("��J1-5 hold�P (0����):");
	
		cin=System.in.read();	//cin=Ū����L��J�r��
		System.in.read();	//cin=Ū����L��J�r��
		System.in.read();	//Ū������r��
		cin-=48;
		hold[cin]=!hold[cin];

}while (cin!=0);}catch(ArrayIndexOutOfBoundsException e){cin='1';}


	System.out.println();		
	

}while(true);

}

}