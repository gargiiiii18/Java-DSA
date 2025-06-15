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