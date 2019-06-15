public class pk21
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,b,b1,b2;
		char hex1[] = {'\3', '\4', '\5', '\6'};
		String hex2[] = {" A", " 2", " 3", " 4", " 5",
			      " 6", " 7", " 8", " 9", "10", " J",
			      " Q", " K"};
		char[] cx;
		String[] cy;
		int i,j,iNum;
		int swap;
		int pa,pb;
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
System.out.println("=== 金撲克 ===");
do{
//		//洗牌
//		for (j=1 ; j <=5 ; j++)
//		{
//			swap=(int)(Math.random()*52+1);
//			a[0]=a[j];	//a[0]是暫存
//			a[j]=a[swap];
//			a[swap]=a[0];			
//		}		
		
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
	//顯示牌面
// for (i=1; i<=5; i++)
// 	System.out.print("+--+ ");
// 	System.out.println();
// for (i=1; i<=5; i++)	
// 	System.out.print("|"+cx[i]+" | ");
// 	System.out.println();
// for (i=1; i<=5; i++)
// 	System.out.print("|"+cy[i]+"| ");
// 	System.out.println();
// for (i=1; i<=5; i++)
// 	System.out.print("+--+ ");
// 	System.out.println();
 	
		      
//	System.out.println(cx[5]+" "+cx[4]+" "+cx[3]+" "+cx[2]+" "+cx[1]);	
//	System.out.println(cy[5]+" "+cy[4]+" "+cy[3]+" "+cy[2]+" "+cy[1]);			 	
	 	
	 	
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
 	
		 pa=pb=0;
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//對子
	         
	           
		 for (i=1;i<=4;i++)
		 if (b2[i]==b2[i+1]-1)pa++;		//順
//	System.out.println(pb+"對"+pa+"順");
	pe="沒有";
		 switch (pb)
		 {
		 	case 1:
		 		pe="薏胚";
		 		break;
		 	case 2:
		 		pe="吐胚";
		 		break;
		 	case 4:
		 		pe="葫蘆";
		 		break;
		 }

		 switch (pa)
		 {
		 	case 3:
		 		if (b2[1]==0 && b2[5]==12) pe="順";
		 		break;
		 	case 4:
		 		pe="順";
		 		break;
		 }
		 if ((b1[1]==b1[2])==(b1[4]==b1[5]))
		 if (b1[3]==b1[4])
		 pe="同花大"+pe;;
		 	
		 
		System.out.println(pe);
		System.out.print("[Enter 繼續][Ctrl-C 結束]\n: ");
		cin = (char)System.in.read();	//cin=讀取鍵盤輸入字元
		System.in.read();	//讀取跳行字元
		System.out.println();


}while (true);
	}
}