package Trials.Sorting;

import java.util.Arrays;

public class SortingColors {

    public static void sortColors(int[] arr){
        for(int i=0; i<arr.length; i++) {
            boolean sorted = false;
            for(int j=0; j<arr.length-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                sorted = true;
            }
        }
        if(!sorted){
            break;
        }
    }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println(Arrays.toString(nums));

        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

}
