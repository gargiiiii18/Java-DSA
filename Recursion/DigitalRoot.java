// You are given a number n. You need to find the digital root of n.
// DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

// Constraints:
// 1 <= n <= 10^7

// Example 1:
// Input:
// n = 1
// Output: 1
// Explanation: Digital root of 1 is 1

// Example 2:
// Input:
// n = 99999
// Output: 9
// Explanation: Sum of digits of 99999 is 45, which is not a single digit number, hence sum of digit of 45 is 9 which is a single digit number.


package Recursion;

public class DigitalRoot {

    public static int sumDigits(int n){
        if(n/10 == 0){
             return n;
        }

        return (n%10) + sumDigits(n/10);
    }

    public static int calculateDigiRoot(int n){
        if(n/10 == 0){
            return n;
        }
        return calculateDigiRoot(sumDigits(n));
    }

    
    public static void main(String[] args) {
        // long num = 999999999999L;
        int num = 99999;
        // int num = 83;
    
        // int result = calculateDigiRoot(num);
        int result = calculateDigiRoot(num);
        System.out.println(result);
    }

}

