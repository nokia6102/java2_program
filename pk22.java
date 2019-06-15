public class pk22
{
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
		String seri[] ={"None","None","None","None","順"};
		char[] cx;
		String[] cy;
		int i,j,k;
		int swap,pa,pb,pc;
		a=new int[53];		//52張牌
		b=new int[6];		//抽出的五張
		b1=new int[6];		//花色
		b2=new int[6];		//數字	
		cx=new char[6];		//花色字元
		cy=new String[6];	//數字字串
		String pe;
		//放入52張牌
		for (i=1 ; i <=52 ; i++)
			a[i]=i;
System.out.println("=== 金撲克 ===");
do{
		//洗牌
		for (j=1 ; j <=5 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]是暫存
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
		
		for (i=1 ; i <=5 ; i++)
		{	
		  	b[i]=a[i];		
		  	//算牌
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;        //0-12
		  	//算牌顯示字元
		  	cx[i]=hex1[b1[i]];    //花色
		  	cy[i]=hex2[b2[i]];    //數字 
	 	}

////		//同花測試	
//	 	 b1[1]=0;
//		 b1[2]=0;
//		 b1[3]=0;
//		 b1[4]=0;
//		 b1[5]=0;
//		//A 10 J Q K測試	
//	 	 b2[1]=0;
//		 b2[2]=9;
//		 b2[3]=10;
//		 b2[4]=11;
//		 b2[5]=12;

////		//葫蘆測試	
//	 	 b2[1]=2;
//		 b2[2]=2;
//		 b2[3]=3;
//		 b2[4]=3;
//		 b2[5]=3;

//////		//鐵枝測試	
//	 	 b2[1]=4;
//		 b2[2]=1;
//		 b2[3]=4;
//		 b2[4]=4;
//		 b2[5]=4;		 	 	
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
			
		//轉成牌面
		 for (i=1;i<=5;i++)
		 {
			cx[i]=hex1[b1[i]];
		  	cy[i]=hex2[b2[i]];
		 }
//顯示牌組		 
 for (i=1; i<=5; i++)
	System.out.print("+--+ ");
 	System.out.println();
 for (i=1; i<=5; i++)	
 	System.out.print("|"+cx[i]+" | ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("|"+cy[i]+"| ");
 	System.out.println();
 for (i=1; i<=5; i++)
 	System.out.print("+--+ ");
 	System.out.println();
 	
//比對
		 pa=pb=pc=0;
		 
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//對子
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//連續 
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//同花 
		 
	System.out.println(pb+"對"+pa+"連"+pc+"花");
	pe="沒有";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) pe="同花"+pe;
		 	
		 
		System.out.println(pe);
		System.out.print("[Enter 繼續][Ctrl-C 結束]\n: ");
		System.in.read();	//cin=讀取鍵盤輸入字元
		System.in.read();	//讀取跳行字元
		System.out.println();
}while (true);

	}
}

