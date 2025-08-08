package Recursion;

public class DigitalRoot {

    public static int sumDigits(int n){
        if(n/10 == 0){
             return n;
        }

        return (n%10) + sumDigits(n/10);
    }

    public static int calculateDigiRoot(int n){
        if(n/10 == 0){
            return n;
        }
        return calculateDigiRoot(sumDigits(n));
    }

    
    public static void main(String[] args) {
        // long num = 999999999999L;
        int num = 99999;
        // int num = 83;
    
        // int result = calculateDigiRoot(num);
        int result = calculateDigiRoot(num);
        System.out.println(result);
    }

}

