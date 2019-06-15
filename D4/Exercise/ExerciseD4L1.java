//更摸
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExerciseD4L1 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			System.out.println("程稲琌ぐ或?");
			String myString = myReader.readLine();
			System.out.println("程稲琌" + myString + "盾?");

		}catch (IOException e) {
		}
	}
}