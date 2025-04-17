public class LongestPalindromeSubstring1 {

    public static String findLongestPalindrome(String s) {
        int length = s.length();
        if(length==0){
            return "";
        }
        int start = 0;
        int end = length - 1;
        int count = 0;
        while (start < end) {
            if (check(s, start, end)==true) {
                count++;
            } else {
                count = 0;
                for (int i = start + 1; i < end; i++) {
                    if (check(s, i, end) == true) {
                        start = i;
                        count++;
                        break;
                    }
                }
                if(check(s, start, end)==false){
                    for (int j = end - 1; j > start; j--) {
                        if (check(s, start, j) == true) {
                            end = j;
                            count++;
                            break;
                        }
                    }
                }

            }
            start++;
            end--;

        }
        if (count == 0) {
            return "No palindrome substring found";
        } else {
            return s.substring(start - count, end + count + 1);
        }
    }

    public static boolean check(String s, int i, int j){
        if(s.charAt(i)==s.charAt(j)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "babad";
        String result = findLongestPalindrome(s);
        System.out.println(result);
    }
}