package Searching;

public class MaxShipCapacity {

    public static boolean isFeasible(int[] weights, int days, int maxCapacity){
        int daysNeeded = 1;
        int currentLoad = 0;
        int start = 0;

       while (start<weights.length) {
            if(currentLoad+weights[start] <= maxCapacity){
                currentLoad += weights[start];
                start++;
            } else{
                daysNeeded++;
                currentLoad = 0;
            }
       }

       if(daysNeeded > days){
        return false;
       }
       return true;
    }

    public static int minMaxCapacity(int[] weights, int days){
        int low = 0;
        int high = 0;
        int result = 0;

        for(int weight : weights){
            if(weight>low){
                low = weight;
            }
            high += weight;
        }

        while(low<high){
            int mid = ((low+high)/2);
            if(isFeasible(weights, days, mid)){
                result = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int result = minMaxCapacity(weights, days);
        System.out.println(result);
    }
}
