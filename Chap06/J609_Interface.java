// 儲存檔名：d:\Chap06\J609_Interface.java

interface J609_Constants	//建立變數(常數)介面
{
	int LINE	= 101;
	int RECTANGLE   = 102;
	int CIRCLE 	= 103;
	int CURVE 	= 104;
}

class J609_Element implements J609_Constants	//宣告Element類別
{
	String createElement(int element)
	{
		switch(element)
		{
			case LINE: 	//若element==LINE==101
				return "直線";
			case RECTANGLE: 	//若element==RECTANGLE==102
				return "長方形";
			case CIRCLE: 	//若element==CIRCLE==103
				return "圓形";
			case CURVE: 	//若element==CURVE==104
				return "曲線";
			default: 	//若element==其他
				return "無形";
		}
	}
}

class J609_Interface {
	public static void main(String args[]) {
		J609_Element el = new J609_Element();	//建立Stacker物件
		System.out.println("建立" + el.createElement(101));
		System.out.println("建立" + el.createElement(102));
		System.out.println("建立" + el.createElement(103));
		System.out.println("建立" + el.createElement(104));
	}
}