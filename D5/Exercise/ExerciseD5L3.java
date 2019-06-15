import java.io.*;

public class ExerciseD5L3 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{

			String strQuestion[] = new String[3];
			int intAnswer[] = new int[3];

			strQuestion [0] ="10 ×50 = ?";
			intAnswer[0] = 500;
			strQuestion [1] ="21 - 7 = ?";
			intAnswer[1] = 14;
			strQuestion [2] ="360 ÷6 = ?";
			intAnswer[2] = 60;

			System.out.println("■■■ 心算遊戲 ■■■");
			System.out.println("請回答電腦提出的問題");

			int intCounter = 0;

			for (intCounter = 0; intCounter<=2; intCounter++) {

				System.out.println(strQuestion[intCounter]);

				System.out.println("答案是:");

				String myString = myReader.readLine();
				int myAnswer = Integer.parseInt(myString);

				if (myAnswer == intAnswer[intCounter])
					System.out.println("厲害!完全正確");
				else
					System.out.println("抱歉!答案是" + intAnswer[intCounter]);
			}

		}catch (IOException e) {
			System.out.println("發生IO錯誤!");
		}catch (NumberFormatException ne) {
			System.out.println("輸入的數值不正確!");
		}
	}
}