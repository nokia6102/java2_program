//���J���O
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExerciseD4L1 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			System.out.println("�A�̷R�������O����?");
			String myString = myReader.readLine();
			System.out.println("�A�̷R�������O" + myString + "��?");

		}catch (IOException e) {
		}
	}
}