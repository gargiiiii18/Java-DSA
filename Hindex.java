import java.util.Arrays;
public class Hindex{
    public static int[] reverseSort(int[] arr){
        int length = arr.length;
        int[] descArr = new int[length];
        Arrays.sort(arr);
        for(int i=length-1; i>=0; i--){
            descArr[length-1-i] = arr[i];
        }
        return descArr;
    }

    public static int Hindex(int[] arr){
        int length = arr.length;
        int greaterCount = 0;
        int lesserCount = 0;
        for(int i=0; i<length; i++) {
            for(int j=0; j<=i; j++){
                if(arr[j]>=arr[i]){
                    greaterCount++;
//                    System.out.println(greaterCount);
                }
            }
            if(greaterCount>arr[i]) {
                for (int k = length - 1; k > i; k--) {
                    if (arr[k] < arr[i]) {
                        lesserCount++;
//                        System.out.println(lesserCount);
                    }
                }
                if(greaterCount>=arr[i] && lesserCount<arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
        }

    public static void main(String[] args){
        int[] citations = {3,0,6,1,5};
        int[] descCitations = reverseSort(citations);
        int h_index = Hindex(descCitations);
//        System.out.println(Arrays.toString(descCitations));
        System.out.println(h_index);
    }
}