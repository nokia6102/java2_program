// 儲存檔名：d:\Chap05\J502_Weight.java

public class J502_Weight
{
	static double weight(float lb)	//重量轉換方法
	{
		double kg = 1;	//宣告區域變數
		kg = lb / 2.20462;	//磅轉成公斤	
		return kg;	//返回並傳遞Kg
	}

	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader keyin;
		keyin = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in));
		float lb;	//宣告區域變數
		while(true)	//無窮迴圈
		{
			System.out.print("請輸入要轉換的磅數，輸入 0 則結束：");	//顯示字串
			lb = Float.parseFloat(keyin.readLine());	//輸入浮點數值
			if (lb == 0) break;	//若輸入0則中斷迴圈
			System.out.println(lb + "磅 = " + weight(lb) + "公斤");	//呼叫Weight方法
		}
	}
}
