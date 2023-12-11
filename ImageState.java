import javax.swing.*;
public class ImageState{
    HashTable imgHash;
    public ImageState(){
        imgHash = new HashTable();
        imgHash.add("Monkey", "C:\\Users\\gabe.piscitelli\\Pictures\\Camera Roll.monkey.jpg");
        imgHash.add("lowtier", "C:\\Users\\gabe.piscitelli\\Pictures\\other pics.cat.jpg");
    }
    public void dispImg(String image){
        String i = imgHash.get(image);
        ImageIcon img = new ImageIcon(i);
        JLabel imageLabel = new JLabel(img);
        Test.disp.imgPan.add(imageLabel);
        Test.disp.frame.setVisible(true);
    }
    
}