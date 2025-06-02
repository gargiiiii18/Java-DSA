import java.util.Scanner;
import java.util.Arrays;
public class Main{

//    public static int[] productFinder(int[] nums){
//        int length = nums.length;
//        int[] L = new int[length];
//        int[] R = new int[length];
//        int[] ans = new int[length];
//        L[0] = 1;
//        R[length-1] = 1;
//        for(int i=1; i<length; i++){
//            L[i] = L[i-1]*nums[i-1];
//        }
//        for(int j=length-2; j>=0; j--){
//            R[j] = R[j+1]*nums[j+1];
//        }
//        for(int k=0; k<length; k++){
//            ans[k] = L[k]*R[k];
//        }
//
//        return ans;
//    }

    public static int[] productFinder(int[] nums){
        int length = nums.length;
        int product_all=1;
        int[] ans = new int[length];
        for(int i=0; i<length; i++){
            product_all *= nums[i];
        }
        for(int j=0; j<length; j++){
            ans[j] = product_all/nums[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] str_nums = input.split(", ");
        for(int i=0; i<str_nums.length; i++){
            nums[i] = Integer.parseInt(str_nums[i]);
        }
        int[] result = new int[nums.length];
        result = productFinder(nums);
        System.out.println(Arrays.toString(result));

    }
}