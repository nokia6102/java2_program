//�פJ���O
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SampleD4L1 {
	public static void main(String args[]) {

		//�إߥΨ�Ū����J��ƪ�����
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in), 1);

		try{
			//�n�D��J�m�W
			System.out.println("�п�J�z���m�W�G");

			//�ŧiString���O���A���ܼ�,�ΨӥN�JŪ�������
			String myString = myReader.readLine();

			//�s���T������ܥX
			System.out.println("Hi!" + myString + ",�ܰ����{�ѧA");

		//���~�B�z�϶�
		}catch (IOException e) {
		}

	}
}