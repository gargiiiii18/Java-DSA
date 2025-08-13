package Trials.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeIntervals {

    public static List<List<Integer>> mergeIntervals(int[][] nums){
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(i+1<nums.length && nums[i][1] >= nums[i+1][0]){

                ans.add(Arrays.asList(nums[i][0], nums[i+1][1]));
                i++;
                // continue;

            } else{
                ans.add(Arrays.asList(nums[i][0], nums[i][1]));
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int nums[][] = {{2, 6}, {1, 3}, {8, 10}, {15, 18}};
        // int nums[][] = {{1, 4}, {4, 5}};
        List<List<Integer>> result = mergeIntervals(nums);
        System.out.println(result);

    }
}
