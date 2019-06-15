// �x�s�ɦW�Gd:\Chap02\J201_Define.java
// �ɮץ\��G�w�q��Ƶ{��

public class J201_Define
{
  public static void main(String[] args)
  {
    boolean bNumber = true;
    byte byteNumber = (byte)0xff;
    short shortNumber = (short)0x8000;
    int intNumber = 0x0000ffff;
    float fNumber = 1.35E13F;
    double dNumber = 1.35E13D;
    char zero = '0';	//�ϥγ�޸��]�t�r��0
    char chrA = 65;	//A��ASCII�X��65
    char octA = '\101';	//A���K�i��X��101
    char uniA = '\u0041';	//A��Unicode��0041

    System.out.println("(byte) 0xff = " + byteNumber);
    System.out.println("(short) 0x8000 = " + shortNumber);
    System.out.println("(int) 0x8000 = " + intNumber);
    System.out.println("1.35E13f = " + fNumber);
    System.out.println("1.35E13d = " + dNumber);
    System.out.println("Thirteen = " + 13);
    System.out.println("Zero = " + zero);
    System.out.println("chrA = " + chrA);
    System.out.println("octA = "+octA);
    System.out.println("uniA = "+uniA);
  }
}