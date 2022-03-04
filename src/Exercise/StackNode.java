package Exercise;
/*
* Õ»
* */
public class StackNode {
    class Node{
        int value;
        Node info;
    }
    public Node top;//Õ»¶¥
    public Node base;//Õ»µ×
    public StackNode(){
        this.top=null;
        this.base=null;
    }
//    ÈëÕ»
    public void pushStack(int value){
        if (top==base)
        {
            top=new Node();
            top.value=value;
            top.info=null;
        }
        else {
            Node temp=top;
            top=new Node();
            top.value=value;
            top.info=temp;
            }
            }
//      ³öÕ»
    public boolean  popStack(){
        if (top==base){
            System.err.print("Stack is Empty Overflow");
            return false;
        }
        while (top!=base){
        top=top.info;
        }
        return true;
    }
//      Õ»¶¥ÔªËØ
    public  int topNum(){
        int temp=top.value;
        return temp;
    }
//    ±éÀúÕ»
    public void displayStack() {
        if (top == base) {
            System.err.print("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != base) {
            System.out.print(temp.value + " ");
            temp = temp.info;
        }

    }
//    Õ»ÊÇ·ñÎª¿Õ
    public  boolean isEmpty(){
        if (top==base){
            System.out.println("Empty");
            return true;
        }
        System.out.println("Õ»²»Îª¿Õ");
        return false;
    }
}
