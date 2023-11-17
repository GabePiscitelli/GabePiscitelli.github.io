/* The cheeseList holds a list of user inputted words which, if they match with the cheeses in "cheeses.txt", are displayed as an image 
of that cheese. The userInput function takes text typed into the console and adds it into the list. The displayImage function gives 
a command to the image class to create a new image using the hash table of file names whose keys are cheese names. All of the other 
commands (add, delete, get, insert) are the same as they would be in any other list. The "Cheese" class allows for each value in
cheeseList to hold both data and a count integer value. The count will be used to track how many times the word appears in the text
chosen to be searched for words.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class CheeseList implements CheeseInterface{
    Scanner scn = new Scanner(System.in);
    ArrayList<Object> valList = new ArrayList<Object>();
    public CheeseList(){
        // Makes a CheeseList containing "cheese"
        // Uses an ArrayList to hold Cheeses
        Cheese newCheese = new Cheese("cheese");
        newCheese.count = 0;
        valList.add(newCheese);
    }
    public void delete(int index){
        // Deletes thing from list
        valList.remove(index);
    }
    public void userInput(String inp){
        // Takes a user input and adds it to list, does not allow duplicates
        String input = inp.toLowerCase();
        for(int i=0; i<valList.size(); i++){
            if(value(i).data.equals(input)){
                return;
            }
        }
        Cheese newCheese = new Cheese(input);
        newCheese.count = 1;
        valList.add(newCheese);
    }
    
    public String displayImage(Cheese chez){
        // Called when an actual cheese is inputted into the search and returns what cheese needs to be displayed
        // Will be observed by an image displaying class
        String ret = chez.data;
        return(ret);
    }

    public Cheese value(int index){
        // Returns the cheese at the given index in the ArrayList
        return((Cheese)valList.get(index));
    }
}