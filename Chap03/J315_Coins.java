// 儲存檔名：d:\Chap03\J315_Coins.java

public class J315_Coins
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("請輸入錢數 (單位：圓) = ");	//顯示提示字串
		java.io.BufferedReader br;	//宣告讀取緩衝器變數
		br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));	//建立讀取緩衝器物件
		String line = br.readLine();	//line=讀取緩衝器資料
		System.out.println();	//跳行

		int totalMoney = Integer.parseInt(line);	//將輸入字串轉成整數
		int dollars = totalMoney % 100;	//輸入數值除100取餘數
		int fifty = dollars / 50;	//取得五十圓硬幣數量
		int ten = (dollars % 50) / 10;	//取得十圓硬幣數量
		int five = ((dollars % 50) % 10) / 5;	//取得五圓硬幣數量
		int one = ((dollars % 50) % 10) % 5;	//取得一圓硬幣數量
		int coins = fifty + ten + five + one;	//計算硬幣總數

		if (dollars == 0)	//若輸入數值為100的倍數
			System.out.println("不需要硬幣");
		else {	//若輸入數值不是100的倍數
			System.out.println("硬幣總數 = " + coins);
			if(fifty != 0)	//若五十圓硬幣數量!=0
				System.out.println("五十圓硬幣 = " + fifty);
			if(ten != 0)	//若十圓硬幣數量!=0
				System.out.println("十圓硬幣 = " + ten);
			if(five != 0)	//若五圓硬幣數量!=0
				System.out.println("五圓硬幣 = " + five);
			if(one != 0)	//若一圓硬幣數量!=0
				System.out.println("一圓硬幣 = " + one);
		}
	}
}
