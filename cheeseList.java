public class cheeseList implements CheeseInterface{
    public class Cheese{
        int count;
        String data;
        public Cheese(String c){
            data = c;
        }
    }
    public cheeseList(){
        Cheese newCheese = new Cheese("Cheese");
        newCheese.count = 1;
    }
    public void add(){

    }
    public void delete(){

    }
    public void userInput(){
        
    }
    public void displayImage(){
        
    }
    public String get(){
        return("cheese");
    }
    public void insert(){

    }
}