import java.io.*;

public class ExerciseD5L1 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("猜數字遊戲 START!!");
			System.out.println("電腦已經選定了一個數字(0~9)");

			int intAnswer = 8;

			System.out.println("猜猜看它選的是哪個數字");
			System.out.println("你選的數字是:");

			String myString = myReader.readLine();
			int intNumber = Integer.parseInt(myString);

			if (intNumber == intAnswer)
				System.out.println("正確!太厲害了吧");
			else
				System.out.println("殘念!  電腦選的數字是" + intAnswer);

		} catch (IOException e) {
			System.out.println("發生IO錯誤!");

		} catch (NumberFormatException ne) {
			System.out.println("輸入的數值不正確!");
		}
	}
}