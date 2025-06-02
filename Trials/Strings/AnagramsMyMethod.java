package Trials.Strings;
import java.util.Arrays;
public class AnagramsMyMethod {

    public static boolean checkIfAnagrams(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int length = s.length();
        int[] str1 = new int[256];
        int[] str2 = new int[256];
        for(int i=0; i<length; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            str1[c1]++;
            str2[c2]++;
        }
        if(Arrays.equals(str1, str2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        boolean result = checkIfAnagrams(s, t);
        System.out.println(result);
    }
}