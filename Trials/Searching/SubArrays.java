package Trials.Searching;

public class SubArrays {

    public static int findSubArrays(int[] nums){
          int count = 0;

       for(int j=1; j<=nums.length-2; j++){
           int mid = j+(nums.length-1-j)/2;
           while(j<=mid) {
               int low = prefix_sum(nums, j);
               int high = total(nums) - (prefix_sum(nums, j)+sum(nums, j, mid));
               if (sum(nums, j, mid) >= low && sum(nums, j, mid) <= high) {
                   count++;
               }
               mid--;
           }
       }
        return count;
      }


    public static int total(int[] nums){
        int sum=0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }

    public static int sum(int[] nums, int start, int end){
        int sum=0;
        for (int i=start; i<=end; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static int prefix_sum(int nums[], int i){
        int sum = 0;
        for(int start=0; start<i; start++){
            sum += nums[start];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 5, 0};
        int result = findSubArrays(nums);
        System.out.println(result);
    }
}