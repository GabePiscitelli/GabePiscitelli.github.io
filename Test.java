public class Test{
    public static void main(String args[]){
        //boolean var = false;
        TextReader reader = new TextReader();
        CheeseList cheeseList = new CheeseList();
        Display disp = new Display();
        while(true){
            if(disp.sendCount==1){
                cheeseList.userInput(disp.textThing.getText());
            }
        }
    }
}