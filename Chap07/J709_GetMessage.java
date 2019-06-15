public class J709_GetMessage
{
	public static void main(String[] args) throws ArithmeticException
	{
		int numer = 10;
		int denom = 0;
		try {
			int quotient = numer/denom;
		} catch(ArithmeticException e) {
			System.out.println("¿ù»~°T®§¡G" + e.getMessage());
		}
	}
}
