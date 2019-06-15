//定義Profile4類別
class Profile4 {
	//定義欄位
	String pName;		//姓名
	String pAge;		//年齡
	int pHeight;		//身高
	int pWeight;		//體重

	//定義建構子
	Profile4(String name, String age, int height, int weight) {
		//將值代入各欄位中
		pName = name;
		pAge = age;
		pHeight = height;
		pWeight = weight;
	}

	//定義showProfile方法
	public void showProfile() {

		//將各欄位的值顯示於控制台上
		System.out.println("*****" + pName + "的個人資料*****");
		System.out.println("年齡" + pAge + "歲");
		System.out.println("身高" + pHeight + "cm");
		System.out.println("體重" + pWeight + "kg");
	}

	//定義calcBMI方法
	public long calcBMI() {
		return Math.round(pWeight / Math.pow(pHeight , 2) * 10000);
	}
}


//建立一個用來進行測試的類別
class UseProfile4 {

	public static void main(String args[]){

		//建立Profile4類別的實體
		Profile4 myProf = new Profile4("山田 花子", "30", 160, 50);

		//呼叫showProfile方法
		myProf.showProfile();

		//呼叫calcBMI方法
		System.out.println("BMI指數是" + myProf.calcBMI());
	}
}