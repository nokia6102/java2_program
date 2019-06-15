import java.io.*;

public class ExerciseD4L3 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			System.out.println("計算您的標準體重");
			System.out.println("請輸入您的身高:");
			String myString = myReader.readLine();
			double dblHeight = Double.parseDouble(myString);
			long lngAnswer = Math.round(22 * Math.pow(dblHeight , 2) / 10000);

			System.out.println("您的標準體重是" + lngAnswer + "kg");

		} catch (IOException e) {
			System.out.println("發生IO錯誤!");

		} catch (NumberFormatException ne) {
			System.out.println("輸入的數值不正確!");
		}
	}
}