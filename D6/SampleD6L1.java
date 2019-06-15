//©w¸qProfile1Ãþ§O‚Ì’è‹`
class Profile1 {
	//©w¸qÄæ¦ì
	String pName;		//©m¦W
	String pAge;		//¦~ÄÖ
	int pHeight;		//¨­°ª
	int pWeight;		//Åé­«
}

//«Ø¥ß¤@­Ó¥Î¨Ó¶i¦æ´ú¸ÕªºÃþ§O
class UseProfile1 {

	public static void main(String args[]){

		//«Ø¥ßProfile1Ãþ§Oªº¹êÅé
		Profile1 myProf = new Profile1();

		//±N­È¥N¤JProfile1Ãþ§Oªº¦U­ÓÄæ¦ì¤¤
		myProf.pName = "¤s¥Ð ªá¤l";
		myProf.pAge = "30";
		myProf.pHeight = 160;
		myProf.pWeight = 50;

		//±N¦U­ÓÄæ¦ìªº­ÈÅã¥Ü©ó±±¨î¥x
		System.out.println("*****" + myProf.pName + "ªº­Ó¤H¸ê®Æ*****");
		System.out.println("¦~ÄÖ" + myProf.pAge + "·³");
		System.out.println("¨­°ª" + myProf.pHeight + "cm");
		System.out.println("Åé­«" + myProf.pWeight + "kg");
	}
}
