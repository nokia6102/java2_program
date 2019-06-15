import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class J1007_ItemEvent extends Applet
	implements ItemListener
{
	Label lblCo, lblWeb;	//�ŧi�����ܼ�
	TextField txtWeb;	//�ŧi��r����ܼ�
	List lstCo;	//�ŧi�M���ܼ�

	public void init()
	{
		lblCo = new Label("���q�G");	//�إߤ��q����
		lblWeb = new Label("���}�G");	//�إߺ��}����
		txtWeb = new TextField("", 15);	//�إߤ�r���
		txtWeb.setEditable(false);	//�]�����i�s�誺���
		lstCo = new List();	//�إ߲M����
		lstCo.add("��ڪ@��");	//�[�J�M�涵��
		lstCo.add("��ڶ���");	//�[�J�M�涵��
		lstCo.add("��ڷL�n");	//�[�J�M�涵��
		add(lblWeb);	//�[�J���Ҩ�Applet
		add(txtWeb);	//�[�J��r�����Applet
		add(lblCo);	//�[�J���Ҩ�Applet
		add(lstCo);	//�[�J�M������Applet
		lstCo.addItemListener(this);	//�[�J�M�檺���غ�ť
	}

	public void itemStateChanged(ItemEvent e) {
		List l = (List)e.getItemSelectable();
		switch(l.getSelectedIndex())
		{
		case 0:		//��ܲ�0����ڪ@��
			txtWeb.setText("java.sun.com");	//��X�r����r���
			break;
		case 1:		//��ܲ�1����ڶ���
			txtWeb.setText("www.yahoo.com");	//��X�r����r���
			break;
		case 2:		//��ܲ�2����ڷL�n
			txtWeb.setText("www.microsoft.com");	//��X�r����r���
			break;
		default:
			txtWeb.setText("");	//��X�r����r���
			break;
		}
	}
}
