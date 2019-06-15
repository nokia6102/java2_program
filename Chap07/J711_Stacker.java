class J711_Full extends Exception	//使用者自定例外類別
{
	public String toString() {
		return "堆疊滿了！";
	}
}

class J711_Empty extends Exception	//使用者自定例外類別
{
	public String toString() {
		return "堆疊空了！";
	}
}

class J711_Pointer
{
	final int max = 10;	//max=10,堆疊最大值
	int[] st = new int[max];	//保留10個堆疊空間
	int top = -1;	//top=-1,堆疊指標
	void push(int i) throws J711_Full	//push方法
	{
		if(top >= max -1)	//若堆疊滿了
			throw new J711_Full();	//投擲Full例外
		st[++top] = i;	//否則,將資料存入堆疊
	}
	int pop() throws J711_Empty	//pop方法
	{
		if(top < 0)	//若堆疊空了
			throw new J711_Empty();	//投擲Empty例外
		return st[top--];	//否則,傳回堆疊值
	}
}

public class J711_Stacker
{
	public static void main(String[] args)
	{
		J711_Pointer s = new J711_Pointer();	//建立J711_Pointer物件
		try {
			s.push(10);	//10推入堆疊頂端
			s.push(40);	//40推入堆疊頂端
			System.out.println(s.pop());	//取得堆疊頂端資料
			System.out.println(s.pop());	//取得堆疊頂端資料
			System.out.println(s.pop());	//取得堆疊頂端資料
		} catch(J711_Full e) {	//捕捉堆疊空了例外
			System.out.println( e );
		} catch(J711_Empty e) {	//捕捉堆疊空了例外
			System.out.println( e );
		}
	}
}