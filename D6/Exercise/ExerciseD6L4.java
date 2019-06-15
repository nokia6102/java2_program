class Profile4 {
	String pName;		//姓名
	String pAge;		//年齡
	int pHeight;		//身高
	int pWeight;		//體重

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

		System.out.println("*****" + pName + "的個人資料*****");
		System.out.println("年齡" + pAge + "歲");
		System.out.println("身高" + pHeight + "cm");
		System.out.println("體重" + pWeight + "kg");
	}

	public long calcBMI() {
		return Math.round(pWeight / Math.pow(pHeight , 2) * 10000);
	}
}


class UseProfile4 {

	public static void main(String args[]){
		Profile4 myProf = new Profile4("山田 花子", 30, 160, 50);
		myProf.showProfile();
		System.out.println("BMI指數是" + myProf.calcBMI());
	}
}