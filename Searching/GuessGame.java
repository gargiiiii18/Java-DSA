// We are playing the Guess Game. The game is as follows:
// I pick a number from 1 to n. You have to guess which number I picked.
// Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
// You call a pre-defined API int guess(int num), which returns three possible results:

// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).

// Return the number that I picked.

// Example 1:
// Input: n = 10, pick = 6
// Output: 6

// Example 2:
// Input: n = 1, pick = 1
// Output: 1

// Example 3:
// Input: n = 2, pick = 1
// Output: 1

package Searching;

public class GuessGame {

    public static int guessNumber(int n, int pick){
        int low = 0;
        int high = (int) Math.ceil(n);

        while(low<=high){
            int mid = (low+high)/2;
            int res = guess(pick, mid);
            if(res==0){
                return mid;
            } else if(res==1){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static int guess(int pick, int guessed){
        if(guessed<pick){
            return 1;
        } else if(guessed>pick){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n=10;
        int pick = 6;
        int result = guessNumber(n, pick);
        System.out.println(result);
    }
}