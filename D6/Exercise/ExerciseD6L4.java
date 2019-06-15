class Profile4 {
	String pName;		//�m�W
	String pAge;		//�~��
	int pHeight;		//����
	int pWeight;		//�魫

	Profile4(String name, String age, int height, int weight) {
		pName = name;
		pAge = age;
		pHeight = height;
		pWeight = weight;
	}

	Profile4(String name, int age, int height, int weight) {
		pName = name;
		pAge = Integer.toString(age);
		pHeight = height;
		pWeight = weight;
	}

	public void showProfile() {

		System.out.println("*****" + pName + "���ӤH���*****");
		System.out.println("�~��" + pAge + "��");
		System.out.println("����" + pHeight + "cm");
		System.out.println("�魫" + pWeight + "kg");
	}

	public long calcBMI() {
		return Math.round(pWeight / Math.pow(pHeight , 2) * 10000);
	}
}


class UseProfile4 {

	public static void main(String args[]){
		Profile4 myProf = new Profile4("�s�� ��l", 30, 160, 50);
		myProf.showProfile();
		System.out.println("BMI���ƬO" + myProf.calcBMI());
	}
}