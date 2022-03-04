package Exercise;

/*
* ¿ìËÙÅÅÐò--µÝ¹éËã·¨
*
* */
public class TestMain {
    public static void quick_Sort(int[]arr,int left,int right) {
        if (left>right){
            return;
        }
        int i,j,key,temp;
        i=left;
        j=right;
        key=arr[left];
        while (i<j) {
            while (key <=arr [j] && i < j) {
                j--;
            }
            while (key >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left]=arr[i];
        arr[i]=key;
        quick_Sort(arr, left, j-1);
        quick_Sort(arr, j+1, right);
    }


    public static void main(String[] args) {
        int[]arr={45,78,97,64,31,50,20,24};
        System.out.println("ÅÅÐòÇ°:");
        for (int i:arr) {
            System.out.print(i+" ");
        }
        quick_Sort(arr,0, arr.length-1);
        System.out.println();
        System.out.println("ÅÅÐòºó:");
        for (int c:arr) {
            System.out.print(c+" ");
        }
    }
}