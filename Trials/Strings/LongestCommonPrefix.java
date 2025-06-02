package Trials.Strings;
public class LongestCommonPrefix {

    public static String findLongestPrefix(String[] strs){
        int length = strs.length;
        int count = 0;

        String word = findShortest(strs);
        String word1 = strs[0];
        String word2 = strs[1];
        String word3 = strs[2];

        for(int i=0; i<word.length(); i++){
//            System.out.println(word1.charAt(i));
            if(word1.charAt(i)==word2.charAt(i)){
                if(word2.charAt(i)==word3.charAt(i)){
                    count++;
                }
            }
        }
        return word.substring(0, count);
    }

    public static String findShortest(String[] str){
        String shortest = str[0];
        for (String s : str) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"dog","racecar","car"};
        String prefix = findLongestPrefix(strs);
        if(!prefix.isEmpty()){
            System.out.println(prefix);
        } else{
            System.out.println("");
        }
    }
}