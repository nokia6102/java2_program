import java.io.*;

public class J807_ByteArrayOutputStream
{
	public static void main(String[] args) throws IOException
	{
		byte[] data = "Failure is never final.".getBytes();
		ByteArrayOutputStream arrayOut = new 
			ByteArrayOutputStream();	//�إߦ줸�տ�X��C
		arrayOut.write(data);	//data�g�JarrayOut
		System.out.println(arrayOut.toString());	//��ܦ�C�����

		OutputStream fileOut = new 
			FileOutputStream("J807.txt");	//�إ��ɮ׿�X��C����
		arrayOut.writeTo(fileOut);	//arrayOut�g�JfileOut
		fileOut.close();	//�����ɮ׿�X��C����
	}
}
