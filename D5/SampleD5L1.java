import java.io.*;

public class SampleD5L1 {
	public static void main(String args[]) {

		//�إߥΨ�Ū����ƪ�����
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{
			//��ܹC���}�l�T��
			System.out.println("�q�Ʀr�C�� START!!");
			System.out.println("�q���w�g��w�F�@�ӼƦr(0~9)");

			//�q����w���Ʀr
			int intAnswer = 5;

			//�n�D��J�Ʀr
			System.out.println("�q�q�ݥ��諸�O���ӼƦr");
			System.out.println("�A�諸�Ʀr�O:");

			//Ū����J����,�A�N�J�ܼƤ�
			String myString = myReader.readLine();
			int intNumber = Integer.parseInt(myString);

			//�P�_�O�_�q��
			if (intNumber == intAnswer)
				System.out.println("���T!�ӼF�`�F�a");
			else
				System.out.println("�ݩ�!  �q���諸�Ʀr�O" + intAnswer);

		//���~�B�z�϶�
		} catch (IOException e) {
			System.out.println("�o��IO���~!");

		} catch (NumberFormatException ne) {
			System.out.println("��J���ƭȤ����T!");
		}
	}
}