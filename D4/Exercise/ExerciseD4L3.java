import java.io.*;

public class ExerciseD4L3 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			System.out.println("�p��z���з��魫");
			System.out.println("�п�J�z������:");
			String myString = myReader.readLine();
			double dblHeight = Double.parseDouble(myString);
			long lngAnswer = Math.round(22 * Math.pow(dblHeight , 2) / 10000);

			System.out.println("�z���з��魫�O" + lngAnswer + "kg");

		} catch (IOException e) {
			System.out.println("�o��IO���~!");

		} catch (NumberFormatException ne) {
			System.out.println("��J���ƭȤ����T!");
		}
	}
}