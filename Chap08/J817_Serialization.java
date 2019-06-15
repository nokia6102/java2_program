import java.io.*;

class J817_MyString implements Serializable
{
	String str;
	public J817_MyString(String str)	//J817_MyString建立者
	{
		this.str = str;
	}
	public String toString()	//J817_MyString的toString方法
	{
		return str;
	}
}

public class J817_Serialization
{
	public static void main(String[] args) throws Exception
	{
		J817_MyString inObj, outObj;
		inObj = new J817_MyString("");
		outObj = new J817_MyString("Focus on giving, instead of getting.");
		try {
			FileOutputStream fos = 
				new FileOutputStream("J817.txt");	//建立檔案輸出串列
			ObjectOutputStream oos = 
				new ObjectOutputStream(fos);	//建立物件輸出串列
			oos.writeObject(outObj);	//outObj字串寫入oos
			oos.flush();	//強迫輸出oos內容
			oos.close();	//關閉oos物件

			FileInputStream fis = 
				new FileInputStream("J817.txt");	//建立檔案輸入串列
			ObjectInputStream ois = 
				new ObjectInputStream(fis);	//建立物件輸入串列
			inObj = (J817_MyString)ois.readObject();	//inObj=讀取檔案字串
			ois.close();	//關閉ois物件
		} finally {
			System.out.println(inObj);	//顯示讀取字串
		}
	}
}
