package Arrays;
public class MajorityElementBrute {
    public static int calculateMajorityElement(int[] arr){
        int length = arr.length;
        int threshold = length/2;
        for(int i=0; i<length; i++){
            int count=0;
            for(int j=0; j<length; j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>threshold){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement = calculateMajorityElement(nums);
        System.out.println(majorityElement);
    }
}