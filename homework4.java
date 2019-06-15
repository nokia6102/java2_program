
import java.awt.*;
import java.awt.event.*;

class iShowWindow extends Frame implements ActionListener
{
  Button showpoker;
  FontMetrics fm;
  iShowWindow(String title)
  {
  super(title);
  setLayout(new FlowLayout());
  showpoker =new Button("顯示");
  //add(showpoker);
  Homework4 showmsg=new Homework4();
 // String messages=Homework4.ShowMsg;
  showpoker.addActionListener(this);
  //Showpoker=new Label();
  }
  public void addbutton(String btnstr)
  {
  Button btnpoker;
  btnpoker=new Button(btnstr);
  add(btnpoker);
  }
  public void addstr(String aaa)
  {
  Label lbl2;
  lbl2=new Label(aaa);
  add(lbl2);
  }
  public void actionPerformed(ActionEvent e)
  {
   if (e.getSource()== showpoker)
    requestFocus();
    repaint();
  }
  public void paint(Graphics g)
  {
  // int xloc=(getSize().width-fm.stringWidth(messages))/2;
   //int yloc=(getSize().height+fm.getHeight())/2;
   //g.rawstring(messages, xloc ,yloc);
  }

  }

public class Homework4
{
  static int [][] poker=new int[6][2];
  public static void main(String[] args) //throws java.io.IOException
  {
  int [] inNum=new int[53];
  //java.io.BufferedReader line;
  //line=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
  //測試迴圈j

  for (int k=1;k<=2;k++)
  {
  for (int i=1;i<=52;i++)
   inNum[i]=i;
  boolean checkNum=false;
  int get5paper=1,j;
  String tmp="";

  for (int i=1;i<=5;i++)
  {
   do
    {
     j=(int)(Math.random()*52+1);
        poker[i][0]=j%13+1;
        poker[i][1]=j%4;
    }while(inNum[j]==0);
   checkNum=false;
  inNum[j]=0;
  }
  String ftype="";
  sort();
 /*
  for (int s=1;s<=5;s++)
  {
  switch (poker[s][1])
      {
       case 0:
        ftype="\3";
        break;
       case 1:
        ftype="\4";
        break;
       case 2:
        ftype="\5";
        break;
       case 3:
        ftype="\6";
        break;
       }
       System.out.println("poker[" + s +"][0]=>" + poker[s][0] + ftype);
  }
*/
  sort();
  String ShowMsg=teststraight();
  if (ShowMsg=="沒有牌型")
    ShowMsg=pair();
  else if( ShowMsg=="沒有牌型")
  ShowMsg=FullHouse();
  System.out.println(ShowMsg+"\3"+"\4");

 iShowWindow fw=new iShowWindow("遊戲視窗");
 fw.setSize(300, 300);



 for (int s=1;s<=5;s++)
  {
  switch (poker[s][1])
      {
       case 0:
        ftype="愛心";
        break;
       case 1:
        ftype="方塊";
        break;
       case 2:
        ftype="梅花";
        break;
       case 3:
        ftype="黑桃";
        break;
       }
    
    fw.addbutton(ftype+poker[s][0]);
 }


 fw.addstr(ShowMsg);
 fw.addWindowListener(new WindowAdapter()
 {public void windowClosing(WindowEvent e)
 {System.exit(0);}
   });
  fw.show();

  }
 }

  static boolean sort()
  {
  int counti,countj,buffer=0;
  for(counti=1;counti < 5;counti++)
  for(countj=counti;countj<6;countj++)
   if (poker[counti][0] > poker[countj][0])
    {
      buffer=poker[counti][0];
      poker[counti][0]=poker[countj][0];
      poker[countj][0]=buffer;
    }
  return true;
  }

  //測試順子function
  static String teststraight()
  {
  //排序

  boolean x=( (poker[1][0]+4==poker[5][0]) && (poker[2][0]+3==poker[5][0]) && (poker[3][0]+2==poker[5][0]) && (poker[4][0]+1==poker[5][0]) );
    //A,10,J,Q,K的情況
  if ((1==poker[1][0]) && (10==poker[2][0]) && (11==poker[3][0]) && (12==poker[4][0]) && (13==poker[5][0]))
  x=true;
  //是否同花
  if ((poker[1][1]==poker[2][1])&&(poker[1][1]==poker[2][1])&&(poker[1][1]==poker[3][1])&&(poker[1][1]==poker[4][1])&&(poker[1][1]==poker[5][1]))
  return "同花順";
  if (x)
  return "順子";
  else
   return "沒有牌型";
  }
  //判斷對數
  static String pair()
  {
  String pairMsg="沒有牌型";
  if( (poker[1][0]==poker[2][0])||(poker[2][0]==poker[3][0])||(poker[3][0]==poker[4][0])||(poker[4][0]==poker[5][0]) )
    pairMsg="一對";
  if( ((poker[1][0]==poker[2][0])&&(poker[3][0]==poker[4][0]))||((poker[1][0]==poker[2][0])&&(poker[4][0]==poker[5][0]))||((poker[2][0]==poker[3][0])&&(poker[4][0]==poker[5][0])) )
    pairMsg="二對";
  if( ((poker[1][0]==poker[2][0])&&(poker[1][0]==poker[3][0]))||((poker[2][0]==poker[3][0])&&(poker[2][0]==poker[4][0]))||((poker[3][0]==poker[4][0])&&(poker[3][0]==poker[5][0])) )
    pairMsg="三條";
  if( ((poker[1][0]==poker[2][0])&&(poker[1][0]==poker[3][0])&&(poker[1][0]==poker[4][0]))||((poker[2][0]==poker[3][0])&&(poker[2][0]==poker[4][0])&&(poker[2][0]==poker[5][0])) )
    pairMsg="鐵支";
  return pairMsg;
  }
  //判斷FullHouse
  static String FullHouse()
  {
    if( ((poker[1][0]==poker[2][0])&&(poker[3][0]==poker[4][0])&&(poker[3][0]==poker[5][0])&&(poker[1][0]!=poker[3][0]))||((poker[4][0]==poker[5][0])&&(poker[1][0]==poker[2][0])&&(poker[1][0]==poker[3][0])&&(poker[4][0]!=poker[1][0])) )
     return "FullHouse";
    else
     return "沒有牌型";
  }

}