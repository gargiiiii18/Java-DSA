package Trials.Arrays;

import java.util.Arrays;

public class Diff {

    public static int makeSum(int[] nums, int diff){
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int left=0;
        int right = nums.length-1;
        int count=0;

        while(left<right){
            if(nums[right]-nums[left] == diff){
                count++;
                right--;
                left=0;
            } else{
                if(right-left == 1){
                    right--;
                    left=0;
                } else{
                    left++;
                }
            }
        }
    return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 4, 8};
        int diff = 2;
        int result = makeSum(nums, diff);
        System.out.println(result);
    }
}