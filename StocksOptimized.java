import java.util.Arrays;
public class StocksOptimized{

    public static int calculateProfit(int[] arr){
        int length = arr.length;
        int min = 0;
        int profit = 0;
        int maxProfit = 0;
        for(int i=0; i<length; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
          profit = arr[i] - arr[min];
            if(profit>maxProfit){
                maxProfit = profit;
            }

        }
    return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int profit = calculateProfit(prices);
        System.out.println(profit);
    }
}