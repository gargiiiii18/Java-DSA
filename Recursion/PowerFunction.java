package Recursion;

public class PowerFunction {

    public static double power(double base, int exponent){

        if(base == 0){
            return 0;
        }

        if(exponent == 0){
            return 1;
        }

        if(exponent == 1){
            return base;
        }

        double halfPow = power(base, Math.abs(exponent)/2);

        if(exponent < 0){
            if(Math.abs(exponent) % 2 == 0){
            return 1/(halfPow*halfPow);
        }
            return 1/(halfPow*halfPow*base);
        }


        if(exponent % 2 == 0){
            
            return halfPow*halfPow;
        }
       
        return halfPow*halfPow*base;
    }


    public static void main(String[] args) {
       double base = -2;
       int exponent = -3;
       double result = power(base, exponent);
       System.out.println(result); 
    }
}
