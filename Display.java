import javax.swing.*;
import java.awt.*;
public class Display{
    JPanel panel; // the panel is not visible in output
    JLabel label;
    JTextField textThing; // accepts upto 10 characters
    static JButton send;
    JButton reset;
    JLabel t;
    JTextArea ta;
    JFrame frame = new JFrame("Cheese Simulator.exe");
    public Display(){

    }
    public void makeDisp(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        panel = new JPanel(); // the panel is not visible in output
        label = new JLabel("Enter Text");
        textThing = new JTextField(10); // accepts upto 10 characters
        send = new JButton("Send");
        reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(textThing);
        panel.add(send);
        panel.add(reset);
        t = new JLabel();
        frame.getContentPane().add(BorderLayout.NORTH, t);
        // Text Area at the Center
        ta = new JTextArea();
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
    public void sendText(){
        t.setText(textThing.getText());
        frame.setVisible(true);
    }
}