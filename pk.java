public class pk
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,b,b1,b2;


		String[] cx,cy;
		int i,j,c,iNum;
		int sla,slb;
		a=new int[53];
		b=new int[6];
		b1=new int[6];
		b2=new int[6];
		cx=new String[6];
		cy=new String[6];


		for (i=1 ; i <=52 ; i++)
		{
		  	a[i]=i;
		}
		for (j=1 ; j <=5 ; j++)
		{
//		 	sla=(int)(Math.random()*52+1);
			slb=(int)(Math.random()*52+1);
			a[0]=a[j];
			a[j]=a[slb];
			a[slb]=a[0];
			
			
		}		
		
		for (i=1 ; i <=5 ; i++)
		{	
//			c=(int)(Math.random()*52+1);
		  	b[i]=a[i];
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;    //0-12
		  	switch (b1[i])
		  	{
		  		case 0:cx[i]="\3";break;
		  		case 1:cx[i]="\4";break;
		  		case 2:cx[i]="\5";break;
		  		case 3:cx[i]="\6";break;
			}
			
				switch (b2[i])
		  	{
		  		case 0:cy[i]="K";break;
		  		case 1:cy[i]="A";break;
		  		case 2:cy[i]="2";break;
		  		case 3:cy[i]="3";break;
		  		case 4:cy[i]="4";break;
		  		case 5:cy[i]="5";break;
		  		case 6:cy[i]="6";break;
		  		case 7:cy[i]="7";break;
		  		case 8:cy[i]="8";break;
		  		case 9:cy[i]="9";break;
		  		case 10:cy[i]="J";break;
		  		case 11:cy[i]="Q";break;
		  		case 12:cy[i]="K";break;
			}
//		  	cx[i]=c1[b1[i]];
//		  	cy[i]=c2[b2[i]];
		  	
		}
		
		
	System.out.println("\3\4\5\6");		
	System.out.println(b[5]+" "+b[4]+" "+b[3]+" "+b[2]+" "+b[1]);
	System.out.println(cx[5]+" "+cx[4]+" "+cx[3]+" "+cx[2]+" "+cx[1]);	
	System.out.println(cy[5]+" "+cy[4]+" "+cy[3]+" "+cy[2]+" "+cy[1]);		
	
	
	}
}