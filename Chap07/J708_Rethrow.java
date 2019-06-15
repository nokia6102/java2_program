public class J708_Rethrow
{
	static void Rethrow() throws IllegalAccessException
	{
		try {
			throw new IllegalAccessException("錯誤");	//投擲例外
		} catch(IllegalAccessException e) {
			System.out.println("第一次接到：" + e );
			throw e;	//再投擲例外
		}
	}
	public static void main(String[] args)
	{
		try {
			Rethrow();	//呼叫Rethrow()方法
		} catch(IllegalAccessException e) {
			System.out.println("第二次接到：" + e );
		}
	}
}
