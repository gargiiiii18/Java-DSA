// You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

// Return a list answer of size 2 where:

// answer[0] is a list of all players that have not lost any matches.
// answer[1] is a list of all players that have lost exactly one match.
// The values in the two lists should be returned in increasing order.

// Note:

// You should only consider the players that have played at least one match.
// The testcases will be generated such that no two matches will have the same outcome.

// Constraints:
// 1 <= matches.length <= 10^5
// matches[i].length == 2
// 1 <= winneri, loseri <= 10^5
// winneri != loseri
// All matches[i] are unique.

// Example 1:

// Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
// Output: [[1,2,10],[4,5,7,8]]
// Explanation:
// Players 1, 2, and 10 have not lost any matches.
// Players 4, 5, 7, and 8 each have lost one match.
// Players 3, 6, and 9 each have lost two matches.
// Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].

// Example 2:

// Input: matches = [[2,3],[1,3],[5,4],[6,4]]
// Output: [[1,2,5,6],[]]
// Explanation:
// Players 1, 2, 5, and 6 have not lost any matches.
// Players 3 and 4 each have lost two matches.
// Thus, answer[0] = [1,2,5,6] and answer[1] = [].

package Sorting;

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
            lossesCount[winner] = 0;
            if(lossesCount[loser]==-1){
               lossesCount[loser]=1; 
            } else{
                lossesCount[loser]++;
            }
         }

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> lostZero = new ArrayList<>();
        List<Integer> lostOne = new ArrayList<>();

        for(int j= 0; j<matchesPlayed.length; j++){
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
        int matchesPlayed[][] =  {{2, 3}, {1, 3}, {5, 4}, {6, 4}};
        // System.out.println(matchesPlayed.length);
        List<List<Integer>> result = countLostMatches(matchesPlayed);
        System.out.println(result);
    }
}
