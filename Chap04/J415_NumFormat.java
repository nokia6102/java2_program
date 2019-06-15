// 纗郎d:\Chap04\J415_NumFormat.java

import java.text.*;	//まjava.text.*
public class J415_NumFormat
{
	public static void main(String[] args)
	{
		int iNumber = 1016868;	//币﹍俱计
		double dNumber = 1.02543;	//币﹍弘计
		NumberFormat nf = NumberFormat.getNumberInstance();	//NumberFormatン

		nf.setMaximumIntegerDigits(5);	//砞﹚俱计程计
		String iStr = nf.format(iNumber);	//盢俱计锣Θ﹃
		System.out.println("俱计计 = " + iNumber);
		System.out.println("锣传﹃ = " + iStr);

		nf.setMaximumFractionDigits(2);	//砞﹚计翴计
		String dStr = nf.format(dNumber);	//盢弘计锣Θ﹃
		System.out.println("疊翴计 = " + dNumber);
		System.out.println("锣传﹃ = " + dStr);
	}
}
