// 儲存檔名：d:\Chap05\J507_Length.java

class J507_Transfer	//宣告類別
{
	float in;	//宣告物件變數
	J507_Transfer(int cm)	//長度轉換方法
	{
		in = cm / 2.54f;	//公分轉成英吋
	}
	float getInch()
	{
		return in;
	}
}

public class J507_Length
{
	public static void main(String[] args)
	{
		System.out.print("公分\t英吋\n");	//顯示字串
		for(int cm=1; cm<=10; cm++)	//1至10公分迴圈
		{
			System.out.println(" " + cm + "\t" 
				+ (new J507_Transfer(cm).getInch()));	//呼叫getInch方法
		}
	}
}