package Strings;
public class IsomorphicStrings {
    public static boolean checkIsomorphic( String s, String t){
        int length = s.length();
        String a = new String();
       for(int i=0; i<length; i++){
           a = s.replace(s.charAt(i), t.charAt(i));
           s = a;
//           System.out.println(a);
       }
        if(a.equals(t)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "paper";
        String t = "titler";
        boolean result = checkIsomorphic(s,t);
        System.out.println(result);
    }
}