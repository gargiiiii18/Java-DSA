package Trials.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void mergeArrays(int[] nums1, int[] nums2, int m, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else{
                nums1[k--] = nums2[j--];
            }
        }

    }
    public static void main(String[] args) {
        // int[] nums1 = {1,2,3,0,0,0};
        // int[] nums2 = {2,5,6};
        int[] nums1 = {1,0};
        int[] nums2 = {2};
        // int[] nums1 = {4,5,6,0,0,0};
        // int[] nums2 = {1,2,3};
        // int[] nums1 = {4,0,0,0,0,0};
        // int[] nums2 = {1,2,3,5,6};      
    
        int m = 1;
        int n = 1;

        mergeArrays(nums1, nums2, m, n);

        System.out.println(Arrays.toString(nums1));
    }
}
