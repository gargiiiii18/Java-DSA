package Sorting.SortingTechniques;

import java.util.Arrays;

public class CountSort {

    public static int[] countSort(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int nums : arr){
            if(nums<min){
                min = nums;
            }
            if(nums>max){
                max = nums;
            }
        }

        int count[] = new int[max+1];
        int prefixSum[] = new int[max+1];

        for(int i=0 ;i<arr.length; i++){
            count[arr[i]]++;
        }

        // System.out.println(Arrays.toString(count));

         prefixSum[0] = count[0];  
        for(int j=1; j<count.length; j++){
            prefixSum[j] = count[j] + prefixSum[j-1];
        }

        // System.out.println(Arrays.toString(prefixSum));

        int[] result = new int[arr.length];

        for(int k=arr.length-1; k>=0; k--){
            result[--prefixSum[arr[k]]] = arr[k];
        }

        return result;
    }
    public static void main(String[] args) {
        // int[] input = {1, 3, 5, 3, 4, 3, 1, 3, 4, 3, 1};
        int[] input = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};

        System.out.println(Arrays.toString(input));

        int[] result = countSort(input);

        System.out.println(Arrays.toString(result));

    }
}
