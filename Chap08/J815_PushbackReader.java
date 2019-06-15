import java.io.*;

public class J815_PushbackReader
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		String s = "I + II = III\n";
		char[] data = new char[s.length()];
		s.getChars(0, s.length(), data, 0);
		CharArrayReader cr = new CharArrayReader(data);
		PushbackReader pr = new PushbackReader(cr);
		int c;

		print("�ഫ�e�G" + s);
		print("�ഫ��G");
		while((c = pr.read()) != -1) {	//Ū���r��,�Y���O�ɮ׵���
			switch(c) {
			case 'I':	//�Y�Ĥ@�Ӧr���O'I'
				if((c = pr.read()) == 'I') {	//�Y�ĤG�Ӧr���O�]'I'
					if((c = pr.read()) == 'I') {	//�Y�ĤT�Ӧr���]�O'I'
						print('3');	//��� '3'
					} else {	//�Y�ĤT�Ӧr�����O'='
						print('2');	//��� '2'
						pr.unread(c);	//���ʫ��Ш�W�@�Ӧr��
					}
				} else {	//�Y�ĤG�Ӧr�����O'='
					print('1');	//��� '1'
					pr.unread(c);	//���ʫ��Ш�W�@�Ӧr��
				}
				break;
			default:	//�Y�Ĥ@�Ӧr�����O'I'
				print((char) c);	//��ܦr��
				break;
			}
		}
	}
}
