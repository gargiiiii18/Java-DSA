// It is a sweltering summer day, and a boy wants to buy some ice cream bars.

// At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible.

// Note: The boy can buy the ice cream bars in any order.

// Return the maximum number of ice cream bars the boy can buy with coins coins.

// You must solve the problem by counting sort.

// Constraints:
// costs.length == n
// 1 <= n <= 10^5
// 1 <= costs[i] <= 10^5
// 1 <= coins <= 10^8

// Example 1:
// Input: costs = [1,3,2,4,1], coins = 7
// Output: 4
// Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.

// Example 2:
// Input: costs = [10,6,8,7,7,8], coins = 5
// Output: 0
// Explanation: The boy cannot afford any of the ice cream bars.

// Example 3:
// Input: costs = [1,6,3,1,2,5], coins = 20
// Output: 6
// Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.

package Sorting;

public class IceCreamBars {

    public static int[] countSort(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int num: arr){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }

        int[] count = new int[max+1];
        int[] prefixSum = new int[max+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        prefixSum[0] = count[0];
        for(int j=1; j<count.length; j++){
            prefixSum[j] = prefixSum[j-1] + count[j];
        }

        int[] result = new int[arr.length];

        for(int k=arr.length-1; k>=0; k--){
            result[--prefixSum[arr[k]]] = arr[k];
        }
        return result;
    }

    public static int countBars(int[] costs, int coins){
        int sorted[] = countSort(costs);
        int noOfBars = 0;
        for(int cost : sorted){
            if(cost<=coins){
                noOfBars++;
                coins-=cost;
            }
        }
        return noOfBars;
    }
    public static void main(String[] args) {
        int[] costs = {3,2,4,1};
        int coins = ;
        int noOfBars = countBars(costs, coins);
        System.out.println(noOfBars);
    }
}
