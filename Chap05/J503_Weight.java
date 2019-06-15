// 儲存檔名：d:\Chap05\J503_Weight.java

public class J503_Weight
{
	static float weight(float kg)	//重量轉換方法
	{
		float lb;	//宣告區域變數
		lb = kg * 2.20462f;	//公斤轉成磅
		return lb;	//返回並傳遞lb
	}

	public static void main(String[] args)
	{
		float[] kg = {40, 50, 60, 70, 80};	//宣告區域變數
		float[] lb = new float[5];	//宣告區域變數
		System.out.println("公斤\t磅");	//顯示字串
		for(int i=0; i<5; i++)	//無窮迴圈
		{
			System.out.println(kg[i] + "\t" + weight(kg[i]));	//呼叫Weight方法
		}
	}
}
