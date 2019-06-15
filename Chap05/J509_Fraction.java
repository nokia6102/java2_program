// 纗郎d:\Chap05\J509_Fraction.java

class J509_Fracpri	//摸
{
	int whole;	//ン跑计
	int numer;	//ン跑计
	int demon;	//ン跑计
	void setFracpri(int w, int n, int d)	//砞﹚だ计よ猭1
	{
		whole = w;	//砞﹚俱计
		numer = n;	//砞﹚だ
		demon = d;	//砞﹚だダ
	}
	void setFracpri(int n, int d)	//砞﹚だ计よ猭2 (禬更)
	{
		whole = 0;	//砞﹚俱计
		numer = n;	//砞﹚だ
		demon = d;	//砞﹚だダ
	}
	void showFracpri()	//陪ボだ计よ猭
	{
		if(whole == 0)
			System.out.println(numer + "/" + demon);
		else
			System.out.println(whole + " " + numer + "/" + demon);
	}
}

public class J509_Fraction
{
	public static void main(String[] args)
	{
		J509_Fracpri f = new J509_Fracpri();	//ミ摸ン
		System.out.print("盿だ计");
		f.setFracpri(2, 3, 4);	//㊣﹍setFracpri
		f.showFracpri();	
		System.out.print("痷だ计");
		f.setFracpri(4, 5);	//㊣禬更setFracpri
		f.showFracpri();
	}
}