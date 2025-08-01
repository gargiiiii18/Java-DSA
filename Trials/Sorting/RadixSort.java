package Trials.Sorting;

import java.util.Arrays;

public class RadixSort {

    public static int[] radixSort(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            if(num>max){
                max = num;
            }
        }

        int noOfPasses = 0;
        while(max>0){
            max = max/10;
            noOfPasses++;
        }
        // System.out.println(noOfPasses);

        int[] result = new int[nums.length];

        int pos = 10;
        for(int i=0; i<noOfPasses; i++){
            countSort(nums, pos, result);
            pos*=10;
            for(int j=0; j<nums.length; j++){
                nums[j] = result[j];
            }
        }
        return nums;

    }

    public static void countSort(int[] arr, int pos, int[] result){

        int count[] = new int[10];
        int prefixSum[] = new int[10];

        for(int i=0; i<arr.length; i++){
            count[(arr[i]%pos)/(pos/10)]++;
        }

        // System.out.println(Arrays.toString(count));

         prefixSum[0] = count[0];  
        for(int j=1; j<count.length; j++){
            prefixSum[j] = count[j] + prefixSum[j-1];
        }

        // System.out.println(Arrays.toString(prefixSum));


        for(int k=arr.length-1; k>=0; k--){
            result[--prefixSum[(arr[k]%pos)/(pos/10)]] = arr[k];
        }

    }

    public static void main(String[] args) {
        int[] nums = {55, 256, 33, 111};
        System.out.println(Arrays.toString(nums));
        int[] result = radixSort(nums);
        System.out.println(Arrays.toString(result));
    }
}
