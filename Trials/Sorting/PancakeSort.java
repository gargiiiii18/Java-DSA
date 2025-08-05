package Trials.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeSort {

    public static List<Integer> pancakeSort(int[] arr){
        int iteration = 0;
        int end = arr.length-1;
        int sortedElements = 0;
        List<Integer> flipSequence = new ArrayList<>();

        while(iteration<arr.length-1){
            int max = findMax(arr, end);
            // System.out.println(arr[max]);

            // int value = arr[max];

            reverse(arr, 0, max);
            flipSequence.add(max+1);
            // System.out.println("after flip 1" + Arrays.toString(arr));
            reverse(arr, 0, arr.length-sortedElements-1);
            flipSequence.add(arr.length-sortedElements);
            // System.out.println("after flip 2" + Arrays.toString(arr));
            iteration++;
            sortedElements++;
            end--;
        }

        return flipSequence;
    }

    public static void reverse(int[] arr, int left, int right){
        // int left=0;
        // int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int findMax(int[] arr, int end){
        int max=arr[0];
        int maxIndex = 0;
        for(int i=0; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int[] input = {3, 2, 4, 1};
        System.out.println(Arrays.toString(input));
        List<Integer> result = pancakeSort(input);
        System.out.println(Arrays.toString(input));
        System.out.println(result);
    }
}
