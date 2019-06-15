//�w�qProfile4���O
class Profile4 {
	//�w�q���
	String pName;		//�m�W
	String pAge;		//�~��
	int pHeight;		//����
	int pWeight;		//�魫

	//�w�q�غc�l
	Profile4(String name, String age, int height, int weight) {
		//�N�ȥN�J�U��줤
		pName = name;
		pAge = age;
		pHeight = height;
		pWeight = weight;
	}

	//�w�qshowProfile��k
	public void showProfile() {

		//�N�U��쪺����ܩ󱱨�x�W
		System.out.println("*****" + pName + "���ӤH���*****");
		System.out.println("�~��" + pAge + "��");
		System.out.println("����" + pHeight + "cm");
		System.out.println("�魫" + pWeight + "kg");
	}

	//�w�qcalcBMI��k
	public long calcBMI() {
		return Math.round(pWeight / Math.pow(pHeight , 2) * 10000);
	}
}


//�إߤ@�ӥΨӶi����ժ����O
class UseProfile4 {

	public static void main(String args[]){

		//�إ�Profile4���O������
		Profile4 myProf = new Profile4("�s�� ��l", "30", 160, 50);

		//�I�sshowProfile��k
		myProf.showProfile();

		//�I�scalcBMI��k
		System.out.println("BMI���ƬO" + myProf.calcBMI());
	}
}