// �x�s�ɦW�Gd:\Chap05\J514_BMI.java

public class J514_BMI
{
	public static void main(String[] args)
	{
		java.util.StringTokenizer st = new
			java.util.StringTokenizer(args[0]);
		double w = Double.parseDouble(st.nextToken());	//�ഫ�Ĥ@�ӰѼ�
		double h = Double.parseDouble(st.nextToken());	//�ഫ�ĤG�ӰѼ�
		double BMI = (w / Math.pow(h, 2));	//�p������q
		System.out.println("�魫 = " + w + "����");	//����魫
		System.out.println("���� = " + h + "����");	//��ܨ���
		System.out.println("���q = " + BMI);	//��ܭ��q
	}
}
