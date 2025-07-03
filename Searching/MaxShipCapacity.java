// A conveyor belt has packages that must be shipped from one port to another within days days.

// The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

// Constraints:
// 1 <= days <= weights.length <= 5 * 10^4
// 1 <= weights[i] <= 500

// Example 1:
// Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
// Output: 15
// Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
// 1st day: 1, 2, 3, 4, 5
// 2nd day: 6, 7
// 3rd day: 8
// 4th day: 9
// 5th day: 10

// Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

// Example 2:
// Input: weights = [3,2,2,4,1,4], days = 3
// Output: 6
// Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
// 1st day: 3, 2
// 2nd day: 2, 4
// 3rd day: 1, 4

// Example 3:
// Input: weights = [1,2,3,1,1], days = 4
// Output: 3
// Explanation:
// 1st day: 1
// 2nd day: 2
// 3rd day: 3
// 4th day: 1, 1

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
