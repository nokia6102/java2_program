// 儲存檔名：d:\Chap05\J513_Temperature.java

class J513_Transfer
{
	float f;	//宣告物件變數
	float getC(float c)	//溫度轉換方法
	{
		f = ((9 * c) / 5) + 32;	//攝氏轉成華氏	
		return f;	//返回並傳遞f
	}
}

public class J513_Temperature
{
	public static void main(String[] args)
	{
		float c = Float.parseFloat(args[0]);	//字串轉成浮點數值
		J513_Transfer f = new J513_Transfer();	//建立類別物件
		System.out.println(c + "°C = " + f.getC(c) + "°F");	//呼叫Transfer方法
	}
}