

public class HW3
{
	public static void main(String[] args) throws java.io.IOException
	{
		int a,b,c,d,temp,num1,num2,num3,num4,counta = 0,countb = 0,i;
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("請輸入所要猜的數字(第1位整數): ");
		num1 = Integer.parseInt(keyin.readLine());
		System.out.print("請輸入所要猜的數字(第2位整數): ");
		num2 = Integer.parseInt(keyin.readLine());
		System.out.print("請輸入所要猜的數字(第3位整數): ");
		num3 = Integer.parseInt(keyin.readLine());
		System.out.print("請輸入所要猜的數字(第4位整數): ");
		num4 = Integer.parseInt(keyin.readLine());
		a = (int)Math.random() * 9 + 1; 
		b = (int)Math.random() * 10 ;
		while (b == a)
		{
		b = (int)Math.random() * 10 ;
		}
		c = (int)Math.random() * 10 ;
		while (c == a || c == b)
		{
		c = (int)Math.random() * 10 ;
		}
		
		d = (int)Math.random() * 10 ;
		while (d == a || d == b || d == c)
		{d = (int)Math.random() * 10 ;}
		if (inum != 0)
		{		
		if (num4 == a) 
		counta ++;
		if (num4 == a || num4 == b || num4 == c)
		countb ++;
		if (num3 == c) 
		counta ++;
		if (num3 == a || num3 == b || num3 == d)
		countb ++;
		if (num2 == b) 
		counta ++;
		if (num2 == a || num2 == d || num2 == c)
		countb ++;
		if (num1 == a) 
		counta ++;
		if (num1 == d || num1 == b || num1 == c)
		countb ++;
		System.out.println(counta + "A" + countb + "b" );						


		}
		else
		System.out.println("答案是" + a + b + c + d );
	}
	
	
	
}
