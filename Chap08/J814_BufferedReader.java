import java.io.*;

public class J814_BufferedReader
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		String s = "Copyright&copy; 2001 Ku & Ku.\n";
		char[] data = new char[s.length()];
		s.getChars(0, s.length(), data, 0);
		CharArrayReader cr = new CharArrayReader(data);	//�إ�Ū���r���}�C����
		BufferedReader br = new BufferedReader(cr);	//�إ�Ū���w�ľ�����
		int c;
		boolean flag = false;	//�X��=false

		print("�ഫ�e�G");
		while((c = cr.read()) != -1)
			print((char) c);
		cr.reset();
		print("�ഫ��G");
		while((c = br.read()) != -1) {	//�Y���O�w�ľ�����
			switch(c) {
			case '&':	//�YŪ����Ƭ�&��
				if(!flag) {	//�Y�X��=false
					br.mark(data.length);	//�Хܥثe��m
					flag = true;	//�O�X��=true
				} else {
					flag = false;	//�O�X��=false
				}
				break;
			case ';':	//�YŪ����Ƭ�;��
				if(!flag) {	//�Y�X��=false
					print((char) c);	//��ܸ��
				} else {
					print("(c)");	//��ܨ��N�Ÿ�
					flag = false;	//�O�X��=false
				}
				break;
			case ' ':
				if(!flag) {	//�Y�X��=false
					print((char) c);	//��ܸ��
				} else {
					print("&");
					flag = false;	//�O�X��=false
					br.reset();	//���ʫ��Ш�mark��m
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
