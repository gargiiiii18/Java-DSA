import java.util.*;
public class NoOfSundays {

    //my logic

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     String startDay = sc.nextLine();

    //     int days = sc.nextInt();
  
    //     // System.out.println(startDay);
    //     // System.out.println(days);

    //     String[] week = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
    //     // System.out.println(Arrays.toString(week));

    //     int start = 0;
    //     for(int i=0; i<week.length; i++){
    //         if(week[i].equals(startDay)){
    //             start = i;
    //         }
    //     }

    //     // System.out.println("start: "+start);

    //     int counter = 0;
    //     int  j = start;
    //     int k = start;

    //     // System.out.println(start+days);

    //    while(k <= start+days){
    //      if(week[j].equals("sun")){
    //         counter++;
    //      }
    //     //  System.out.println(j);
    //      j = (j+1)%week.length;
    //      k++;
    //    }

    //   System.out.println("no. of sundays: "+counter);
    // }

    //solution logic

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String startDay = sc.nextLine();

        int days = sc.nextInt();

        String[] week = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int start = 0;

        for(int i=0; i<week.length; i++){
            if(week[i].equals(startDay)){
                start = i;
            }
        }

        int remainingDays = 6 - start;
        int res = 0;

        days = days - remainingDays;
        if(days <= 0) System.out.println("no of sundays: "+res);

        else{
            res = 1;

        if(days > 0){
            res += days/7;
        }
        System.out.println("no of sundays: "+res);
    }

    }
}
