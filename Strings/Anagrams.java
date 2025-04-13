package Strings;

public class Anagrams {

    public static boolean checkIfAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            int length = s.length();
            int[] counter = new int[26];
            for (int i = 0; i<length; i++){
                char c1 = s.charAt(i);
                counter[c1-97]++;
            }
            for(int j=0; j<length; j++){
                char c2 = t.charAt(j);
                counter[c2-97]--;
            }
            for(int num: counter){
                if(num!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        boolean result = checkIfAnagrams(s, t);
        System.out.println(result);
    }
}