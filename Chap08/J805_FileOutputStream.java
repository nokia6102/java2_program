import java.io.*;

public class J805_FileOutputStream
{
	static void print(String s) {	//�w�q�ù���X��k
		System.out.print(s);
	}

	public static void main(String[] args) throws Exception
	{
		byte[] data = "You will never win, if you never begin.\r\n"
			      .getBytes();	//���o�éw�q�}�C����
		FileOutputStream file1 = new 
			FileOutputStream("J805.txt");	//�إ߼g�J��X��C����
		for(int i=0; i<data.length; i++)
			file1.write(data[i]);	//�줸�ո�Ƽg�J�ɮ�
		FileOutputStream file2 = new 
			FileOutputStream("J805.txt", true);	//�إߪ��[��X��C����
		file2.write(data);	//�w�ľ���Ƽg�J�ɮ�
		FileOutputStream file3 = new 
			FileOutputStream("J805.txt", true);	//�إߪ��[��X��C����
		file3.write(data, 0, 18);	//���w���׸�Ƽg�J�ɮ�
		file1.close();	//�����g�J�ɮת���
		file2.close();	//�������[�ɮת���
		file3.close();	//�������[�ɮת���
	}
}
