import java.io.*;

public class SampleD5L1 {
	public static void main(String args[]) {

		//建立用來讀取資料的物件
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{
			//顯示遊戲開始訊息
			System.out.println("猜數字遊戲 START!!");
			System.out.println("電腦已經選定了一個數字(0~9)");

			//電腦選定的數字
			int intAnswer = 5;

			//要求輸入數字
			System.out.println("猜猜看它選的是哪個數字");
			System.out.println("你選的數字是:");

			//讀取輸入的值,再代入變數中
			String myString = myReader.readLine();
			int intNumber = Integer.parseInt(myString);

			//判斷是否猜中
			if (intNumber == intAnswer)
				System.out.println("正確!太厲害了吧");
			else
				System.out.println("殘念!  電腦選的數字是" + intAnswer);

		//錯誤處理區塊
		} catch (IOException e) {
			System.out.println("發生IO錯誤!");

		} catch (NumberFormatException ne) {
			System.out.println("輸入的數值不正確!");
		}
	}
}