public class J708_Rethrow
{
	static void Rethrow() throws IllegalAccessException
	{
		try {
			throw new IllegalAccessException("���~");	//���Y�ҥ~
		} catch(IllegalAccessException e) {
			System.out.println("�Ĥ@������G" + e );
			throw e;	//�A���Y�ҥ~
		}
	}
	public static void main(String[] args)
	{
		try {
			Rethrow();	//�I�sRethrow()��k
		} catch(IllegalAccessException e) {
			System.out.println("�ĤG������G" + e );
		}
	}
}
