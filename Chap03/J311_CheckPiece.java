// 儲存檔名：d:\Chap03\J311_CheckPiece.java

public class J311_CheckPiece
{
	public static void main(String[] args) throws java.io.IOException
	{
		char inChar;
		int  plus = 0, minus = 0, zero = 0;
		java.io.BufferedReader line;
		line = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		do
		{
			System.out.print("請輸入整數數值：");
			int inNum = Integer.parseInt(line.readLine());
			if (inNum > 0)		// 若 inNum 大於 0
				plus++;	// plus = plus + 1
			else if (inNum < 0)		// 若 inNum 小於 0
				minus++;	// minus = minus + 1
			else					// 否則
				zero++;		// zero = zero + 1
			System.out.print("是否輸入下一筆數值 (y/n)：");
			inChar = (char)System.in.read();	//inChar=輸入字元
			System.in.read(); System.in.read();	//讀取cr與lf控制碼
		} while (inChar == 'Y' || inChar == 'y');	// 若字元='Y'則重複迴圈
		System.out.println("正數有 " + plus + " 個");	// 顯示正數個數
		System.out.println("負數有 " + minus + " 個");	// 顯示負數個數
		System.out.println("零有 " + zero + " 個");	// 顯示零的個數
	}
}
