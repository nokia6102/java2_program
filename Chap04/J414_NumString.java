// �x�s�ɦW�Gd:\Chap04\J414_NumString.java

import java.text.*;	//�ޤJjava.text.*
public class J414_NumString
{
	public static void main(String[] args) throws Exception
	{
		int iNumber;	//�ŧi����ܼ�
		System.out.println("i" + "\t" + "i����");	//��ܼ��D
		for(int i=0; i<10; i++) {
			iNumber = (int)Math.pow(i, 2);	//�p��i������
			if(String.valueOf(iNumber).length() == 1)	//���Ħ�ƬO�_��1
				System.out.println(i + "\t  " + iNumber);	//�w���[2�Ů�
			else
				System.out.println(i + "\t " + iNumber);	//�w���[1�Ů�
		}
	}
}
