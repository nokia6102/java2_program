

public class pop
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		int [] a;
		int i;
		a=new int[5];
		int iNum;
		
		for (i=1 ; i <=5 ; i++)
		{
			System.out.print("請輸入整數"+i+":");
			iNum = Integer.parseInt(keyin.readLine());
			a[i]=iNum;
		}
		
			
			System.out.print(a[5]+" "+a[4]+" "+a[3]+" "+a[2]+" "+a[1]);
		
		
			
			
	}
}
