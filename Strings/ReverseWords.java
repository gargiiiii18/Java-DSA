public class ReverseWords{

    public static StringBuilder createStringBuilder(String s){
//        System.out.println("creating stringbuilder");
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i));
        }
        return sb;
    }

    public static void reverseEntireSequence(StringBuilder sb, int left, int right){
//        System.out.println("im called");
        while(left<right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }

    }

    public static String reverseWords(String s){
        int start = 0;
        int end = 0;

        StringBuilder sb = createStringBuilder(s);
        int length = sb.length();
        reverseEntireSequence(sb, 0, length-1);
//        System.out.println(sb.toString());

        while(start<length){
            while(end<length && sb.charAt(end) != ' '){
               end++;
            }
            reverseEntireSequence(sb, start, end-1);
            start = end+1;
            end = start;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String reversed = reverseWords(s);
        System.out.println(reversed);
    }
}