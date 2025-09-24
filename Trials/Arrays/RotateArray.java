package Trials.Arrays;

import java.util.Arrays;

public class RotateArray {

    // public void rotate(int[] nums, int k) {

    //     int[] tmp = new int[k];

    //     int n = nums.length;
    //     int t = tmp.length;

    //     k = n % k;

    //     for(int i=0; i < t; i++){
    //         tmp[i] = nums[n-k+i];
    //     }

    //     System.out.println("temp:");
    //     System.out.println(Arrays.toString(tmp));

    //     for(int j=n-k-1; j>=0; j--){
    //         nums[j+k] = nums[j];
    //     }

    //     for(int m=0; m<k; m++){
    //         nums[m] = tmp[m];
    //     }
    // }

    // public void rotate(int[] nums, int k) {

    //     int[] tmp = new int[k];

    //     int n = nums.length;
    //     int t = tmp.length; 

    //     for(int i=0; i < t; i++){
    //         tmp[i] = nums[n-k+i];
    //     }

    //     System.out.println(Arrays.toString(nums));

    //     for(int p=0; p<k; p++){
    //         for(int j=n-k-1; j>=0; j--){
    //             nums[j+p+1] = nums[j+p];
    //     }
    // }

    //     for(int m=0; m<k; m++){
    //     nums[m] = tmp[m];
    // }
    // }

    public void reverseArray(int[] nums, int start, int end){

        int left = start;
        int right = end;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

    }

    
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverseArray(nums, 0, n-1);

        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);

    }

    public static void main(String[] args) {

        // int[] nums = {1,2,3,4,5,6,7};
        // int[] nums = {-1,-100,3,99};
        int[] nums = {-1};

        // int k = 3;
        int k = 2;
 
        System.out.println(Arrays.toString(nums));

        RotateArray r = new RotateArray();
        r.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
