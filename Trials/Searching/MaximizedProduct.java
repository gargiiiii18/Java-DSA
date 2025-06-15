package Trials.Searching;

public class MaximizedProduct {

    public static int minimizeMaxProduct(int n, int[] qtys){
        int low = 0;
        int high = n;
        int result = 0;
        while(low<=high){
            int stores = 0;
            int mid = (low+high)/2;

            for(int qty : qtys){
                stores += qty/mid;
                if(qty%mid>0){
                    stores++;
                }
            }
            if(stores<=n){
                result = mid;
                high = mid-1;
            } else{
                low=mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] quantities = {11, 6};
        int n = 6;
        int result = minimizeMaxProduct(n, quantities);
        System.out.println(result);
    }
}