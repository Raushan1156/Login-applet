import java.awt.*;
import java.awt.event.*;
public class login extends Frame{
    Label un,up;
    TextField tx1,tx2;
    Button b;
    login(){
        setLayout(null);

        un=new Label("Enter username:");
        un.setSize(100,30);
        un.setLocation(90,90);
        add(un);

        tx1=new TextField(20);
        tx1.setLocation(220,100);
        tx1.setSize(150,25);
        add(tx1);

        up=new Label("Password:");
        up.setSize(100,30);
        up.setLocation(90,140);
        add(up);

        tx2=new TextField(20);
        tx2.setLocation(220,150);
        tx2.setSize(150,25);
        add(tx2);

        //Login button
        b=new Button("Login");
        b.setLocation(150,200);
        b.setSize(120,30);
        add(b);

        setVisible(true);
        setSize(440,350);
        setLocation(500,200);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        }

    public static void main(String [] args)
    {
     login l=new login();
    }
}