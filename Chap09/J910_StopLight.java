import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J910_StopLight extends Applet implements ActionListener
{
	Button btnRed, btnYellow, btnGreen;	//�ŧi�R�O���s�ܼ�
	int firstX = 65, firstY = 60;	//�ŧi�Ĥ@�ꪺ�_�I
	int secondX = firstX + 60, secondY = 60;	//�ŧi�ĤG�ꪺ�_�I
	int thirdX = firstX + 120, thirdY = 60;	//�ŧi�ĤT�ꪺ�_�I
	Color firstC = Color.red;	//�ŧi�Ĥ@�ꪺ���
	Color secondC = Color.gray;	//�ŧi�ĤG�ꪺ���
	Color thirdC = Color.gray;	//�ŧi�ĤT�ꪺ���
	String message = "���@�O�@��";

	public void init() {
		setBackground(Color.cyan);	//�]�w�I���⬰�L�Ǧ�
		btnRed = new Button("���O");	//�إ߬��O�R�O���s
		btnYellow = new Button("���O");	//�إ߶��O�R�O���s
		btnGreen = new Button("��O");	//�إߺ�O�R�O���s
		add(btnRed);	//�[�J���O���s��Applet
		add(btnYellow);	//�[�J���O���s��Applet
		add(btnGreen);	//�[�J��O���s��Applet
		btnRed.addActionListener(this);	//�[�J���O���sListerer
		btnYellow.addActionListener(this);	//�[�J���O���sListerer
		btnGreen.addActionListener(this);	//�[�J��O���sListerer
	}

	public void paint(Graphics g) {
		g.drawRect(firstX-20, firstY-20, 210, 90);	//�e�Ť߯x��
		g.setColor(firstC);	//�]�w�Ĥ@���C��
		g.fillOval(firstX, firstY, 50, 50);	//�e�Ĥ@�Ӷ�
		g.setColor(secondC);	//�]�w�ĤG���C��
		g.fillOval(secondX, secondY, 50, 50);	//�e�ĤG�Ӷ�
		g.setColor(thirdC);	//�]�w�ĤT���C��
		g.fillOval(thirdX, thirdY, 50, 50);	//�e�ĤT�Ӷ�
		g.setColor(Color.black);	//�]�w��X��
		g.drawString(message, secondX, secondY+100);	//��X�r��
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("���O")) {	//�Y��"���O"���s
			firstC = Color.red;	//�]�w�Ĥ@�ꪺ�C��
			secondC = Color.gray;	//�]�w�ĤG�ꪺ�C��
			thirdC = Color.gray;	//�]�w�ĤT�ꪺ�C��
			message = "���@�O�@��";	//�]�w��X�r��
		} else if(str.equals("���O")) {	//�Y��"���O"���s
			firstC = Color.gray;	//�]�w�Ĥ@�ꪺ�C��
			secondC = Color.yellow;	//�]�w�ĤG�ꪺ�C��
			thirdC = Color.gray;	//�]�w�ĤT�ꪺ�C��
			message = "���O�ݱ���";	//�]�w��X�r��
		} else if(str.equals("��O")) {	//�Y��"��O"���s
			firstC = Color.gray;	//�]�w�Ĥ@�ꪺ�C��
			secondC = Color.gray;	//�]�w�ĤG�ꪺ�C��
			thirdC = Color.green;	//�]�w�ĤT�ꪺ�C��
			message = "��@�O�@��";	//�]�w��X�r��
		}
		repaint();	//����applet
	}
}
