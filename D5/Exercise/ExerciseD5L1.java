import java.io.*;

public class ExerciseD5L1 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("�q�Ʀr�C�� START!!");
			System.out.println("�q���w�g��w�F�@�ӼƦr(0~9)");

			int intAnswer = 8;

			System.out.println("�q�q�ݥ��諸�O���ӼƦr");
			System.out.println("�A�諸�Ʀr�O:");

			String myString = myReader.readLine();
			int intNumber = Integer.parseInt(myString);

			if (intNumber == intAnswer)
				System.out.println("���T!�ӼF�`�F�a");
			else
				System.out.println("�ݩ�!  �q���諸�Ʀr�O" + intAnswer);

		} catch (IOException e) {
			System.out.println("�o��IO���~!");

		} catch (NumberFormatException ne) {
			System.out.println("��J���ƭȤ����T!");
		}
	}
}