// A split of an integer array is good if:
// The array is split into three non-empty contiguous subarrays - named left, mid, right respectively from left to right.
// The sum of the elements in left is less than or equal to the sum of the elements in mid, and the sum of the elements in mid is less than or equal to the sum of the elements in right.
// Given nums, an array of non-negative integers, return the number of good ways to split nums. As the number may be too large, return it modulo 10^9 + 7.

// Constraints:
// 3 <= nums.length <= 10^5
// 0 <= nums[i] <= 10^4

// Example 1:
// Input: nums = [1,1,1]
// Output: 1
// Explanation: The only good way to split nums is [1] [1] [1].

// Example 2:
// Input: nums = [1,2,2,2,5,0]
// Output: 3
// Explanation: There are three good ways of splitting nums:
// [1] [2] [2,2,5,0]
// [1] [2,2] [2,5,0]
// [1,2] [2,2] [5,0]

// Example 3:
// Input: nums = [3,2,1]
// Output: 0
// Explanation: There is no good way to split nums.

package Searching;
import java.util.*;
public class SubArrays {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 5, 0};
        int n = nums.length;
        long[] prefixSum = new long[n];
        int mod = 1000000007;
        int ans = 0;

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for (int i = 0; i < n-2; i++) {
            int leftBoundary = n;
            int rightBoundary = i;

            int start = i + 1;
            int end = n - 2;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (prefixSum[mid] >= 2 * prefixSum[i]) {
                    leftBoundary = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            start = i + 1;
            end = n - 2;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (prefixSum[mid] <= (prefixSum[n-1] + prefixSum[i]) / 2) {
                    rightBoundary = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            if (rightBoundary >= leftBoundary) {
                int numSplits = (rightBoundary - leftBoundary + 1) % mod;
                ans = (ans + numSplits) % mod;
            }
        }

        System.out.println(ans);
    }
}
