import java.util.*;
public class RoundTableConference {

    public int factorial(int num){
        if(num == 0 || num ==1) return 1;
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        RoundTableConference rd = new RoundTableConference();
        // int res = rd.factorial(3);
        // System.out.println(res);

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res = rd.factorial(N-1)*rd.factorial(2);
        System.out.println(res);
    }
}
