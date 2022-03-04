package Exercise;

public class Sort {
   public static  void quickSort(int[]arr,int left,int right){
       if (left>right){
           return;
       }
       int i,j,key,temp;
       i=left;
       j=right;
       key=arr[left];
       while (i<j){
           while (key<=arr[j]&&i<j){
               j--;
           }
           while (key>=arr[i]&&i<j){
               i++;
           }
       if (i<j){
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
       }
       arr[left]=arr[i];
       arr[i]=key;
       quickSort(arr, left, j-1);
       quickSort(arr, j+1, right);
   }
   public static void mergeUtil(int[]arr,int left,int mid,int right,int[]temp){
       int i,j,k;
       i=left;
       j=mid+1;
       k=0;
       while (i<=mid&&j<=right){
           if (arr[i]<arr[j]){
               temp[k++]=arr[i++];
           }else {
               temp[k++]=arr[j++];
           }
       }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=right){
            temp[k++]=arr[j++];
        }
        for (int t=0;t<k;t++){
            arr[left+t]=temp[t];
        }
   }
   public static void mergeSort(int[]arr,int left,int right,int[]temp){
       if (left<right){
           int mid=(left+right)/2;
           mergeSort(arr, left,mid,temp);
           mergeSort(arr, mid+1, right, temp);
           mergeUtil(arr,left,mid,right,temp);
       }
   }
   public static void insertSort(int[]arr){
       for (int i=1;i<arr.length;i++){
           int temp=arr[i];
           int t;
           for (t=i-1;t>=0;t--){
               if (temp<arr[t]){
                   arr[t+1]=arr[t];
                   continue;
               }
            break;
           }
           arr[t+1]=temp;
       }
   }
    public static void main(String[] args) {
        int[]arr={12,45,79,68,64,37,75,41,70};
        int[]temp=new int[arr.length];
        System.out.println("ÅÅÐòÇ°:");
        for (int c:arr) {
            System.out.print(c+" ");
        }
        System.out.println();
//        quickSort(arr,0, arr.length-1);//¿ìËÙÅÅÐò
//        mergeSort(arr,0, arr.length-1,temp );//¹é²¢ÅÅÐò
        insertSort(arr);//²åÈëÅÅÐò
        System.out.println("ÅÅÐòºó:");
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}
