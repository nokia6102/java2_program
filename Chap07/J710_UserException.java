class J710_MyException extends Exception	//使用者自定例外類別
{
	private int a;
	J710_MyException(int a) {
		this.a = a;
	}
	public String toString() {
		return "索引值 " + a + " 超出範圍";
	}
}

public class J710_UserException
{
	static int[] numer = {10, 20, 30};
	static int[] denom = {2, 5, 3};
	static int[] quotient = new int[3];
	static void Division(int i) 	//算術運算方法
		throws J710_MyException
	{
		if(i>=3)	//若i>=3
			throw new J710_MyException(i);	//投擲例外
		else		//若i<3
			quotient[i] = numer[i]/denom[i];
			System.out.print(numer[i] + "/" + denom[i] + "=");
			System.out.println(quotient[i]);
	}
	public static void main(String[] args)
	{
		J710_MyException me = new J710_MyException(3);
		try {
			for(int i=0; i<=3; i++)
				Division(i);	//呼叫方法
		} catch(J710_MyException e) {
			System.out.println( e );
		}
	}
}