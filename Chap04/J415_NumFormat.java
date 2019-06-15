// �x�s�ɦW�Gd:\Chap04\J415_NumFormat.java

import java.text.*;	//�ޤJjava.text.*
public class J415_NumFormat
{
	public static void main(String[] args)
	{
		int iNumber = 1016868;	//�ŧi�ñҩl���
		double dNumber = 1.02543;	//�ŧi�ñҩl�����
		NumberFormat nf = NumberFormat.getNumberInstance();	//�ŧiNumberFormat����

		nf.setMaximumIntegerDigits(5);	//�]�w��Ƴ̤j���
		String iStr = nf.format(iNumber);	//�N����ন�r��
		System.out.println("��Ƽƭ� = " + iNumber);
		System.out.println("�ഫ�r�� = " + iStr);

		nf.setMaximumFractionDigits(2);	//�]�w�p���I����
		String dStr = nf.format(dNumber);	//�N������ন�r��
		System.out.println("�B�I�ƭ� = " + dNumber);
		System.out.println("�ഫ�r�� = " + dStr);
	}
}
