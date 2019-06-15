//匯入Package
import java.io.*;

public class SampleD4L3 {
	public static void main(String args[]) {
		//建立用來讀取資料的物件
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			//顯示第一個訊息
			System.out.println("計算您的BMI指數");

			//要求輸入身高
			System.out.println("請輸入您的身高:");

			//宣告一String類別型態的變數用來代入讀取到的輸入資料
			String myString = myReader.readLine();

			//將代入String類別型態的值再代入double型態的變數中
			double dblHeight = Double.parseDouble(myString);
			
			//要求輸入體重
			System.out.println("請輸入您的體重:");

			//將讀取到的輸入資料代入String類別型態的變數中
			myString = myReader.readLine();

			//將代入String類別型態的值再代入double型態的變數中
			double dblWeight = Double.parseDouble(myString);

			//執行運算並將結果代入double型態的變數中
			long lngAnswer = Math.round(dblWeight / Math.pow(dblHeight , 2) * 10000);

			//顯示結果訊息
			System.out.println("您的BMI指數是" + lngAnswer);
			System.out.println("※ 一旦BMI指數超出22就表示過重了哦");

		//錯誤處理區塊 (IO錯誤)
		}catch (IOException e) {
			System.out.println("發生IO錯誤!");

		//錯誤處理區塊 (NumberFormat錯誤)
		} catch (NumberFormatException ne) {
			System.out.println("輸入的數值不正確!");
		}
	}
}