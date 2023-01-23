import javax.swing.*;
import java.awt.*;
public class MyFrame
{
    // just updated on github  1/23
    public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setSize(500,500);

        BallPanel p1 = new BallPanel();
        //p1.setBackground(Color.ORANGE);

        f1.add(p1);

        //f1.pack();
        f1.setVisible(true);

    }
}
