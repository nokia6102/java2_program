//�פJ���O
import java.io.*;

public class ExerciseD4L2 {
	public static void main(String args[]) {
		//�إߥΨ�Ū����J��ƪ�����
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			//��ܲĤ@�ӰT��
			System.out.println("���� A ��B ���B��");

			//�n�D��JA
			System.out.println("�п�JA");

			//�ŧi�@String���O���A���ܼƥΨӥN�JŪ���쪺��J���
			String myString = myReader.readLine();

			//�N�N�JString���O���A���ȦA�N�Jint���A���ܼƤ�
			int intA = Integer.parseInt(myString);
			
			//�n�D��JB
			System.out.println("�п�JB");

			//�NŪ���쪺��J��ƥN�JString���O���A���ܼƤ�
			myString = myReader.readLine();

			//�N�N�JString���O���A���ȦA�N�Jint���A���ܼƤ�
			int intB = Integer.parseInt(myString);

			//�p�� A ��B ,�ñN���G�N�JintAnswer
			int intAnswer = intA * intB;

			//��ܵ��G
			System.out.println("A ��B ���p�⵲�G�O" + intAnswer);

		//���~�B�z�϶�
		}catch (IOException e) {
			System.out.println("�����~����");
		}
	}
}