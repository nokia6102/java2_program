//載入類別
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExerciseD4L1 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			System.out.println("你最愛的食物是什麼?");
			String myString = myReader.readLine();
			System.out.println("你最愛的食物是" + myString + "嗎?");

		}catch (IOException e) {
		}
	}
}