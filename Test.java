public class Test{
    public static void main(String args[]){
        boolean var = false;
        TextReader reader = new TextReader();
        CheeseList cheeseList = new CheeseList();
        Display disp = new Display();
        disp.makeDisp();
        System.out.println("What word would you like to search for?");
        cheeseList.userInput();
        System.out.println("What text would you like to search for it in?");
        String text = reader.takeText();
        reader.format(text);
        //System.out.println(disp.textThing.getText());
        for(int i=0; i<cheeseList.valList.size(); i++){
            System.out.println(cheeseList.value(i).data + ":" + reader.search(cheeseList.value(i).data, text));
        }
        while(var == false){
            if(Display.send.getModel().isPressed() == true){
                System.out.println("chez");
                var = true;
            }
        }
    }
}