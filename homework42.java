////////////////////////////////////////////////////////////////////////////////////////
//作者：資三謙9006010簡大翔							      //
//檔案名稱：homework42.java							      //
//檔案功能：五張牌遊戲								      //
//規則如下：									      //
//	1.亂數產生5張牌不能重覆							      //
//	2.判斷5張牌為何種牌組							      //
//寫作日期：中華民國91年5月9日							      //
//修改日期：中華民國91年6月7日							      //
//修改部份：加入圖形介面							      //
////////////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;               // For random number generator

public class homework42 implements ActionListener
{
// 建立所需的物件
	static JFrame aWindow = new JFrame("期末小程式");	// 建立視窗物件JFrame
	static Container content = aWindow.getContentPane();	// 取得content pane
	static JPanel ControlButtonPanel,ButtonPanel,CardPanel;	// 建立裝按鈕的容器JPanel
	static JPanel MagPanel,TotalMoneyPanel,WinPanel,DownPanel,WhatPanel;
	static JLabel TotalMoneyLabel,WhatCardLabel,DownMoenyLabel,WinLabel,PaLabel,DownLabel;
	static JLabel [] WhatLabel = new JLabel[11];
	static CardLayout card = new CardLayout(0,0);		// 建立CardLayout
	static JButton GoButton,OkButton,CanelButton,ContinueButton,EndButton;	// 設定按鈕物件
	static JButton [] CardButton = new JButton[5];		// 建立五張牌的Button
	static JButton OneButton,FiveButton,TenButton,FiftyButton,AllButton;
	static Color myGreen = new Color(0,200,0);		// 自行設定顏色，此色為綠色
	static Icon[] icon = new ImageIcon[53];			// 儲存52張牌和一個背面的圖
	static boolean [] Check = new boolean[5];		// 選取牌
	static boolean Check1 = false;				// 停止選牌
	static int money=1000;					// 總金額
	static int DownMoney = 0;				// 下注金額
	static int Pa = 0;					// 幾倍
	static int WinMoney = 0;				// 贏得金額
	static String getLabelText;

/////////////////////////////////////////////////////////////////////////////////////////////	
// 建立亂數所需的變數
	final static int numberCount = 5;			// 有五個按鈕
	final static int minValue = 0;				// 亂數起始值
	final static int maxValue = 51;				// 亂數最大值
	static int[] values = new int[maxValue-minValue+1];	// 52張牌
	static							// 陣列初始值
	{
		for(int i = 0 ; i<values.length ; i++)		//陣列值填入0~51
			values[i] = i + minValue;
	}	

	private static Random choice = new Random();             // 宣告亂數
	
	// 隨機產生號碼放入陣列中
	static int[] getNumbers()
	{
		int[] numbers = new int[numberCount];		//儲存號碼於numbers
		int candidate = 0;				//儲存亂數產生的號碼
		for(int i = 0; i < numberCount; i++)		//取五個號碼
		{
			search:					// 標籤
			for(;;)					//判斷是否有重覆的號碼
			{
				candidate = values[choice.nextInt(values.length)];	// 產生亂數
				//System.out.print(candidate);
				//如果發現重覆的號碼就跳置search重新選取一個號碼
				for(int j = 0 ; j<i ; j++)
					if(candidate==numbers[j])
						continue search;
				//如果沒有相同的號碼就存入陣列中
				numbers[i] = candidate;
				break;				// 然後取下一個號碼
			}
		}
		// 氣泡排序法
		BubbleSort(numbers,5);
		return numbers;					// 傳回亂數產生的五個號碼
	} 
	// 取得亂數產生的五個號碼
	static int[] choices = new int [5]; 

/////////////////////////////////////////////////////////////////////////////////////////////	
// 按鈕配置		
	public homework42()
	{

	// 將53張牌放入icon中
		for (int i=0;i<52;i++)
			icon[i] = new ImageIcon("image/" + i + ".jpg");
		icon[52] = new ImageIcon("image/back.jpg");
			
	// 將五張牌放至適當位置
		CardPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,8,15)); 
		CardPanel.setBackground(myGreen);	// 設定背景顏色
    		// 讓panel有邊框，邊框顏色為藍色
		CardPanel.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(Color.cyan,
			Color.blue), "金撲克",TitledBorder.CENTER ,TitledBorder.TOP ));
   
		// 更改控制按鈕的大小
		Dimension buttonSize = new Dimension(62,82);
		for(int i=0; i<5; i++)
		{
			CardPanel.add(CardButton[i] = new JButton(icon[52])); // 將按鈕放入CardPanel中
			CardButton[i].setPreferredSize(buttonSize);	// 變更按鈕的大小
			CardButton[i].setBackground(Color.yellow);		// 變更按鈕的背景顏色
			CardButton[i].addActionListener(this);		// 加入ActionListener
			//CardButton[i].setEnabled(false);		// 將CardButton Disabled
		}
		content.add(CardPanel);					// 將CardPanel放入content中
		CardPanel.setBounds(10,80,370,150);			// 設定CardPanel的位置和大小
	
	// 將下注鈕放至適當位置
		DownPanel = new JPanel(new  GridLayout(1,6,5,0));
		DownPanel.setBackground(myGreen);
		DownLabel = new JLabel("　　下注");
		DownLabel.setForeground(Color.red);
		DownPanel.add(DownLabel);
		OneButton = new JButton("1");
		OneButton.setBackground(Color.orange);
		OneButton.addActionListener(this);
		DownPanel.add(OneButton);
		FiveButton = new JButton("10");
		FiveButton.setBackground(Color.orange);
		FiveButton.addActionListener(this);
		DownPanel.add(FiveButton);
		TenButton = new JButton("50");
		TenButton.setBackground(Color.orange);
		TenButton.addActionListener(this);
		DownPanel.add(TenButton);
		FiftyButton = new JButton("100");
		FiftyButton.setBackground(Color.orange);
		FiftyButton.addActionListener(this);
		DownPanel.add(FiftyButton);
		AllButton = new JButton("ALL");
		AllButton.setBackground(Color.orange);
		AllButton.addActionListener(this);
		DownPanel.add(AllButton);
		content.add(DownPanel);
		DownPanel.setBounds(0,230,380,25);
		CanelButton = new JButton("取消");
		CanelButton.setBackground(Color.orange);
		CanelButton.addActionListener(this);
		content.add(CanelButton);
		CanelButton.setBounds(64,260,60,25);
		CanelButton.setVisible(false);
		
	// 將按鈕放至適當位置
		ButtonPanel = new JPanel(new  GridLayout(1,2,5,0));	// 建立ButtonPanel物件
		ButtonPanel.setBackground(myGreen);			// 設定ButtonPanel背景顏色
		// 將控制按鈕放入ControlButtonPanel
		ControlButtonPanel = new JPanel(card);		// 設定此JPanel layout Manager 為CardLayout
		ControlButtonPanel.add(GoButton = new JButton("發牌"), "Card" + 1);  // 加入一個發牌按鈕
		GoButton.addActionListener(this);               // 將按鈕加入listener
		ControlButtonPanel.add(OkButton = new JButton("確認"), "Card" + 2);  // 加入一個確認按鈕
		OkButton.addActionListener(this);               // 將按鈕加入listener
		ControlButtonPanel.add(ContinueButton = new JButton("繼續"), "Card" + 3);
		ContinueButton.addActionListener(this);
		ButtonPanel.add(ControlButtonPanel);		// 將ControlButtonPanel加入ButtonPanel中
		
		EndButton = new JButton("不玩");		// 建立CanelButton物件
		EndButton.addActionListener(this);
		ButtonPanel.add(EndButton);		// 將CanelButton加入ButtonPanel中
		
		content.add(ButtonPanel);		// 將ButtonPanel放入content中
		ButtonPanel.setBounds(255,260,125,25);		// 設定ControlButtonPanel所放的位置
	}

/////////////////////////////////////////////////////////////////////////////////////////////
// 按鈕事件
	public void actionPerformed(ActionEvent e) 
	{
	// 下注金額按鈕
		if(e.getSource() == OneButton && money > 1)
		{
			CanelButton.setVisible(true);
			DownMoney += 1;
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			money -= 1;
			TotalMoneyLabel.setText("  總金額 = " + money);
		}
		if(e.getSource() == FiveButton && money > 10)
		{
			CanelButton.setVisible(true);
			DownMoney += 10;
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			money -= 10;
			TotalMoneyLabel.setText("  總金額 = " + money);
		}
		if(e.getSource() == TenButton && money > 50)
		{
			CanelButton.setVisible(true);
			DownMoney += 50;
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			money -= 50;
			TotalMoneyLabel.setText("  總金額 = " + money);
		}
		if(e.getSource() == FiftyButton && money > 100)
		{
			CanelButton.setVisible(true);
			DownMoney += 100;
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			money -= 100;
			TotalMoneyLabel.setText("  總金額 = " + money);
		}
		if(e.getSource() == AllButton && money != 0)
		{
			CanelButton.setVisible(true);
			DownMoney += money;
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			money = 0;
			TotalMoneyLabel.setText("  總金額 = " + money);
		}
		if(e.getSource() == CanelButton && DownMoney !=0)
		{
			money += DownMoney;
			DownMoney = 0;
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			TotalMoneyLabel.setText("  總金額 = " + money);
		}
		
		for(int i=0; i<5; i++)
		{
			// 第i張牌
			if(e.getSource() == CardButton[i] && Check1)
			{
				if (Check[i])
				{
					CardButton[i].setIcon(icon[choices[i]]);
					Check[i] = false;
				}
				else
				{
					CardButton[i].setIcon(icon[52]);
					Check[i] = true;
				}
			}
		}

/////////////////////////////////////////////////////////////////////////////////////////////
	// 如果按下GoButton，執行發牌動作
		if(e.getSource() == GoButton && DownMoney !=0)
		{
			int[] numbers = getNumbers();	// 取得亂數產生的五張牌
			Check1 = true;
			for(int i = 0; i < 5; i++)
			{
				Check[i] = false;	// 預置Check[i] = false;
				choices[i] = numbers[i];// 將五張牌存入choicesc中
				CardButton[i].setIcon(icon[choices[i]]);	// 將五張牌秀出來
				CardButton[i].setEnabled(true);			// 將CardButton Enabled
			}
			//System.out.println("Go");
			WhatCardLabel.setVisible(false);
			PaLabel.setVisible(false);
			WinLabel.setVisible(false);
			WhatCardLabel.setText("牌組：");
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			WinLabel.setText("　　贏得金額 = ");
			//DownMoney = 10;
			WinMoney = 0;
			//getLabelText = DownMoenyLabel.getText();
			//DownMoenyLabel.setText(getLabelText + DownMoney);
			DownPanel.setVisible(false);
			CanelButton.setVisible(false);
			card.next(ControlButtonPanel);		// 換下一個按鈕出現
		}

/////////////////////////////////////////////////////////////////////////////////////////////		
	// 如果按下OkButton，執行換牌動作和判斷結果
		if(e.getSource() == OkButton)
		{
			Check1 = false;
			int candidate = 0;
			//System.out.println("Ok");
			for (int i=0; i<5; i++)
			{
				if (Check[i])
				{
					search:					// 標籤
					for(;;)					//判斷是否有重覆的號碼
					{
						candidate = values[choice.nextInt(values.length)];	// 產生亂數
						//如果發現重覆的號碼就跳置search重新選取一個號碼
						for(int j = 0 ; j<5 ; j++)
							if(candidate==choices[j])
								continue search;
						//如果沒有相同的號碼就存入陣列中
						choices[i] = candidate;
						CardButton[i].setIcon(icon[choices[i]]);
						break;
					}
				}
			}
			BubbleSort(choices,5);		// 將牌排序
			for (int i=0; i<5; i++)
				CardButton[i].setIcon(icon[choices[i]]);	// 秀出排序後的牌
			WhatCard(choices);			// 判斷牌組
			
			WinMoney = DownMoney * Pa;
			getLabelText = WinLabel.getText();
			WinLabel.setText(getLabelText + WinMoney);
			money = money + WinMoney;
			TotalMoneyLabel.setText("  總金額 = " + money);
			WhatCardLabel.setVisible(true);
			PaLabel.setVisible(true);
			WinLabel.setVisible(true);
			if (money == 0)
				ContinueButton.setText("重玩");
			card.next(ControlButtonPanel);		// 換下一個按鈕出現
		}

/////////////////////////////////////////////////////////////////////////////////////////////	
	// 如果按下ContinueButton，繼續Play	
		if(e.getSource() == ContinueButton)
		{
			for (int i=0; i<5; i++)
			{
				CardButton[i].setIcon(icon[52]);
				//CardButton[i].setEnabled(false);
			}
			DownMoney = 0;
			Pa = 0;
			WinMoney = 0;
			if (money == 0)
			{
				money = 1000;
				ContinueButton.setText("繼續");
			}
			TotalMoneyLabel.setText("  總金額 = " + money);
			DownMoenyLabel.setText("　　下注金額 = " + DownMoney);
			WhatCardLabel.setVisible(false);
			PaLabel.setVisible(false);
			WinLabel.setVisible(false);
			DownPanel.setVisible(true);
			card.next(ControlButtonPanel);		// 換下一個按鈕出現
		}

/////////////////////////////////////////////////////////////////////////////////////////////		
	// 如果按下CanelButton，結束程式
		if(e.getSource() == EndButton)
			System.exit(0);				//結束
	}

/////////////////////////////////////////////////////////////////////////////////////////////	
// 主程式
	public static void main(String[] args)
	{

/////////////////////////////////////////////////////////////////////////////////////////////		
	// 視窗設定
		Toolkit theKit = aWindow.getToolkit();       // 取得Toolkit的大小
		Dimension wndSize = theKit.getScreenSize();  // 取得螢幕的大小
		// 設定位置在螢幕的中央 & 視窗大小為螢幕的一半
		aWindow.setBounds(wndSize.width/4, wndSize.height/4,   // 位置
				wndSize.width/2, wndSize.height/2);  // 大小
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 重置Frame將所有組件銷毀
		//設定游標形狀
		//aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	//手
		aWindow.getContentPane().setBackground(myGreen);	//設定背景顏色
		content.setLayout(null);	// 設定Container 不使用layout Manager
			
		new homework42();	// 呼叫homework42

/////////////////////////////////////////////////////////////////////////////////////////////		
	//Label設定
		MagPanel = new JPanel(new GridLayout(2,1,10,0));
		// 讓panel有邊框，邊框顏色為藍色
		MagPanel.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(Color.cyan,
			Color.blue)));
		MagPanel.setBackground(Color.pink);
		money = money - DownMoney;
		TotalMoneyLabel = new JLabel("總金額 = " + money);
		TotalMoneyLabel.setForeground(Color.blue);
		MagPanel.add(TotalMoneyLabel);
		WinPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		WinPanel.setBackground(Color.pink);
		WhatCardLabel = new JLabel("牌組：");
		WhatCardLabel.setForeground(Color.blue);
		WinPanel.add(WhatCardLabel);
		DownMoenyLabel = new JLabel("　　下注金額 = " + DownMoney);
		DownMoenyLabel.setForeground(Color.blue);
		WinPanel.add(DownMoenyLabel);
		PaLabel = new JLabel("× " + Pa + " 倍");
		PaLabel.setForeground(Color.blue);
		WinPanel.add(PaLabel);
		WinLabel = new JLabel("　　贏得金額 = " + WinMoney);
		WinLabel.setForeground(Color.blue);
		WinPanel.add(WinLabel);
		MagPanel.add(WinPanel);
		content.add(MagPanel);					// 將MagPanel放入content中
		MagPanel.setBounds(12,30,366,50);			// 設定MagPanel的位置和大小
		WhatCardLabel.setVisible(false);
		PaLabel.setVisible(false);
		WinLabel.setVisible(false);
		
		WhatLabel[0] = new JLabel("同花大順 × 10倍");
		WhatLabel[1] = new JLabel("同花順 × 9倍");
		WhatLabel[2] = new JLabel("鐵支 × 8倍");
		WhatLabel[3] = new JLabel("葫蘆 × 7倍");
		WhatLabel[4] = new JLabel("同花 × 6倍");
		WhatLabel[5] = new JLabel("大順 × 5倍");
		WhatLabel[6] = new JLabel("順子 × 4倍");
		WhatLabel[7] = new JLabel("三條 × 3倍");
		WhatLabel[8] = new JLabel("二對 × 2倍");
		WhatLabel[9] = new JLabel("一對 × 1倍");
		WhatLabel[10] = new JLabel("雜牌 × 0倍");
		WhatPanel = new JPanel(new  GridLayout(11,1,0,0));
		// 讓panel有邊框，邊框顏色為藍色
		WhatPanel.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(Color.cyan,
			Color.blue)));
		WhatPanel.setBackground(myGreen);
		for (int i=0; i<11; i++)
		{
			WhatPanel.add(WhatLabel[i]);
			WhatLabel[i].setForeground(Color.yellow);
		}
		content.add(WhatPanel);
		WhatPanel.setBounds(390,30,110,200);
		
		
/////////////////////////////////////////////////////////////////////////////////////////////		
		// 使視窗固定
		aWindow.setResizable(false);
		// 顯示視窗
		aWindow.setVisible(true);
	}

//將牌依數字排序採氣泡排序法由小至大	
	public static void BubbleSort(int[] card,int num)
	{
		for (int i=0; i<(num-1); i++)	
			for (int j=i; j<num; j++)
				if(card[i]%13>card[j]%13)
				{
       					int register = card[i];
       					card[i]= card[j];
       					card[j]= register;
      				}
      	}
      	
// 判斷是什麼牌
      	public static void WhatCard(int[] getcard)	//判斷牌組
      	{
		int [][] savecard = new int [5][14];
		int reg = 0;
		for (int i=0; i<5; i++)
			for (int j=0; j<14; j++)
				savecard[i][j] = 0;
      		for (int i=0; i<5; i++)	//將數字、花色分類
		{		
			savecard[4][getcard[i]%13]++;
			savecard[getcard[i]/13][13]++;
			savecard[getcard[i]/13][getcard[i]%13]++;			
		}
		int count=0;
		boolean samepattern=false,Sequence=false,big=false;
		for(int i=0; i<5; i++) //判斷順
			if ((getcard[1]%13)+i-1 == getcard[i]%13)
				count++;
		if (count == 4 && getcard[0]%13 == 0 && getcard[1]%13 == 9)
			big = true;
		if (count == 5)
			Sequence=true;
		for (int i=0; i<5; i++) //判斷同花
			if (savecard[i][13]==5)
				samepattern = true;
		for (int i=0;i<13;i++)	//將牌型依鐵支、三條、一對、雜牌排序，採氣泡排序法		
			for (int j=i;j<14;j++)
				if (savecard[4][i]<savecard[4][j])
				{
       					int register = savecard[4][i];
       					savecard[4][i]= savecard[4][j];
       					savecard[4][j]= register;
      				}
      		//System.out.print("  " + "牌組為:");
		if (samepattern)//印出牌形
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "同花");
			//System.out.print("同花");
			reg = 6;
			if (big)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "大順");
				//System.out.print("大順");
				reg += 4;
			}
			else if (Sequence)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "順");
				//System.out.print("順");
				reg += 3;
			}	
		}
		else if (big)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "大順");
			//System.out.print("大順");
			reg = 5;
		}
		else if (Sequence)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "順子");
			//System.out.print("順子");
			reg = 4;
		}
		else if (savecard[4][0] == 4)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "鐵支");
			//System.out.print("鐵支");
			reg = 8;
		}
		else if (savecard[4][0] == 3)
			if (savecard[4][1] == 2)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "葫蘆");
				//System.out.print("葫蘆");
				reg = 7;
			}
			else
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "三條");
				//System.out.print("三條");
				reg = 3;
			}	
		else if (savecard[4][0] == 2)
			if (savecard[4][1] == 2)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "二對");
				//System.out.print("二對");
				reg = 2;
			}
			else
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "一對");
				//System.out.print("一對");
				reg = 1;
			}
		else if (savecard[4][0] == 1)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "雜牌");
			reg = 0;
		}
		Pa = reg;
		PaLabel.setText("× " + reg + " 倍");
      	}
}