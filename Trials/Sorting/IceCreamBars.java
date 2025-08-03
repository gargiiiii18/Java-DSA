package Trials.Sorting;

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
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;
        int noOfBars = countBars(costs, coins);
        System.out.println(noOfBars);
    }
}
