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
		a=new int[53];		//52�i�P
		b=new int[6];		//��X�����i
		b1=new int[6];		//���
		b2=new int[6];		//�Ʀr	
		cx=new char[6];	//���
		cy=new String[6];	//�Ʀr
		String pe;
		char cin;
		//��J52�i�P
		for (i=1 ; i <=52 ; i++)
		  	a[i]=i;
System.out.println("=== �����J ===");
do{
//		//�~�P
//		for (j=1 ; j <=5 ; j++)
//		{
//			swap=(int)(Math.random()*52+1);
//			a[0]=a[j];	//a[0]�O�Ȧs
//			a[j]=a[swap];
//			a[swap]=a[0];			
//		}		
		
		for (i=1 ; i <=5 ; i++)
		{	
		  	b[i]=a[i];		
		  	//��P
		  	b1[i]=(b[i]-1)/13;    //0-3
		  	b2[i]=b[i]%13;        //0-12
		  	//��P��ܦr��
		  	cx[i]=hex1[b1[i]];    //���
		  	cy[i]=hex2[b2[i]];    //�Ʀr 
	 	}
	//��ܵP��
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
	 	
	 	
		//�̼Ʀr�ƧǤp->�j
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
			
		//�ন�P��
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
	         if (b2[i]==b2[j]) pb++;		//��l
	         
	           
		 for (i=1;i<=4;i++)
		 if (b2[i]==b2[i+1]-1)pa++;		//��
//	System.out.println(pb+"��"+pa+"��");
	pe="�S��";
		 switch (pb)
		 {
		 	case 1:
		 		pe="���F";
		 		break;
		 	case 2:
		 		pe="�R�F";
		 		break;
		 	case 4:
		 		pe="��Ī";
		 		break;
		 }

		 switch (pa)
		 {
		 	case 3:
		 		if (b2[1]==0 && b2[5]==12) pe="��";
		 		break;
		 	case 4:
		 		pe="��";
		 		break;
		 }
		 if ((b1[1]==b1[2])==(b1[4]==b1[5]))
		 if (b1[3]==b1[4])
		 pe="�P��j"+pe;;
		 	
		 
		System.out.println(pe);
		System.out.print("[Enter �~��][Ctrl-C ����]\n: ");
		cin = (char)System.in.read();	//cin=Ū����L��J�r��
		System.in.read();	//Ū������r��
		System.out.println();


}while (true);
	}
}