////////////////////////////////////////////////////////////////////////////////////////
//�@�̡G��T��9006010²�j��							      //
//�ɮצW�١Ghomework42.java							      //
//�ɮץ\��G���i�P�C��								      //
//�W�h�p�U�G									      //
//	1.�üƲ���5�i�P���୫��							      //
//	2.�P�_5�i�P����صP��							      //
//�g�@����G���إ���91�~5��9��							      //
//�ק����G���إ���91�~6��7��							      //
//�קﳡ���G�[�J�ϧΤ���							      //
////////////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;               // For random number generator

public class homework42 implements ActionListener
{
// �إߩһݪ�����
	static JFrame aWindow = new JFrame("�����p�{��");	// �إߵ�������JFrame
	static Container content = aWindow.getContentPane();	// ���ocontent pane
	static JPanel ControlButtonPanel,ButtonPanel,CardPanel;	// �إ߸˫��s���e��JPanel
	static JPanel MagPanel,TotalMoneyPanel,WinPanel,DownPanel,WhatPanel;
	static JLabel TotalMoneyLabel,WhatCardLabel,DownMoenyLabel,WinLabel,PaLabel,DownLabel;
	static JLabel [] WhatLabel = new JLabel[11];
	static CardLayout card = new CardLayout(0,0);		// �إ�CardLayout
	static JButton GoButton,OkButton,CanelButton,ContinueButton,EndButton;	// �]�w���s����
	static JButton [] CardButton = new JButton[5];		// �إߤ��i�P��Button
	static JButton OneButton,FiveButton,TenButton,FiftyButton,AllButton;
	static Color myGreen = new Color(0,200,0);		// �ۦ�]�w�C��A���⬰���
	static Icon[] icon = new ImageIcon[53];			// �x�s52�i�P�M�@�ӭI������
	static boolean [] Check = new boolean[5];		// ����P
	static boolean Check1 = false;				// �����P
	static int money=1000;					// �`���B
	static int DownMoney = 0;				// �U�`���B
	static int Pa = 0;					// �X��
	static int WinMoney = 0;				// Ĺ�o���B
	static String getLabelText;

/////////////////////////////////////////////////////////////////////////////////////////////	
// �إ߶üƩһݪ��ܼ�
	final static int numberCount = 5;			// �����ӫ��s
	final static int minValue = 0;				// �üư_�l��
	final static int maxValue = 51;				// �üƳ̤j��
	static int[] values = new int[maxValue-minValue+1];	// 52�i�P
	static							// �}�C��l��
	{
		for(int i = 0 ; i<values.length ; i++)		//�}�C�ȶ�J0~51
			values[i] = i + minValue;
	}	

	private static Random choice = new Random();             // �ŧi�ü�
	
	// �H�����͸��X��J�}�C��
	static int[] getNumbers()
	{
		int[] numbers = new int[numberCount];		//�x�s���X��numbers
		int candidate = 0;				//�x�s�üƲ��ͪ����X
		for(int i = 0; i < numberCount; i++)		//�����Ӹ��X
		{
			search:					// ����
			for(;;)					//�P�_�O�_�����Ъ����X
			{
				candidate = values[choice.nextInt(values.length)];	// ���Ͷü�
				//System.out.print(candidate);
				//�p�G�o�{���Ъ����X�N���msearch���s����@�Ӹ��X
				for(int j = 0 ; j<i ; j++)
					if(candidate==numbers[j])
						continue search;
				//�p�G�S���ۦP�����X�N�s�J�}�C��
				numbers[i] = candidate;
				break;				// �M����U�@�Ӹ��X
			}
		}
		// ��w�ƧǪk
		BubbleSort(numbers,5);
		return numbers;					// �Ǧ^�üƲ��ͪ����Ӹ��X
	} 
	// ���o�üƲ��ͪ����Ӹ��X
	static int[] choices = new int [5]; 

/////////////////////////////////////////////////////////////////////////////////////////////	
// ���s�t�m		
	public homework42()
	{

	// �N53�i�P��Jicon��
		for (int i=0;i<52;i++)
			icon[i] = new ImageIcon("image/" + i + ".jpg");
		icon[52] = new ImageIcon("image/back.jpg");
			
	// �N���i�P��ܾA���m
		CardPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,8,15)); 
		CardPanel.setBackground(myGreen);	// �]�w�I���C��
    		// ��panel����ءA����C�⬰�Ŧ�
		CardPanel.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(Color.cyan,
			Color.blue), "�����J",TitledBorder.CENTER ,TitledBorder.TOP ));
   
		// ��ﱱ����s���j�p
		Dimension buttonSize = new Dimension(62,82);
		for(int i=0; i<5; i++)
		{
			CardPanel.add(CardButton[i] = new JButton(icon[52])); // �N���s��JCardPanel��
			CardButton[i].setPreferredSize(buttonSize);	// �ܧ���s���j�p
			CardButton[i].setBackground(Color.yellow);		// �ܧ���s���I���C��
			CardButton[i].addActionListener(this);		// �[�JActionListener
			//CardButton[i].setEnabled(false);		// �NCardButton Disabled
		}
		content.add(CardPanel);					// �NCardPanel��Jcontent��
		CardPanel.setBounds(10,80,370,150);			// �]�wCardPanel����m�M�j�p
	
	// �N�U�`�s��ܾA���m
		DownPanel = new JPanel(new  GridLayout(1,6,5,0));
		DownPanel.setBackground(myGreen);
		DownLabel = new JLabel("�@�@�U�`");
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
		CanelButton = new JButton("����");
		CanelButton.setBackground(Color.orange);
		CanelButton.addActionListener(this);
		content.add(CanelButton);
		CanelButton.setBounds(64,260,60,25);
		CanelButton.setVisible(false);
		
	// �N���s��ܾA���m
		ButtonPanel = new JPanel(new  GridLayout(1,2,5,0));	// �إ�ButtonPanel����
		ButtonPanel.setBackground(myGreen);			// �]�wButtonPanel�I���C��
		// �N������s��JControlButtonPanel
		ControlButtonPanel = new JPanel(card);		// �]�w��JPanel layout Manager ��CardLayout
		ControlButtonPanel.add(GoButton = new JButton("�o�P"), "Card" + 1);  // �[�J�@�ӵo�P���s
		GoButton.addActionListener(this);               // �N���s�[�Jlistener
		ControlButtonPanel.add(OkButton = new JButton("�T�{"), "Card" + 2);  // �[�J�@�ӽT�{���s
		OkButton.addActionListener(this);               // �N���s�[�Jlistener
		ControlButtonPanel.add(ContinueButton = new JButton("�~��"), "Card" + 3);
		ContinueButton.addActionListener(this);
		ButtonPanel.add(ControlButtonPanel);		// �NControlButtonPanel�[�JButtonPanel��
		
		EndButton = new JButton("����");		// �إ�CanelButton����
		EndButton.addActionListener(this);
		ButtonPanel.add(EndButton);		// �NCanelButton�[�JButtonPanel��
		
		content.add(ButtonPanel);		// �NButtonPanel��Jcontent��
		ButtonPanel.setBounds(255,260,125,25);		// �]�wControlButtonPanel�ҩ񪺦�m
	}

/////////////////////////////////////////////////////////////////////////////////////////////
// ���s�ƥ�
	public void actionPerformed(ActionEvent e) 
	{
	// �U�`���B���s
		if(e.getSource() == OneButton && money > 1)
		{
			CanelButton.setVisible(true);
			DownMoney += 1;
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			money -= 1;
			TotalMoneyLabel.setText("  �`���B = " + money);
		}
		if(e.getSource() == FiveButton && money > 10)
		{
			CanelButton.setVisible(true);
			DownMoney += 10;
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			money -= 10;
			TotalMoneyLabel.setText("  �`���B = " + money);
		}
		if(e.getSource() == TenButton && money > 50)
		{
			CanelButton.setVisible(true);
			DownMoney += 50;
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			money -= 50;
			TotalMoneyLabel.setText("  �`���B = " + money);
		}
		if(e.getSource() == FiftyButton && money > 100)
		{
			CanelButton.setVisible(true);
			DownMoney += 100;
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			money -= 100;
			TotalMoneyLabel.setText("  �`���B = " + money);
		}
		if(e.getSource() == AllButton && money != 0)
		{
			CanelButton.setVisible(true);
			DownMoney += money;
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			money = 0;
			TotalMoneyLabel.setText("  �`���B = " + money);
		}
		if(e.getSource() == CanelButton && DownMoney !=0)
		{
			money += DownMoney;
			DownMoney = 0;
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			TotalMoneyLabel.setText("  �`���B = " + money);
		}
		
		for(int i=0; i<5; i++)
		{
			// ��i�i�P
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
	// �p�G���UGoButton�A����o�P�ʧ@
		if(e.getSource() == GoButton && DownMoney !=0)
		{
			int[] numbers = getNumbers();	// ���o�üƲ��ͪ����i�P
			Check1 = true;
			for(int i = 0; i < 5; i++)
			{
				Check[i] = false;	// �w�mCheck[i] = false;
				choices[i] = numbers[i];// �N���i�P�s�Jchoicesc��
				CardButton[i].setIcon(icon[choices[i]]);	// �N���i�P�q�X��
				CardButton[i].setEnabled(true);			// �NCardButton Enabled
			}
			//System.out.println("Go");
			WhatCardLabel.setVisible(false);
			PaLabel.setVisible(false);
			WinLabel.setVisible(false);
			WhatCardLabel.setText("�P�աG");
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			WinLabel.setText("�@�@Ĺ�o���B = ");
			//DownMoney = 10;
			WinMoney = 0;
			//getLabelText = DownMoenyLabel.getText();
			//DownMoenyLabel.setText(getLabelText + DownMoney);
			DownPanel.setVisible(false);
			CanelButton.setVisible(false);
			card.next(ControlButtonPanel);		// ���U�@�ӫ��s�X�{
		}

/////////////////////////////////////////////////////////////////////////////////////////////		
	// �p�G���UOkButton�A���洫�P�ʧ@�M�P�_���G
		if(e.getSource() == OkButton)
		{
			Check1 = false;
			int candidate = 0;
			//System.out.println("Ok");
			for (int i=0; i<5; i++)
			{
				if (Check[i])
				{
					search:					// ����
					for(;;)					//�P�_�O�_�����Ъ����X
					{
						candidate = values[choice.nextInt(values.length)];	// ���Ͷü�
						//�p�G�o�{���Ъ����X�N���msearch���s����@�Ӹ��X
						for(int j = 0 ; j<5 ; j++)
							if(candidate==choices[j])
								continue search;
						//�p�G�S���ۦP�����X�N�s�J�}�C��
						choices[i] = candidate;
						CardButton[i].setIcon(icon[choices[i]]);
						break;
					}
				}
			}
			BubbleSort(choices,5);		// �N�P�Ƨ�
			for (int i=0; i<5; i++)
				CardButton[i].setIcon(icon[choices[i]]);	// �q�X�Ƨǫ᪺�P
			WhatCard(choices);			// �P�_�P��
			
			WinMoney = DownMoney * Pa;
			getLabelText = WinLabel.getText();
			WinLabel.setText(getLabelText + WinMoney);
			money = money + WinMoney;
			TotalMoneyLabel.setText("  �`���B = " + money);
			WhatCardLabel.setVisible(true);
			PaLabel.setVisible(true);
			WinLabel.setVisible(true);
			if (money == 0)
				ContinueButton.setText("����");
			card.next(ControlButtonPanel);		// ���U�@�ӫ��s�X�{
		}

/////////////////////////////////////////////////////////////////////////////////////////////	
	// �p�G���UContinueButton�A�~��Play	
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
				ContinueButton.setText("�~��");
			}
			TotalMoneyLabel.setText("  �`���B = " + money);
			DownMoenyLabel.setText("�@�@�U�`���B = " + DownMoney);
			WhatCardLabel.setVisible(false);
			PaLabel.setVisible(false);
			WinLabel.setVisible(false);
			DownPanel.setVisible(true);
			card.next(ControlButtonPanel);		// ���U�@�ӫ��s�X�{
		}

/////////////////////////////////////////////////////////////////////////////////////////////		
	// �p�G���UCanelButton�A�����{��
		if(e.getSource() == EndButton)
			System.exit(0);				//����
	}

/////////////////////////////////////////////////////////////////////////////////////////////	
// �D�{��
	public static void main(String[] args)
	{

/////////////////////////////////////////////////////////////////////////////////////////////		
	// �����]�w
		Toolkit theKit = aWindow.getToolkit();       // ���oToolkit���j�p
		Dimension wndSize = theKit.getScreenSize();  // ���o�ù����j�p
		// �]�w��m�b�ù������� & �����j�p���ù����@�b
		aWindow.setBounds(wndSize.width/4, wndSize.height/4,   // ��m
				wndSize.width/2, wndSize.height/2);  // �j�p
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ���mFrame�N�Ҧ��ե�P��
		//�]�w��ЧΪ�
		//aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	//��
		aWindow.getContentPane().setBackground(myGreen);	//�]�w�I���C��
		content.setLayout(null);	// �]�wContainer ���ϥ�layout Manager
			
		new homework42();	// �I�shomework42

/////////////////////////////////////////////////////////////////////////////////////////////		
	//Label�]�w
		MagPanel = new JPanel(new GridLayout(2,1,10,0));
		// ��panel����ءA����C�⬰�Ŧ�
		MagPanel.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(Color.cyan,
			Color.blue)));
		MagPanel.setBackground(Color.pink);
		money = money - DownMoney;
		TotalMoneyLabel = new JLabel("�`���B = " + money);
		TotalMoneyLabel.setForeground(Color.blue);
		MagPanel.add(TotalMoneyLabel);
		WinPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		WinPanel.setBackground(Color.pink);
		WhatCardLabel = new JLabel("�P�աG");
		WhatCardLabel.setForeground(Color.blue);
		WinPanel.add(WhatCardLabel);
		DownMoenyLabel = new JLabel("�@�@�U�`���B = " + DownMoney);
		DownMoenyLabel.setForeground(Color.blue);
		WinPanel.add(DownMoenyLabel);
		PaLabel = new JLabel("�� " + Pa + " ��");
		PaLabel.setForeground(Color.blue);
		WinPanel.add(PaLabel);
		WinLabel = new JLabel("�@�@Ĺ�o���B = " + WinMoney);
		WinLabel.setForeground(Color.blue);
		WinPanel.add(WinLabel);
		MagPanel.add(WinPanel);
		content.add(MagPanel);					// �NMagPanel��Jcontent��
		MagPanel.setBounds(12,30,366,50);			// �]�wMagPanel����m�M�j�p
		WhatCardLabel.setVisible(false);
		PaLabel.setVisible(false);
		WinLabel.setVisible(false);
		
		WhatLabel[0] = new JLabel("�P��j�� �� 10��");
		WhatLabel[1] = new JLabel("�P�ᶶ �� 9��");
		WhatLabel[2] = new JLabel("�K�� �� 8��");
		WhatLabel[3] = new JLabel("��Ī �� 7��");
		WhatLabel[4] = new JLabel("�P�� �� 6��");
		WhatLabel[5] = new JLabel("�j�� �� 5��");
		WhatLabel[6] = new JLabel("���l �� 4��");
		WhatLabel[7] = new JLabel("�T�� �� 3��");
		WhatLabel[8] = new JLabel("�G�� �� 2��");
		WhatLabel[9] = new JLabel("�@�� �� 1��");
		WhatLabel[10] = new JLabel("���P �� 0��");
		WhatPanel = new JPanel(new  GridLayout(11,1,0,0));
		// ��panel����ءA����C�⬰�Ŧ�
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
		// �ϵ����T�w
		aWindow.setResizable(false);
		// ��ܵ���
		aWindow.setVisible(true);
	}

//�N�P�̼Ʀr�ƧǱĮ�w�ƧǪk�Ѥp�ܤj	
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
      	
// �P�_�O����P
      	public static void WhatCard(int[] getcard)	//�P�_�P��
      	{
		int [][] savecard = new int [5][14];
		int reg = 0;
		for (int i=0; i<5; i++)
			for (int j=0; j<14; j++)
				savecard[i][j] = 0;
      		for (int i=0; i<5; i++)	//�N�Ʀr�B������
		{		
			savecard[4][getcard[i]%13]++;
			savecard[getcard[i]/13][13]++;
			savecard[getcard[i]/13][getcard[i]%13]++;			
		}
		int count=0;
		boolean samepattern=false,Sequence=false,big=false;
		for(int i=0; i<5; i++) //�P�_��
			if ((getcard[1]%13)+i-1 == getcard[i]%13)
				count++;
		if (count == 4 && getcard[0]%13 == 0 && getcard[1]%13 == 9)
			big = true;
		if (count == 5)
			Sequence=true;
		for (int i=0; i<5; i++) //�P�_�P��
			if (savecard[i][13]==5)
				samepattern = true;
		for (int i=0;i<13;i++)	//�N�P�����K��B�T���B�@��B���P�ƧǡA�Į�w�ƧǪk		
			for (int j=i;j<14;j++)
				if (savecard[4][i]<savecard[4][j])
				{
       					int register = savecard[4][i];
       					savecard[4][i]= savecard[4][j];
       					savecard[4][j]= register;
      				}
      		//System.out.print("  " + "�P�լ�:");
		if (samepattern)//�L�X�P��
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "�P��");
			//System.out.print("�P��");
			reg = 6;
			if (big)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "�j��");
				//System.out.print("�j��");
				reg += 4;
			}
			else if (Sequence)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "��");
				//System.out.print("��");
				reg += 3;
			}	
		}
		else if (big)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "�j��");
			//System.out.print("�j��");
			reg = 5;
		}
		else if (Sequence)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "���l");
			//System.out.print("���l");
			reg = 4;
		}
		else if (savecard[4][0] == 4)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "�K��");
			//System.out.print("�K��");
			reg = 8;
		}
		else if (savecard[4][0] == 3)
			if (savecard[4][1] == 2)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "��Ī");
				//System.out.print("��Ī");
				reg = 7;
			}
			else
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "�T��");
				//System.out.print("�T��");
				reg = 3;
			}	
		else if (savecard[4][0] == 2)
			if (savecard[4][1] == 2)
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "�G��");
				//System.out.print("�G��");
				reg = 2;
			}
			else
			{
				getLabelText = WhatCardLabel.getText();
				WhatCardLabel.setText(getLabelText + "�@��");
				//System.out.print("�@��");
				reg = 1;
			}
		else if (savecard[4][0] == 1)
		{
			getLabelText = WhatCardLabel.getText();
			WhatCardLabel.setText(getLabelText + "���P");
			reg = 0;
		}
		Pa = reg;
		PaLabel.setText("�� " + reg + " ��");
      	}
}