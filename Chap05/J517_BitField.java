// 儲存檔名：d:\Chap05\J517_BitField.java

public class J517_BitField
{
	static boolean[] flags = new boolean[16];	//建立flags陣列

	public static void setFlag(int arg)	//設定旗號方法
	{
		flags[arg] = true;
	}
	public static void clsFlag(int arg)	//清除旗號方法
	{
		flags[arg] = false;
	}
	public static void notFlag(int arg)	//改變旗號方法
	{
		flags[arg] ^= true;
	}
	public static boolean getFlag(int arg)	//取得旗號方法
	{
		return flags[arg];
	}
	public static int addFlag()	//計算旗號總數方法
	{
		int sum = 0;
		for(int i=0; i<16; i++)
			if(flags[i] == true)
				sum++;
		return sum;
	}
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader br;	//宣告BufferedReader物件
		br = new java.io.BufferedReader(
		     new java.io.InputStreamReader(System.in));	//建立並配置物件記憶體
		int number;	//宣告整數變數
		System.out.println("1.設定旗號  2.清除旗號  3.改變旗號  "
				 + "4.取得旗號  5.旗號總數  6.結束程式");
		while(true) {
			System.out.print("請選擇 1-6：");
			char sel = (char)System.in.read();	//讀取鍵盤輸入字元
			System.in.read(); System.in.read();	//讀取LF與CR碼

			switch(sel) {	//判斷輸入字元
			    case '1':	//若輸入字元='1'
				System.out.print("請輸入旗號：");
				number = Integer.parseInt(br.readLine());	//讀取字串並轉成整數
				setFlag(number);	//呼叫setFlag方法
				break;
			    case '2':	//若輸入字元='2'
				System.out.print("請輸入旗號：");
				number = Integer.parseInt(br.readLine());	//讀取字串並轉成整數
				clsFlag(number);	//呼叫clsFlag方法
				break;
			    case '3':	//若輸入字元='3'
				System.out.print("請輸入旗號：");
				number = Integer.parseInt(br.readLine());	//讀取字串並轉成整數
				notFlag(number);	//呼叫notFlag方法
				break;
			    case '4':	//若輸入字元='4'
				System.out.print("請輸入旗號：");
				number = Integer.parseInt(br.readLine());	//讀取字串並轉成整數
				System.out.println("旗號 " + number + " = " 
						+ getFlag(number));	//呼叫getFlag方法
				break;
			    case '5':	//若輸入字元='5'
				System.out.println("旗號為1的個數：" 
						+ addFlag());	//呼叫addFlag方法
				break;
			    case '6':	//若輸入字元='6'
				return;
			}
		}
	}
}
