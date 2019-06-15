import java.io.*;

public class SampleD5L4 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

			//建立用來儲存問題與解答的陣列
			String strQuiz[][] = new String[5][5];
			
			//【0：問題	1～3：各種可能的選擇	4：解答】
			//問題1
			strQuiz[0][0] = "美國的首都是?";
			strQuiz[0][1] = "1. 紐約";
			strQuiz[0][2] = "2. 洛杉磯";
			strQuiz[0][3] = "3. 華盛頓D.C.";
			strQuiz[0][4] = "3";

			//問題2
			strQuiz[1][0] = "1929年歷史上發生了什麼大事?";
			strQuiz[1][1] = "1. 第一次世界大戰爆發";
			strQuiz[1][2] = "2. 全球經濟大恐慌";
			strQuiz[1][3] = "3. 哥倫布發現新大陸";
			strQuiz[1][4] = "2";


			//問題3
			strQuiz[2][0] = "Love Me Tender是由哪位歌手演唱的?";
			strQuiz[2][1] = "1. 瑪麗蓮夢露";
			strQuiz[2][2] = "2. U2";
			strQuiz[2][3] = "3. 貓王";
			strQuiz[2][4] = "3";

			//問題4
			strQuiz[3][0] = "5月1日是什麼節日?";
			strQuiz[3][1] = "1. 萬聖節";
			strQuiz[3][2] = "2. 全球環保日";
			strQuiz[3][3] = "3. 勞動節";
			strQuiz[3][4] = "3";

			//問題5
			strQuiz[4][0] = "『老人與海』是哪位作者的作品?";
			strQuiz[4][1] = "1. 海明威";
			strQuiz[4][2] = "2. 芥川 龍之介";
			strQuiz[4][3] = "3. 費茲傑羅";
			strQuiz[4][4] = "1";

		try{

			//顯示開始訊息
			System.out.println("■■■ 常識問答 ■■■");
			System.out.println("請以數字選出正確的解答。");


			//宣告與初始化計數變數
			int intCounter = 0;
			
			//宣告與初始化計分變數
			int intPoint = 0;

			//主常式
			for (intCounter = 0; intCounter<=4; intCounter++) {

				//顯示問題
				System.out.println(strQuiz[intCounter][0] );

				System.out.println(strQuiz[intCounter][1] );
				System.out.println(strQuiz[intCounter][2] );
				System.out.println(strQuiz[intCounter][3] );

				//要求輸入答案
				System.out.println("答案是:");


				//讀取輸入值,並代入變數中
				String myString = myReader.readLine();
				int myAnswer = Integer.parseInt(myString);

				//判斷是否正確
				if (myAnswer == Integer.parseInt(strQuiz[intCounter][4]) ) {
					System.out.println("厲害!完全正確");
					intPoint ++;
				} else {
					System.out.println("抱歉!答案是" + strQuiz[intCounter][4]);
				}
			}

			//顯示答對題數與相對訊息
			System.out.println("\n■■■ 成績公佈 ■■■");			
			switch (intPoint) {
				case 0:
					System.out.println("全軍覆沒。唉……");
					break;
				case 1:
					System.out.println("答對1題。只好下次再加油囉。");
					break;
				case 2:
					System.out.println("答對2題。再加點油吧!");
					break;
				case 3:
					System.out.println("答對3題。還可以啦。");
					break;
				case 4:
					System.out.println("答對4題。還不錯嘛!");
					break;
				case 5:
					System.out.println("答對5題。PERFECT!!");
					break;
			}

		//錯誤處理區塊
		}catch (IOException e) {
			System.out.println("發生IO錯誤!");
		}catch (NumberFormatException ne) {
			System.out.println("輸出的數值不正確!");
		}
	}
}