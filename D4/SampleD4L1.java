//匯入類別
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SampleD4L1 {
	public static void main(String args[]) {

		//建立用來讀取輸入資料的物件
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			//要求輸入姓名
			System.out.println("請輸入您的姓名：");

			//宣告String類別型態的變數,用來代入讀取的資料
			String myString = myReader.readLine();

			//連結訊息並顯示出
			System.out.println("Hi!" + myString + ",很高興認識你");

		//錯誤處理區塊
		}catch (IOException e) {
		}

	}
}