package CompanyOAQuestions;

public class ubs {

    public static int generatePassword(String currentPassword, int k){

        int count = 0;

        for(int i=0; i<currentPassword.length()/2; i++){
            if(currentPassword.charAt(i) != currentPassword.charAt(currentPassword.length()-i-1)){
                count++;
            } else if(i+k < currentPassword.length() && currentPassword.charAt(i) != currentPassword.charAt(i+k)){
                count++;
            }
        }

        for(int j=0; j<currentPassword.length(); j++){
            if(count<1){
            if(j+k < currentPassword.length() && currentPassword.charAt(j) != currentPassword.charAt(j+k)){
                count++;
            }
        }
        }
        
        return count;
    }
    public static void main(String[] args) {
        String currentPassword = "abzzbz";
        // String currentPassword = "abbaaa";
        // String currentPassword = "abcba";
        int k=3;
        // int k=2;
        int noOfChanges = generatePassword(currentPassword, k);
        System.out.println(noOfChanges);
    }
}
