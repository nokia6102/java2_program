//
//名稱： PKCARD 							         
//版本：5.0 windows 介面
//功能：5 張金撲克
//學號：9006086
//姓名：鄭立強			
//2002/6/12 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.spi.*;

public class pk50w5
{
public static String pe;
public static String pair[] ={"沒有","一胚","吐胚","三條","葫蘆","鐵枝"};
public static int mpair[] ={0,2,4,6,8,10,};
public static String seri[] ={"None","None","None","None","順","同花"};
public static int mseri[] ={0,0,0,0,20,40,6};
public static int swap,pa,pb,pc,pp;	
public static int [] a,b,b1,b2;
public static char hex1[] = {3,4,5,6};
public static Icon fIcon[] = {new ImageIcon("f1.gif"),
							  new ImageIcon("f2.gif"),
							  new ImageIcon("f3.gif"),
							  new ImageIcon("f4.gif")};
						  
public static String hex2[] = {" A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J",
			      			" Q", " K"};
public static   Container myContainer = null;			//massage box
public static boolean hold[]={false,false,false,false,false,false};
public static int money=5000,iNum=0;	
//主程式
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));			
			
		//MidiFileReader soun=new MidiFileReader(new  MidiFileFormat("1.mid"));
	
			
		char[] cx;
		String[] cy;
        int i,j,k;        
		a=new int[53];		//52張牌
		b=new int[11];		//抽出的11張
		b1=new int[11];		//花色
		b2=new int[11];		//數字	
		
		gui();
		
		//放入52張牌
		for (i=1 ; i <=52 ; i++) a[i]=i;		
	
		for (i=1 ; i <=5 ; i++) hold[i]=false;
	//	a[2]=10;
		wash();	

}

public static void wash() 
	{	int j;
		for (j=1 ; j <=10 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]是暫存
			a[j]=a[swap];
			a[swap]=a[0];			
		}			
	}

public static void gui() {
		JFrame myFrame = new JFrame("----金撲克5----[WINDOWS版]");
		
		JMenuBar myMenuBar = new JMenuBar();
		
		myFrame.setJMenuBar(myMenuBar);
		JMenu myMenu = new JMenu("G 遊戲");
		
		myMenu.setMnemonic('G');					
		JMenuItem rule = new JMenuItem("規則");
		JMenuItem quit = new JMenuItem("結束");
		myMenu.add(rule);
		myMenu.add(quit);
		myMenuBar.add(myMenu);    
		
			rule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
					//建立JOptionPane
				JOptionPane myOptPane= new JOptionPane(
					"先押錢，後翻牌，選要的牌，按賭，在看換後是幾倍：\n沒有===>0倍\n1胚===>2倍\n吐胚===>4倍\n同花===>5倍\n3條===>6倍\n葫蘆===>8倍\n鐵枝===>10倍\n順===>20倍\n同花順===>40倍", JOptionPane.INFORMATION_MESSAGE);

				//以createDialog方法建立對話方塊，並將之代入JDialog物件中
				JDialog myDialog = myOptPane.createDialog(myContainer, "倍數說明");
				
				//設定對話方塊為顯示狀態
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
		myPanel.setLayout(new GridLayout(5, 5, 0, 5));
		myPanel.setBackground(Color.white);
		
		final JLabel myLabel = new JLabel("本前本金:$"+money, JLabel.CENTER);
		final JTextField myText = new JTextField("0", 5);
		final JLabel myLabel11 = new JLabel("  本金-->", JLabel.CENTER);
		final JLabel myLabel12 = new JLabel("  押金-->", JLabel.CENTER);
		final JLabel myLabel13 = new JLabel("", JLabel.CENTER);
		final JTextField myText2 = new JTextField(""+money, 5);
		final JTextField myText3 = new JTextField("0", 5);
final JLabel myLabel1 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel2 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel3 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel4 = new JLabel("?", JLabel.CENTER);
final JLabel myLabel5 = new JLabel("?", JLabel.CENTER);
final JButton btn11 = new JButton("<--押");

		final JButton btn1 = new JButton("change");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[1]=!hold[1];
				if (btn1.getText()=="change") btn1.setText("保留") ;
				else btn1.setText("change");						
			}
		});

		final JButton btn2 = new JButton("change");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[2]=!hold[2];
				if (btn2.getText()=="change") btn2.setText("保留") ;
				else btn2.setText("change");
							}
		});

		final JButton btn3 = new JButton("change");
		btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					hold[3]=!hold[3];
					if (btn3.getText()=="change") btn3.setText("保留") ;
				else btn3.setText("change");
				}
		});

		final JButton btn4 = new JButton("change");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[4]=!hold[4];
				if (btn4.getText()=="change") btn4.setText("保留") ;
				else btn4.setText("change");
	
			}
		});

		final JButton btn5 = new JButton("change");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				hold[5]=!hold[5];
				if (btn5.getText()=="change") btn5.setText("保留") ;
				else btn5.setText("change");
			}
		});
		
			 JButton btn9 = new JButton("---");
				btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn9");
			}
		});
		final JButton btn6 = new JButton("押100");
		final JButton btn7 = new JButton("押500");
		final JButton btn8 = new JButton("押1000");
		final JButton btn10 = new JButton("翻!");
				
		 btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (btn10.getText()=="翻!")
				{
				btn10.setText("賭");
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
				btn11.setEnabled(false);
				
		for (i=1 ; i <=10 ; i++)
		{	
		  	b[i]=a[i];		
		  	//算牌
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;        //0-12
	 	}
	 		
cal();		 	
		 
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
						 			
 myLabel.setText("--------->"+pe+"<---------");

}else{
	int i,j,k;
	for (i=1; i<=5; i++)
	if (!hold[i]) 
	{
		b1[i]=b1[i+5];
		b2[i]=b2[i+5];
	}
	
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

	
    cal();	 	
    
	pp=mpair[pb]+mseri[pa];		//獲得倍數
	money+=iNum*pp;

	myLabel.setText("--------->"+pe+"<---------\n獲得"+pp+"倍，得$"+iNum*pp);
	myText2.setText(" "+money);



		for (i=1 ; i <=5 ; i++)	hold[i]=false;		//全不保留
		wash();	//洗牌
				
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);				
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn10.setEnabled(false);	
				btn11.setEnabled(true);	
				iNum=0;				//下注金歸0
				myText3.setText("0");

btn10.setText("翻!");	
}
				
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				if (money>=100) {
				iNum+=100;
				money-=100;}
			    btn10.setEnabled(true);
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
				myLabel.setText("目前押:$"+iNum+"本金剩:$"+money);
				myText2.setText(""+money);
				myText3.setText(""+iNum);				
			}
		});
		
	
		myPanel.add(myLabel11);
		myPanel.add(myText2);
		myText2.setEditable(false);
		myText3.setEditable(false);
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

		//定義關閉框架（視窗）時的處理
		myFrame.addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
 			}
		}
		);

	
	//將視窗大小設為300×240
	myFrame.setSize(500, 400);
	myFrame.setLocation(200,200);
	myFrame.setVisible(true);	
    myFrame.setCursor(12);			//手指
 
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
}
	
public static void cal() {
		//依數字排序小->大
		int i,j,k;
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
	         if (b2[i]==b2[j]) pb++;		//對子
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//連續 
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//同花 	 
		 
	pe="沒有";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) {
		pe="同花"+pe;
		pa++;
		} 
	if (pc==4) 
		{	pe="同花";
			pa=6;	
		}
}

}