import java.util.*;
public class GreaterElement{

    //brute force
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int[] nums = new int[n];

    //     // if(nums.length == 0 || nums == null) System.out.println(0);

    //     int count = 1;

    //     for(int i=0; i<n; i++){
    //         nums[i] = sc.nextInt();
    //     }

    //     System.out.println(Arrays.toString(nums));

    //     for(int j=0; j<n; j++){
    //         int k = j-1;
    //         while(k >= 0){
    //             if(nums[j] < nums[k]){
    //                 break;
    //             }
    //             if(k == 0) count++;
    //             k--;
    //         }
    //     }
    //     System.out.println(count);
        
    // }

    //optimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        // if(nums.length == 0 || nums == null) System.out.println(0);

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int count = 0;

        System.out.println(Arrays.toString(nums));

        for(int j=0; j<n; j++){
            if(nums[j] >= max) {
                max = nums[j];
                count++;
            }
        }
        System.out.println(count);
        
    }
}