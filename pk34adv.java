//
//�W�١G PKCARD 							         
//�����G3.4 Adv
//�\��G13�i�ƥX�A�����[�v�[�J��j�p�A�����̨ΤƵP��
//�Ǹ��G9006086
//�m�W�G�G�߱j								    		      									   // 
//

public class pk34adv
{	public static int[] b,b1,b2,c1,c2;
        static int[][] card=new int[5][53];
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a,x;
		//int [][] card;
		
		int i,j,k,l,m,n;
		int swap;
		int [] temp5;
		temp5=new int[6];
		//card=new int[5][53];
		a=new int[53];		//52�i�P
		b=new int[16];		//��X�����i
		//
		x=new int[4];		//��3 �� group
		//
//		int xsort[] = {0,1,2,3};	//��3 �� group ����
		
		b1=new int[16];	//���
		b2=new int[16];	//�Ʀr	
		c1=new int[16];	//���
		b2=new int[16];	//���
		
		
		//��J52�i�P
		for (i=1 ; i<=52; i++)
			a[i]=i;
			

		
System.out.println("=== ���J 13 ===");
do{


		for (j=0 ; j<=4; j++)
		for (k=0 ; k<=13; k++)
			card[j][k]=0;
		//�~�P
		for (j=1 ; j <=15 ; j++)
		{
			swap=(int)(Math.random()*52+1);
			a[0]=a[j];	//a[0]�O�Ȧs
			a[j]=a[swap];
			a[swap]=a[0];			
		}		
	
		for (i=1 ; i <=13 ; i++)
		{	
		  	b[i]=a[i];		
		  	//��P
		  	b1[i]=(b[i]-1)/13+1;    // 0-3
		  	b2[i]=b[i]%13+1;        // 0-12
		  	card[b1[i]][b2[i]]=1;
		  	card[b1[i]][0]++;
		  	card[0][b2[i]]++;	  	
	 	}
	 	card[4][6]=1; card[0][6]++;              
	 	card[4][7]=1; card[0][7]++;              
	 	card[4][8]=1; card[0][8]++;              
	 	card[4][9]=1; card[0][9]++;              
	 	card[4][10]=1;card[0][10]++;             
	 	card[4][0]=6;	 
	 	show(); 		 	
               int s1=0;
               //show();
	       System.out.println("-----------");    
		for (i=4;i>=1;i--)
	{ 
	 	if (card[i][0]<5) continue;
		for (j=13;j>=1;j--)
	{	
		        if(card[i][j]==0)
			  s1=0;
			else
			  s1++;		   
		if (s1==5) 
		  for (k=1;k<=5;k++)
		    {
		      temp5[k]=(i-1)*13+(j-1+k);  
		      card[i][j-1+k]=0;
		      card[0][j-1+k]--;
		      card[i][0]--;
		    }
		 
		 	
     	}
	}
		for (l=1;l<=5;l++)
		System.out.print(temp5[l]+" ");
		  System.out.println("-------�ⶶ-"+card[0][10]);				
         	show();       	
	       
      
	       	       	       
		System.out.print("[Enter �~��][Ctrl-C ����]\n: ");
		System.in.read();		//���read�H�KŪ��[ENTER]
		System.in.read();		
		System.out.println();
  } while (true);
}
static boolean show()  
	{

 		int i,j;
 		
		for (i=0;i<=4;i++)
		{
		for (j=0;j<=13;j++)
		System.out.print(card[i][j]+" ");
		System.out.println();
        	
        	}    	
return true ;
	}



}