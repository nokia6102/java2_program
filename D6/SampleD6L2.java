//�w�qProfile2���O
class Profile2 {
	//�w�q���
	String pName;		//�m�W
	String pAge;		//�~��
	int pHeight;		//����
	int pWeight;		//�魫

	//�w�q��k
	void showProfile() {

		//�N�U��쪺����ܩ󱱨�x�W
		System.out.println("*****" + pName + "���ӤH���*****");
		System.out.println("�~��" + pAge + "��");
		System.out.println("����" + pHeight + "cm");
		System.out.println("�魫" + pWeight + "kg");
	}
}


//�إߤ@�ӥΨӶi����ժ����O
class UseProfile2 {

	public static void main(String args[]){

		//�إ�Profile2���O������
		Profile2 myProf = new Profile2();

		//�N�ȥN�JProfile2���O����줤
		myProf.pName = "�s�� ��l";
		myProf.pAge = "30";
		myProf.pHeight = 160;
		myProf.pWeight = 50;

		//�I�sshowProfile��k
		myProf.showProfile();

	}
}