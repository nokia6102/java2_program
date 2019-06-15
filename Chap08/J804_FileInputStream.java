import java.io.*;

public class J804_FileInputStream
{
	static void print(String s) {	//定義螢幕輸出方法
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception
	{
		int size;
		FileInputStream fileIn = new FileInputStream(
				"J804_FileInputStream.java");	//建立檔案輸入串列物件
		print("總位元組數：" + (size = fileIn.available()));	//顯示位元組總數
		print("讀取 " + size + " 位元組....");	//顯示讀取的位元組數
		byte[] data = new byte[size];	//宣告記憶體緩衝器
		if(fileIn.read(data) != size)		//若讀取資料 != size
			print("不能讀取 " + size + " 位元組");	//顯示讀取不足訊息
		print(new String(data, 0, size));	//顯示讀取資料
		fileIn.close();	//關閉檔案輸入串列物件
	}
}
