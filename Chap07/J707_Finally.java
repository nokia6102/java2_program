public class J707_Finally
{
	static int[] numer = {10, 20, 30};
	static int[] denom = {2, 5, 0};
	static int[] quotient = new int[3];
	static void Division(int i)
	{
		quotient[i] = numer[i]/denom[i];
		System.out.println(numer[i] + "/" + denom[i]
				  + "=" + quotient[i]);
	}
	public static void main(String[] args) throws ArithmeticException
	{
		try {			//測試算術錯誤
			for(int i=0; i<3; i++)
				Division(i);	//呼叫Division方法
		} catch(ArithmeticException e) {	//捕捉算術錯誤
			System.out.println( e );
		} finally {	//終結try區塊
			System.out.println("終結try區塊");
		}
	}
}
