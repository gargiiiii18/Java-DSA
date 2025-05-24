package Recursion;

public class OneZeroTable{
    public static int recursiveCall(int n, int k){
        if(n==1){
            return 0;
        }
        int totalNoOfDigs = (int) Math.pow(2, n-1);
        int mid = totalNoOfDigs/2;
        if(k<=mid){
            return recursiveCall(n-1, k);
        }

        return 1-recursiveCall(n-1, k-mid);

    }

    public static void main(String[] args){
        int n=2;
        int k=2;
        System.out.println(recursiveCall(n, k));
    }
}