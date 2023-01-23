import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Creating my own Panel class that inherits from JPanel
public class BallPanel extends JPanel
{
    Ball one = new Ball();

    public BallPanel()
    {
        setPreferredSize(new Dimension(400,400));
        // adding a keylistener to this panel
        // Need this so it knows what panel to focus on
        this.setFocusable(true);
        this.addKeyListener(new MyKeyListener());
        this.addMouseListener(new MyMouseListener());
    }

    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package
    protected void paintComponent(Graphics g)
    {
        // calling the paintComponent method I overroad
        super.paintComponent(g);

        setBackground(Color.BLACK);

        one.draw(g);
        //one.move();
        one.bounce();

        // If the ball hits the right edge change what we add each time
        // if(x >= 400)
        // xAdd = -1;

        // update the location of the ball
        //x = x + xAdd;

        // pause the program
        try
        {
            Thread.sleep(10);

        }
        catch(Exception blah)
        {
            System.out.println(blah.toString());
        }

        repaint(); // calls paintComponent again



    }

    // extending keyAdapter and overriding the methods I want
    public class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            System.out.println(e.getKeyCode());
            one.moveRight();
        }

    }

    public class MyMouseListener extends MouseAdapter
    {
        public void    mouseClicked(MouseEvent e)
        {
            System.out.println("clicked");
        }
    }

}
