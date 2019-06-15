// 儲存檔名：d:\Chap05\J514_BMI.java

public class J514_BMI
{
	public static void main(String[] args)
	{
		java.util.StringTokenizer st = new
			java.util.StringTokenizer(args[0]);
		double w = Double.parseDouble(st.nextToken());	//轉換第一個參數
		double h = Double.parseDouble(st.nextToken());	//轉換第二個參數
		double BMI = (w / Math.pow(h, 2));	//計算攝取量
		System.out.println("體重 = " + w + "公斤");	//顯示體重
		System.out.println("身高 = " + h + "公尺");	//顯示身高
		System.out.println("食量 = " + BMI);	//顯示食量
	}
}
