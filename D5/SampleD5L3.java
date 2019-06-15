import java.io.*;

public class SampleD5L3 {
	public static void main(String args[]) {
		//建立用來讀取資料的物件
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{

			//宣告並實體化用來發問、解答的陣列
			String strQuestion[] = new String[3];
			int intAnswer[] = new int[3];

			//將問題與解答代入陣列
			strQuestion [0] ="25 ÷5 = ?";
			intAnswer[0] = 5;
			strQuestion [1] ="10 ×3 = ?";
			intAnswer[1] = 30;
			strQuestion [2] ="100 + 1000 = ?";
			intAnswer[2] = 1100;


			//顯示開始訊息
			System.out.println("■■■ 心算遊戲 ■■■");
			System.out.println("請回答電腦提出的問題");


			//宣告並初始化計數器變數
			int intCounter = 0;

			//主常式
			for (intCounter = 0; intCounter<=2; intCounter++) {

				//顯示問題
				System.out.println(strQuestion[intCounter]);

				//要求輸入答案
				System.out.println("答案是:");

				//讀取輸入值,並代入變數中
				String myString = myReader.readLine();
				int myAnswer = Integer.parseInt(myString);

				//判斷是否正確
				if (myAnswer == intAnswer[intCounter])
					System.out.println("厲害!完全正確");
				else
					System.out.println("抱歉!答案是" + intAnswer[intCounter]);
			}

		//錯誤處理區塊
		}catch (IOException e) {
			System.out.println("發生IO錯誤!");
		}catch (NumberFormatException ne) {
			System.out.println("輸入的數值不正確!");
		}
	}
}