package Trials.Searching;

public class GuessGame {

    public static int guess(int n, int pick){
        int low = 0;
        int high = (int) Math.ceil(n);

        while(low<=high){
            int mid = (low+high)/2;
            if(mid==pick){
                return mid;
            } else if(mid<pick){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n=10;
        int pick = 6;
        int result = guess(n, pick);
        System.out.println(result);
    }
}