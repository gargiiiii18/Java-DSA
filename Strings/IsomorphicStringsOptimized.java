package Strings;
import java.util.Arrays;
public class IsomorphicStringsOptimized{

    public static boolean checkIsomorphic(String s, String t){
        int[] mapStoT = new int[256];
        int[] mapTtoS = new int[256];
        int length = s.length();
        Arrays.fill(mapStoT,-1);
        Arrays.fill(mapTtoS,-1);
        for(int i=0; i<length; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mapStoT[c1]==-1 && mapTtoS[c2]==-1){
                mapStoT[c1] = c2;
                mapTtoS[c2] = c1;
            } else if(mapStoT[c1]==c2 && mapTtoS[c2]==c1){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "egg";
        System.out.println(checkIsomorphic(s,t));
    }
}