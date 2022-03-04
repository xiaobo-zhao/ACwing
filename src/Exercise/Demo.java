package Exercise;
import java.util.*;
public class Demo {
     static  void showPush(Stack<Integer>st,int a){
        st.push(new Integer (a));
         System.out.println("push"+" "+a);
         System.out.println("stack"+st);
    }
    static void showPop(Stack<Integer>st){
         st.pop();
        System.out.println("stack"+st);

    }

    public static void main(String[] args) {
        Stack<Integer> sta=new Stack<>();
           showPush(sta,78);
           showPush(sta,99);
        System.out.println(sta);
        showPop(sta);
        System.out.println(sta);
    }

}
