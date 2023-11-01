public class Test{
    public static void main(String args[]){
        TextReader reader = new TextReader();
        CheeseList cheeseList = new CheeseList();
        System.out.println("What word would you like to search for?");
        cheeseList.userInput();
        System.out.println("What text would you like to search for it in?");
        String text = reader.takeText();
        reader.format(text);
        for(int i=0; i<cheeseList.valList.size(); i++){
            System.out.println(cheeseList.value(i).data + ":" + reader.search(cheeseList.value(i).data, text));
        }
        
    }
}