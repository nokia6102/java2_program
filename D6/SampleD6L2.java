//定義Profile2類別
class Profile2 {
	//定義欄位
	String pName;		//姓名
	String pAge;		//年齡
	int pHeight;		//身高
	int pWeight;		//體重

	//定義方法
	void showProfile() {

		//將各欄位的值顯示於控制台上
		System.out.println("*****" + pName + "的個人資料*****");
		System.out.println("年齡" + pAge + "歲");
		System.out.println("身高" + pHeight + "cm");
		System.out.println("體重" + pWeight + "kg");
	}
}


//建立一個用來進行測試的類別
class UseProfile2 {

	public static void main(String args[]){

		//建立Profile2類別的實體
		Profile2 myProf = new Profile2();

		//將值代入Profile2類別的欄位中
		myProf.pName = "山田 花子";
		myProf.pAge = "30";
		myProf.pHeight = 160;
		myProf.pWeight = 50;

		//呼叫showProfile方法
		myProf.showProfile();

	}
}