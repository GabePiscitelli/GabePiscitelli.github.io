/* The cheeseList holds a list of user inputted words which, if they match with the cheeses in "cheeses.txt", are displayed as an image 
of that cheese. The userInput function takes text typed into the console and adds it into the list. The displayImage function gives 
a command to the image class to create a new image using the hash table of file names whose keys are cheese names. All of the other 
commands (add, delete, get, insert) are the same as they would be in any other list. The "Cheese" class allows for each value in
cheeseList to hold both data and a count integer value. The count will be used to track how many times the word appears in the text
chosen to be searched for words.
*/
public class cheeseList implements CheeseInterface{
    public class Cheese{
        int count;
        int index;
        String data;
        public Cheese(String c){
            data = c;
            index = 0;
        }
    }
    int indexVal = 0;
    public cheeseList(){
        Cheese newCheese = new Cheese("Cheese");
        newCheese.count = 0;
        newCheese.index = indexVal;
        indexVal++;
    }
    public void delete(){

    }
    public void userInput(){
        Cheese newCheese = new Cheese("user input");
        newCheese.count = 0;
        newCheese.index = indexVal;
        indexVal++;
    }
    public void displayImage(){
        
    }
    public String get(int index){
        return("cheese");
    }
}