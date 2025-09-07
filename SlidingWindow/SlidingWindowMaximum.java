package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>(); 
        List<Integer> res = new ArrayList<>();
        int left = 0;
        for(int i=0; i<nums.length; i++){
            left = i-k+1;

            if(left >= 0){
            while(!q.isEmpty() && (q.peekFirst() < left)){
                q.remove();
            }
            }
            while(!q.isEmpty() && (nums[i] > nums[q.peekLast()])){
                q.removeLast();
            }
            q.add(i);
            if(left >= 0){
            res.add(nums[q.peek()]);
            }

        }
        // res.add(nums[q.peek()]);

        int[] result = new int[res.size()];

        for(int j=0; j<res.size(); j++){
            result[j] = res.get(j);
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = {1,3,-1,-3,5,3,6,7};
        // int[] nums = {1};
        // int[] nums = {1, -1};
        int[] nums = {1,3,1,2,0,5};
        int k = 3;
        // int k = 1;
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        int[] result = s.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
