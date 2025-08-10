package Trials.SlidingWindow;

import java.util.HashSet;

public class ValidString {
   
    public static int checkvalidString(String s){
        int start = 0;
        int end = start+1;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 1;

        set.add(s.charAt(0));

        while(end < s.length()){
            if(set.contains(s.charAt(end))){
                    while(s.charAt(start) != s.charAt(end)){
                        set.remove(s.charAt(start));
                        start++;
                    }
                    set.remove(s.charAt(start));
                    start++;
                    
            }
            set.add(s.charAt(end));
            if(set.size() > maxLength){
                maxLength = set.size();
            }
            end++;
        }
        // System.out.println(set);
     
        return maxLength;

    }
    
    public static void main(String[] args) {
        String s = "pwwkew";
        int result = checkvalidString(s);
        System.out.println(result);
    }
}
