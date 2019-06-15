class Profile3X {

	String pName;		//姓名
	String pAge;		//年齡
	int pHeight;		//身高
	int pWeight;		//體重


	void showProfile() {

		System.out.println("*****" + pName + "的個人資料*****");
		System.out.println("年齡" + pAge + "歲");
		System.out.println("身高" + pHeight + "cm");
		System.out.println("體重" + pWeight + "kg");

		System.out.println("BMI指數是" + calcBMI());
		System.out.println("姓名的字數是" + calcLength());	

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

		myProf.pName = "徐許信";
		myProf.pAge = "30";
		myProf.pHeight = 175;
		myProf.pWeight = 60;

		myProf.showProfile();
	}
}
