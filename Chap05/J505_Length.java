// 儲存檔名：d:\Chap05\J505_Length.java

class J505_Transfer	//宣告類別
{
	double cm;	//宣告物件變數
	double getCM(float in)	//長度轉換方法
	{
		cm = in * 2.54;	//英吋轉成公分	
		return cm;	//返回並傳遞cm
	}
}

public class J505_Length
{
	public static void main(String[] args)
	{
		J505_Transfer l = new J505_Transfer();	//建立類別物件
		System.out.print("英吋\t公分\n");	//顯示字串
		for(int in=1; in<=10; in++)	//1至10英吋迴圈
		{
			System.out.println(" " + in + "\t" 
				+ l.getCM(in));	//呼叫getCM方法
		}
	}
}