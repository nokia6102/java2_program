import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SampleD10L3 extends Applet {

	int intPosX;                    //�x�s�ƹ���Ъ���m�]X�b�^
	int intPosY;                    //�x�s�ƹ���Ъ���m�]Y�b�^
	Image imgIcon;                  //�d�����ϥ�

	public void init() {

		//�]�wApplet���I���⬰�Ŧ�
		setBackground(Color.blue);

		//�qHTML�����ѼƨӨ��o�ϥܪ��ɦW
		String strIconName = getParameter("ICON_NAME");

		//�Q�Ψ��o���ϥ��ɦW�Ө��o�ϥܪ��v��
		imgIcon = getImage(getDocumentBase(), strIconName);

		//�n���ƹ��ƥ��ť��
		addMouseMotionListener(new MouseMotionAdapter(){
			//�w�qmouseMoved�ƥ��k
			public void mouseMoved(MouseEvent me){

				//�qMouseEvent����Ө��o��Хثe��
				//��m�]X�b, Y�b�^�ñN���N�J�ܼ�
				intPosX = me.getX();
				intPosY = me.getY();
				//�Ǧ��I�s�Xpaint��k
				repaint();
			}
		});
	}

	//paint��k�]�nø�XApplet�ɩҩI�s�X����k�^
	public void paint(Graphics g) {
		//�Q�ΰѼ�Graphics����֦���drawImage��k
		//�b�ثe�ƹ���Ъ��Ҧb��m�Wø�X�d�����ϥ�
		g.drawImage(imgIcon, intPosX + 10, intPosY + 10, this);
	}
}