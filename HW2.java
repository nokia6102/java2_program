
public class HW2
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		System.out.print("�п�J������(�����): ");
		int iNum = Integer.parseInt(keyin.readLine());
		if (iNum > 0)
		System.out.println(iNum + "��������" + pand(iNum) );						else
		System.out.println("�Ӿx����...�s�A��J����Ƥ��O��!");
	}
	static int pand(int p)
	{
	int sum = 1,i = 1;	
	for (i = 1;i <= p; i++)
	sum = sum * i;
	return sum;
	}
}
