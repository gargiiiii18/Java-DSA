package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumExceed {

    // public static List<List <Integer>> splitSubarrays(Integer[] nums, int k){
    //     //Naive Approach
    //     List<List<Integer>> list = new ArrayList<>();
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i]+nums[j] <= k){
    //                 list.add(Arrays.asList(nums[i], nums[j]));
    //             }
    //         }
    //     }
    //     return list;
    // }

    public static List<List <Integer>> splitSubarrays(Integer[] nums, int k){
        //Optimized Approach
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
            int left = 0;
            int right = nums.length-1;
            while(left<right){
                if((nums[left] + nums[right]) <= k){
                    list.add(Arrays.asList(nums[left], nums[right]));
                } 
                right--;
                // right = nums.length-1;
                if(left == right){
                    left++;
                    right = nums.length-1;
                }
                
            }
        
        return list;
    }

    public static void main(String[] args) {
        Integer[] nums = {2, 5, 6, 4, 8};
        int k = 8;
        List<List<Integer>> list = splitSubarrays(nums, k);
        System.out.println(list);
    }
}
