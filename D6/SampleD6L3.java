//�w�qProfile3���O
class Profile3 {
	//�w�q���
	String pName;		//�m�W
	String pAge;		//�~��
	int pHeight;		//����
	int pWeight;		//�魫

	//�w�qshowProfile��k
	void showProfile() {

		//�N�U��쪺����ܩ󱱨�x�W
		System.out.println("*****" + pName + "���ӤH���*****");
		System.out.println("�~��" + pAge + "��");
		System.out.println("����" + pHeight + "cm");
		System.out.println("�魫" + pWeight + "kg");

		//�I�scalcBMI��k
		System.out.println("BMI���ƬO" + calcBMI());		
	}

	//�w�qcalcBMI��k
	long calcBMI() {
		long lngBMI = Math.round(pWeight / Math.pow(pHeight , 2) * 10000);
		return lngBMI;
	}
}


//�إߤ@�ӥΨӶi����ժ����O
class UseProfile3 {
	public static void main(String args[]){

		//�إ�Profile3���O������
		Profile3 myProf = new Profile3();

		//�N�ȥN�JProfile3���O����줤
		myProf.pName = "�s�� ��l";
		myProf.pAge = "30";
		myProf.pHeight = 160;
		myProf.pWeight = 50;

		//�I�sshowProfile��k
		myProf.showProfile();
	}
}