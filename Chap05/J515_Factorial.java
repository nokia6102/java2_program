// 儲存檔名：d:\Chap05\J515_Factorial.java

class J515_Recursion	//J515_Recursion類別
{
	int factorial(int n)
	{
		if(n > 1)
			return n * factorial(n-1);	//遞回呼叫factorial
		else
			return 1;	//結束遞回呼叫
	}
}

public class J515_Factorial
{
	public static void main(String[] args)
	{
		J515_Recursion r = new J515_Recursion();	//建立J515_Recursion物件
		System.out.println("4! = " + r.factorial(4));	//呼叫factorial方法
		System.out.println("5! = " + r.factorial(5));	//呼叫factorial方法
		System.out.println("6! = " + r.factorial(6));	//呼叫factorial方法
	}
}