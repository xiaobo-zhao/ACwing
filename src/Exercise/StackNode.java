package Exercise;
/*
* ջ
* */
public class StackNode {
    class Node{
        int value;
        Node info;
    }
    public Node top;//ջ��
    public Node base;//ջ��
    public StackNode(){
        this.top=null;
        this.base=null;
    }
//    ��ջ
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
//      ��ջ
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
//      ջ��Ԫ��
    public  int topNum(){
        int temp=top.value;
        return temp;
    }
//    ����ջ
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
//    ջ�Ƿ�Ϊ��
    public  boolean isEmpty(){
        if (top==base){
            System.out.println("Empty");
            return true;
        }
        System.out.println("ջ��Ϊ��");
        return false;
    }
}
