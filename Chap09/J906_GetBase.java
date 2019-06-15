import java.applet.Applet;
import java.awt.*;
import java.net.*;

public class J906_GetBase extends Applet
{
	String codeBase = "Code Base: ";	//�w�qcodeBase�r��
	String docBase = "Document Base: ";	//�w�qdocBase�r��
	int Width, Height;	//�w�qWidth, Height�ܼ�
	public void start()
	{
		String param;	//�w�qparam�r���ܼ�

		param = getParameter("Width");	//���ohtml��Width�Ѽ�
		try {
			if(param != null)	//�Y���O�Ŧr��
				Width = Integer.parseInt(param) / 2 - 150;	//�N�Ѽ��ন���
			else			//�Y�ѼƬO�Ŧr��
				Width = 10;	//�OWidth=10
		} catch(NumberFormatException e) {
			Width = 0;	//�OWidth=0
		}

		param = getParameter("Height");	//���ohtml��Height�Ѽ�
		try {
			if(param != null)	//�Y���O�Ŧr��
				Height = Integer.parseInt(param) / 2;	//�N�Ѽ��ন���
			else			//�Y�ѼƬO�Ŧr��
				Height = 30;	//�OHeight=30
		} catch(NumberFormatException e) {
			Height = 0;	//�OHeight=0
		}
	}
	public void paint(Graphics g)
	{
		URL u1 = getCodeBase();	//���oclass�ɪ�URL��}
		codeBase += u1.toString();	//u1�[�JcodeBase�r��
		URL u2 = getDocumentBase();	//���oHTML�ɮת�URL��}
		docBase += u2.toString();	//u2�[�JdocBase�r��
		g.drawString(codeBase, Width, (Height-10));		//���codeBase�r��
		g.drawString(docBase, Width, (Height+10));		//���docBase�r��
	}
}
