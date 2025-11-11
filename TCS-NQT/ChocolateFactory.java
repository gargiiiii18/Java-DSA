// Problem Statement –

// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

// Example 1 :

// N=8 and arr = [4,5,0,1,9,0,5,0].

// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

// Input :

// 8  – Value of N

// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

// Output:

// 4 5 1 9 5 0 0 0

// Example 2:

// Input:

// 6 — Value of N.

// [6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

// Output:

// 6 1 8 2 0 0

import java.util.*;
public class ChocolateFactory {

    //method does not keep relative order of non zero elements

    // public static void main(String[] args) {
    //     int[] nums = {6,0,1,8,0,2};
    //     System.out.println(Arrays.toString(nums));
    //     int left = 0;
    //     int right = nums.length-1;

    //     while(left < right){
    //         if(nums[right] == 0){
    //             right--;
    //         }
    //         if(nums[left] == 0){
    //             int temp = nums[left];
    //             nums[left] = nums[right];
    //             nums[right] = temp;
    //             right--;
    //         }
    //             left++;
    //     }
    //     System.out.println(Arrays.toString(nums));
    // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));        

        int count = 0;
        for(int j=0; j<n; j++){
            if(nums[j] != 0){
                nums[count] = nums[j];
                count++;
            }
        }

        for(int k=count; k<n; k++){
            nums[k] = 0;
        }
        
        System.out.println(Arrays.toString(nums));
    }
}
