package Arrays;

import java.util.Arrays;

public class RotateArray {

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
        // int[] nums = {-1};
        int[] nums = {1,2,3};

        // int k = 3;
        int k = 4;
 
        System.out.println(Arrays.toString(nums));

        RotateArray r = new RotateArray();
        r.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
