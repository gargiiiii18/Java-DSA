package Trials.Arrays;
import java.util.Arrays;

public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums){

        int duplicate = 0;
        int writeIdx = 1;
 
        for(int j=1; j<nums.length; j++){
            if(nums[j] == nums[j-1]){
                duplicate++;
            }
            if(nums[j]!=nums[j-1]){
                duplicate = 0;
            }             
            if(duplicate<1){
                nums[writeIdx++] = nums[j];                
            }            

        }
        System.out.println(Arrays.toString(nums));
        return writeIdx;
    }

    public static void main(String[] args) {
        // int[] nums = {1,1,1,2,2,3};
        // int[] nums = {0,0,1,1,1,1,2,3,3};
        int[] nums = {1,1,1,1};
        RemoveDuplicates2 rm = new RemoveDuplicates2();
        int res = rm.removeDuplicates(nums);
        System.out.println(res);
    }
}
