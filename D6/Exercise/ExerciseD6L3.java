class Profile3X {

	String pName;		//�m�W
	String pAge;		//�~��
	int pHeight;		//����
	int pWeight;		//�魫


	void showProfile() {

		System.out.println("*****" + pName + "���ӤH���*****");
		System.out.println("�~��" + pAge + "��");
		System.out.println("����" + pHeight + "cm");
		System.out.println("�魫" + pWeight + "kg");

		System.out.println("BMI���ƬO" + calcBMI());
		System.out.println("�m�W���r�ƬO" + calcLength());	

	}


	long calcBMI() {
		long lngBMI = Math.round(pWeight / Math.pow(pHeight , 2) * 10000);
		return lngBMI;
	}

	int calcLength() {
		int intLength = pName.length();
		return intLength;
	}
}


class UseProfile3X {
	public static void main(String args[]){

		Profile3X myProf = new Profile3X();

		myProf.pName = "�}�\�H";
		myProf.pAge = "30";
		myProf.pHeight = 175;
		myProf.pWeight = 60;

		myProf.showProfile();
	}
}
