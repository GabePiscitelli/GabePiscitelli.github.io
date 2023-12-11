import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Display{
    ImageState imgs;
    //imageIcon imgTest;
    TextReader reader = new TextReader();
    CheeseList cheeseList = new CheeseList();
    public boolean clicked = false;
    JPanel panel; // the panel is not visible in output
    JPanel bigPanel;
    JPanel oPanel;
    JLabel label;
    JTextField textThing; // accepts upto 10 characters
    JButton send;
    JButton monkey;
    JButton lowtier;
    JPanel imgPan;
    JLabel question1;
    JLabel question2;
    JLabel thing1;
    JLabel thing2;
    JTextField ans1;
    boolean displayImg;
    JTextField ans2;
    JFrame frame = new JFrame("Cheese Simulator.exe");
    int sendCount=0;
    public Display(){
        imgs = new ImageState();
        displayImg = false;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);
        
        panel = new JPanel(); // the panel is not visible in output
        bigPanel = new JPanel();
        imgPan = new JPanel();
        oPanel = new JPanel();
        //oPanel.setLocation(0, 100);

        send = new JButton("Send");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                click();
            }
        });

        monkey = new JButton("Display Image");
        monkey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                imgs.dispImg("monkey");
            }
        });

        lowtier = new JButton("Display Low Tier God");
        lowtier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                imgs.dispImg("lowtier");
            }
        });
        
        
        panel.add(send);
        panel.add(monkey);
        panel.add(lowtier);
        
       
        label = new JLabel("");
        panel.add(label);
        question1 = new JLabel("What would you like to search for?");
        ans1 = new JTextField(50);
        question1.setBounds(0,0,100,50);
        ans1.setBounds(0,50,100,100);
        bigPanel.add(question1);
        frame.setVisible(true);
        bigPanel.add(ans1);
        frame.setVisible(true);

        question2 = new JLabel("What would you like to search for it in?");
        ans2 = new JTextField(50);
        //question2.setBounds(0,100,100,50);
        //ans2.setBounds(0,200,100,50);
        oPanel.add(question2);
        frame.setVisible(true);
        oPanel.add(ans2);
        frame.setVisible(true);

        //imgTest = new imageIcon();
       
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(bigPanel, BorderLayout.NORTH);
        frame.getContentPane().add(BorderLayout.CENTER, oPanel);
        frame.getContentPane().add(BorderLayout.EAST, imgPan);

        frame.setVisible(true);
    }
    

    public void click(){
        String fInp = reader.format(ans2.getText());
        cheeseList.userInput(ans1.getText());
        int val = reader.search(cheeseList.value(1).data, fInp);
        //System.out.println(val);
        String v = Integer.toString(val);
        label.setText(v);
        cheeseList.delete(1);
        
    }
}