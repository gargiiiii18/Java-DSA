package CompanyOAQuestions.Oracle;

import java.util.ArrayList;
import java.util.List;

public class ValidKeys {

    public static boolean checkPrime(double num){
        boolean flag = true;
        for(int j=2; j<=Math.sqrt(num); j++){
                if(num%j == 0){
                    flag = false;
                }
            }
                if(flag){
                return true;
            }
            return false;
    }

    public static List<Integer> getValidKeys(List<Integer> arr){

        List<Integer> validKeyCount = new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            int count = 0;
            for(int j=2; j<=arr.get(i); j++){
                if(Math.sqrt(j) == Math.floor(Math.sqrt(j))){
                if(checkPrime(Math.sqrt(j))){
                    count++;
                }
            }
            }
            validKeyCount.add(count);
        }
        return validKeyCount;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(11);

        int n = 2;

        // System.out.println(checkPrime(91));

        List<Integer> result = getValidKeys(nums);
        System.out.println(result);

    }
}
