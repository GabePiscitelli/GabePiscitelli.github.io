public class Stack{
    SNode head;
    int size;
    public class SNode{
        Object data;
        SNode next;
        public SNode(Object value){
            data = value;
        }
    }
    public Stack(Object value){
        SNode newNode = new SNode(value);
        head = newNode;
        size = 1;
    }
    //methods
    public boolean push(Object value){
        SNode newNode = new SNode(value);
        newNode.next = head;
        head = newNode;
        size++;
        return(true);
    }
    public Object pop(){
        SNode selected = head;
        head = head.next;
        size--;
        return(selected.data);
    }
    public Object peek(){
        return(head.data);
    }
}