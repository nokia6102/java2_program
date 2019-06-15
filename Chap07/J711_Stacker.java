class J711_Full extends Exception	//�ϥΪ̦۩w�ҥ~���O
{
	public String toString() {
		return "���|���F�I";
	}
}

class J711_Empty extends Exception	//�ϥΪ̦۩w�ҥ~���O
{
	public String toString() {
		return "���|�ŤF�I";
	}
}

class J711_Pointer
{
	final int max = 10;	//max=10,���|�̤j��
	int[] st = new int[max];	//�O�d10�Ӱ��|�Ŷ�
	int top = -1;	//top=-1,���|����
	void push(int i) throws J711_Full	//push��k
	{
		if(top >= max -1)	//�Y���|���F
			throw new J711_Full();	//���YFull�ҥ~
		st[++top] = i;	//�_�h,�N��Ʀs�J���|
	}
	int pop() throws J711_Empty	//pop��k
	{
		if(top < 0)	//�Y���|�ŤF
			throw new J711_Empty();	//���YEmpty�ҥ~
		return st[top--];	//�_�h,�Ǧ^���|��
	}
}

public class J711_Stacker
{
	public static void main(String[] args)
	{
		J711_Pointer s = new J711_Pointer();	//�إ�J711_Pointer����
		try {
			s.push(10);	//10���J���|����
			s.push(40);	//40���J���|����
			System.out.println(s.pop());	//���o���|���ݸ��
			System.out.println(s.pop());	//���o���|���ݸ��
			System.out.println(s.pop());	//���o���|���ݸ��
		} catch(J711_Full e) {	//�������|�ŤF�ҥ~
			System.out.println( e );
		} catch(J711_Empty e) {	//�������|�ŤF�ҥ~
			System.out.println( e );
		}
	}
}