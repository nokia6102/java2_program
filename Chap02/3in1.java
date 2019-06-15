public class 3in1
{
	public static void main(String[] args) throws java.io.IOException,NumberFormatException
	{	int a=0,b=0,c=0,d=0,iNum=0,i=0,count=0;
		int ax=0,bx=0,cx=0;
		int x=0,y=0,z=0,r=0,aa=0,bb=0;
		char yn;
		String guess;
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
	do{
	
		a=b=c=d=iNum=i=count=0;
		ax=bx=cx=x=y=z=r=aa=bb=0;
		
		a = (int)(Math.random()*9+1);	//a=亂數
		
		do{
	     	    b = (int)(Math.random()*9);	//b=亂數
		}
		while( b==a);	
				
		do{
	     	    c = (int)(Math.random()*9);	//c=亂數
		}
		while( c==a || c==b );	
				
		do{
	     	    d = (int)(Math.random()*9);	//d=亂數
		}
		while( d==a || d==b || d==c);	
		// System.out.print("ans:"+a+b+c+d);	
		
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
		ax=iNum;
		for (i=1;i<=4;i++)
		{
		 cx=ax%10;		
		 ax=ax/10;		
		 if (i==1)
		 	r=cx;
		 else if (i==2)
		 	z=cx;
		 else if (i==3)
		 	y=cx;
		 else if (i==4)
		 	x=cx;	 	
		}
		
		
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
	  	        System.out.print("該不錯！");
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
       System.out.print("人家不玩了~~~");
 }
 
}