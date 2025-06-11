package Trials.Strings;
import java.util.*;

public class GroupingAnagrams{

    public static List<List<String>> groupAnagrams(String[] strs){
        String[] sorted = new String[strs.length];
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            sorted[i] = new String(chars);
        }

        Map<String, List<String>> grouped = new HashMap<>();
        for(int i=0; i< sorted.length; i++){
            grouped.computeIfAbsent(sorted[i], k->new ArrayList<>()).add(strs[i]);
        }

        List<List<String>> ans = new ArrayList<>(grouped.values());
        return ans;

    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);

    }
}