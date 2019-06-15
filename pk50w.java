//
//名稱： PKCARD 							         
//版本：5.0 windows 介面
//功能：5 張金撲克
//學號：9006086
//姓名：鄭立強			
//2002/5/14 08:55下午

//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//

public class pk50w
{	public static void GameGUI() throws java.io.IOException
	{
		//設定標題呼叫出JFrame的建構子
		JFrame myFrame = new JFrame("----金撲克5----[WINDOWS版]");
		JMenuBar myMenuBar = new JMenuBar();
		JMenuBar myMenuBarAbout = new JMenuBar();
		myFrame.setJMenuBar(myMenuBar);
		JMenu myMenu = new JMenu("G 遊戲");
		//JMenu myMenuAbout = new JMenu("A 關於");
		myMenu.setMnemonic('G');
		JMenuItem replay = new JMenuItem("規則");
		JMenuItem quit = new JMenuItem("結束");
		myMenu.add(replay);
//		myMenu.addSeparator();
		myMenu.add(quit);
		myMenuBar.add(myMenu);
		
    


		//quit
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});		
		
//		JFrame myFrame = new JFrame("Click Me Buttons !");
		myFrame.getContentPane().setLayout(new BorderLayout());

		JPanel myPanel = new JPanel();
		//GridLayout gLayout = new GridLayout(1, 3, 5, 5);
		myPanel.setLayout(new GridLayout(2, 5, 5, 5));

		final JLabel myLabel = new JLabel("請點選任一顆按鈕", JLabel.CENTER);

		JButton btn1 = new JButton("保留1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn1");
			}
		});

		JButton btn2 = new JButton("保留2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn2");
			}
		});

		JButton btn3 = new JButton("保留3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn3");
			}
		});

		JButton btn4 = new JButton("保留4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn4");
			}
		});

		JButton btn5 = new JButton("保留5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn5");
			}
		});
		
		JButton btn6 = new JButton("押100");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn6");
			}
		});
		
		JButton btn7 = new JButton("押500");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn7");
			}
		});
				JButton btn8 = new JButton("押1000");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn8");
			}
		});
				JButton btn9 = new JButton("全保留");
				btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn9");
			}
		});
				JButton btn10 = new JButton("賭!");
				btn10.setEnabled(false);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				myLabel.setText("btn10");
			}
		});

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
		myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);

		myFrame.getContentPane().add(myLabel, BorderLayout.SOUTH);	

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

		myFrame.setSize(400, 200);
		myFrame.setVisible(true);
		//定義關閉框架（視窗）時的處理
		myFrame.addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
 			}
		}
		);

	
	//將視窗大小設為300×240
	myFrame.setSize(500, 300);
	myFrame.setLocation(300,100);
	myFrame.setVisible(true);	
    myFrame.setCursor(12);
	}
	
	
//	主程式
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,b,b1,b2;
		char hex1[] = {3, 4, 5, 6};
		String hex2[] = {" A", " 2", " 3", " 4", " 5",
				      " 6", " 7", " 8", " 9", "10", " J",
			      " Q", " K"};
		String pair[] ={"沒有","一胚","吐胚","三條","葫蘆","鐵枝"};
		int mpair[] ={0,2,4,6,8,10,};
		String seri[] ={"None","None","None","None","順"};
		int mseri[] ={0,0,0,0,20,40};
		boolean hold[]={false,false,false,false,false,false};
		int money=5000,iNum=0;
		int cin;
		char[] cx;
		String[] cy;
		int i,j,k;
		int swap,pa,pb,pc,pp;
		a=new int[53];		//52張牌
		b=new int[11];		//抽出的11張
		b1=new int[11];		//花色
		b2=new int[11];		//數字	
		String pe;
		
		GameGUI();
		
		//放入52張牌
		for (i=1 ; i <=52 ; i++)
			a[i]=i;
			
		for (j=0 ; j <=5 ; j++)
		System.out.println(pair[j]+"===>"+mpair[j]+"倍");
	
		System.out.println(seri[4]+"===>"+mseri[4]+"倍");		
		System.out.println("同花順===>"+mseri[5]+"倍");

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
 	
 	do{
		System.out.print("目前還有$"+money+"輸入押金\n->");
		iNum = Integer.parseInt(keyin.readLine());
}while(iNum<0);
		money-=iNum;

		
		//洗牌
		for (i=1 ; i <=5 ; i++)
		{
			hold[i]=false;
		}
		
		for (j=1 ; j <=10 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]是暫存
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
				for (i=1 ; i <=10 ; i++)
		{	
		  	b[i]=a[i];		
		  	//算牌
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;        //0-12
	 	}

	 	
		//依數字排序小->大
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

 	
//比對
		 pa=pb=pc=0;
		 
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//對子
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//連續 
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//同花 
		 			

System.out.println("=== 金撲克 ===    $"+money);
try{do{
//顯示牌組		 
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
 for (i=1; i<=5; i++)
 if (hold[i])
 	System.out.print("hold ");
 else
 	System.out.print("  "+i+"  ");
 	System.out.println();
//	System.out.println(pb+"對"+pa+"連"+pc+"花");
	pe="沒有";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) pe="同花"+pe;				
		 	
		 
		System.out.println("--------->"+pe+"<---------");		
		System.out.print("輸入1-5 hold牌 (0結束):");
	
		cin=System.in.read();	//cin=讀取鍵盤輸入字元
		System.in.read();	//cin=讀取鍵盤輸入字元
		System.in.read();	//讀取跳行字元
		cin-=48;
		hold[cin]=!hold[cin];

}while (cin!=0);}catch(ArrayIndexOutOfBoundsException e){cin='1';}


		System.out.println();		
	for (i=1; i<=5; i++)
	if (!hold[i]) 
	{
		b1[i]=b1[i+5];
		b2[i]=b2[i+5];
	}
	
	
//顯示牌組		 
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
	 	
		//依數字排序小->大
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
		 
//	System.out.println(pb+"對"+pa+"連"+pc+"花");
	pe="沒有";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) {
		pe="同花"+pe;
		pa++;
		} 
	pp=mpair[pb]+mseri[pa];
	money+=iNum*pp;
	System.out.println("[換牌後]-->>"+pe+"<<-------");
	System.out.println("獲得"+pp+"倍，得$"+iNum*pp);
	System.out.println();

}while(true);

}

}