package Arrays;
import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDupicates(int[] nums){

        // int i = 0;
        // int j = i+1;

        // while(i<nums.length && j<nums.length){
        //     if(nums[i] == nums[j]){
        //         j++;
        //     } else{
        //         nums[i+1] = nums[j];
        //         i++;
        //     }
        // }
        // System.out.println(Arrays.toString(nums));
        // return i+1;

        int writeIdx = 1;

        for(int i=1; i<nums.length; i++){
           if(nums[i] != nums[i-1]){
                nums[writeIdx++] = nums[i]; 
           } 
        }
        System.out.println(Arrays.toString(nums));
        return writeIdx;
    }
    public static void main(String[] args) {
        // int[] nums = {1,1,1,2,2,3};
        int[] nums = {1,1,2};
        RemoveDuplicates rm = new RemoveDuplicates();
        int res = rm.removeDupicates(nums);

        System.out.println(res);

    }
}
