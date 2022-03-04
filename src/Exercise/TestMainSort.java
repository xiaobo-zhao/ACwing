package Exercise;

/*
* πÈ≤¢≈≈–Ú--µ›πÈÀ„∑®
*
* */
public class TestMainSort {
        public static void mergeUtils(int[]arr,int left,int mid,int right,int[]temp){
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
        public static void mergeSort(int[]arr,int left,int right,int[] temp){
            if (left<right){
                int mid=(left+right)/2;
                mergeSort(arr, left, mid, temp);
                mergeSort(arr, mid+1, right, temp);
                mergeUtils(arr,left,mid,right,temp);
            }
        }
    public static void main(String[] args) {
            int []arr={12,45,78,94,65,34,56,100,456,789,1000};
            int []temp=new int[arr.length];
        System.out.println("≈≈–Ú«∞:");
        for (int c:arr) {
            System.out.print(c+" ");
        }
        mergeSort(arr,0, arr.length-1,temp);
        System.out.println();
        System.out.println("≈≈–Ú∫Û:");
        for (int a:arr) {
            System.out.print(a+" ");
        }
        }


}