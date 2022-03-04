package Exercise;

import java.util.Arrays;

/*
����һ���±��1��ʼ���������� numbers�������Ѱ��ǵݼ�˳������������������ҳ��������֮�͵���Ŀ���� target ����������
��������������ֱ��� numbers[index1] �� numbers[index2] ���� 1 <= index1 < index2 <= numbers.length ��
�Գ���Ϊ 2 ���������� [index1, index2] ����ʽ�����������������±� index1 �� index2��
����Լ���ÿ������ ֻ��ӦΨһ�Ĵ𰸶����㲻�����ظ�ʹ����ͬ��Ԫ�ء�������ƵĽ����������ֻʹ�ó������Ķ���ռ䡣
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


