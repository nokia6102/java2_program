class J710_MyException extends Exception	//�ϥΪ̦۩w�ҥ~���O
{
	private int a;
	J710_MyException(int a) {
		this.a = a;
	}
	public String toString() {
		return "���ޭ� " + a + " �W�X�d��";
	}
}

public class J710_UserException
{
	static int[] numer = {10, 20, 30};
	static int[] denom = {2, 5, 3};
	static int[] quotient = new int[3];
	static void Division(int i) 	//��N�B���k
		throws J710_MyException
	{
		if(i>=3)	//�Yi>=3
			throw new J710_MyException(i);	//���Y�ҥ~
		else		//�Yi<3
			quotient[i] = numer[i]/denom[i];
			System.out.print(numer[i] + "/" + denom[i] + "=");
			System.out.println(quotient[i]);
	}
	public static void main(String[] args)
	{
		J710_MyException me = new J710_MyException(3);
		try {
			for(int i=0; i<=3; i++)
				Division(i);	//�I�s��k
		} catch(J710_MyException e) {
			System.out.println( e );
		}
	}
}