public class threein1b2

{
	public static void main(String[] args) throws java.io.IOException,NumberFormatException
	{	
		int sl;
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));	
		do{
		re:try{
		  System.out.println("+-Ver.b-----------+");
		  System.out.println("+-----------------+");
		  System.out.println("(1)6������        ");
		  System.out.println("(2)��N!  		");
		  System.out.println("(3)?A?B�q�Ʀr�C�� ");
		  System.out.println("(0)EXIT		");
		  System.out.println("+-----------------+");
		  System.out.print("�п�J(0-3):");
		  
		 sl = Integer.parseInt(keyin.readLine());
		 }catch(NumberFormatException e){
		      sl=999;
		      System.out.println("!!!!�п�J0-3!!!!");
		      break re;
		}
		 System.out.println("");
		  if (sl==1)	  
		       threein1b2.six(); 
		     else if(sl==2)
		       threein1b2.n();
		     else if(sl==3)
		       threein1b2.ab();
		}while(sl!=0);
		    

		
	
	
  
     	
   
     
 }


public static void n()  throws java.io.IOException,NumberFormatException
{System.out.println("(2)n!");
	
java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		long iNum;
		do{
		System.out.print("�п�J���(0����): ");
		iNum = Integer.parseInt(keyin.readLine());
		long i,j=1;
		for (i=1 ; i <=iNum ; i++)
			j*=i;
		System.out.println(iNum + "!= " + j);	
	        }while(iNum!=0);
}

public static void six()  throws java.io.IOException,NumberFormatException
{  System.out.println("(1)6������");
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int iNum;
		
		do{	
		System.out.print("�п�J���(0����): ");
		iNum = Integer.parseInt(keyin.readLine());
	
		if (iNum % 6 == 0)	//�YiNum�O6������
			System.out.println(iNum + " �O 6 ������");
		else	//�YiNum�O6������
			System.out.println(iNum + " ���O 6 ������");	
		}while(iNum!=0);
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
	System.out.println("(3)?A?B�q�Ʀr�C��");		
	do{
	
		a=b=c=d=iNum=i=count=0;
		ax=bx=cx=x=y=z=r=aa=bb=0;
		
		do{
		ans=(int)(Math.random()*9000+1000);
		ax=ans;
		for (i=1;i<=4;i++)
		{
		 cx=ax%10;		
		 ax=ax/10;		
		 if (i==1)
		 	d=cx;
		 else if (i==2)
		 	c=cx;
		 else if (i==3)
		 	b=cx;
		 else if (i==4)
		 	a=cx;	 	
		}
	        }while(b==a || c==a || c==b||d==a || d==b || d==c);
	     

		 System.out.println(ans);
	do
	{      	
		count++;
		aa=bb=0;
		System.out.println("===��"+count+"�^===");
		
		guess="0000";
		redo:try{			
		   System.out.print("�вq4���:");
		   guess=keyin.readLine();
		   iNum = Integer.parseInt(guess);
		}catch(NumberFormatException e){
		      System.out.println("!!!!���Y�O�å�!!!");
		      break redo;
		}
		
		//�H�U�O���X�ϥΪ̿�J���ƨ� x y z r
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
		
		
		//���{��
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
	   
		System.out.println("[����] "+aa+"A"+bb+"B");
		
	
	 }while ((aa!=4) && (count<10));
	  if (aa==4){
	  	 
	  	switch (count)
	  	      {case 1:
	  	      	System.out.println("�@�o�N���I�A�i�H�hñ�ֳz�F!!");
	  	      	break;
	  	       case 2:
	  	       case 3:
	  	       case 4:
	  	        System.out.print("��A���I");
	  	        break;
	  	       case 5:
	  	       case 6:
	  	       case 7:
	  	       case 8:
	  	       case 9:
	  	       case 10:
	  	        System.out.print("�٤����I");
	  	        break;
	  	      }
	  	System.out.println("���״N�O�G" +a+b+c+d);
	 } else{
	  	System.out.println("�շ��I�i�D�A�]�p�^���׬O�G" +a+b+c+d);
	 	}
	  
		System.out.print("�A���@����(Y/N)?");
	
        yn = (char)System.in.read();	//yn=Ū����L��J�r��
	System.in.read();	//Ū������r��
	System.in.read();	//Ū���^�Цr��
	
       }while(yn=='y' || yn=='Y');				
}



}