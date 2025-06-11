package Strings;
import java.util.*;

public class GroupingAnagrams {

    public static List<List<String>> groupingAnagrams(String[] strs){
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupingAnagrams(strs);
        System.out.println(ans);
    }
}