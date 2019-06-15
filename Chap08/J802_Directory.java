import java.io.File;

public class J802_Directory
{
	static void print(String s) {	//�ŧi��X��k
		System.out.print(s);
	}
	public static void main(String[] args)
	{
		String path = "C:/jdk1.3";	//�w�q�u�@���|
		File f = new File(path);	//�إ��ɮ����O
		if(f.isDirectory()) {		//���լO�_���ؿ�
			print("�ɮ׸��| " + path + "\n");	//��ܤu�@���|
			String s[] = f.list();	//���o�ؿ������������
			for(int i=0; i<s.length; i++) {	//�j��
				File fn = new File(path + "/" + s[i]);	//�إ߸��|�P�ɦW����
				if(fn.isDirectory()) {	//�ˬd�O�_���ؿ�
					print(s[i] + " �O�ؿ�\n");
				} else {
					print(s[i] + " �O�ɮ�\t");
					print("�ɮפj�p�G" + s[i].length() + "Bytes\n");
				}
			}
		}
	}
}
