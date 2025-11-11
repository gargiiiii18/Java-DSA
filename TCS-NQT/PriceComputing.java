import java.util.*;
public class PriceComputing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int product = 1;

        while(N > 0){
            int dig = N % 10;
            product *= dig;
            N /= 10; 
        }

        System.out.println(product);


    }
}
