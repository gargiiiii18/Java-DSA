package Strings;

public class LongestCommonPrefix {

    public static String findLongestPrefix(String[] strs){
        if(strs == null || strs.length==0){
            return "";
        }
        int minLength = Integer.MAX_VALUE;

        for(String str : strs){
            minLength = Math.min(str.length(), minLength);
        }

        int low = 0;
        int high = minLength;
        while(low<=high){
            int mid = (low+high)/2;
            if(isCommonPrefix(strs, mid)){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return strs[0].substring(0, ((low+high)/2));
    }

    public static boolean isCommonPrefix(String[] strs, int len){
        for(int i=1; i<strs.length; i++){
            if(!strs[i].startsWith(strs[0].substring(0, len))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String[] strs = {"dog", "racecar", "car"};
//        String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"flower", "flowering", "flowers"};
        String prefix = findLongestPrefix(strs);
        System.out.println(prefix);
    }
}