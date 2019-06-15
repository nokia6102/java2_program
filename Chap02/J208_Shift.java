// 儲存檔名：d:\Chap02\J208_Shift.java

public class J208_Shift
{
	public static void main(String[] args)
	{
		char hex[] = {'0', '1', '2', '3', '4', '5',
			      '6', '7', '8', '9', 'a', 'b',
			      'c', 'd', 'e', 'f'};	//定義十六進位轉換表
		byte hexA = (byte)0xc5;	//定義十六進位資料
		int hiA = (hexA & 0xf0) >> 4;	//取得高四位元十六進位值
		int loA = (hexA & 0x0f);	//取得低四位元十六進位值
		System.out.println("hexA = 0x" + hex[hiA] + hex[loA]);	//輸出
	}
}