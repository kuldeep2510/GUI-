import java.awt.*;

class MarvellousWindow extends Frame
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
  B1.setBounds(50,50,100,50);
  T1.setBounds(50,150,200,50);
  
  add(B1);
  add(T1);
  setLayout(null);
  setVisible(true);

}
}
class GUI5
{
    public static void main(String arg[])
    {
       MarvellousWindow mobj1 =new MarvellousWindow("First",500,600);
      
    }
}