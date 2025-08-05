package Trials.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){

        if(low<high){
        int loc = partition(arr, low, high);
        quickSort(arr, low, loc-1);
        quickSort(arr, loc+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int start = low;
        int end = high;

        while(start<end){
            while(start<arr.length && arr[start]<=pivot){
                start++;
            }
            while(end>=0 && arr[end]>pivot){
                end--;
            }
            if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            }
        }
        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        return end;
    }
    
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}
