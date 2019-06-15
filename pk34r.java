//
//名稱： PKCARD 							         
//版本：3.4 r
//功能：13張排出，順花色加權加入比大小，但未最佳化牌組
//學號：9006086
//姓名：鄭立強								    		      									   // 
//

public class pk34r
{	public static int[] b,b1,b2;
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,x;
		
		int i,j,k,l,m,n;
		int swap;
		
		a=new int[53];		//52張牌
		b=new int[16];		//抽出的五張
		//
		x=new int[4];		//分3 個 group
		//
//		int xsort[] = {0,1,2,3};	//分3 個 group 順序
		b1=new int[16];	//花色
		b2=new int[16];	//數字	
		
		
		//放入52張牌
		for (i=1 ; i<=52; i++)
			a[i]=i;
System.out.println("=== 撲克 13 ===");
do{
		//洗牌
		for (j=1 ; j <=15 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]是暫存
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
	
		for (i=1 ; i <=15 ; i++)
		{	
		  	b[i]=a[i];		
		  	//算牌
		  	b1[i]=(b[i]-1)/13;    // 0-3
		  	b2[i]=b[i]%13;        // 0-12
	 	}
	        calPK(1,15);
		 //計算3個group加權 
	 	for (i=0;i<=2;i++)
	 	{
	 	x[i+1]=calPK(5*i+1,5*i+5);	
		show(5*i+1,5*i+5);
	 	//以加權算分排色
	 	System.out.println(turnANS(x[i+1])+"="+x[i+1]);		
		}
		System.out.println(x[1]+":"+x[2]+":"+x[3]);		
		for (i=1;i<3;i++)
		for (j=i+1;j<=3;j++)
			if (x[i]>x[j])
			{
			x[0]=x[i];
			x[i]=x[j];
			x[j]=x[0];
		 	for (m=1;m<=5;m++)
		   	{	//以群組去排序
		   		k=(j-1)*5+m;
		   		l=(i-1)*5+m;
				b1[0]=b1[k];
				b2[0]=b2[k];
				b1[k]=b1[l];
				b2[k]=b2[l];
				b1[l]=b1[0];
		 		b2[l]=b2[0];
		   	}
			}
	 	System.out.println(x[1]+":"+x[2]+":"+x[3]);	
				
		show(3,15);
						
		System.out.print("[Enter 繼續][Ctrl-C 結束]\n: ");
		System.in.read();		//兩個read以便讀取[ENTER]
		System.in.read();		
		System.out.println();
}while (true);

	}
	


public static int calPK(int pkNumS,int pkNumE)  throws java.io.IOException,NumberFormatException
{
 int i,j;
 int pa,pb;
 int pc;
 

		//依數字排序小->大(氣泡式)
		for (i=pkNumS;i<=pkNumE;i++)
		for (j=i+1;j<=pkNumE;j++)
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
		 
		 pa=pb=0;
		 
		 for (i=pkNumS;i<=pkNumE;i++)
		 for (j=i+1;j<=pkNumE;j++)	
	         if (b2[i]==b2[j]) pb++;		//對子

		 for (i=pkNumS;i<=pkNumE-1;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//連續
	
	   	 pc=0;
		 switch (pb)
		 {
		 	case 1:	pc=20;		//一胚
		 		break;
		 	case 2:pc=40; 		//吐胚
		 		break;
		 	case 3:pc=60; 		//三條
		 		break;
		 	case 4:pc=80;		//葫蘆
		 		break;
		 	case 6:pc=120;		//鐵枝
		 		break;
		 }

		 switch (pa)
		 {
		 	case 3:	if (b2[pkNumS-1+1]==0 && b2[pkNumS-1+5]==12) pc=200;
		 		break;
		 	case 4:	pc=200;
		 		break;
		 }

		 if (pa==4 || (pa==3 && b2[pkNumS-1+1]==0 && b2[pkNumS-1+5]==12))
		 {
		   if (b1[pkNumS-1+1]==b1[pkNumS-1+2] && b1[pkNumS-1+2]==b1[pkNumS-1+3] && b1[pkNumS-1+3]==b1[pkNumS-1+4] && b1[pkNumS-1+4]==b1[pkNumS-1+5])
		     {	
		     					
		     	pc=2000+b1[pkNumS-1+1]+b1[pkNumS-1+3];         //同花順
		     				     //b1[pkNumS-1+3]是加上花色的加權
		     }	
		 else
		     {  
		 	if (pc==0) pc=70+b1[pkNumS-1+3];     //同花雜
		 				    //b1[pkNumS-1+3]是加上花色的加權
		     }
		 }
	 
 return pc;	
}

public static String turnANS(int pc)  throws java.io.IOException,NumberFormatException
{
 
 		String pe;
		 pe="沒有";
		 switch (pc)
		 {	
		 	case 20:
		 		pe="薏胚";
		 		break;
		 	case 40:
		 		pe="吐胚";
		 		break;
			case 60:
		 		pe="三條";
		 		break;		 	
		 	case 70:
		 	case 71:
		 	case 72:
		 	case 73:		 			 	
		 		pe="同花";
		 		break;	 				
		 	case 80:
		 		pe="葫蘆";
		 		break;		 	
		 	case 120:
		 		pe="鐵枝";
		 		break;
		 	case 200:
		 		pe="順";
		 		break;
		 		
		 	case 2000:
		 	case 2001:
		 	case 2002:
		 	case 2003:
		 		pe="同花大順";
		 		break;		 			 	
		 }			
 		return pe;	
}

public static void show(int pkNumS,int pkNumE)  throws java.io.IOException,NumberFormatException
{
//顯示牌組
 		
		char hex1[] = {6, 3, 4, 5};
		String hex2[] = {" A", " 2", " 3", " 4", " 5",
			      " 6", " 7", " 8", " 9", "10", " J",
			      " Q", " K"};
int i;			      
 for (i=pkNumS;i<=pkNumE;i++)
	System.out.print("+--+ ");
 	System.out.println();
 for (i=pkNumS;i<=pkNumE;i++)
 	System.out.print("|"+hex1[b1[i]]+" | ");
 	System.out.println();
 for (i=pkNumS;i<=pkNumE;i++)
 	System.out.print("|"+hex2[b2[i]]+"| ");
 	System.out.println();
 for (i=pkNumS;i<=pkNumE;i++)
 	System.out.print("+--+ ");
 	System.out.println();
}


}