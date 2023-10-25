public class TextReader implements TextReaderInterface{
    public String format(String input){
        String ret = input;
        ret = ret.replaceAll("\\s", ""); 
        ret = ret.replaceAll(".", "");
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