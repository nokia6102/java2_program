// 儲存檔名：d:\Chap05\J518_Inventory.java

class J518_Access
{
	private int[] identify;
	private int[] quantity;
	private float[] price;

	J518_Access(int max)	//Access建立者
	{
		identify = new int[max];
		quantity = new int[max];
		price = new float[max];
	}
	public int update( int ID, int Qty, float Pr )	//更新資料方法
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				quantity[i] = Qty;
				price[i] = Pr;
				System.out.println("已更新編號：" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				identify[i] = ID;
				quantity[i] = Qty;
				price[i] = Pr;
				System.out.println("已附加編號：" + identify[i]);
				break;
			}
		}
		return Qty;
	}
	public void update( int ID, int number )	//更新資料方法 (超載1)
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				quantity[i] -= number;
				System.out.println("已更新編號：" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("找不到相符編號。");
				break;
			}
		}
	}
	public void update( int ID, float percent )	//更新資料方法 (超載2)
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				price[i] -= percent;
				System.out.println("已更新編號：" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("找不到相符編號。");
				break;
			}
		}
	}
	public void setQuantity( int ID, int Qty )	//設定數量方法
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				quantity[i] = Qty;
				System.out.println("已更新編號：" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("找不到相符編號。");
				break;
			}
		}
	}
	public int getQuantity( int ID )	//取得數量方法
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
	public void setPrice( int ID, float Pr )	//設定單價方法
	{
		for(int i=0; i<price.length; i++) {
			if( identify[i] == ID ) {
				price[i] = Pr;
				System.out.println("已更新編號：" + identify[i]);
				break;
			}
			else if( identify[i] == 0 ) {
				System.out.println("找不到相符編號。");
				break;
			}
		}
	}
	public float getPrice( int ID )	//取得單價方法
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
	public void stockReport(  )	//顯示報表方法
	{
		float total = 0;
		for(int i=0; i<identify.length; i++) {
			if(identify[i] != 0) {
				System.out.print("編號 " + identify[i] + "：");
				System.out.print(" 庫存量：" + quantity[i]);
				System.out.println(" 單價：" + price[i]);
				total += (quantity[i] * price[i]);
			}
		}
		System.out.println("總價：" + total);
	}
} // End of J518_Access class

public class J518_Inventory
{
	public static void main(String[] args) throws java.io.IOException
	{
		J518_Access Invent = new J518_Access(100);	//建立J518_Access物件
		java.io.BufferedReader br;	//宣告BufferedReader物件
		br = new java.io.BufferedReader(
		     new java.io.InputStreamReader(System.in));	//建立並配置br物件
		int strID;
		int intQty;
		float floatPr;
		while(true) {
			System.out.print("\n1.更新資料  2.更新數量  3.取得數量  4.更新單價  5.取得單價");
			System.out.print("\n6.減少數量  7.降低單價  8.顯示報表  9.結束程式  ");
			System.out.print("選擇 1-9：");
			char sel = (char)System.in.read();	//讀取輸入字元
			System.in.read(); System.in.read();	//讀取LF與CR

			switch(sel) {	//判斷輸入字元
			    case '1':	//若輸入字元='1'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.print("輸入數量：");
				intQty = Integer.parseInt(br.readLine());
				System.out.print("輸入單價：");
				floatPr = Float.parseFloat(br.readLine());
				Invent.update(strID, intQty, floatPr);
				break;
			    case '2':	//若輸入字元='2'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.print("輸入數量：");
				intQty = Integer.parseInt(br.readLine());
				Invent.setQuantity(strID, intQty);
				break;
			    case '3':	//若輸入字元='3'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.println("編號 " + strID + " 庫存量："
						+ Invent.getQuantity(strID));
				break;
			    case '4':	//若輸入字元='4'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.print("輸入單價：");
				floatPr = Float.parseFloat(br.readLine());
				Invent.setPrice(strID, floatPr);
				break;
			    case '5':	//若輸入字元='5'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.println("編號 " + strID + " 單價："
						+ Invent.getPrice(strID));
				break;
			    case '6':	//若輸入字元='6'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.print("減少數量：");
				intQty = Integer.parseInt(br.readLine());
				Invent.update(strID, intQty);
				break;
			    case '7':	//若輸入字元='7'
				System.out.print("輸入編號：");
				strID = Integer.parseInt(br.readLine());
				System.out.print("減少單價：");
				floatPr = Float.parseFloat(br.readLine());
				Invent.update(strID, floatPr);
				break;
			    case '8':	//若輸入字元='8'
				Invent.stockReport();
				break;
			    case '9':	//若輸入字元='9'
				return;
			}
		}
	}
} // End of J518_Inventory class