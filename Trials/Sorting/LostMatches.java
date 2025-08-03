package Trials.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LostMatches {

    public static List<List<Integer>> countLostMatches(int[][] matchesPlayed){

         int lossesCount[] = new int[100001];
         Arrays.fill(lossesCount, -1);

         for(int i=0; i<matchesPlayed.length; i++){
            int winner = matchesPlayed[i][0];
            int loser = matchesPlayed[i][1];
            if(lossesCount[winner]==-1){
                lossesCount[winner] = 0;
            } 
            if(lossesCount[loser]==-1){
               lossesCount[loser]=1; 
            } else{
                lossesCount[loser]++;
            }
         }

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> lostZero = new ArrayList<>();
        List<Integer> lostOne = new ArrayList<>();

        for(int j=0; j<lossesCount.length; j++){
            if(lossesCount[j]==0){
                lostZero.add(j);
            } else if(lossesCount[j]==1){
                lostOne.add(j);
            }
        }

        answer.add(lostZero);
        answer.add(lostOne);

         return answer;
    }
    public static void main(String[] args) {
        int matchesPlayed[][] = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        // System.out.println(matchesPlayed.length);
        List<List<Integer>> result = countLostMatches(matchesPlayed);
        System.out.println(result);
    }
}
