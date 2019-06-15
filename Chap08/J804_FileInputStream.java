import java.io.*;

public class J804_FileInputStream
{
	static void print(String s) {	//�w�q�ù���X��k
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception
	{
		int size;
		FileInputStream fileIn = new FileInputStream(
				"J804_FileInputStream.java");	//�إ��ɮ׿�J��C����
		print("�`�줸�ռơG" + (size = fileIn.available()));	//��ܦ줸���`��
		print("Ū�� " + size + " �줸��....");	//���Ū�����줸�ռ�
		byte[] data = new byte[size];	//�ŧi�O����w�ľ�
		if(fileIn.read(data) != size)		//�YŪ����� != size
			print("����Ū�� " + size + " �줸��");	//���Ū�������T��
		print(new String(data, 0, size));	//���Ū�����
		fileIn.close();	//�����ɮ׿�J��C����
	}
}
