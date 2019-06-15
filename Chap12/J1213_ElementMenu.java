import java.awt.*;
import java.awt.event.*;

class J1213_FrameWindow extends Frame //�إ߮ج[�������O
	implements ActionListener
{
	MenuBar menubar;	//�ŧi�\���C�ܼ�
	Menu mnuElement, mnuColor;	//�ŧi�\����ܼ�
	MenuItem itmLine, itmRectangle, itmCircle, itmCurve;	//�ŧi�\�ඵ�ܼ�
	MenuItem subRed, subBlue, subGreen, subBlack;	//�ŧi�\�ඵ�ܼ�
	Label lblMsg;	//�ŧi�����ܼ�
	J1213_FrameWindow(String title)	//�ج[�����إߪ�
	{
		super(title);	//�w�q�������D
		setLayout(new GridLayout(1, 1));	//�]�wGridLayout�t�m�Φ�
		lblMsg = new Label();	//�إ߼��Ҫ���
		add(lblMsg);	//�[�J���Ҩ������

		menubar = new MenuBar();	//�إߥ\���C
		mnuElement = new Menu("Element");	//�إ�Element�\���
		menubar.add(mnuElement);	//�[�JElement�\���
			itmLine = new MenuItem("Line",  	//�إ�Line�\�ඵ
				new MenuShortcut(KeyEvent.VK_L));	//�]�wLine���ֱ���
			itmRectangle = new MenuItem("Rectangle",  	//�إ�Rectangle�\�ඵ
				new MenuShortcut(KeyEvent.VK_R));	//�]�wRectangle���ֱ���
			itmCircle = new MenuItem("Circle",  	//�إ�Circle�\�ඵ
				new MenuShortcut(KeyEvent.VK_C));	//�]�wCircle���ֱ���
			itmCurve = new MenuItem("Curve",  	//�إ�curve�\�ඵ
				new MenuShortcut(KeyEvent.VK_V));	//�]�wCurve���ֱ���
		mnuColor = new Menu("Color");	//�[�JElement�\���
			subRed = new MenuItem("Red"); 	//�إ�Red�\�ඵ
			subBlue = new MenuItem("Blue"); 	//�إ�Blue�\�ඵ
			subGreen = new MenuItem("Green"); 	//�إ�Green�\�ඵ
			subBlack = new MenuItem("Black"); 	//�إ�Black�\�ඵ

			mnuElement.add(itmLine);	//�[�JLine��Element�\���
			mnuElement.add(itmRectangle);	//�[�JRectangle��Element�\���
			mnuElement.add(itmCircle);	//�[�JCircle��Element�\���
			mnuElement.add(itmCurve);	//�[�JCurve��Element�\���
			mnuElement.addSeparator();	//�[�J���j�u
			mnuElement.add(mnuColor);	//�[�JColor��Element�\���
				mnuColor.add(subRed);	//�[�JRed��Color�\���
				mnuColor.add(subBlue);	//�[�JBlue��Color�\���
				mnuColor.add(subGreen);	//�[�JGreen��Color�\���
				mnuColor.add(subBlack);	//�[�JBlack��Color�\���

			itmLine.addActionListener(this);	//�[�JLine�\�ඵ�ʧ@��ť
			itmRectangle.addActionListener(this);	//�[�JRectangle�\�ඵ�ʧ@��ť
			itmCircle.addActionListener(this);	//�[�JCircle�\�ඵ�ʧ@��ť
			itmCurve.addActionListener(this);	//�[�JCurve�\�ඵ�ʧ@��ť
			subRed.addActionListener(this);	//�[�JRed�\�ඵ�ʧ@��ť
			subBlue.addActionListener(this);	//�[�JBlue�\�ඵ�ʧ@��ť
			subGreen.addActionListener(this);	//�[�JGreen�\�ඵ�ʧ@��ť
			subBlack.addActionListener(this);	//�[�JBlack�\�ඵ�ʧ@��ť

		setMenuBar(menubar);	//�]�w�����\���C
	}
	public void actionPerformed(ActionEvent e)	//����Action�ƥ��k
	{
		if(e.getActionCommand().equals("Line"))	//�Y��Line�\�ඵ�ƥ�
			lblMsg.setText("���� Line �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Rectangle"))	//�Y��Rectangle�\�ඵ�ƥ�
			lblMsg.setText("���� Rectangle �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Circle"))	//�Y��Circle�\�ඵ�ƥ�
			lblMsg.setText("���� Circle �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Curve"))	//�Y��Curve�\�ඵ�ƥ�
			lblMsg.setText("���� Curve �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Red"))	//�Y��Red�\�ඵ�ƥ�
			lblMsg.setText("���� Red �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Blue"))	//�Y��Blue�\�ඵ�ƥ�
			lblMsg.setText("���� Blue �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Green"))	//�Y��Green�\�ඵ�ƥ�
			lblMsg.setText("���� Green �\��");	//�]�w���Ҥ�r
		else if(e.getActionCommand().equals("Black"))	//�Y��Black�\�ඵ�ƥ�
			lblMsg.setText("���� Black �\��");	//�]�w���Ҥ�r
	}
}
	
public class J1213_ElementMenu	//�إߵ������ε{�����O
{
	public static void main(String[] args)	//main��k
	{
		J1213_FrameWindow fw = new J1213_FrameWindow("ElementMenu");	//�إߵ�������
		fw.setSize(250, 150);	//�]�w�����j�p
		fw.addWindowListener(new WindowAdapter()	//�[�J������ť
		{ public void windowClosing(WindowEvent e)	//�����P�B�z���������ƥ�
			{System.exit(0);}	//��������������
		});
		fw.show();	//��ܵ���
	}
}