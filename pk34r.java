//
//�W�١G PKCARD 							         
//�����G3.4 r
//�\��G13�i�ƥX�A�����[�v�[�J��j�p�A�����̨ΤƵP��
//�Ǹ��G9006086
//�m�W�G�G�߱j								    		      									   // 
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
		
		a=new int[53];		//52�i�P
		b=new int[16];		//��X�����i
		//
		x=new int[4];		//��3 �� group
		//
//		int xsort[] = {0,1,2,3};	//��3 �� group ����
		b1=new int[16];	//���
		b2=new int[16];	//�Ʀr	
		
		
		//��J52�i�P
		for (i=1 ; i<=52; i++)
			a[i]=i;
System.out.println("=== ���J 13 ===");
do{
		//�~�P
		for (j=1 ; j <=15 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]�O�Ȧs
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
	
		for (i=1 ; i <=15 ; i++)
		{	
		  	b[i]=a[i];		
		  	//��P
		  	b1[i]=(b[i]-1)/13;    // 0-3
		  	b2[i]=b[i]%13;        // 0-12
	 	}
	        calPK(1,15);
		 //�p��3��group�[�v 
	 	for (i=0;i<=2;i++)
	 	{
	 	x[i+1]=calPK(5*i+1,5*i+5);	
		show(5*i+1,5*i+5);
	 	//�H�[�v����Ʀ�
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
		   	{	//�H�s�եh�Ƨ�
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
						
		System.out.print("[Enter �~��][Ctrl-C ����]\n: ");
		System.in.read();		//���read�H�KŪ��[ENTER]
		System.in.read();		
		System.out.println();
}while (true);

	}
	


public static int calPK(int pkNumS,int pkNumE)  throws java.io.IOException,NumberFormatException
{
 int i,j;
 int pa,pb;
 int pc;
 

		//�̼Ʀr�ƧǤp->�j(��w��)
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
 	
//���		 
		 
		 pa=pb=0;
		 
		 for (i=pkNumS;i<=pkNumE;i++)
		 for (j=i+1;j<=pkNumE;j++)	
	         if (b2[i]==b2[j]) pb++;		//��l

		 for (i=pkNumS;i<=pkNumE-1;i++)
		 if (b2[i+1]==b2[i]+1)pa++;		//�s��
	
	   	 pc=0;
		 switch (pb)
		 {
		 	case 1:	pc=20;		//�@�F
		 		break;
		 	case 2:pc=40; 		//�R�F
		 		break;
		 	case 3:pc=60; 		//�T��
		 		break;
		 	case 4:pc=80;		//��Ī
		 		break;
		 	case 6:pc=120;		//�K�K
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
		     					
		     	pc=2000+b1[pkNumS-1+1]+b1[pkNumS-1+3];         //�P�ᶶ
		     				     //b1[pkNumS-1+3]�O�[�W��⪺�[�v
		     }	
		 else
		     {  
		 	if (pc==0) pc=70+b1[pkNumS-1+3];     //�P����
		 				    //b1[pkNumS-1+3]�O�[�W��⪺�[�v
		     }
		 }
	 
 return pc;	
}

public static String turnANS(int pc)  throws java.io.IOException,NumberFormatException
{
 
 		String pe;
		 pe="�S��";
		 switch (pc)
		 {	
		 	case 20:
		 		pe="���F";
		 		break;
		 	case 40:
		 		pe="�R�F";
		 		break;
			case 60:
		 		pe="�T��";
		 		break;		 	
		 	case 70:
		 	case 71:
		 	case 72:
		 	case 73:		 			 	
		 		pe="�P��";
		 		break;	 				
		 	case 80:
		 		pe="��Ī";
		 		break;		 	
		 	case 120:
		 		pe="�K�K";
		 		break;
		 	case 200:
		 		pe="��";
		 		break;
		 		
		 	case 2000:
		 	case 2001:
		 	case 2002:
		 	case 2003:
		 		pe="�P��j��";
		 		break;		 			 	
		 }			
 		return pe;	
}

public static void show(int pkNumS,int pkNumE)  throws java.io.IOException,NumberFormatException
{
//��ܵP��
 		
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