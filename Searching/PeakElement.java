package Searching;

public class PeakElement {

    public static int findPeak(int[] nums){
      int left = 0;
      int right = nums.length-1;
      while(left<right){
           int mid = left + (right-left)/2;
     
           if(nums[mid]>nums[mid+1]){
                right=mid;
           } else {
                left=mid+1;
           }
          
      }
      return left;
    }
    

    public static void main(String[] args) {
     //    int[] nums = {1, 4, 1, 3};
        int[] nums = {2, 1, 1, 1};
        int peak = findPeak(nums);

        System.out.println(peak);
    }
}