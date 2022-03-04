package Exercise;

import java.util.*;

public class Dog<E>{
    private LinkedList<Integer>data;
    public boolean add(int x){
        data.add(x);
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        LinkedList<Integer>link=new LinkedList<Integer>();
        link.add(45);
        link.add(78);
        link.add(99);
        Iterator<Integer> num=link.iterator();
        while (num.hasNext()) {
            System.out.println(num.next());
        }
    }

}
