// 儲存檔名：d:\Chap06\J608_Interface.java

interface J608_Stackface {	//宣告J608_Stackface介面
	void push(int val);	//宣告push介面方法
	int pop();	//宣告pop介面方法
	boolean isEmpty();	//宣告isEmpty介面方法
	public boolean isFull();	//宣告isFull介面方法
}

class J608_Stacker implements J608_Stackface	//宣告Stacker類別
{
	private int[] stack;
	private int pointer;
	J608_Stacker() {	//Stacker建立者
		stack = new int[10]; 
		pointer = -1;
	}
	public void push(int val) {	//定義push介面方法
		stack[++pointer] = val;
	}
	public int pop() {	//定義pop介面方法
		return stack[pointer--];
	}
	public boolean isEmpty() {	//定義isEmpty介面方法
		return pointer < 0 ? true : false;
	}
	public boolean isFull() {	//定義isFull介面方法
		return pointer >= 9 ? true : false;
	}
}

class J608_Interface {
	public static void main(String args[]) {
		J608_Stacker st = new J608_Stacker();	//建立Stacker物件
		int i = 0;
		System.out.print("push: ");
		while(!st.isFull()) {	//呼叫isFull方法
			System.out.print(i);
			st.push(i++);	//呼叫push方法
		}
		System.out.println();
		System.out.print("pop:  ");
		while(!st.isEmpty())	//呼叫isEmpty方法
			System.out.print(st.pop());	//呼叫pop方法
	}
}