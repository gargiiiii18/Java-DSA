package Strings;
import java.util.Arrays;
public class GCDStrings {

    public static String calculateGCD(String s, String t){
        int length = s.length()>t.length() ? t.length() : s.length();
//        System.out.println(length);
        char[] substr = new char[length];
        for(int i=length-1; i>=0; i--){
            if(s.charAt(i)==t.charAt(i)){
                substr[i]=s.charAt(i);
            }
            else{
                break;
            }
        }
        String result = new String(substr);
        return result;
    }

    public static void main(String[] args) {
        String s = "ababab";
        String t = "cbab";
        String GCD = calculateGCD(s, t);
        System.out.println(GCD);
    }
}