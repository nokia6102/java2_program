// 儲存檔名：d:\Chap04\J414_NumString.java

import java.text.*;	//引入java.text.*
public class J414_NumString
{
	public static void main(String[] args) throws Exception
	{
		int iNumber;	//宣告整數變數
		System.out.println("i" + "\t" + "i平方");	//顯示標題
		for(int i=0; i<10; i++) {
			iNumber = (int)Math.pow(i, 2);	//計算i的平方
			if(String.valueOf(iNumber).length() == 1)	//有效位數是否為1
				System.out.println(i + "\t  " + iNumber);	//定位後加2空格
			else
				System.out.println(i + "\t " + iNumber);	//定位後加1空格
		}
	}
}
