package Exercise;

import java.util.Arrays;

/*
给你一个下标从1开始的整数数组 numbers该数组已按非递减顺序排列请你从数组中找出满足相加之和等于目标数 target 的两个数。
如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
你可以假设每个输入 只对应唯一的答案而且你不可以重复使用相同的元素。你所设计的解决方案必须只使用常量级的额外空间。
 */
public class AcWing {
    public int[] twoSum(int[] numbers, int target) {
        int[]arr=new int[2];
        int left=0;
        int right=numbers.length-1;
        while (left<=right){
            int sum=numbers[left]+numbers[right];
            if (sum==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }if (sum<target){
                left++;
            }else {
                right--;
            }
        }
        return numbers;
    }
}


