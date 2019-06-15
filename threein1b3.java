public class threein1b3{


	public static void main(String[] args) throws java.io.IOException,NumberFormatException
	{	
		int sl;
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));	
		do{
		re:try{
		  System.out.println("+-Ver.b3-----------+");
		  System.out.println("+-----------------+");
		  System.out.println("(1)6的倍數        ");
		  System.out.println("(2)算N!  		");
		  System.out.println("(3)?A?B猜數字遊戲 ");
		  System.out.println("(0)EXIT		");
		  System.out.println("+-----------------+");
		  System.out.print("請輸入(0-3):");
		  
		 sl = Integer.parseInt(keyin.readLine());
		 }catch(NumberFormatException e){
		      sl=999;
		      System.out.println("!!!!請輸入0-3!!!!");
		      break re;
		}
		 System.out.println("");
		  if (sl==1)	  
		       six(); 
		     else if(sl==2)
		       n();
		     else if(sl==3)
		       ab();
		}while(sl!=0);
		    

		
	
	
  
     	
   
     
 }


public static void n()  throws java.io.IOException,NumberFormatException
{System.out.println("(2)n!");
	
java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		long iNum;
		do{
		System.out.print("請輸入整數(0結束): ");
		iNum = Integer.parseInt(keyin.readLine());
		long i,j=1;
		for (i=1 ; i <=iNum ; i++)
			j*=i;
		System.out.println(iNum + "!= " + j);	
	        }while(iNum!=0);
}

public static void six()  throws java.io.IOException,NumberFormatException
{  System.out.println("(1)6的倍數");
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int iNum;
		
		do{	
		System.out.print("請輸入整數(0結束): ");
		iNum = Integer.parseInt(keyin.readLine());
	
		if (iNum % 6 == 0)	//若iNum是6的倍數
			System.out.println(iNum + " 是 6 的倍數");
		else	//若iNum是6的倍數
			System.out.println(iNum + " 不是 6 的倍數");	
		}while(iNum!=0);
}

//取每一位數的程式

public static int retNum(int num,int n)  throws java.io.IOException,NumberFormatException
{int ax,cx,i;
 int dx=0;
		ax=num;
		for (i=1;i<=n;i++)
		{
		 cx=ax%10;		
		 ax=ax/10;		
	         dx=cx;		  	
		}	
		//System.out.println("test point");
		return (dx);
}
public static void ab()  throws java.io.IOException,NumberFormatException
{
int a=0,b=0,c=0,d=0,iNum=0,i=0,count=0;
		int ax=0,bx=0,cx=0,ans=0;
		int x=0,y=0,z=0,r=0,aa=0,bb=0;
		char yn;
		String guess;
	
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
	System.out.println("(3)?A?B猜數字遊戲");		
	do{
	
		a=b=c=d=iNum=i=count=0;
		ax=bx=cx=x=y=z=r=aa=bb=0;
		
		do{
			ans=(int)(Math.random()*9000+1000);
			a=retNum(ans,4);
			b=retNum(ans,3);
			c=retNum(ans,2);
			d=retNum(ans,1);
	        }while(b==a || c==a || c==b||d==a || d==b || d==c);
	     

//		 System.out.println(ans);
	do
	{      	
		count++;
		aa=bb=0;
		System.out.println("===第"+count+"回===");
		
		guess="0000";
		redo:try{			
		   System.out.print("請猜4位數:");
		   guess=keyin.readLine();
		   iNum = Integer.parseInt(guess);
		}catch(NumberFormatException e){
		      System.out.println("!!!!豬頭別亂打!!!");
		      break redo;
		}
		
		//以下是取出使用者輸入的數到 x y z r
		
		
			x=retNum(iNum,4);
			y=retNum(iNum,3);
			z=retNum(iNum,2);
			r=retNum(iNum,1);

		//比對程式
		if (x==a)
		   aa++;
		else if (x==b || x==c || x==d)
		   bb++;
		   
		if (y==b)
		   aa++;
		else if (y==a || y==c || y==d)
		   bb++;
		
		if (z==c)
		   aa++;
		else if (z==a || z==b || z==d)
		   bb++;
		
		if (r==d)
		   aa++;
		else if (r==a || r==b || r==c)
		   bb++;         
	   
		System.out.println("[提示] "+aa+"A"+bb+"B");
		
	
	 }while ((aa!=4) && (count<10));
	  if (aa==4){
	  	 
	  	switch (count)
	  	      {case 1:
	  	      	System.out.println("一發就中！你可以去簽樂透了!!");
	  	      	break;
	  	       case 2:
	  	       case 3:
	  	       case 4:
	  	        System.out.print("算你狠！");
	  	        break;
	  	       case 5:
	  	       case 6:
	  	       case 7:
	  	       case 8:
	  	       case 9:
	  	       case 10:
	  	        System.out.print("還不錯！");
	  	        break;
	  	      }
	  	System.out.println("答案就是：" +a+b+c+d);
	 } else{
	  	System.out.println("白痴！告訴你（妳）答案是：" +a+b+c+d);
	 	}
	  
		System.out.print("再玩一次嗎(Y/N)?");
	
        yn = (char)System.in.read();	//yn=讀取鍵盤輸入字元
	System.in.read();	//讀取跳行字元
	System.in.read();	//讀取回覆字元
	
       }while(yn=='y' || yn=='Y');				
}



}