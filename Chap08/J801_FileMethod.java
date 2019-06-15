import java.io.File;

public class J801_FileMethod
{
	static void print(String s) {
		System.out.print(s);
	}

	public static void main(String[] args)
	{
		File f = new File("C:/jdk1.3/bin/java.exe");	//�إ��ɮ����O
		print("�ɮצW�١G" + f.getName() + "\n");	//���o�ɮצW��
		print("�ɮ׸��|�G" + f.getPath() + "\n");	//���o�ɮ׸��|
		print("������|�G" + f.getAbsolutePath() + "\n");	//���o������|
		print("�W�h�ؿ��G" + f.getParent() + "\n");	//���o�W�h�ؿ��W��
		print("�ɮפj�p�G" + f.length() + " bytes\n");	//���o�ɮפj�p
		print("�̫�ק�G" + f.lastModified() + "\n");	//���o�̫�ק�ɶ�
		print("�O�_�s�b�G");
		print(f.exists() ? "�s�b\n" : "���s�b\n");	//�ˬd�O�_�s�b
		print("�i�_Ū���G");
		print(f.canRead() ? "�iŪ��\n" : "���iŪ\n");	//�ˬd�O�_�iŪ��
		print("�i�_�g�J�G");
		print(f.canWrite() ? "�i�g�J\n" : "���i�g\n");	//�ˬd�O�_�i�g�J
	}
}
