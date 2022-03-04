package Exercise;

public class Util {
    class Node{
        int value;
        Node info;
    }
    public Node top;
    public Node base;
    class minNode{
        int minvalue;
        minNode next;
    }
    public minNode head=null;
    public minNode low=null;
    public Util()
    {
        this.top=null;
        this.base=null;
    }
    public void push(int value){
        if (base==top){
            top=new Node();
            top.value=value;
            top.info=null;
        }
        if (head==low){
            head=new minNode();
            head.minvalue=value;
            head.next=null;
        }else if (value<=head.minvalue){
            head=new minNode();
            head.minvalue=value;
            head.next=null;
        }
    }
public void pop(){
        if (base==top){
            System.out.println("Stack is Empty");
        }
        while (top!=base){
            System.out.println(top.value);
            top=top.info;
        }
    }
    public int getTop(){
        if (base==top){
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return top.value;
        }
    }
public int getMin() {

            return head.minvalue;
            }
    }


