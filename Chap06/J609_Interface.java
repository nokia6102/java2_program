// �x�s�ɦW�Gd:\Chap06\J609_Interface.java

interface J609_Constants	//�إ��ܼ�(�`��)����
{
	int LINE	= 101;
	int RECTANGLE   = 102;
	int CIRCLE 	= 103;
	int CURVE 	= 104;
}

class J609_Element implements J609_Constants	//�ŧiElement���O
{
	String createElement(int element)
	{
		switch(element)
		{
			case LINE: 	//�Yelement==LINE==101
				return "���u";
			case RECTANGLE: 	//�Yelement==RECTANGLE==102
				return "�����";
			case CIRCLE: 	//�Yelement==CIRCLE==103
				return "���";
			case CURVE: 	//�Yelement==CURVE==104
				return "���u";
			default: 	//�Yelement==��L
				return "�L��";
		}
	}
}

class J609_Interface {
	public static void main(String args[]) {
		J609_Element el = new J609_Element();	//�إ�Stacker����
		System.out.println("�إ�" + el.createElement(101));
		System.out.println("�إ�" + el.createElement(102));
		System.out.println("�إ�" + el.createElement(103));
		System.out.println("�إ�" + el.createElement(104));
	}
}