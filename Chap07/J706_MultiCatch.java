public class J706_MultiCatch
{
	public static void main(String[] args) 
		throws ArithmeticException, IndexOutOfBoundsException
	{
		int[] numer = {10, 20, 30};
		int[] denom = {0, 5, 3};
		int[] quotient = new int[3];
		for(int i=0; i<=3; i++) {
			try {
				quotient[i] = numer[i]/denom[i];
			} catch(ArithmeticException e) {
				System.out.println("°}¦C[" + i + "]¿ù»~¡G" + e);
			} catch(IndexOutOfBoundsException e) {
				System.out.println("°}¦C[" + i + "]¿ù»~¡G" + e);
			}
		}
	}
}
