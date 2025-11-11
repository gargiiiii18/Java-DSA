import java.util.*;
public class IntelligenceAgency {

    public static long digitSum(long n){
        long sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();

        if(R == 0){
            System.out.println(0);
            sc.close();
            return;
        }
 
        long sum = R*digitSum(N);

        // System.out.println("sum after R loops: "+sum);

        long sumOfDigits = digitSum(sum);

        // System.out.println("initial sum: "+sumOfDigits);

        while(sumOfDigits >= 10){
            sumOfDigits = digitSum(sumOfDigits);
        }

    System.out.println(sumOfDigits);
    sc.close();
    }
}
