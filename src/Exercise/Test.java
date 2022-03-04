package Exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         AcWing acWing=new AcWing();
        int[]net=new int[3];
        Scanner in=new Scanner(System.in);
        for (int i=0;i< net.length;i++){
            net[i]=in.nextInt();
        }
        for (int c:acWing.twoSum(net,6)) {
            System.out.print(c+" ");
        }
        }


}
