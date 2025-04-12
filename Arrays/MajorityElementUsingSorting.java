package Arrays;
import java.util.Arrays;
public class MajorityElementUsingSorting {

    public static int calculateMajorityElement(int[] arr){
        int length = arr.length;
        int threshold = length/2;
        int candidate=0;
        int count=0;
        Arrays.sort(arr);
        for(int i=0; i<length; i++){
            if(arr[i]==arr[candidate]){
                count++;
            } else{
                candidate++;
            }
            if(count>=threshold){
                return arr[candidate];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,1,1,1,2,2};
        int majorityElement = calculateMajorityElement(nums);
        System.out.println(majorityElement);
    }
}