import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Display{
    public boolean clicked = false;
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
    JTextField ans1;
    JTextField ans2;
    JFrame frame = new JFrame("Cheese Simulator.exe");
    int sendCount=0;
    public Display(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);

        panel = new JPanel(); // the panel is not visible in output
        bigPanel = new JPanel();
        bigPanel.setBounds(0, 0, 500, 500);
        label = new JLabel("Enter Text");
        textThing = new JTextField(10); // accepts upto 10 characters
        send = new JButton("Send");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                clicked = true;
            }
        });
        reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(textThing);
        panel.add(send);
        panel.add(reset);
       

        question1 = new JLabel("What would you like to search for?");
        ans1 = new JTextField(100);
        question1.setBounds(0,0,100,50);
        ans1.setBounds(0,50,100,100);
        bigPanel.add(question1);
        frame.setVisible(true);
        bigPanel.add(ans1);
        frame.setVisible(true);

        question2 = new JLabel("What would you like to search for it in?");
        ans2 = new JTextField(100);
        question2.setBounds(0,100,100,50);
        ans2.setBounds(0,200,100,50);
        //frame.add(question2);
        frame.setVisible(true);
        //frame.add(ans2);
        frame.setVisible(true);

        
       
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, bigPanel);
        frame.setVisible(true);
    }
    public int sendClick(){
        System.out.println("HRERRDER");
        if(sendCount==1){
            ans1.setText(textThing.getText());
            textThing.setText("");
            frame.setVisible(true);
            return(1);
        }
        if(sendCount==2){
            ans2.setText(textThing.getText());
            textThing.setText("");
            frame.setVisible(true);
            return(2);
        }
        return(-1);
    }
}