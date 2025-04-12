package Arrays;
public class MajorityElementOptimized {

    public static int calculateMajorityElement(int[] arr){
        int length = arr.length;
        int threshold = length/2;
        int candidate=0;
        int count=0;
        for(int i=0; i<length; i++){
            if(arr[i]==arr[candidate]){
                count++;
            } else{
                count--;
                if(count<0){
                    candidate=i;
                }
            }
        }
        return arr[candidate];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement = calculateMajorityElement(nums);
        System.out.println(majorityElement);
    }
}