import java.awt.*;
import java.awt.event.*;

public class J1001_WindowEvent extends Frame
	implements WindowListener
{
	public static void main(String args[]) {
		J1001_WindowEvent we = new J1001_WindowEvent();	//�إ����O����
		we.addWindowListener(new J1001_WindowEvent());	//�[�J���󪺵�����ť
		we.setBounds(100, 100, 200, 200);	//�]�w�����j�p
		we.setVisible(true);	//��ܵ���
	}
	public void windowClosing(WindowEvent e) {	//���������ɩI�s����k
		System.out.println("��������");
		System.exit(0);	//��������
	}
	public void windowActivated(WindowEvent e) {	//�������o�D���I�s����k
		System.out.println("���o�D������");
	}
	public void windowDeactivated(WindowEvent e) {	//�������h�D���I�s����k
		System.out.println("���h�D������");
	}	
	public void windowDeiconified(WindowEvent e) {	//�����٭�ɩI�s����k
		System.out.println("�٭����");
	}
	public void windowIconified(WindowEvent e) {	//�����Y�p�ɩI�s����k
		System.out.println("�Y�p����");
	}
	public void windowOpened(WindowEvent e) {	//�}�ҵ����ɩI�s����k
		System.out.println("�}�ҵ���");
	}
	public void windowClosed(WindowEvent e) {	//����������I�s����k
	}
}
