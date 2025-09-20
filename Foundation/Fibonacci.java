package Foundation;
public class Fibonacci {
    

    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        for(int i=0; i<n; i++){
            int next = a + b;
            System.out.print(next);
            if(i++ != n){
                System.out.print(", ");
            }
            a = b;            
            b = next;
        }
    }
}
