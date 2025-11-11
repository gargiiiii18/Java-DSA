import java.util.*;
public class VehiclesViolatingRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
   
        sc.nextLine();

        String str = sc.nextLine();

        String[] strArr = str.split(" ");
        int[] nums = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(strArr[i]);
        }

        // System.out.println(Arrays.toString(nums));

        int D = sc.nextInt();
        int X = sc.nextInt();

        int totalFine = 0;
        for(int j=0; j<N; j++){
            if((D%2 == 0 && nums[j]%2 != 0) || (D%2 != 0 && nums[j]%2 == 0)){
                totalFine += X;
            }
        }
        System.out.println(totalFine);

    }
}
