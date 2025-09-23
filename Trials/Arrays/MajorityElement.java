package Trials.Arrays;

public class MajorityElement {

    // public int majorityElement(int[] nums) {

    //     int n = nums.length;
    //     // System.out.println(n);
    //     int maj = 0;

    //     for(int i=0; i<n; i++){
    //         // int val = nums[i];
    //         int count = 0;            
    //         // System.out.println("count: "+count);
    //         for(int j=0; j<n; j++){
    //             if(nums[j] == nums[i]){
    //                 count++;
    //             }
    //             if(count > n/2){
    //                 maj = nums[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return maj;
    // }   

    public int majorityElement(int[] nums) {

        int count = 1;
        int n = nums.length;
        int candidate = nums[0];

        for(int i=1; i<n; i++){
            if(count <= 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            } 
            else{
                count--;
            }  

        }
            return candidate;
    }    
    public static void main(String[] args) {
        // int[] nums = {3,2,3};
        // int[] nums = {1};
        // int[] nums = {6, 6, 6, 7, 7};
        // int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
        MajorityElement mj = new MajorityElement();
        int res = mj.majorityElement(nums);

        System.out.println(res);
    }
}
