// �x�s�ɦW�Gd:\Chap03\J312_TimesTable.java

public class J312_TimesTable
{
	public static void main(String[] args)
	{
		int count1, count2;
		for (count2=1; count2<=9; count2++)	//�Q���ưj���1��9
		{
			for (count1=2; count1<=5; count1++)	//���ưj���2��5
			{
				System.out.print(count1 + " * " + count2 + " = ");	//��Xcount1 '*' count2
				System.out.print(count1*count2 + "\t");	//��X�ø��ܤU�@�w��
			}
			System.out.println();	//��X����
		}
		System.out.println();	//��X����
		for (count2=1; count2<=9; count2++)	//�Q���ưj���1��9
		{
			for (count1=6; count1<=9; count1++)	//���ưj���6��9
			{
				System.out.print(count1 + " * " + count2 + " = ");	//��Xcount1 '*' count2
				System.out.print(count1*count2 + "\t");	//��X�ø��ܤU�@�w��
			}
			System.out.println();	//��X����
		}
	}
}