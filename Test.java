public class Test{
    public static void main(String args[]){
        CheeseList cheeseList = new CheeseList();
        cheeseList.userInput();
        System.out.println(cheeseList.displayImage(cheeseList.value(0)));
    }
}