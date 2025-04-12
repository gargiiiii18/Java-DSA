package Arrays;
public class WateringPlants {
    public static int stepCalculator(int[] arr, int capacity){
        int i=-1;
        int length = arr.length;
        int tempCap = capacity;
        int stepCount = 0;
        while(i<length-1){
            if(arr[i+1]>tempCap){
                stepCount = stepCount + 2*(i-(-1));
                tempCap = capacity;
            }
            i++;
            stepCount++;
            tempCap-=arr[i];
        }
        return stepCount;
    }

    public static void main(String[] args) {
        int[] plants = {2,2,3,3};
        int capacity = 4;
        int steps = stepCalculator(plants, capacity);
        System.out.println(steps);
    }
}