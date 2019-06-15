import java.io.*;

public class J809_PushbackInputStream
{
	static void print(String s) {
		System.out.print(s);
	}
	static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) throws IOException
	{
		byte[] data = "I + II = III\n".getBytes();
		ByteArrayInputStream arrayIn = new 
			ByteArrayInputStream(data);	//�إ߰}�C��J��C����
		PushbackInputStream pushIn = new 
			PushbackInputStream(arrayIn);	//�إ߱��^��J��C����
		int c;

		print("�ഫ�e�G");
		while((c = arrayIn.read()) != -1) {
			print((char) c);
		}
		arrayIn.reset();
		print("�ഫ��G");
		while((c = pushIn.read()) != -1) {
			switch(c) {
			case 'I':
				if((c = pushIn.read()) == 'I') {	//�Y�U�@�Ӧr���O'I'
					if((c = pushIn.read()) == 'I') {	//�Y�U�@�Ӧr���O'I'
						print('3');	//��X '3'
					} else {	//�Y�U�@�Ӧr�����O'='
						print('2');	//��X '2'
						pushIn.unread(c);	//���ʫ��Ш�W�@�Ӧr��
					}
				} else {	//�Y�U�@�Ӧr�����O'='
					print('1');	//��X
					pushIn.unread(c);	//���ʫ��Ш�W�@�Ӧr��
				}
				break;
			default:
				print((char) c);
				break;
			}
		}
	}
}
