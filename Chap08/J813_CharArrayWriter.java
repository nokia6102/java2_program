import java.io.*;

public class J813_CharArrayWriter
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char s) {
		System.out.print(s);
	}
	public static void main(String[] args) throws IOException
	{
		String s1 = "施比受更為有福！";
		char[] d1 = new char[s1.length()];
		s1.getChars(0, s1.length(), d1, 0);	//將s1字串存入d1緩衝器
		CharArrayWriter caw = new CharArrayWriter();	//建立caw物件
		caw.write(d1);	//將d1寫入caw物件
		print("物件內容：" + caw.toString()+ '\n');	//顯示caw物件內容

		char[] c = caw.toCharArray();	//將caw內容存入陣列c
		print("陣列內容：");
		for(int i=0; i<c.length; i++)	//顯示字元陣列迴圈
			print(c[i]);	//顯示單一字元
		print('\n');	//顯示跳行

		FileWriter fw = new FileWriter("J813.txt");	//建立寫入檔案物件
		caw.writeTo(fw);	//將陣列物件寫入檔案
		fw.close();	//關閉寫入檔案
		print("寫入 J813.txt 檔案成功\n");	//顯示訊息

		caw.reset();	//移動寫入指標回起點
		caw.write("重設物件內容");	//將訊息寫入caw物件
		print(caw.toString());	//顯示caw物件資料
	}
}
