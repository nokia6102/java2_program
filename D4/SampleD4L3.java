//�פJPackage
import java.io.*;

public class SampleD4L3 {
	public static void main(String args[]) {
		//�إߥΨ�Ū����ƪ�����
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			//��ܲĤ@�ӰT��
			System.out.println("�p��z��BMI����");

			//�n�D��J����
			System.out.println("�п�J�z������:");

			//�ŧi�@String���O���A���ܼƥΨӥN�JŪ���쪺��J���
			String myString = myReader.readLine();

			//�N�N�JString���O���A���ȦA�N�Jdouble���A���ܼƤ�
			double dblHeight = Double.parseDouble(myString);
			
			//�n�D��J�魫
			System.out.println("�п�J�z���魫:");

			//�NŪ���쪺��J��ƥN�JString���O���A���ܼƤ�
			myString = myReader.readLine();

			//�N�N�JString���O���A���ȦA�N�Jdouble���A���ܼƤ�
			double dblWeight = Double.parseDouble(myString);

			//����B��ñN���G�N�Jdouble���A���ܼƤ�
			long lngAnswer = Math.round(dblWeight / Math.pow(dblHeight , 2) * 10000);

			//��ܵ��G�T��
			System.out.println("�z��BMI���ƬO" + lngAnswer);
			System.out.println("�� �@��BMI���ƶW�X22�N��ܹL���F�@");

		//���~�B�z�϶� (IO���~)
		}catch (IOException e) {
			System.out.println("�o��IO���~!");

		//���~�B�z�϶� (NumberFormat���~)
		} catch (NumberFormatException ne) {
			System.out.println("��J���ƭȤ����T!");
		}
	}
}