public class Test{
    public static void main(String args[]){
        //boolean var = false;
        TextReader reader = new TextReader();
        CheeseList cheeseList = new CheeseList();
        Display disp = new Display();
        disp.makeDisp();
        while(true){
        if(disp.send.getModel().isPressed()==true){
                cheeseList.userInput(disp.textThing.getText());
                System.out.println("UWU");
                //disp.ans1.setText(cheeseList.value(1).data);
                //disp.frame.setVisible(true);
                break;
        }}
    }
}