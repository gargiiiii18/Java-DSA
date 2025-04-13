package Strings;
public class GCDStringsOptimized {
    public static boolean checkGCDSubstringPossible(String s, String t){
        String concat1 = s + t;
        String concat2 = t + s;
        if(!concat1.equals(concat2)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "ababab";
        String str2 = "abab";
        boolean GCDPossible = checkGCDSubstringPossible(str1, str2);
        if(GCDPossible){
            if(str1.length()<str2.length()){
                System.out.println(str1);
            } else{
                System.out.println(str2);
            }
        } else{
            System.out.println("No GCD is possible");
        }
    }
}