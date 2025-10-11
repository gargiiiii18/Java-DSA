package DynamicProgramming;
import java.util.*;
public class Fibonacci {

    //Memoization
    // public int fiboPrint(int n, int[] dp){

    //     if(n <= 1){
    //         return n;
    //     }

    //     if(dp[n] != -1){
    //         return dp[n];
    //     }

    //     return dp[n] = fiboPrint(n-1, dp) + fiboPrint(n-2, dp);
    // }
    

    //Tabulation
    public int fiboPrint(int n, int[] dp){

        //when n is 0
        int prev2 = 0;

        //when n is 1
        int prev1 = 1;

        for(int i=2; i<n; i++){
            int curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int n=7;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        Fibonacci fb = new Fibonacci();
        int res = fb.fiboPrint(n, dp);
        System.out.println(res);
    }
}
