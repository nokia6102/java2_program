//匯入類別
import java.io.*;

public class ExerciseD4L2 {
	public static void main(String args[]) {
		//建立用來讀取輸入資料的物件
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			//顯示第一個訊息
			System.out.println("執行 A ×B 的運算");

			//要求輸入A
			System.out.println("請輸入A");

			//宣告一String類別型態的變數用來代入讀取到的輸入資料
			String myString = myReader.readLine();

			//將代入String類別型態的值再代入int型態的變數中
			int intA = Integer.parseInt(myString);
			
			//要求輸入B
			System.out.println("請輸入B");

			//將讀取到的輸入資料代入String類別型態的變數中
			myString = myReader.readLine();

			//將代入String類別型態的值再代入int型態的變數中
			int intB = Integer.parseInt(myString);

			//計算 A ×B ,並將結果代入intAnswer
			int intAnswer = intA * intB;

			//顯示結果
			System.out.println("A ×B 的計算結果是" + intAnswer);

		//錯誤處理區塊
		}catch (IOException e) {
			System.out.println("有錯誤產生");
		}
	}
}