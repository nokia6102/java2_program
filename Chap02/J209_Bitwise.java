//儲存檔名：d:\Chap02\J209_Bitwise.java

public class J209_Bitwise
{
	public static void main(String[] args)
	{
		char hex[] = {'0', '1', '2', '3', '4', '5',
			      '6', '7', '8', '9', 'a', 'b',
			      'c', 'd', 'e', 'f'};
		byte a = (byte)0x57;	//宣告並啟始a值
		byte b = (byte)0x93;	//宣告並啟始b值
		int x = ~ a;	//宣告並指定x值
		int y = a & b;	//宣告並指定y值
		int z = a | b;	//宣告並指定z值
		int w = a ^ b;	//宣告並指定w值

		System.out.println ("a = 0x" + hex[(a & 0xf0) >> 4] + hex[a & 0x0f]);	//輸出字串、a值與定位
		System.out.println ("b = 0x" + hex[(b & 0xf0) >> 4] + hex[b & 0x0f]);	//輸出字串、b值與跳行
		System.out.println ("~a = 0x" + hex[(x & 0xf0) >> 4] + hex[x & 0x0f]);	//輸出字串、x值與跳行
		System.out.println ("a&b = 0x" + hex[(y & 0xf0) >> 4] + hex[y & 0x0f]);	//輸出字串、y值與跳行
		System.out.println ("a|b = 0x" + hex[(z & 0xf0) >> 4] + hex[z & 0x0f]);	//輸出字串、z值與跳行
		System.out.println ("a^b = 0x" + hex[(w & 0xf0) >> 4] + hex[w & 0x0f]);	//輸出字串、w值與跳行
	}
}