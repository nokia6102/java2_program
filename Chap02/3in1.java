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
		
		a = (int)(Math.random()*9+1);	//a=�ü�
		
		do{
	     	    b = (int)(Math.random()*9);	//b=�ü�
		}
		while( b==a);	
				
		do{
	     	    c = (int)(Math.random()*9);	//c=�ü�
		}
		while( c==a || c==b );	
				
		do{
	     	    d = (int)(Math.random()*9);	//d=�ü�
		}
		while( d==a || d==b || d==c);	
		// System.out.print("ans:"+a+b+c+d);	
		
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
	  	        System.out.print("�Ӥ����I");
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
       System.out.print("�H�a�����F~~~");
 }
 
}