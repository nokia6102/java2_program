public class pk22
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,b,b1,b2;
		char hex1[] = {3, 4, 5, 6};
		String hex2[] = {" A", " 2", " 3", " 4", " 5",
			      " 6", " 7", " 8", " 9", "10", " J",
			      " Q", " K"};
		String pair[] ={"�S��","�@�F","�R�F","�T��","��Ī","�K�K"};
		String seri[] ={"None","None","None","None","��"};
		char[] cx;
		String[] cy;
		int i,j,k;
		int swap,pa,pb,pc;
		a=new int[53];		//52�i�P
		b=new int[6];		//��X�����i
		b1=new int[6];		//���
		b2=new int[6];		//�Ʀr	
		cx=new char[6];		//���r��
		cy=new String[6];	//�Ʀr�r��
		String pe;
		//��J52�i�P
		for (i=1 ; i <=52 ; i++)
			a[i]=i;
System.out.println("=== �����J ===");
do{
		//�~�P
		for (j=1 ; j <=5 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]�O�Ȧs
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
		
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

////		//�P�����	
//	 	 b1[1]=0;
//		 b1[2]=0;
//		 b1[3]=0;
//		 b1[4]=0;
//		 b1[5]=0;
//		//A 10 J Q K����	
//	 	 b2[1]=0;
//		 b2[2]=9;
//		 b2[3]=10;
//		 b2[4]=11;
//		 b2[5]=12;

////		//��Ī����	
//	 	 b2[1]=2;
//		 b2[2]=2;
//		 b2[3]=3;
//		 b2[4]=3;
//		 b2[5]=3;

//////		//�K�K����	
//	 	 b2[1]=4;
//		 b2[2]=1;
//		 b2[3]=4;
//		 b2[4]=4;
//		 b2[5]=4;		 	 	
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
//��ܵP��		 
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
 	
//���
		 pa=pb=pc=0;
		 
		 for (i=1;i<=5;i++)
		 for (j=i+1;j<=5;j++)		  
	         if (b2[i]==b2[j]) pb++;		//��l
	         	           
		 for (i=1;i<=4;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//�s�� 
		 
		 for (k=1;k<=4;k++)
		 if (b1[k+1]==b1[k])pc++;		//�P�� 
		 
	System.out.println(pb+"��"+pa+"�s"+pc+"��");
	pe="�S��";
	pe=pair[pb];
	if (b2[1]==0 && b2[2]==9) pa++;
	if (pe==pair[0])pe=seri[pa];
	if (pc==4 && pa==4) pe="�P��"+pe;
		 	
		 
		System.out.println(pe);
		System.out.print("[Enter �~��][Ctrl-C ����]\n: ");
		System.in.read();	//cin=Ū����L��J�r��
		System.in.read();	//Ū������r��
		System.out.println();
}while (true);

	}
}
