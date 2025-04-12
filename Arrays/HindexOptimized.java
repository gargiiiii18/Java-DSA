package Arrays;
import java.util.Arrays;
public class HindexOptimized{
    public static int[] reverseSort(int[] arr){
        int length = arr.length;
        int[] descArr = new int[length];
        Arrays.sort(arr);
        for(int i=length-1; i>=0; i--){
            descArr[length-1-i] = arr[i];
        }
        return descArr;
    }

    public static int hindex(int[] arr){
        int i=0;
        int length = arr.length;
        while(i<length && arr[i]>i){
            i++;
        }
        return i;

    }

    public static void main(String[] args){
        int[] citations = {2,6,5};
        int[] descCitations = reverseSort(citations);
        int h_index = hindex(descCitations);
//        System.out.println(Arrays.toString(descCitations));
        System.out.println(h_index);
    }
}