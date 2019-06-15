// 儲存檔名：d:\Chap05\J504_Grade.java

public class J504_Grade
{

	static int score(int i, int array[][])	//計算總分方法
	{
		int sum = 0;	//宣告區域變數
		for (int j = 0; j < 3; j++)	//計算總分迴圈
			sum += array[i][j];
		return sum;	//返回並傳回sum
	}

	public static void main(String[] args)
	{
		String[] name1 = {"張三", "李四", "王五"};	//宣告姓名陣列
		int[][] record = {{90, 80, 70},
				  {80, 80, 90},
				  {70, 80, 70}};	//宣告成績陣列
		System.out.print("姓名\t" + "國文\t" + "英文\t");
		System.out.println("數學\t" + "總分\t" + "平均");	//顯示欄位字串
		for (int i = 0; i < 3; i++)	//顯示成績迴圈
		{
			System.out.println(name1[i] + "\t"	//顯示陣列值
			 	+ record[i][0] + "\t"	//顯示第一科分數
			 	+ record[i][0] + "\t"	//顯示第二科分數
			 	+ record[i][0] + "\t"	//顯示第三科分數
			 	+ score(i, record) + "\t"	//顯示方法傳回值
			 	+ score(i, record) / 3);	//顯示方法傳回值
		}
	}
}