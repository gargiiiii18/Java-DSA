package Foundation;
public class SimilarStrings {
    public static boolean checkSimilar(String a, String b){
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        System.out.println(checkSimilar(a, b));
        
    }
}
