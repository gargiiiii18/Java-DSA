import java.util.*;
public class CurtainLabelling {

    //my approach

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int L = sc.nextInt();
        int maxAquaCurtains = 0;

        int i=0;
        while(i <str.length()){
            int j = i;
            int countA = 0;
            while(j<str.length() && j < i+L){
                if(str.charAt(j) == 'a') countA++;
                j++;
            }
            // System.out.println("countA: "+countA);          
            if(countA > maxAquaCurtains) maxAquaCurtains = countA;
            i=j;
            // System.out.println("i :"+i);
        }
        System.out.println(maxAquaCurtains);

    }

    //textbook approach
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     String str = sc.nextLine();

    //     int L = sc.nextInt();
    //     int max = 0;
    //     int count = 0;
        
    //     for(int i=0; i<str.length(); i++){
    //         if(i % L == 0){
    //             max = Math.max(count, max);
    //             count = 0;
    //         }
    //         if(str.charAt(i)=='a') count++;
    //     }
    //     System.out.println(max);
    // }
}
