public class J1A2B
{
	public static void main(String[] args) throws java.io.IOException
	{	int a,b,c,d;
		 a = (int)(Math.random()*9+1);	//a=亂數
		//java.io.BufferedReader keyin;
		//keyin = new java.io.BufferedReader(
		//	new java.io.InputStreamReader(System.in));
		//System.out.print("請輸入整數: ");
		//int iNum = Integer.parseInt(keyin.readLine());
		//System.out.println("輸入的整數: " + iNum);
		//nt i,j=1;
		//for (i=1 ; i <=iNum ; i++)
			//j*=i;
		System.out.print("= " + a);
		do{
	     	    b = (int)(Math.random()*9);	//a=亂數
		}
		while( b==a);	
		System.out.print(b);
		
		do{
	     	    c = (int)(Math.random()*9);	//a=亂數
		}
		while( c==a || c==b );	
		System.out.print(c);
		
		do{
	     	    d = (int)(Math.random()*9);	//a=亂數
		}
		while( d==a || d==b || d==c);	
		System.out.print(d);
		int x,y,z,r,aa=0,bb=0;
		//a=9;
		x=1;
		y=2;
		z=3;
		r=4;
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
		   
		System.out.print("\n"+aa+"A"+bb+"B");
		
		
	}
}