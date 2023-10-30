import javax.swing.*;
import java.awt.*;
public class Display{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cheese Simulator.exe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);


        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        JButton t = new JButton("test");
        panel.add(t);

        frame.getContentPane().add(BorderLayout.NORTH, t);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);

        while(true){
            t.setText(ta.getText());
        }
    }
}