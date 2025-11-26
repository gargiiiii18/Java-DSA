package Searching;

public class KthFraction {

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double left = 0;
        double right = 1.0;
        
        while (left < right) {
            double mid = (left + right) / 2;
            double maxFraction = 0.0;
            int totalSmallerFractions = 0;
            int numeratorIdx = 0;
            int denominatorIdx = 0;
            int j = 1;
        
            for (int i = 0; i < arr.length - 1; i++) {
                while (j < arr.length && arr[i] >= mid * arr[j]) {
                    j++;
                }
                totalSmallerFractions += (arr.length - j);
        
                if (j == arr.length) {
                    break;
                }
        
                double fraction = (double) arr[i] / arr[j];
        
                if (fraction > maxFraction) {
                    maxFraction = fraction;
                    numeratorIdx = i;
                    denominatorIdx = j;
                }
            }
        
            if (totalSmallerFractions == k) {
                return new int[] {arr[numeratorIdx], arr[denominatorIdx]};
            } else if (totalSmallerFractions > k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        
        return new int[0];  
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] result = kthSmallestPrimeFraction(arr, k);
        
        // Output the result
        System.out.println("[" + result[0] + ", " + result[1] + "]");  // Output: [2, 5]
    }
}