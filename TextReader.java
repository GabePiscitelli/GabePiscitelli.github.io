import java.util.Scanner;
public class TextReader implements TextReaderInterface{
    Scanner scn = new Scanner(System.in);
    public TextReader(){
        // Need an instance of a TextReader to run code
    }
    public String takeText(){
        // Will eventually take a user input and return it
        String textChunk = scn.nextLine();
        return(textChunk);
    }
    public String format(String input){
        // Makes the input lowercase
        String ret = input;
        ret = ret.toLowerCase();
        return(ret);
    }

    public int search(String word, String formattedInput){
        /* Takes a word and searches through a given text for how many times that word is spelled. 
        For example if you give it the word "egg" and the text "enter the gray ghost's house" it will return
        1 because it finds the first "e" then the first "g" then another "g" but there are no more times "g"
        appears in the text.
        */
        int wordCount = 0;
        String[] wordToCheck = new String[word.length()];
        int wordIndex = 0;
        for(int i=0; i<word.length(); i++){
            wordToCheck[i] = word.substring(i,i+1);
        }
        for(int i=0; i<formattedInput.length(); i++){
            if(formattedInput.substring(i,i+1).equals(wordToCheck[wordIndex])){
                if(wordIndex == wordToCheck.length-1){
                    wordCount++;
                    wordIndex=0;
                }
                wordIndex++;
            }
        }
        return(wordCount);
    }
}