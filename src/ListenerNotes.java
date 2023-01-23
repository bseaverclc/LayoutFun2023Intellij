import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // need this package for listeners
public class ListenerNotes
{

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setSize(400,400);

        JLabel helloLabel = new JLabel("Hello World");

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);

        // adding a mouse listener to the panel
        // This will get called automatically for us
        // when the user clicks on the Panel
        panel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                helloLabel.setText("(" + x + "," + y + ")");
            }
        });

        JButton button1 = new JButton("Push Me");
        // adding an action listener to the button
        // gets called for us when the user clicks on the button
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                helloLabel.setText("I pushed it");
            }
        });

        JTextField textfield1 = new JTextField(10);
        // adding an actionListener to the textfield
        // gets called for us when the user is in the textfield
        // and clicks the return button on the keyboard
        textfield1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                helloLabel.setText(textfield1.getText());
            }
        });

        ImageIcon icon = new ImageIcon("pony.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);

        panel.add(helloLabel);
        panel.add(button1);
        panel.add(textfield1);
        panel.add(picLabel);

        frame.add(panel);

        frame.setVisible(true);

    }

}

