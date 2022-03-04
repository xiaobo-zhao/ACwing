package Exercise;

public class Linked {
    class Node {
        public int data;
        public Node info;
        public Node(int data){
            this.data=data;
        }
    }
    public int size;
    public Node head;
//    ��ʼ��
    public Linked(){
        this.size=0;
        this.head=null;
    }
//    ͷ�巨
    public boolean addFirst(int data){
        Node node=new Node(data);
        if (size==0){
            head=node;
            size++;
            return true;
        }else {
            node.info=head;
            head=node;
            size++;
            return true;
        }
    }
//    β�巨
    public boolean addLast(int data){
        Node node=new Node(data);
        Node temp;
        if (size==0){
            head=node;
            size++;
            return true;
        }
        temp=head;
        while (temp.info!=null){
            temp=temp.info;
        }
        temp.info=node;
        temp=node;
        size++;
        return true;
    }
//    ��������
    public void disPlay(){
        Node temp=head;
        if (head==null){
            return;
        }
        for (int i=0;i<size;i++){
            System.out.print(temp.data+" ");
            temp=temp.info;
        }
    }
//    �ж������Ƿ�Ϊnull
    public boolean isEmpty(){
        if (size==0){
            return true;
        }else {
            return false;
        }
    }
//    ��ͷɾ������
    public boolean removeFirst(){
        head=head.info;
        size--;
        return true;
    }
//    ��β��ɾ������
    public boolean removeLast(){
        Node temp;
        if (this.size==0){
            return false;
        }
        temp=head;
        while (temp.info!=null){
            temp=temp.info;
        }
        temp.info=null;
        this.size--;
        return true;
    }
//    ��һ��ֵɾ��
    public boolean removeNum(int index){
        if (isEmpty()){
            return false;
        }
        if (index<0||index>(size)){
            System.err.print("��������ȷ���±�!");
            return false;
        }
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.info;
        }
        head.info=temp.info;
        this.size--;
        return true;
    }


}


