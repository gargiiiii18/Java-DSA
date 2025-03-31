import java.util.Arrays;
public class Flowerbed{

    public static boolean checkIfCanBePlanted(int n, int[] arr) {
        while (n > 0) {

            for (int i = 1; i < arr.length-1; i++) {
                if (arr[i + 1] != 1 && arr[i - 1] != 1) {
                    arr[i] = 1;
                    n--;
                    break;
                }


            }
            if(n==1){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean canBePlanted = checkIfCanBePlanted(n, flowerbed);
        System.out.println(canBePlanted);
        }
    }