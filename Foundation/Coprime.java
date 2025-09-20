package Foundation;
public class Coprime {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
       return gcd(b, a%b);
    }

    public static void main(String[] args) {
        int a = 14;
        int b = 15;
        if(gcd(a, b) == 1){
            System.out.println("coprime");
        } else{
            System.out.println("Not coprime");
        }
    }
}
