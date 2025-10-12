package DynamicProgramming;
import java.util.*;
public class ClimbingStaircase {

    //Memoization
    // public int findWays(int n, int[] dp){

    //     if(n == 0) return 1;
    //     if(n == 1) return 1;

    //     if(dp[n] != -1){
    //         return dp[n];
    //     }        

    //     int left = findWays(n-1, dp);

    //     int right = findWays(n-2, dp);

    //     return dp[n] = left + right;
    // }

    //Tabulation
    public int findWays(int n, int[] dp){

        dp[0] = 1;

        for(int i=1; i<=n; i++){
           int left = dp[i-1];

           int right = 0;

           if(i>1){
            right = dp[i-2];
           }

           dp[i] = left + right;
        }

        return dp[n];
    }

    public int climbStairs(int n){
         int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return findWays(n, dp);

    }
    public static void main(String[] args) {
        int n=45;
        ClimbingStaircase cs = new ClimbingStaircase();
        int res = cs.climbStairs(n);
        System.out.println(res);

    }
}
