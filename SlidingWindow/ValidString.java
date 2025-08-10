// Problem Statement

// Given a string s, find the length of the longest substring without duplicate characters.


// 🔍 Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.


// 🔍 Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.


// 🔍 Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


// 📎 Constraints

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

package SlidingWindow;

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
