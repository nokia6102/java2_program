// �x�s�ɦW�Gd:\Chap05\J518_Inventory.java

class J518_Access
{
	private int[] identify;
	private int[] quantity;
	private float[] price;

	J518_Access(int max)	//Access�إߪ�
	{
		identify = new int[max];
		quantity = new int[max];
		price = new float[max];
	}
	public int update( int ID, int Qty, float Pr )	//��s��Ƥ�k
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				quantity[i] = Qty;
				price[i] = Pr;
				System.out.println("�w��s�s���G" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				identify[i] = ID;
				quantity[i] = Qty;
				price[i] = Pr;
				System.out.println("�w���[�s���G" + identify[i]);
				break;
			}
		}
		return Qty;
	}
	public void update( int ID, int number )	//��s��Ƥ�k (�W��1)
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				quantity[i] -= number;
				System.out.println("�w��s�s���G" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("�䤣��۲Žs���C");
				break;
			}
		}
	}
	public void update( int ID, float percent )	//��s��Ƥ�k (�W��2)
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				price[i] -= percent;
				System.out.println("�w��s�s���G" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("�䤣��۲Žs���C");
				break;
			}
		}
	}
	public void setQuantity( int ID, int Qty )	//�]�w�ƶq��k
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				quantity[i] = Qty;
				System.out.println("�w��s�s���G" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("�䤣��۲Žs���C");
				break;
			}
		}
	}
	public int getQuantity( int ID )	//���o�ƶq��k
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				return quantity[i];
			}
			else if( identify[i] == '0' ) {
				return 0;
			}
		}
		return 0;
	}
	public void setPrice( int ID, float Pr )	//�]�w�����k
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				price[i] = Pr;
				System.out.println("�w��s�s���G" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("�䤣��۲Žs���C");
				break;
			}
		}
	}
	public float getPrice( int ID )	//���o�����k
	{
		float temp = 0.0f;
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				return price[i];
			}
			else if( identify[i] == 0 ) {
				return 0.0f;
			}
		}
		return 0.0f;
	}
	public void stockReport(  )	//��ܳ����k
	{
		float total = 0;
		for(int i=0; i<identify.length; i++) {
			if(identify[i] != 0) {
				System.out.print("�s�� " + identify[i] + "�G");
				System.out.print(" �w�s�q�G" + quantity[i]);
				System.out.println(" ����G" + price[i]);
				total += (quantity[i] * price[i]);
			}
		}
		System.out.println("�`���G" + total);
	}
} // End of J518_Access class

public class J518_Inventory
{
	public static void main(String[] args) throws java.io.IOException
	{
		J518_Access Invent = new J518_Access(100);	//�إ�J518_Access����
		java.io.BufferedReader br;	//�ŧiBufferedReader����
		br = new java.io.BufferedReader(
		     new java.io.InputStreamReader(System.in));	//�إߨðt�mbr����
		int strID;
		int intQty;
		float floatPr;
		while(true) {
			System.out.print("\n1.��s���  2.��s�ƶq  3.���o�ƶq  4.��s���  5.���o���");
			System.out.print("\n6.��ּƶq  7.���C���  8.��ܳ���  9.�����{��  ");
			System.out.print("��� 1-9�G");
			char sel = (char)System.in.read();	//Ū����J�r��
			System.in.read(); System.in.read();	//Ū��LF�PCR

			switch(sel) {	//�P�_��J�r��
			    case '1':	//�Y��J�r��='1'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.print("��J�ƶq�G");
				intQty = Integer.parseInt(br.readLine());
				System.out.print("��J����G");
				floatPr = Float.parseFloat(br.readLine());
				Invent.update(strID, intQty, floatPr);
				break;
			    case '2':	//�Y��J�r��='2'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.print("��J�ƶq�G");
				intQty = Integer.parseInt(br.readLine());
				Invent.setQuantity(strID, intQty);
				break;
			    case '3':	//�Y��J�r��='3'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.println("�s�� " + strID + " �w�s�q�G"
						+ Invent.getQuantity(strID));
				break;
			    case '4':	//�Y��J�r��='4'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.print("��J����G");
				floatPr = Float.parseFloat(br.readLine());
				Invent.setPrice(strID, floatPr);
				break;
			    case '5':	//�Y��J�r��='5'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.println("�s�� " + strID + " ����G"
						+ Invent.getPrice(strID));
				break;
			    case '6':	//�Y��J�r��='6'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.print("��ּƶq�G");
				intQty = Integer.parseInt(br.readLine());
				Invent.update(strID, intQty);
				break;
			    case '7':	//�Y��J�r��='7'
				System.out.print("��J�s���G");
				strID = Integer.parseInt(br.readLine());
				System.out.print("��ֳ���G");
				floatPr = Float.parseFloat(br.readLine());
				Invent.update(strID, floatPr);
				break;
			    case '8':	//�Y��J�r��='8'
				Invent.stockReport();
				break;
			    case '9':	//�Y��J�r��='9'
				return;
			}
		}
	}
} // End of J518_Inventory class