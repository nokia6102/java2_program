import java.io.*;

public class J808_BufferedInputStream
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		byte[] data = "Copyright&copy; 2001 Ku & Ku.\n".getBytes();
		ByteArrayInputStream arrayIn = new 
			ByteArrayInputStream(data);	//�إ߰}�C��J��C����
		BufferedInputStream bufIn = new 
			BufferedInputStream(arrayIn);	//�إ߽w�ľ���J��C����
		int c;
		boolean flag = false;	//�X��=false

		print("�ഫ�e�G");
		while((c = arrayIn.read()) != -1)
			print((char) c);
		arrayIn.reset();
		print("�ഫ��G");
		while((c = bufIn.read()) != -1) {	//�Y���O�w�ľ�����
			switch(c) {
			case '&':	//�YŪ����Ƭ�&��
				if(!flag) {	//�Y�X��=false
					bufIn.mark(data.length);	//�Хܥثe��m
					flag = true;	//�O�X��=true
				} else {	//�Y�X��=true
					flag = false;	//�O�X��=false
				}
				break;
			case ';':	//�YŪ����Ƭ�;��
				if(!flag) {	//�Y�X��=false
					print((char) c);	//��ܸ��
				} else {	//�Y�X��=true
					print("(c)");	//��ܨ��N�Ÿ�
					flag = false;	//�O�X��=fasle
				}
				break;
			case ' ':	//�YŪ����Ƭ��ť�
				if(!flag) {	//�Y�X��=false
					print((char) c);	//��ܸ��
				} else {	//�Y�X��=true
					print("&");	//���"&"
					flag = false;	//�O�X��=false
					bufIn.reset();	//���ʫ��Ш�mark��m
				}
				break;
			default:	//�YŪ����Ƭ���L
				if(!flag)	//�Y�X��=false
					print((char) c);	//��ܸ��
				break;
			}
		}
	}
}
