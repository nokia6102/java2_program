//5張牌
//pk 2.0 sp
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//				請字串&變數改一改再交ok
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//2002/5/9 08:14下午
//

public class pk20sp
{
	public static void main(String[] args) throws java.io.IOException
	{	
	 	java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,b,b1,b2;
		char hex1[] = {'\3', '\4', '\5', '\6'};
		String hex2[] = {"A", "2", "3", "4", "5",
			      "6", "7", "8", "9", "10", "J",
			      "Q", "K"};
		String pair[] ={"None","1PAIR","2PAIR","3條","2-3","鐵技"};
		String seri[] ={"None","None","None","None","順"};
		char[] cx;
		String[] cy;
		int i,j,k,iNum;
		int sla,slb;
		int pa,pb,pc;
		a=new int[53];		//52張牌
		b=new int[6];		//抽出的五張
		b1=new int[6];		//花色
		b2=new int[6];		//數字	
		cx=new char[6];	//花色
		cy=new String[6];	//數字
		String pe;
		char cin;
		//放入52張牌
		for (i=1 ; i <=52 ; i++)
		  	a[i]=i;
System.out.println(" 金 撲 克 ");
System.out.println("~~~~~~~~~~~~~~~");

		//洗牌
		for (j=1 ; j <=5 ; j++)
		{
			slb=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]是暫存
			a[j]=a[slb];
			a[slb]=a[0];			
		}		
		
		
		

		for (i=1 ; i <=5 ; i++)
		{	
		  	b[i]=a[i];		
		  	//算牌
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;        //0-12
		  	//算牌顯示字元
		  	cx[i]=hex1[b1[i]];
		  	cy[i]=hex2[b2[i]]; 
	 	}
	 	
	 	
	 	
	 			//		//A 10 J Q K測試	
//	 	 b2[1]=0;
//		 b2[2]=9;
//		 b2[3]=10;
//		 b2[4]=11;
//		 b2[5]=12;
//		 		for (i=1 ; i <=5 ; i++)
//		{	
//	
//		  	cx[i]=hex1[b1[i]];
//		  	cy[i]=hex2[b2[i]]; 
//	 	}
	//顯示牌面
//	System.out.println(b[5]+" "+b[4]+" "+b[3]+" "+b[2]+" "+b[1]);
	System.out.println(cx[1]+" "+cx[2]+" "+cx[3]+" "+cx[4]+" "+cx[5]);	
	System.out.println(cy[1]+" "+cy[2]+" "+cy[3]+" "+cy[4]+" "+cy[5]);			 	
	 	
	 	
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
		 
		 pa=pb=pc=0;
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//對子
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//連續
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//同花 
		 
	System.out.println(pb+"對"+pa+"連"+pc+"花");
	// 使用陣列對應結果
	pe="沒有";
	pe=pair[pb];
	if (b2[1]==0 && b2[5]==12) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) pe="同花"+pe;
	
		 System.out.println(pe);

	}
}