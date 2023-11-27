import javax.swing.*;
import java.awt.*;
public class Display{
    JPanel panel; // the panel is not visible in output
    JPanel bigPanel;
    JLabel label;
    JTextField textThing; // accepts upto 10 characters
    JButton send;
    JButton reset;
    JLabel question1;
    JLabel question2;
    JLabel thing1;
    JLabel thing2;
    JLabel ans1;
    JLabel ans2;
    JFrame frame = new JFrame("Cheese Simulator.exe");
    public Display(){

    }
    public void makeDisp(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);

        panel = new JPanel(); // the panel is not visible in output
        bigPanel = new JPanel();
        label = new JLabel("Enter Text");
        textThing = new JTextField(10); // accepts upto 10 characters
        send = new JButton("Send");
        reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(textThing);
        panel.add(send);
        panel.add(reset);
       

        question1 = new JLabel("What would you like to search for?");
        ans1 = new JLabel("bean");
        question1.setBounds(0,0,100,50);
        ans1.setBounds(0,200,100,50);
        bigPanel.add(question1);
        frame.setVisible(true);
        bigPanel.add(ans1);
        frame.setVisible(true);

        thing1 = new JLabel("");
        thing2 = new JLabel("");
        thing1.setBounds(0,0,500,50);
        thing2.setBounds(0,300,500,50);
        frame.getContentPane().add(thing1);
        frame.setVisible(true);
        frame.getContentPane().add(thing2);
        frame.setVisible(true);
        /* 
        question1 = new JLabel("What would you like to search for?");
        question2 = new JLabel("What would you like to search for it in?"); 
        question1.setBounds(0,0,500,50);
        question2.setBounds(0,60,50,50);
        frame.getContentPane().add(question1);
        frame.getContentPane().add(question2);
        */
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, bigPanel);
        frame.setVisible(true);
    }
    public void sendText(){
        //idk
    }
}