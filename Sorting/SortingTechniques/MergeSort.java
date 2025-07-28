package Sorting.SortingTechniques;
import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int arr[], int left, int right){

        if(left < right){
            int mid = left + (right-left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, right, mid);

        }

    }

    public void merge(int[] arr, int left, int right, int mid){
       
        int[] leftArray = new int[mid+1-left];
        int[]  rightArray = new int[right-mid];

        for(int i=0; i<leftArray.length; i++){
            leftArray[i] = arr[left+i];
        }

        for(int j=0; j<rightArray.length; j++){
            rightArray[j] = arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=left;

        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            } else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<leftArray.length){
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        while(j<rightArray.length){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        // int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] arr = {5, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        MergeSort mg = new MergeSort();
        mg.mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
