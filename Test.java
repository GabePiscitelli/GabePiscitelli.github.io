public class Test{
    public static void main(String args[]){
        CheeseList cheeseList = new CheeseList();
        cheeseList.userInput("user");
        cheeseList.userInput("user");
        System.out.println(cheeseList.value(1).count);
    }
}