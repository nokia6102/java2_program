import java.io.*;

public class SampleD5L4 {
	public static void main(String args[]) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

			//�إߥΨ��x�s���D�P�ѵ����}�C
			String strQuiz[][] = new String[5][5];
			
			//�i0�G���D	1��3�G�U�إi�઺���	4�G�ѵ��j
			//���D1
			strQuiz[0][0] = "���ꪺ�����O?";
			strQuiz[0][1] = "1. �ì�";
			strQuiz[0][2] = "2. �����F";
			strQuiz[0][3] = "3. �ز��yD.C.";
			strQuiz[0][4] = "3";

			//���D2
			strQuiz[1][0] = "1929�~���v�W�o�ͤF����j��?";
			strQuiz[1][1] = "1. �Ĥ@���@�ɤj���z�o";
			strQuiz[1][2] = "2. ���y�g�٤j���W";
			strQuiz[1][3] = "3. ���ۥ��o�{�s�j��";
			strQuiz[1][4] = "2";


			//���D3
			strQuiz[2][0] = "Love Me Tender�O�ѭ���q��t�۪�?";
			strQuiz[2][1] = "1. ���R�����S";
			strQuiz[2][2] = "2. U2";
			strQuiz[2][3] = "3. �ߤ�";
			strQuiz[2][4] = "3";

			//���D4
			strQuiz[3][0] = "5��1��O����`��?";
			strQuiz[3][1] = "1. �U�t�`";
			strQuiz[3][2] = "2. ���y���O��";
			strQuiz[3][3] = "3. �Ұʸ`";
			strQuiz[3][4] = "3";

			//���D5
			strQuiz[4][0] = "�y�ѤH�P���z�O����@�̪��@�~?";
			strQuiz[4][1] = "1. ������";
			strQuiz[4][2] = "2. ��t �s����";
			strQuiz[4][3] = "3. �O����ù";
			strQuiz[4][4] = "1";

		try{

			//��ܶ}�l�T��
			System.out.println("������ �`�Ѱݵ� ������");
			System.out.println("�ХH�Ʀr��X���T���ѵ��C");


			//�ŧi�P��l�ƭp���ܼ�
			int intCounter = 0;
			
			//�ŧi�P��l�ƭp���ܼ�
			int intPoint = 0;

			//�D�`��
			for (intCounter = 0; intCounter<=4; intCounter++) {

				//��ܰ��D
				System.out.println(strQuiz[intCounter][0] );

				System.out.println(strQuiz[intCounter][1] );
				System.out.println(strQuiz[intCounter][2] );
				System.out.println(strQuiz[intCounter][3] );

				//�n�D��J����
				System.out.println("���׬O:");


				//Ū����J��,�åN�J�ܼƤ�
				String myString = myReader.readLine();
				int myAnswer = Integer.parseInt(myString);

				//�P�_�O�_���T
				if (myAnswer == Integer.parseInt(strQuiz[intCounter][4]) ) {
					System.out.println("�F�`!�������T");
					intPoint ++;
				} else {
					System.out.println("��p!���׬O" + strQuiz[intCounter][4]);
				}
			}

			//��ܵ����D�ƻP�۹�T��
			System.out.println("\n������ ���Z���G ������");			
			switch (intPoint) {
				case 0:
					System.out.println("���x�ШS�C���K�K");
					break;
				case 1:
					System.out.println("����1�D�C�u�n�U���A�[�o�o�C");
					break;
				case 2:
					System.out.println("����2�D�C�A�[�I�o�a!");
					break;
				case 3:
					System.out.println("����3�D�C�٥i�H�աC");
					break;
				case 4:
					System.out.println("����4�D�C�٤�����!");
					break;
				case 5:
					System.out.println("����5�D�CPERFECT!!");
					break;
			}

		//���~�B�z�϶�
		}catch (IOException e) {
			System.out.println("�o��IO���~!");
		}catch (NumberFormatException ne) {
			System.out.println("��X���ƭȤ����T!");
		}
	}
}