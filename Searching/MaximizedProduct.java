// You are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.
// You need to distribute all products to the retail stores following these rules:
// 1. A store can only be given at most one product type but can be given any amount of it.
// 2. After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
// Return the minimum possible x.

// Example 1:
// Input: n = 6, quantities = [11,6]
// Output: 3
// Explanation: One optimal way is:
// - The 11 products of type 0 are distributed to the first four stores in these amounts: 2, 3, 3, 3
// - The 6 products of type 1 are distributed to the other two stores in these amounts: 3, 3
// The maximum number of products given to any store is max(2, 3, 3, 3, 3, 3) = 3.

package Searching;

public class MaximizedProduct {

    public static int minimizeMaxProduct(int n, int[] qtys){
        int low = 0;
        int high = Integer.MIN_VALUE;
        int result = 0;

        for(int qty : qtys){
            if(qty>high){
                high=qty;
            }
        }

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