import java.io.*;

public class SampleD5L3 {
	public static void main(String args[]) {
		//�إߥΨ�Ū����ƪ�����
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		try{

			//�ŧi�ù���ƥΨӵo�ݡB�ѵ����}�C
			String strQuestion[] = new String[3];
			int intAnswer[] = new int[3];

			//�N���D�P�ѵ��N�J�}�C
			strQuestion [0] ="25 ��5 = ?";
			intAnswer[0] = 5;
			strQuestion [1] ="10 ��3 = ?";
			intAnswer[1] = 30;
			strQuestion [2] ="100 + 1000 = ?";
			intAnswer[2] = 1100;


			//��ܶ}�l�T��
			System.out.println("������ �ߺ�C�� ������");
			System.out.println("�Ц^���q�����X�����D");


			//�ŧi�ê�l�ƭp�ƾ��ܼ�
			int intCounter = 0;

			//�D�`��
			for (intCounter = 0; intCounter<=2; intCounter++) {

				//��ܰ��D
				System.out.println(strQuestion[intCounter]);

				//�n�D��J����
				System.out.println("���׬O:");

				//Ū����J��,�åN�J�ܼƤ�
				String myString = myReader.readLine();
				int myAnswer = Integer.parseInt(myString);

				//�P�_�O�_���T
				if (myAnswer == intAnswer[intCounter])
					System.out.println("�F�`!�������T");
				else
					System.out.println("��p!���׬O" + intAnswer[intCounter]);
			}

		//���~�B�z�϶�
		}catch (IOException e) {
			System.out.println("�o��IO���~!");
		}catch (NumberFormatException ne) {
			System.out.println("��J���ƭȤ����T!");
		}
	}
}