import java.io.*;

class J817_MyString implements Serializable
{
	String str;
	public J817_MyString(String str)	//J817_MyString�إߪ�
	{
		this.str = str;
	}
	public String toString()	//J817_MyString��toString��k
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
				new FileOutputStream("J817.txt");	//�إ��ɮ׿�X��C
			ObjectOutputStream oos = 
				new ObjectOutputStream(fos);	//�إߪ����X��C
			oos.writeObject(outObj);	//outObj�r��g�Joos
			oos.flush();	//�j����Xoos���e
			oos.close();	//����oos����

			FileInputStream fis = 
				new FileInputStream("J817.txt");	//�إ��ɮ׿�J��C
			ObjectInputStream ois = 
				new ObjectInputStream(fis);	//�إߪ����J��C
			inObj = (J817_MyString)ois.readObject();	//inObj=Ū���ɮצr��
			ois.close();	//����ois����
		} finally {
			System.out.println(inObj);	//���Ū���r��
		}
	}
}
