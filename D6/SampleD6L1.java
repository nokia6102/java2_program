//�w�qProfile1���O�̒�`
class Profile1 {
	//�w�q���
	String pName;		//�m�W
	String pAge;		//�~��
	int pHeight;		//����
	int pWeight;		//�魫
}

//�إߤ@�ӥΨӶi����ժ����O
class UseProfile1 {

	public static void main(String args[]){

		//�إ�Profile1���O������
		Profile1 myProf = new Profile1();

		//�N�ȥN�JProfile1���O���U����줤
		myProf.pName = "�s�� ��l";
		myProf.pAge = "30";
		myProf.pHeight = 160;
		myProf.pWeight = 50;

		//�N�U����쪺����ܩ󱱨�x
		System.out.println("*****" + myProf.pName + "���ӤH���*****");
		System.out.println("�~��" + myProf.pAge + "��");
		System.out.println("����" + myProf.pHeight + "cm");
		System.out.println("�魫" + myProf.pWeight + "kg");
	}
}
