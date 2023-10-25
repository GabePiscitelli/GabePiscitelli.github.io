public class TextReader implements TextReaderInterface{
    public TextReader(){

    }
    public String takeText(){
        String textChunk="According to all known laws of aviation, there is no way a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway because bees don't care what humans think is impossible. Yellow, black. Yellow, black. Yellow, black. Yellow, black. Ooh, black and yellow! Let's shake it up a little.";
        return(textChunk);
    }
    public String format(String input){
        String ret = input;
        ret = ret.toLowerCase();
        return(ret);
    }

    public int search(String word, String fInput){
        int ret = 0;
        String[] check = new String[word.length()];
        int ind = 0;
        for(int i=0; i<word.length(); i++){
            check[i] = word.substring(i,i+1);
        }
        for(int i=0; i<fInput.length(); i++){
            System.out.println(check[ind]);
            if(fInput.substring(i,i+1) == check[ind]){
                if(ind == check.length-1){
                    ret++;
                }
                ind++;
            }
        }
        return(ret);
    }
}