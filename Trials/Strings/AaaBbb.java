package Trials.Strings;
public class AaaBbb{

    public static String constructString(int a, int b){

        StringBuilder ans = new StringBuilder();
        int maxLength = a+b;

        while((a>0 || b>0) && (ans.length()<maxLength)){
            int l = ans.length();
            boolean writeA = false;
            if(l>=2){
                if(ans.charAt(l-1)==ans.charAt(l-2)){
                    if(ans.charAt(l-1)=='b'){
                        writeA = true;
                    }
                }
            } else{
                if(a>=b){
                    writeA = true;
                }
            }
            if(writeA){
                ans.append('a');
                a--;
            } else{
                ans.append('b');
                b--;
            }
        }
     return ans.toString();
    }


    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        String result = constructString(a, b);
        System.out.println(result);
    }
}