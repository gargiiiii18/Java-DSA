package Trials.Recursion;

public class DigitalRoot {

    public static int sumDigits(int n){
        if(n/10 == 0){
             return n;
        }

        int digiSum = n%10 + sumDigits(n/10);

        if(digiSum < 10){
            return (int) (n%10) + sumDigits(n/10);
        }

        return sumDigits(digiSum);

        // return (n%10) + sumDigits(n/10);
    }

    // public static int calculateDigiRoot(int n){
    //     if(n/10 == 0){
    //         return n;
    //     }
    //     return calculateDigiRoot(sumDigits(n));
    // }

    
    public static void main(String[] args) {
        // long num = 999999999999L;
        // int num = 99999;
        int num = 83;
    
        // int result = calculateDigiRoot(num);
        int result = sumDigits(num);
        System.out.println(result);
    }

}

