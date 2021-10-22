import java.awt.*;
import java.awt.event.*;


class MarvellousWindow extends Frame implements ActionListener
{
  Button B1;
  TextField T1;
public MarvellousWindow(String str,int x,int y)
{

  super();
  setTitle(str);
  setSize(x,y);

  B1= new Button("Submit");
  T1= new TextField();
  B1.setBounds(50,300,100,50);
  T1.setBounds(10,150,200,50);
  
  add(B1);
  add(T1);
  B1.addActionListener(this);
  setLayout(null);
  setVisible(true);

}
public void actionPerformed(ActionEvent obj)
{
  T1.setText("Kuldeep");
}
}
class GUI6
{
    public static void main(String arg[])
    {
       MarvellousWindow mobj1 =new MarvellousWindow("First",500,600);
      
    }
}