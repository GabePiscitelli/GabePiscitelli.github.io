import javax.swing.*;
import java.awt.*;
public class Display{
    JPanel panel; // the panel is not visible in output
    JLabel label;
    JTextField textThing; // accepts upto 10 characters
    JButton send;
    JButton reset;
    JLabel question1;
    JLabel question2;
    JFrame frame = new JFrame("Cheese Simulator.exe");
    public Display(){

    }
    public void makeDisp(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);

        panel = new JPanel(); // the panel is not visible in output
        label = new JLabel("Enter Text");
        textThing = new JTextField(10); // accepts upto 10 characters
        send = new JButton("Send");
        reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(textThing);
        panel.add(send);
        panel.add(reset);
        question1 = new JLabel("What would you like to search for?");
        question2 = new JLabel("What would you like to search for it in?");
        question1.setBounds(0,0,250,15);
        frame.getContentPane().add(question1);
        question2.setBounds(90,10,300,15);
        frame.getContentPane().add(question2);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
    }
    public void sendText(){
        //idk
    }
}