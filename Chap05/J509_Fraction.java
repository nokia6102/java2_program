// �x�s�ɦW�Gd:\Chap05\J509_Fraction.java

class J509_Fracpri	//�ŧi���O
{
	int whole;	//�ŧi�����ܼ�
	int numer;	//�ŧi�����ܼ�
	int demon;	//�ŧi�����ܼ�
	void setFracpri(int w, int n, int d)	//�]�w���Ƥ�k1
	{
		whole = w;	//�]�w���
		numer = n;	//�]�w���l
		demon = d;	//�]�w����
	}
	void setFracpri(int n, int d)	//�]�w���Ƥ�k2 (�W��)
	{
		whole = 0;	//�]�w���
		numer = n;	//�]�w���l
		demon = d;	//�]�w����
	}
	void showFracpri()	//��ܤ��Ƥ�k
	{
		if(whole == 0)
			System.out.println(numer + "/" + demon);
		else
			System.out.println(whole + " " + numer + "/" + demon);
	}
}

public class J509_Fraction
{
	public static void main(String[] args)
	{
		J509_Fracpri f = new J509_Fracpri();	//�إ����O����
		System.out.print("�a���ơG");
		f.setFracpri(2, 3, 4);	//�I�s��l��setFracpri
		f.showFracpri();	
		System.out.print("�u���ơG");
		f.setFracpri(4, 5);	//�I�s�W����setFracpri
		f.showFracpri();
	}
}