package Arrays;
public class Stocks{
    public static int calculatePprofit(int[] arr){
        int length = arr.length;
        int buy = 0;
        for(int i=0; i<length; i++){
            if(arr[i]<arr[buy]){
                buy = i;
            }
        }
        int sell = buy+1;
        for(int j=buy+1; j<length; j++){
            if(arr[j]>arr[sell]){
                sell = j;
            }
        }
        int profit = arr[sell]-arr[buy];
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = calculatePprofit(prices);
        System.out.println(profit);
    }
}