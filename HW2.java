
public class HW2
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("請輸入階乘數(正整數): ");
		int iNum = Integer.parseInt(keyin.readLine());
		if (iNum > 0)
		System.out.println(iNum + "的階乘為" + pand(iNum) );						else
		System.out.println("來鬧的喔...叫你輸入正整數不是嗎!");
	}
	static int pand(int p)
	{
	int sum = 1,i = 1;	
	for (i = 1;i <= p; i++)
	sum = sum * i;
	return sum;
	}
}
