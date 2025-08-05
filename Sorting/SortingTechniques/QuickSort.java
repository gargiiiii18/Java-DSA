// Given an array of integers nums, sort the array in ascending order using quick sort and return it.

// Example 1:
// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]


// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

// Example 2:
// Input: nums = [5,1,1,2,0,0]
// Output: [0,0,1,1,2,5]
// Explanation: Note that the values of nums are not necessarily unique.

// Constraints:
// 1 <= nums.length <= 5 * 10^4
// -5 * 10^4 <= nums[i] <= 5 * 10^4

package Sorting.SortingTechniques;

import java.util.Arrays;

public class QuickSort {

    public static void quicksort(int[] arr, int low, int high){
        if(low < high){

            int loc = partition(arr, low, high);

            quicksort(arr, low, loc-1);
            quicksort(arr, loc+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int start = low;
        int end = high;

        while(start < end){
            while(start<arr.length && arr[start] <= pivot){
                start++;
            }
            while(end>=0 && arr[end] > pivot){
                end--;
            }
            if(start < end){
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
        System.out.println(Arrays.toString(nums));
        quicksort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
