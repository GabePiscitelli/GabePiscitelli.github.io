import java.util.*;
class HashTable{
    Object[] index;
    String[] values;
    public HashTable(){
        index = new Object[10];
        values = new String[10];
    }
    public String get(String key){
        for(int i=0; i<index.length; i++){
            if(index[i] != null && index[i].equals(key)){
                return(values[i]);
            }
        }
        return(null);
    }
    public boolean add(Object key, String value){
        for(int i=0; i<index.length; i++){
            if(index[i]==null){
                index[i] = key;
                values[i] = value;
                return(true);
            }
        }
        resize();
        for(int i=0; i<index.length; i++){
            if(index[i].equals(null)){
                index[i] = key;
                values[i] = value;
                return(true);
            }
        }
        return(false);
    }
    public void resize(){
        Object[] new_key_arr = new Object[index.length+1];
        String[] new_val_arr = new String[values.length+1];
        for(int i=0; i<index.length; i++){
            new_key_arr[i] = index[i];
            new_val_arr[i] = values[i];
        }
    }
    public Object elements(){
        return(values);
    }
    public Object keys(){
        return(index);
    }
}