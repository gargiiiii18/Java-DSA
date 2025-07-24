package Trials.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] input){
        for(int i=1; i<input.length; i++){
           int key = i;
           int j = key-1;
           while(j>=0 && input[key]<input[j]){
            int temp = input[key];
            input[key] = input[j];
            input[j] = temp;

            j--;
            key--;
           }
        }
    }

    public static void main(String[] args) {
        int[] input = {4, 2};
        insertionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
