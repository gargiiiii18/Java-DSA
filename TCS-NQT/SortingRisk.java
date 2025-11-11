import java.util.*;
public class SortingRisk {
    
    //counting method
    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int[] nums = new int[n];

    //     for(int i=0; i<n; i++){
    //         nums[i] = sc.nextInt();
    //     }

    //     int a=0;
    //     int b=0;
    //     int c=0;

    //     for(int j=0; j<nums.length; j++){
    //         if(nums[j] == 0) a++;
    //         else if(nums[j] == 1) b++;
    //         else if(nums[j] == 2) c++;
    //     }

    //     // System.out.println(a);
    //     // System.out.println(b);
    //     // System.out.println(c);

    //     for(int i=0; i<a; i++){
    //         nums[i] = 0;
    //     }
    //     for(int j=a; j<a+b; j++){
    //         nums[j] = 1;
    //     }
    //     for(int k=a+b; k<a+b+c; k++){
    //         nums[k] = 2;
    //     }
    //     System.out.println(Arrays.toString(nums));

    // }


    //3 pointer method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;

        int mid = low;

        while(mid < high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
            else{
            mid++;
            }

        }

    System.out.println(Arrays.toString(nums));
    }
}
