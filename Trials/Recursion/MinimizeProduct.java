package Trials.Recursion;

public class MinimizeProduct {

    private static long MOD = 1_000_000_007L;

    public static int minimizeProduct(int p){

        if(p == 1){
            return 1;
        }

        long max = (1L << p) - 1;
        //2^p - 1 
        long sm = max - 1;
        // sm = max - 1 (second largest number)
        long n = sm/2;
        // half of second largest

        int intermediateProduct = recursive(sm, n);
        return (int) ((intermediateProduct % MOD)*(max % MOD) % MOD);

    }

    public static int recursive(long val, long n){
        //Binary Exponentiation
        if(n == 0){
            return 1;
        }

        if(n == 1){
            return (int) (val % MOD);
        }

        long newVal = ((val % MOD) * (val % MOD)) % MOD; //squaring 

        if(n % 2 == 1){
            return (int) ((recursive(newVal, n/2) % MOD) * (val % MOD) % MOD); //then halvng power because we calculate power of 2 in each call
        }

        return (int) (recursive(newVal, n/2) % MOD);
    }

    public static void main(String[] args) {
        int p = 3;
        int result = minimizeProduct(p);
        System.out.println(result);
    }    
   
}
