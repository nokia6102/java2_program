// �x�s�ɦW�Gd:\Chap06\J608_Interface.java

interface J608_Stackface {	//�ŧiJ608_Stackface����
	void push(int val);	//�ŧipush������k
	int pop();	//�ŧipop������k
	boolean isEmpty();	//�ŧiisEmpty������k
	public boolean isFull();	//�ŧiisFull������k
}

class J608_Stacker implements J608_Stackface	//�ŧiStacker���O
{
	private int[] stack;
	private int pointer;
	J608_Stacker() {	//Stacker�إߪ�
		stack = new int[10]; 
		pointer = -1;
	}
	public void push(int val) {	//�w�qpush������k
		stack[++pointer] = val;
	}
	public int pop() {	//�w�qpop������k
		return stack[pointer--];
	}
	public boolean isEmpty() {	//�w�qisEmpty������k
		return pointer < 0 ? true : false;
	}
	public boolean isFull() {	//�w�qisFull������k
		return pointer >= 9 ? true : false;
	}
}

class J608_Interface {
	public static void main(String args[]) {
		J608_Stacker st = new J608_Stacker();	//�إ�Stacker����
		int i = 0;
		System.out.print("push: ");
		while(!st.isFull()) {	//�I�sisFull��k
			System.out.print(i);
			st.push(i++);	//�I�spush��k
		}
		System.out.println();
		System.out.print("pop:  ");
		while(!st.isEmpty())	//�I�sisEmpty��k
			System.out.print(st.pop());	//�I�spop��k
	}
}