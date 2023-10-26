public class Test{
    public static void main(String args[]){
        TextReader reader = new TextReader();
        CheeseList cheeseList = new CheeseList();
        cheeseList.userInput("balls");
        String text = reader.takeText();
        reader.format(text);
        //System.out.println(cheeseList.value(0).data);
        for(int i=0; i<cheeseList.valList.size(); i++){
            System.out.println(cheeseList.value(i).data);
            System.out.println(reader.search(cheeseList.value(i).data, text)); 
        }
    }
}